import { services } from './services.config.js';
import { initStaggerTestimonials } from './testimonials.js';
import { initDestinationsWheel } from './destinations.js';
import { initLiquidGlass } from './liquid-glass.js';
import { applyI18n } from './i18n.js';

function buildServiceLinks(base, className, withAll = false) {
  const allLink = withAll
    ? `<li><a href="${base}index.html#services" class="${className} services-all-link">Tous nos services</a></li>`
    : '';
  return allLink + services
    .map(s => `<li><a href="${base}${s.route}" class="${className}">${s.nav}</a></li>`)
    .join('');
}

function enhanceHeader() {
  const isHome = !document.querySelector('body[data-service-page]');
  const base = isHome ? '' : '../';

  // Desktop: transform the existing "Services" button into a dropdown.
  const desktopBtn = document.querySelector('[data-services-desktop]');
  if (desktopBtn) {
    const wrapper = document.createElement('div');
    wrapper.className = 'services-dropdown';
    wrapper.innerHTML = `
      <button class="btn btn-primary services-dropdown-toggle" aria-haspopup="true" aria-expanded="false">
        Services <ion-icon name="chevron-down-outline"></ion-icon>
      </button>
      <ul class="services-dropdown-menu">
        ${buildServiceLinks(base, 'services-dropdown-link', true)}
      </ul>`;
    desktopBtn.replaceWith(wrapper);

    const toggle = wrapper.querySelector('.services-dropdown-toggle');
    toggle.addEventListener('click', (e) => {
      e.stopPropagation();
      const open = wrapper.classList.toggle('open');
      toggle.setAttribute('aria-expanded', open ? 'true' : 'false');
    });
    document.addEventListener('click', () => wrapper.classList.remove('open'));
  }

  // Mobile drawer: add a "Services" accordion entry in 2nd position (after Accueil).
  const navbarList = document.querySelector('.navbar-list');
  if (navbarList && !navbarList.querySelector('.nav-services-item')) {
    const li = document.createElement('li');
    li.className = 'nav-services-item';
    li.innerHTML = `
      <button class="navbar-link nav-services-toggle" aria-expanded="false">
        Services <ion-icon name="chevron-down-outline"></ion-icon>
      </button>
      <ul class="nav-services-submenu">
        <li><a href="${base}index.html#services" class="nav-services-link" data-nav-link>Tous nos services</a></li>
        ${services.map(s => `<li><a href="${base}${s.route}" class="nav-services-link" data-nav-link>${s.nav}</a></li>`).join('')}
      </ul>`;
    // Insert after the first <li> (Accueil), i.e. at index 1.
    const firstLi = navbarList.children[0];
    if (firstLi && firstLi.nextSibling) {
      navbarList.insertBefore(li, firstLi.nextSibling);
    } else {
      navbarList.appendChild(li);
    }

    const toggle = li.querySelector('.nav-services-toggle');
    toggle.addEventListener('click', (e) => {
      e.preventDefault();
      const open = li.classList.toggle('open');
      toggle.setAttribute('aria-expanded', open ? 'true' : 'false');
    });

    // Close drawer when a final sub-link is clicked.
    li.querySelectorAll('[data-nav-link]').forEach(link => {
      link.addEventListener('click', () => {
        const navbar = document.querySelector('[data-navbar]');
        const overlay = document.querySelector('[data-overlay]');
        if (navbar) navbar.classList.remove('active');
        if (overlay) overlay.classList.remove('active');
        document.body.classList.remove('nav-open');
      });
    });
  }
}

function renderFooterServices() {
  const targets = document.querySelectorAll('[data-footer-services]');
  if (!targets.length) return;
  const isHome = !document.body.hasAttribute('data-service-page');
  const base = isHome ? '' : '../';
  const allServicesLink = `<li><a href="${base}index.html#services" class="footer-link">Tous nos services</a></li>`;
  const html = allServicesLink + services
    .map(s => `<li><a href="${base}${s.route}" class="footer-link">${s.nav}</a></li>`)
    .join('');
  targets.forEach(t => { t.insertAdjacentHTML('beforeend', html); });
}

function renderHomeServices() {
  const grid = document.querySelector('[data-home-services]');
  if (!grid) return;
  grid.innerHTML = services.map(s => `
    <article class="service-card">
      <div class="service-card-icon"><ion-icon name="${s.icon}"></ion-icon></div>
      <h3 class="service-card-title">${s.nav}</h3>
      <p class="service-card-text">${s.short}</p>
      <a href="${s.route}" class="btn btn-primary service-card-btn">Découvrir</a>
    </article>`).join('');
}

function formatDate(value) {
  if (!value) return '';
  const [y, m, d] = value.split('-');
  if (!y || !m || !d) return value;
  return `${d}/${m}/${y}`;
}

function initDeviseWhatsApp() {
  const form = document.getElementById('devis-form');
  if (!form) return;
  const PHONE = '212661631160';
  form.addEventListener('submit', (event) => {
    event.preventDefault();
    const value = id => (document.getElementById(id) || {}).value || '';
    const rows = [
      ['Destination souhaitée', value('destination')],
      ['Nombre de voyageurs', value('people')],
      ["Date d'arrivée", formatDate(value('checkin'))],
      ['Date de départ', formatDate(value('checkout'))],
    ];
    const detail = rows.map(([k, v]) => `\u2022 ${k} : ${v}`).join('\n');
    const message =
      'Bonjour Manasik Bayt Travel,\n' +
      'je souhaite un devis pour :\n\n' +
      detail +
      '\n\nMerci et à bientôt.';
    const url = `https://wa.me/${PHONE}?text=${encodeURIComponent(message)}`;
    window.open(url, '_blank', 'noopener');
  });
}

