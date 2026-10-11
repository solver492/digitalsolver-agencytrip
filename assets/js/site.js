import { services } from './services.config.js';
import { initStaggerTestimonials } from './testimonials.js';
import { initDestinationsWheel } from './destinations.js';
import { initLiquidGlass } from './liquid-glass.js';
import { applyI18n } from './i18n.js';

function buildServiceLinks(base, className) {
  return services
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
        ${buildServiceLinks(base, 'services-dropdown-link')}
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

  // Mobile drawer: add a "Services" accordion entry.
  const navbarList = document.querySelector('.navbar-list');
  if (navbarList && !navbarList.querySelector('.nav-services-item')) {
    const li = document.createElement('li');
    li.className = 'nav-services-item';
    li.innerHTML = `
      <button class="navbar-link nav-services-toggle" aria-expanded="false">
        Services <ion-icon name="chevron-down-outline"></ion-icon>
      </button>
      <ul class="nav-services-submenu">
        ${buildServiceLinks(base, 'nav-services-link')}
      </ul>`;
    const contactLi = Array.from(navbarList.children).find(x => /contact/i.test(x.textContent));
    if (contactLi) navbarList.insertBefore(li, contactLi);
    else navbarList.appendChild(li);

    const toggle = li.querySelector('.nav-services-toggle');
    toggle.addEventListener('click', (e) => {
      e.preventDefault();
      const open = li.classList.toggle('open');
      toggle.setAttribute('aria-expanded', open ? 'true' : 'false');
    });
  }
}

function renderFooterServices() {
  const targets = document.querySelectorAll('[data-footer-services]');
  if (!targets.length) return;
  const isHome = !document.body.hasAttribute('data-service-page');
  const base = isHome ? '' : '../';
  const html = services
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

function init() {
  enhanceHeader();
  renderFooterServices();
  renderHomeServices();
  initStaggerTestimonials(document.querySelector('[data-testimonials]'));
  initDestinationsWheel(document.querySelector('[data-destinations-section]'), 'Nos destinations');
  initLiquidGlass();
  initDeviseWhatsApp();
  applyI18n(document.body);
}

if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', init);
} else {
  init();
}
