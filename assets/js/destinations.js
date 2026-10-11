const wm = name =>
  `https://commons.wikimedia.org/wiki/Special:FilePath/${encodeURIComponent(name)}?width=900`;

export const DESTINATIONS = [
  { title: "La Mecque", country: "Arabie saoudite", img: wm("The Kaaba during Hajj - edited.jpg") },
  { title: "Médine", country: "Arabie saoudite", img: wm("Masjid An-Nabawi in Madinah.jpg") },
  { title: "Istanbul", country: "Turquie", img: wm("Blue Mosque Courtyard Dusk Wikimedia Commons.jpg") },
  { title: "Dubaï", country: "Émirats arabes unis", img: wm("Skyline-Dubai-2010.jpg") },
  { title: "Marrakech", country: "Maroc", img: wm("Jemaa el-Fnaa at night - Maroco - Marrakesh.jpg") },
  { title: "Le Caire", country: "Égypte", img: wm("All Gizah Pyramids.jpg") },
  { title: "Antalya", country: "Turquie", img: wm("Antalya Clock Tower 02.jpg") },
  { title: "Paris", country: "France", img: wm("Tour Eiffel Wikimedia Commons.jpg") },
  { title: "Kuala Lumpur", country: "Malaisie", img: wm("Petronas Panorama II.jpg") },
];

const CARD_H = 0.675;
const CARD_MAX_W = 0.5;
const CARD_RATIO = 0.85;
const STEP = 40;
const DRUM = 2.22;
const LENS = 2.7;
const RING_R = 1.14;
const BOW = 1.82;
const TITLE = 0.124;
const INDEX = 0.04;
const CULL = 1.6;
const WHEEL_UNITS = 520;
const DRAG_UNITS = 420;
const SETTLE = 150;
const EASE = 0.12;

const clamp = (v, lo, hi) => Math.min(hi, Math.max(lo, v));
const lerp = (a, b, t) => a + (b - a) * t;
const rad = d => (d * Math.PI) / 180;
const bowAt = (drumDeg, bow) => -bow * (1 - Math.cos(rad(drumDeg)));

function place(ringDeg, drumDeg, ringR, drumR, bow, m) {
  return (
    `translateX(${m * bowAt(drumDeg, bow)}px)` +
    ` rotateZ(${(1 - m) * ringDeg}deg) translateY(${-(1 - m) * ringR}px)` +
    ` rotateX(${m * drumDeg}deg) translateZ(${m * drumR}px)`
  );
}

