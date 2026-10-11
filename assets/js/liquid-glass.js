/**
 * Liquid Glass — intégration pour Manasik Bayt Travel.
 * Charge la lib WebGL (container.js + button.js) et l'applique
 * au menu Services (dropdown desktop) et aux boutons principaux.
 */

function loadScript(src) {
  return new Promise((resolve, reject) => {
    const s = document.createElement('script');
    s.src = src;
    s.onload = resolve;
    s.onerror = reject;
    document.head.appendChild(s);
  });
}

function loadStyle(href) {
  const link = document.createElement('link');
  link.rel = 'stylesheet';
  link.href = href;
  document.head.appendChild(link);
}

export async function initLiquidGlass() {
  const isHome = !document.body.hasAttribute('data-service-page');
  const base = isHome ? '' : '../';

  // Charge les CSS de la lib
  loadStyle(`${base}assets/vendor/liquid-glass/glass.css`);

  try {
    // Charge les scripts WebGL
    await loadScript(`${base}assets/vendor/liquid-glass/html2canvas.min.js`);
    await loadScript(`${base}assets/vendor/liquid-glass/container.js`);
    await loadScript(`${base}assets/vendor/liquid-glass/button.js`);

    // Active les effets glass sur les boutons .btn-primary dans le hero
    document.querySelectorAll('.hero .btn-primary, .hero .btn-secondary').forEach(btn => {
      btn.classList.add('glass-effect');
    });

    document.body.classList.add('liquid-glass-ready');
  } catch (e) {
    // Fallback CSS uniquement si WebGL échoue
    console.warn('Liquid Glass WebGL non disponible, fallback CSS actif.');
    document.body.classList.add('liquid-glass-css-only');
  }
}
