import { widgets } from './widgets.config.js';

const isFilled = slot =>
  !!slot && typeof slot.script === 'string' && slot.script.trim() !== '';

function hideSlot(el) {
  const section = el.closest('section');
  const target = section || el;
  target.style.display = 'none';
  // Si le bloc masqué était une cible d'ancre (ex. #widget-principal),
  // on masque aussi les boutons qui pointaient dessus (sinon lien mort).
  if (section && section.id) {
    document
      .querySelectorAll(`a[href="#${section.id}"]`)
      .forEach(a => { a.style.display = 'none'; });
  }
}

function renderSlot(el, slot) {
  const wrapper = document.createElement('div');
  wrapper.style.width = '100%';
  wrapper.style.maxWidth = '100%';
  wrapper.style.overflowX = 'auto';
  const temp = document.createElement('div');
  temp.innerHTML = slot.script;
  temp.querySelectorAll('script').forEach(scr => {
    const s = document.createElement('script');
    if (scr.src) {
      s.src = scr.src;
      if (scr.async) s.async = true;
      if (scr.charset) s.charset = scr.charset;
    } else {
      s.text = scr.text || scr.innerText;
    }
    wrapper.appendChild(s);
  });
  el.innerHTML = '';
  el.appendChild(wrapper);
}

export function renderWidgetSlots(pageKey) {
  const slots = widgets[pageKey] || [];
  const byId = new Map(slots.map(s => [s.id, s]));

  // On parcourt les emplacements réellement présents dans la page :
  // tout emplacement vide (sans script, ou absent de la config) est masqué
  // (position + titre) tant qu'aucun widget n'y est implémenté.
  document.querySelectorAll('.widget-slot').forEach(el => {
    const slot = byId.get(el.id);
    if (!isFilled(slot)) {
      hideSlot(el);
      return;
    }
    renderSlot(el, slot);
  });
}