export function initDestinationsWheel(root, label = "Nos destinations", action) {
  if (!root) return;
  const stage = root.classList.contains("dw-stage")
    ? root
    : root.querySelector(".dw-stage");
  if (!stage) return;

  const count = DESTINATIONS.length;
  const last = Math.max(count - 1, 0);

  let turn = 0;
  let target = 0;
  let active = 0;
  let reduced = false;

  let cardW = 0, cardH = 0, ringR = 0, ringScale = 1, drumR = 0;
  let bow = 0, depth = 0, titleSize = 0, indexSize = 0;

  const cards = [];
  let wheelEl = null;
  let labelEl = null;
  let titleEl = null;
  let indexEl = null;
  let built = false;
  let raf = 0;
  let drag = null;

  const mqReduced = window.matchMedia("(prefers-reduced-motion: reduce)");
  const readReduced = () => { reduced = mqReduced.matches; };
  readReduced();
  if (mqReduced.addEventListener) mqReduced.addEventListener("change", readReduced);
  else if (mqReduced.addListener) mqReduced.addListener(readReduced);

  function computeMetrics() {
    const w = stage.clientWidth || root.clientWidth;
    const h = stage.clientHeight || root.clientHeight;
    if (!h) return false;
    cardW = Math.min(h * CARD_H * CARD_RATIO, w * CARD_MAX_W);
    cardH = cardW / CARD_RATIO;
    drumR = cardH * DRUM;
    ringR = cardH * RING_R;
    ringScale = count
      ? clamp(((2 * Math.PI * ringR) / count * 0.82) / (cardW || 1), 0.16, 1)
      : 1;
    bow = cardH * BOW;
    depth = cardH * LENS;
    titleSize = cardH * TITLE;
    indexSize = cardH * INDEX;
    return true;
  }

  function build() {
    stage.innerHTML = "";
    stage.setAttribute("role", "listbox");
    stage.setAttribute("tabindex", "0");
    stage.style.perspective = depth + "px";

    wheelEl = document.createElement("div");
    wheelEl.className = "dw-wheel";

    DESTINATIONS.forEach((item, i) => {
      const Tag = item.href ? "a" : "div";
      const card = document.createElement(Tag);
      card.id = `destinations-wheel-${i}`;
      card.setAttribute("role", "option");
      if (item.href) card.setAttribute("href", item.href);
      card.className = "dw-card group";

      const face = document.createElement("span");
      face.className = "dw-face";
      const img = document.createElement("img");
      img.src = item.img;
      img.alt = item.country ? `${item.title}, ${item.country}` : item.title;
      img.draggable = false;
      img.loading = "lazy";
      img.addEventListener("error", () => { img.style.display = "none"; });
      face.appendChild(img);

      const cap = document.createElement("span");
      cap.className = "dw-face-cap";
      const t = document.createElement("span");
      t.className = "dw-face-title";
      t.textContent = item.title;
      cap.appendChild(t);
      if (item.country) {
        const c = document.createElement("span");
        c.className = "dw-face-country";
        c.textContent = item.country;
        cap.appendChild(c);
      }
      face.appendChild(cap);

      if (action && item.href) {
        const pill = document.createElement("span");
        pill.className = "dw-action";
        pill.innerHTML =
          '<svg viewBox="0 0 12 12" class="dw-action-ico" aria-hidden="true"><path d="M3 9 9 3M4 3h5v5" fill="none" stroke="currentColor" stroke-width="1.4" stroke-linecap="round" stroke-linejoin="round"/></svg>';
        const pt = document.createElement("span");
        pt.textContent = action;
        pill.appendChild(pt);
        face.appendChild(pill);
      }

      card.appendChild(face);
      wheelEl.appendChild(card);
      cards.push(card);
    });

    labelEl = document.createElement("div");
    labelEl.className = "dw-label";
    labelEl.textContent = label;

    titleEl = document.createElement("div");
    titleEl.className = "dw-title";
    const titleInner = document.createElement("span");
    titleInner.textContent = DESTINATIONS[active].title;
    titleEl.appendChild(titleInner);
    const countryInner = document.createElement("div");
    countryInner.className = "dw-title-country";
    countryInner.textContent = DESTINATIONS[active].country || "";
    titleEl.appendChild(countryInner);

    indexEl = document.createElement("ol");
    indexEl.className = "dw-index";
    DESTINATIONS.forEach((item, i) => {
      const li = document.createElement("li");
      const btn = document.createElement("button");
      btn.type = "button";
      btn.textContent = item.title;
      btn.addEventListener("click", () => to(i + 1));
      li.appendChild(btn);
      indexEl.appendChild(li);
    });

    stage.append(wheelEl, labelEl, titleEl, indexEl);
    built = true;
  }

  function applySizes() {
    if (!built) return;
    stage.style.perspective = depth + "px";
    cards.forEach(card => {
      card.style.width = cardW + "px";
      card.style.height = cardH + "px";
      card.style.marginLeft = -cardW / 2 + "px";
      card.style.marginTop = -cardH / 2 + "px";
    });
    if (labelEl) labelEl.style.fontSize = titleSize + "px";
    if (titleEl) titleEl.style.fontSize = titleSize + "px";
    if (indexEl) indexEl.style.fontSize = Math.max(indexSize, 10) + "px";
  }

  function setActive(next) {
    if (next === active) return;
    active = next;
    if (!built) return;
    cards.forEach((card, i) => {
      if (i === active) card.setAttribute("aria-selected", "true");
      else card.removeAttribute("aria-selected");
    });
    if (titleEl) {
      const item = DESTINATIONS[active];
      titleEl.firstElementChild.textContent = item.title;
      titleEl.querySelector(".dw-title-country").textContent = item.country || "";
    }
    const lis = indexEl.children;
    for (let i = 0; i < lis.length; i++) {
      lis[i].classList.toggle("active", i === active);
    }
    stage.setAttribute("aria-activedescendant", `destinations-wheel-${active}`);
  }

  const to = next => { target = clamp(next, 0, last + 1); };

  function draw() {
    raf = requestAnimationFrame(draw);
    if (!built) return;
    const gap = target - turn;
    if (Math.abs(gap) < 0.0005) turn = target;
    else turn += gap * (reduced ? 1 : EASE);
    const t = turn;
    const m = clamp(t, 0, 1);
    const pos = Math.max(0, t - 1);
    wheelEl.style.transform = `translateZ(${-m * drumR}px)`;
    for (let i = 0; i < count; i++) {
      const d = i - pos;
      const drumDeg = d * STEP;
      const card = cards[i];
      if (card) {
        card.style.transform = place(d * (360 / count), drumDeg, ringR, drumR, bow, m);
        card.style.opacity = m > 0.5 && Math.abs(d) > CULL ? "0" : "1";
        card.style.zIndex = String(Math.round(100 - Math.abs(d) * 2));
      }
      const face = card && card.firstElementChild;
      if (face) face.style.transform = `scale(${lerp(ringScale, 1, m)})`;
    }
    labelEl.style.opacity = String(1 - m);
    titleEl.style.opacity = String(m);
    setActive(clamp(Math.round(pos), 0, last));
  }

  // Tant que la roue est à l'écran, on capture la molette pour faire défiler
  // les destinations ; une fois arrivé au bout (ou au début), on relâche pour
  // laisser la page descendre / remonter normalement.
  let inView = false;
  if ("IntersectionObserver" in window) {
    const io = new IntersectionObserver(
      entries => { inView = entries[0].isIntersecting; },
      { threshold: 0.55 }
    );
    io.observe(stage);
  } else {
    inView = true;
  }

  const onWheel = event => {
    if (!inView) return;
    const dir = event.deltaY;
    const atEnd = target >= last && dir > 0;
    const atStart = target <= 0 && dir < 0;
    if (atEnd || atStart) return; // on libère le scroll de la page
    event.preventDefault();
    to(target + dir / WHEEL_UNITS);
    window.clearTimeout(settling);
    settling = window.setTimeout(() => to(Math.round(target)), SETTLE);
  };
  let settling = 0;

  const onPointerDown = event => {
    drag = { x: event.clientX, y: event.clientY };
    if (event.currentTarget.setPointerCapture) {
      event.currentTarget.setPointerCapture(event.pointerId);
    }
  };
  const onPointerMove = event => {
    if (!drag) return;
    const dx = drag.x - event.clientX;
    const dy = drag.y - event.clientY;
    const delta = Math.abs(dy) >= Math.abs(dx) ? dy : dx;
    to(target + delta / DRAG_UNITS);
    drag = { x: event.clientX, y: event.clientY };
  };
  const onPointerUp = () => {
    if (!drag) return;
    drag = null;
    if (target > 1) to(Math.round(target));
  };
  const onKeyDown = event => {
    if (event.key === "ArrowDown") to(Math.round(target) + 1);
    else if (event.key === "ArrowUp") to(Math.round(target) - 1);
    else return;
    event.preventDefault();
  };

  stage.addEventListener("wheel", onWheel, { passive: false });
  stage.addEventListener("pointerdown", onPointerDown);
  stage.addEventListener("pointermove", onPointerMove);
  stage.addEventListener("pointerup", onPointerUp);
  stage.addEventListener("pointercancel", onPointerUp);
  stage.addEventListener("keydown", onKeyDown);

  let ro = null;
  if ("ResizeObserver" in window) {
    ro = new ResizeObserver(() => {
      if (computeMetrics()) {
        if (!built) build();
        applySizes();
      }
    });
    ro.observe(stage);
  }
  if (computeMetrics() && !built) build();
  applySizes();
  raf = requestAnimationFrame(draw);
}