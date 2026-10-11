// Le menu Services est rendu en CSS glassmorphism (capsules de verre cristallisé).
// Le rendu WebGL de la lib masquait les liens réels (photographie figée via
// html2canvas) : on ne construit donc plus le panneau WebGL ici.
// Les boutons gardent leur look liquid-glass, appliqué en CSS (.btn dans style.css).
export function initLiquidGlass() {
  document.body.classList.remove("liquid-glass-off");
}
