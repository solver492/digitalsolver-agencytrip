/**
 * destinations-hub.js
 * Pilote la page destinations.html :
 *   - Grille des destinations avec filtres pills et pastille ?q=
 *   - Deux rangées de chips (types de séjour / pays)
 *   - Bouton Tout
 *   - Pastille dismissible si ?q= dans l'URL
 */

import { DESTINATIONS_CONFIG } from './destinations.config.js';
import { normalize } from './search.js';

const TAG_LABELS = {
  'omra-hajj':  'Omra & Hajj',
  'culture':    'Culture',
  'plage':      'Plage',
  'nature':     'Nature',
  'ville':      'Ville',
  'montagne':   'Montagne',
  'famille':    'Famille',
  'luxe':       'Luxe',
};

const $ = s => document.querySelector(s);

let activeTag     = null;
let activeCountry = null;
let searchQuery   = '';

// ─── Chips ─────────────────────────────────────────────────────────────────

function buildChips() {
  const rowTags      = $('#dest-chips-tags');
  const rowCountries = $('#dest-chips-countries');
  if (!rowTags || !rowCountries) return;

  const countries = [...new Set(DESTINATIONS_CONFIG.map(d => d.country))].sort((a, b) =>
    a.localeCompare(b, 'fr')
  );
  const usedTags = Object.keys(TAG_LABELS).filter(tag =>
    DESTINATIONS_CONFIG.some(d => (d.tags || []).includes(tag))
  );

  // Bouton Tout dans la 1ère rangée
  const resetBtn = document.createElement('button');
  resetBtn.className = 'dest-filter-chip dest-filter-chip--reset';
  resetBtn.textContent = 'Tout';
  resetBtn.addEventListener('click', resetFilters);
  rowTags.appendChild(resetBtn);

  // Rangée 1 : tags
  usedTags.forEach(tag => {
    const btn = document.createElement('button');
    btn.className = 'dest-filter-chip';
    btn.dataset.filterType  = 'tag';
    btn.dataset.filterValue = tag;
    btn.setAttribute('aria-pressed', 'false');
    btn.textContent = TAG_LABELS[tag];
    btn.addEventListener('click', () => toggleChip(btn, 'tag', tag));
    rowTags.appendChild(btn);
  });

  // Rangée 2 : pays
  countries.forEach(country => {
    const btn = document.createElement('button');
    btn.className = 'dest-filter-chip';
    btn.dataset.filterType  = 'country';
    btn.dataset.filterValue = country;
    btn.setAttribute('aria-pressed', 'false');
    btn.textContent = country;
    btn.addEventListener('click', () => toggleChip(btn, 'country', country));
    rowCountries.appendChild(btn);
  });
}

function toggleChip(btn, type, value) {
  const rowId  = type === 'tag' ? '#dest-chips-tags' : '#dest-chips-countries';
  const isActive = btn.getAttribute('aria-pressed') === 'true';

  // Désactiver tous les chips du même type
  document.querySelectorAll(`${rowId} .dest-filter-chip[data-filter-type]`).forEach(b => {
    b.setAttribute('aria-pressed', 'false');
    b.classList.remove('active');
  });

  if (!isActive) {
    btn.setAttribute('aria-pressed', 'true');
    btn.classList.add('active');
    if (type === 'tag')     activeTag     = value;
    if (type === 'country') activeCountry = value;
  } else {
    if (type === 'tag')     activeTag     = null;
    if (type === 'country') activeCountry = null;
  }
  renderGrid();
}

function resetFilters() {
  activeTag = null;
  activeCountry = null;
  searchQuery = '';
  document.querySelectorAll('.dest-filter-chip[data-filter-type]').forEach(b => {
    b.setAttribute('aria-pressed', 'false');
    b.classList.remove('active');
  });
  // Supprimer la pastille ?q=
  hidePill();
  renderGrid();
}

// ─── Pastille ?q= ──────────────────────────────────────────────────────────

function showPill(q) {
  const pill = $('#dest-q-pill');
  if (!pill) return;
  pill.style.display = 'flex';
  pill.innerHTML = `
    <span>Recherche : <strong>${q}</strong></span>
    <button class="dest-q-pill-close" aria-label="Effacer la recherche">&times;</button>
  `;
  pill.querySelector('.dest-q-pill-close').addEventListener('click', () => {
    searchQuery = '';
    hidePill();
    // Nettoie l'URL
    history.replaceState(null, '', window.location.pathname);
    renderGrid();
  });
}

function hidePill() {
  const pill = $('#dest-q-pill');
  if (pill) pill.style.display = 'none';
}

// ─── Filtre ─────────────────────────────────────────────────────────────────

function getFiltered() {
  let results = DESTINATIONS_CONFIG;

  if (searchQuery.length >= 1) {
    const q = normalize(searchQuery);
    results = results.filter(d => {
      const fields = [d.name, d.country, d.region, d.tagline,
                      ...(d.aliases || []), ...(d.tags || [])].map(normalize);
      return fields.some(f => f.includes(q));
    });
  }

  if (activeTag)     results = results.filter(d => (d.tags || []).includes(activeTag));
  if (activeCountry) results = results.filter(d => d.country === activeCountry);

  return results;
}

// ─── Rendu grille ──────────────────────────────────────────────────────────

function renderCard(dest) {
  const imgPath = dest.image || `assets/images/destinations/${dest.slug}.jpg`;
  const isHajj  = (dest.tags || []).includes('omra-hajj');

  return `
    <article class="dest-card" role="listitem">
      <a href="destination.html#destination/${dest.slug}" class="dest-card-link" aria-label="D\u00e9couvrir ${dest.name}">
        <div class="dest-card-img">
          <img
            src="${imgPath}"
            alt="${dest.name}, ${dest.country}"
            loading="lazy"
            width="800" height="533"
            onerror="this.style.display='none';this.nextElementSibling&&(this.nextElementSibling.style.display='flex')"
          />
          <span class="dest-card-img-fallback" style="display:none">${dest.name}</span>
          ${isHajj ? '<span class="dest-card-badge">Omra &amp; Hajj</span>' : ''}
        </div>
        <div class="dest-card-body">
          <h3 class="dest-card-name">${dest.name}</h3>
          <p class="dest-card-country">
            <ion-icon name="location-outline" aria-hidden="true"></ion-icon>
            ${dest.country}
          </p>
          <p class="dest-card-tagline">${dest.tagline || ''}</p>
          <span class="dest-card-btn">D\u00e9couvrir</span>
        </div>
      </a>
    </article>
  `;
}

function renderGrid() {
  const grid  = $('#dest-grid-container');
  const empty = $('#dest-empty');
  if (!grid) return;

  const results = getFiltered();

  if (results.length === 0) {
    grid.innerHTML = '';
    if (empty) empty.style.display = 'block';
  } else {
    grid.innerHTML = results.map(renderCard).join('');
    if (empty) empty.style.display = 'none';
  }
}

// ─── Bouton clear dans état vide ────────────────────────────────────────────

function initClearBtn() {
  const btn = $('#dest-clear-btn');
  if (btn) btn.addEventListener('click', resetFilters);
}

// ─── Pastille ?q= depuis URL ────────────────────────────────────────────────

function initQParam() {
  const urlQ = new URLSearchParams(window.location.search).get('q') || '';
  if (urlQ) {
    searchQuery = urlQ;
    showPill(urlQ);
  }
}

// ─── Init ───────────────────────────────────────────────────────────────────

function init() {
  buildChips();
  initQParam();
  initClearBtn();
  renderGrid();
}

if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', init);
} else {
  init();
}
