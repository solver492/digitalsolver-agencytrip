const SQRT_5000 = Math.sqrt(5000);

const TESTIMONIALS = [
  { t: "Notre Omra en famille a été parfaitement organisée par Manasik Bayt Travel, du visa jusqu'au retour.", by: "Amina, Lyon", img: "./assets/images/logo-manasik.jpeg" },
  { t: "Vols, transferts et hôtel à deux pas du Haram : tout était réservé, je n'ai eu qu'à prier.", by: "Karim, Paris", img: "./assets/images/gallery-1.jpg" },
  { t: "L'équipe a géré notre dossier Elhadj de A à Z. Un accompagnement rassurant et humain.", by: "Fatima, Bruxelles", img: "./assets/images/gallery-2.jpg" },
  { t: "Transferts Jeddah–Médine impeccables et chauffeurs très ponctuels. Merci Manasik Bayt !", by: "Youssef, Montréal", img: "./assets/images/gallery-3.jpg" },
  { t: "Un hôtel confortable face à la mosquée et un suivi constant pendant tout le séjour.", by: "Nadia, Genève", img: "./assets/images/gallery-4.jpg" },
  { t: "Réactivité remarquable : ils ont trouvé une solution quand notre vol a été retardé.", by: "Rachid, Paris", img: "./assets/images/gallery-5.jpg" },
  { t: "Premiers pas vers le Hajj en toute sérénité grâce à leurs conseils et à leur expérience.", by: "Oussama, Marseille", img: "./assets/images/logo-manasik.jpeg" },
  { t: "Groupes bien encadrés, guides disponibles : une Omra spirituelle sans le moindre souci.", by: "Sarah, Toulouse", img: "./assets/images/gallery-1.jpg" },
  { t: "La réservation en ligne est simple et l'équipe répond en quelques minutes sur WhatsApp.", by: "Hicham, Lille", img: "./assets/images/gallery-2.jpg" },
  { t: "Une agence à l'écoute des familles, avec des offres adaptées à notre budget.", by: "Lina, Strasbourg", img: "./assets/images/gallery-3.jpg" },
  { t: "Prix clairs, sans surprise, et excursions à Médine organisées avec beaucoup de soin.", by: "Mehdi, Bordeaux", img: "./assets/images/gallery-4.jpg" },
  { t: "eSIM activée avant le départ, hôtels et transferts confirmés : zéro stress.", by: "Salma, Nantes", img: "./assets/images/gallery-5.jpg" },
  { t: "Notre groupe Omra était formidablement accompagné, je repars avec eux incha'Allah.", by: "Abdel, Casablanca", img: "./assets/images/logo-manasik.jpeg" },
  { t: "Enfin une agence qui gère tout : vol, hôtel, transport, excursions et assurance.", by: "Karima, Rabat", img: "./assets/images/gallery-1.jpg" },
];

export function initStaggerTestimonials(root) {
  if (!root) return;
  const stage = root.classList.contains("ts-stage")
    ? root
    : root.querySelector(".ts-stage");
  if (!stage) return;

  let list = TESTIMONIALS.map(t => ({ ...t }));
  let cardSize = 365;

  const mqReduced = window.matchMedia("(prefers-reduced-motion: reduce)");
  let reduced = mqReduced.matches;

  let autoTimer = 0;
  const AUTOPLAY_MS = 4200;
  function stopAuto() {
    if (autoTimer) { window.clearInterval(autoTimer); autoTimer = 0; }
  }
  function startAuto() {
    stopAuto();
    if (reduced) return;
    autoTimer = window.setInterval(() => move(1), AUTOPLAY_MS);
  }

  const mq = window.matchMedia("(min-width: 640px)");
  const updateSize = () => {
    cardSize = mq.matches ? 365 : 290;
  };
  updateSize();
  if (mq.addEventListener) mq.addEventListener("change", updateSize);
  else if (mq.addListener) mq.addListener(updateSize);

  const positionFor = (index, len) =>
    len % 2 ? index - (len + 1) / 2 : index - len / 2;

  function move(steps) {
    const copy = [...list];
    if (steps > 0) {
      for (let i = steps; i > 0; i--) {
        const item = copy.shift();
        if (!item) return;
        copy.push({ ...item, tempId: Math.random() });
      }
    } else {
      for (let i = steps; i < 0; i++) {
        const item = copy.pop();
        if (!item) return;
        copy.unshift({ ...item, tempId: Math.random() });
      }
    }
    list = copy;
    render();
  }

  function render() {
    stage.innerHTML = "";
    const nav = document.createElement("div");
    nav.className = "ts-nav";
    const prev = document.createElement("button");
    prev.type = "button";
    prev.className = "ts-btn";
    prev.setAttribute("aria-label", "Témoignage précédent");
    prev.innerHTML = "&#8249;";
    prev.addEventListener("click", () => { move(-1); startAuto(); });
    const next = document.createElement("button");
    next.type = "button";
    next.className = "ts-btn";
    next.setAttribute("aria-label", "Témoignage suivant");
    next.innerHTML = "&#8250;";
    next.addEventListener("click", () => { move(1); startAuto(); });
    nav.append(prev, next);

    list.forEach((testimonial, index) => {
      const pos = positionFor(index, list.length);
      const isCenter = pos === 0;
      const card = document.createElement("div");
      card.className = "ts-card" + (isCenter ? " is-center" : "");
      const offsetX = (cardSize / 1.5) * pos;
      const translateY = isCenter ? -65 : pos % 2 ? 15 : -15;
      const rotate = isCenter ? 0 : pos % 2 ? 2.5 : -2.5;
      card.style.width = cardSize + "px";
      card.style.height = cardSize + "px";
      card.style.clipPath =
        "polygon(50px 0%, calc(100% - 50px) 0%, 100% 50px, 100% 100%, calc(100% - 50px) 100%, 50px 100%, 0 100%, 0 0)";
      card.style.transform =
        `translate(-50%, -50%) translateX(${offsetX}px) ` +
        `translateY(${translateY}px) rotate(${rotate}deg)`;
      card.style.boxShadow = isCenter
        ? "0 8px 0 0 rgba(0,0,0,0.12)"
        : "0 0 0 0 transparent";
      card.addEventListener("click", () => { move(pos); startAuto(); });

      const tab = document.createElement("span");
      tab.className = "ts-tab";
      tab.style.right = "-2px";
      tab.style.top = "48px";
      tab.style.width = SQRT_5000 + "px";
      tab.style.height = "2px";
      card.appendChild(tab);

      const img = document.createElement("img");
      img.src = testimonial.img;
      img.alt = testimonial.by;
      card.appendChild(img);

      const quote = document.createElement("h3");
      quote.className = "ts-quote";
      quote.textContent = testimonial.t;
      card.appendChild(quote);

      const by = document.createElement("p");
      by.textContent = `- ${testimonial.by}`;
      card.appendChild(by);

      stage.appendChild(card);
    });

    stage.appendChild(nav);
  }

  const onResize = () => {
    updateSize();
    render();
  };
  window.addEventListener("resize", onResize);

  if (mqReduced.addEventListener) {
    mqReduced.addEventListener("change", e => { reduced = e.matches; if (reduced) stopAuto(); else startAuto(); });
  }

  stage.addEventListener("pointerenter", stopAuto);
  stage.addEventListener("pointerleave", startAuto);
  stage.addEventListener("focusin", stopAuto);

  render();
  startAuto();
}