/**
 * Autocomplete du champ #destination dans le formulaire de devis.
 * Affiche une dropdown de suggestions (max 5) issues de search.js.
 * Au clic sur une suggestion → remplit le champ et mémorise le slug.
 * À la soumission : si slug reconnu → destination.html#destination/<slug>
 *   avec params pax/dates ; sinon comportement WhatsApp habituel.
 */
function initHomeSearchAutocomplete() {
  const destInput = document.getElementById('destination');
  if (!destInput) return;

  const isHome = !document.body.hasAttribute('data-service-page');
  const base   = isHome ? './' : '../';

  // Dropdown container
  const dropdown = document.createElement('ul');
  dropdown.className = 'dest-autocomplete-dropdown';
  dropdown.setAttribute('role', 'listbox');
  dropdown.setAttribute('aria-label', 'Suggestions de destinations');
  dropdown.style.display = 'none';
  destInput.parentNode.style.position = 'relative';
  destInput.parentNode.appendChild(dropdown);

  let selectedSlug = null;
  let searchMod    = null;
  let debounceId   = null;

  function loadMod(cb) {
    if (searchMod) { cb(searchMod); return; }
    import(base + 'assets/js/search.js')
      .then(mod => { searchMod = mod; cb(mod); })
      .catch(err => console.error('[autocomplete] Impossible de charger search.js', err));
  }

  function closeDropdown() {
    dropdown.innerHTML = '';
    dropdown.style.display = 'none';
  }

  function renderDropdown(results) {
    dropdown.innerHTML = '';
    if (!results.length) { closeDropdown(); return; }
    results.slice(0, 5).forEach(dest => {
      const li = document.createElement('li');
      li.className = 'dest-autocomplete-item';
      li.setAttribute('role', 'option');
      li.setAttribute('tabindex', '-1');
      li.textContent = dest.name + (dest.country ? ' — ' + dest.country : '');
      li.addEventListener('mousedown', e => {
        // mousedown avant blur pour éviter que le blur ne ferme avant le clic
        e.preventDefault();
        destInput.value = dest.name;
        selectedSlug = dest.slug;
        closeDropdown();
      });
      dropdown.appendChild(li);
    });
    dropdown.style.display = 'block';
  }

  // ── Saisie ────────────────────────────────────────────────────────────────
  destInput.addEventListener('input', () => {
    selectedSlug = null;
    const q = destInput.value.trim();
    clearTimeout(debounceId);
    if (q.length < 1) { closeDropdown(); return; }
    debounceId = setTimeout(() => {
      loadMod(mod => renderDropdown(mod.searchDestinations(q, 5)));
    }, 150);
  });

  // ── Fermeture sur perte de focus ─────────────────────────────────────────
  destInput.addEventListener('blur', () => {
    setTimeout(closeDropdown, 150);
  });

  // ── Navigation clavier dans la dropdown ──────────────────────────────────
  destInput.addEventListener('keydown', e => {
    const items = dropdown.querySelectorAll('.dest-autocomplete-item');
    if (!items.length) return;
    if (e.key === 'ArrowDown') {
      e.preventDefault();
      items[0].focus();
    } else if (e.key === 'Escape') {
      closeDropdown();
    }
  });

  dropdown.addEventListener('keydown', e => {
    const items = [...dropdown.querySelectorAll('.dest-autocomplete-item')];
    const idx   = items.indexOf(document.activeElement);
    if (e.key === 'ArrowDown') {
      e.preventDefault();
      if (idx < items.length - 1) items[idx + 1].focus();
    } else if (e.key === 'ArrowUp') {
      e.preventDefault();
      if (idx > 0) items[idx - 1].focus();
      else destInput.focus();
    } else if (e.key === 'Enter') {
      e.preventDefault();
      if (idx >= 0) items[idx].dispatchEvent(new MouseEvent('mousedown', { bubbles: true }));
    } else if (e.key === 'Escape') {
      closeDropdown();
      destInput.focus();
    }
  });

  // ── Soumission ────────────────────────────────────────────────────────────
  const form = document.getElementById('devis-form');
  if (!form) return;

  form.addEventListener('submit', e => {
    if (!selectedSlug) return; // laisse initDeviseWhatsApp gérer la soumission normale
    e.preventDefault();
    e.stopImmediatePropagation(); // empêche initDeviseWhatsApp d'intercepter aussi
    const pax     = (document.getElementById('people')  || {}).value || '';
    const checkin = (document.getElementById('checkin') || {}).value || '';
    const checkout= (document.getElementById('checkout')|| {}).value || '';
    const params  = [];
    if (pax)     params.push('pax='     + encodeURIComponent(pax));
    if (checkin) params.push('checkin=' + encodeURIComponent(checkin));
    if (checkout)params.push('checkout='+ encodeURIComponent(checkout));
    const qs   = params.length ? '?' + params.join('&') : '';
    window.location.href = base + 'destination.html#destination/' + selectedSlug + qs;
  }, true); // capture = true pour passer avant initDeviseWhatsApp
}

async function init() {
  enhanceHeader();
  renderFooterServices();
  renderHomeServices();
  initStaggerTestimonials(document.querySelector('[data-testimonials]'));
  initDestinationsWheel(document.querySelector('[data-destinations-section]'), 'Nos destinations', 'Découvrir');
  await initLiquidGlass();
  initDeviseWhatsApp();
  initHomeSearchAutocomplete();
  applyI18n(document.body);
}

// Anti-flash thème : appliqué dans script.js (chargé avant ce module)

if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', init);
} else {
  init();
}
