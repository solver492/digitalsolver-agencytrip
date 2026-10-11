/**
 * search.js
 * Module partagé : moteur de recherche destinations
 * Importé par : destinations-hub.js, destination-page.js, script.js (search overlay)
 */

import { DESTINATIONS_CONFIG } from './destinations.config.js';

// ─────────────────────────────────────────────────────────────────────────────
// Normalisation
// ─────────────────────────────────────────────────────────────────────────────

/**
 * Normalise une chaîne : minuscules, sans accents, sans tirets/espaces multiples.
 * @param {string} str
 * @returns {string}
 */
export function normalize(str) {
  if (!str) return '';
  return str
    .toLowerCase()
    .normalize('NFD')                  // décompose les caractères accentués
    .replace(/[\u0300-\u036f]/g, '')   // supprime les marques diacritiques
    .replace(/[-_]/g, ' ')             // remplace tirets et underscores par espace
    .replace(/\s+/g, ' ')             // normalise les espaces multiples
    .trim();
}

// ─────────────────────────────────────────────────────────────────────────────
// Helpers internes
// ─────────────────────────────────────────────────────────────────────────────

/**
 * Calcule un score de pertinence pour une destination vis-à-vis d'une requête.
 * Score plus élevé = plus pertinent.
 *
 * Niveaux de priorité :
 *   100  – correspondance exacte sur le nom normalisé
 *    80  – préfixe sur le nom normalisé
 *    70  – contient dans le nom normalisé
 *    60  – correspondance exacte sur un alias
 *    50  – préfixe sur un alias
 *    40  – contient dans un alias
 *    30  – correspondance dans le pays ou la région
 *    20  – correspondance dans les tags
 *    10  – correspondance dans la tagline ou l'intro
 *     0  – aucune correspondance
 *
 * @param {object} dest  - entrée DESTINATIONS_CONFIG
 * @param {string} q     - requête normalisée
 * @returns {number}
 */
function score(dest, q) {
  const name    = normalize(dest.name);
  const country = normalize(dest.country);
  const region  = normalize(dest.region);
  const aliases = (dest.aliases || []).map(normalize);
  const tags    = (dest.tags    || []).map(normalize);
  const tagline = normalize(dest.tagline || '');
  const intro   = normalize(dest.intro   || '');

  // Nom — exact
  if (name === q)              return 100;
  // Nom — préfixe
  if (name.startsWith(q))     return 80;
  // Nom — contient
  if (name.includes(q))       return 70;

  // Alias — exact
  if (aliases.some(a => a === q))           return 60;
  // Alias — préfixe
  if (aliases.some(a => a.startsWith(q)))   return 50;
  // Alias — contient
  if (aliases.some(a => a.includes(q)))     return 40;

  // Pays — préfixe ou contient
  if (country.startsWith(q) || country.includes(q)) return 30;
  // Région — préfixe ou contient
  if (region.startsWith(q)  || region.includes(q))  return 30;

  // Tags — contient
  if (tags.some(t => t.includes(q) || q.includes(t))) return 20;

  // Tagline / intro — contient
  if (tagline.includes(q) || intro.includes(q))        return 10;

  return 0;
}

// ─────────────────────────────────────────────────────────────────────────────
// API publique
// ─────────────────────────────────────────────────────────────────────────────

/**
 * Recherche fuzzy dans les destinations.
 * Retourne un tableau trié par pertinence décroissante (max `limit` résultats).
 *
 * Champs interrogés : name, country, region, aliases, tags, tagline, intro.
 * Priorité : correspondance exacte > préfixe > contient.
 *
 * @param {string} query
 * @param {number} [limit=6]
 * @returns {object[]}
 */
export function searchDestinations(query, limit = 6) {
  if (!query || !query.trim()) return getFeatured();

  const q = normalize(query);

  // Filtre + score
  const results = DESTINATIONS_CONFIG
    .map(dest => ({ dest, s: score(dest, q) }))
    .filter(({ s }) => s > 0)
    .sort((a, b) => {
      // Tri principal : score décroissant
      if (b.s !== a.s) return b.s - a.s;
      // Tie-break : destinations featured en premier
      if (b.dest.featured !== a.dest.featured) return b.dest.featured ? 1 : -1;
      // Tie-break secondaire : ordre alphabétique du nom
      return a.dest.name.localeCompare(b.dest.name, 'fr');
    })
    .slice(0, limit)
    .map(({ dest }) => dest);

  return results;
}

/**
 * Retourne les destinations marquées `featured: true`.
 * Utilisé quand le champ de recherche est vide.
 *
 * @returns {object[]}
 */
export function getFeatured() {
  return DESTINATIONS_CONFIG.filter(d => d.featured);
}

/**
 * Cherche dans les services si aucune destination ne correspond.
 * Retourne les services dont un mot-clé est contenu dans la requête normalisée.
 *
 * @param {string} query
 * @returns {{ keywords: string[], slug: string, label: string }[]}
 */
export function searchServices(query) {
  const q = normalize(query);
  const map = [
    { keywords: ['vol', 'avion', 'flight', 'billet'],               slug: 'vols',            label: 'Vols' },
    { keywords: ['hotel', 'hôtel', 'hébergement', 'chambre', 'nuit'], slug: 'hotels',          label: 'Hôtels' },
    { keywords: ['voiture', 'car', 'location', 'auto'],              slug: 'location-voiture', label: 'Location de voiture' },
    { keywords: ['yacht', 'bateau', 'croisiere', 'mer'],             slug: 'yacht',            label: 'Location de yacht' },
    { keywords: ['activite', 'excursion', 'visite', 'sortie'],       slug: 'activites',        label: 'Activités & excursions' },
    { keywords: ['guide', 'accompagnateur'],                         slug: 'guides',           label: 'Guides & visites' },
    { keywords: ['esim', 'sim', 'internet', 'wifi', 'connexion'],    slug: 'esim',             label: 'eSIM' },
    { keywords: ['bagage', 'valise', 'consigne'],                    slug: 'bagages',          label: 'Bagages' },
    { keywords: ['transfert', 'navette', 'aeroport', 'taxi'],        slug: 'transferts',       label: 'Transferts aéroport' },
    { keywords: ['indemnisation', 'remboursement', 'retard', 'annulation'], slug: 'indemnisation', label: 'Indemnisation vol' },
  ];
  return map.filter(s => s.keywords.some(k => q.includes(normalize(k))));
}

/**
 * Trouve une destination par slug exact.
 *
 * @param {string} slug
 * @returns {object|null}
 */
export function getBySlug(slug) {
  return DESTINATIONS_CONFIG.find(d => d.slug === slug) || null;
}

/**
 * Retourne les destinations similaires à une destination donnée (max `max` résultats).
 * Critères par priorité décroissante :
 *   1. Même pays
 *   2. Tags en commun (score : nombre de tags partagés)
 *   3. Même région
 *
 * @param {string} slug  - slug de la destination de référence
 * @param {number} [max=3]
 * @returns {object[]}
 */
export function getSimilar(slug, max = 3) {
  const ref = getBySlug(slug);
  if (!ref) return [];

  const refTags = new Set(ref.tags || []);

  return DESTINATIONS_CONFIG
    .filter(d => d.slug !== slug) // exclure la destination elle-même
    .map(dest => {
      let s = 0;

      // Même pays → bonus élevé
      if (dest.country === ref.country) s += 10;

      // Tags communs → bonus proportionnel
      const commonTags = (dest.tags || []).filter(t => refTags.has(t)).length;
      s += commonTags * 5;

      // Même région → petit bonus
      if (dest.region === ref.region) s += 2;

      return { dest, s };
    })
    .filter(({ s }) => s > 0)           // au moins un point commun
    .sort((a, b) => {
      if (b.s !== a.s) return b.s - a.s;
      // Tie-break : featured en premier
      if (b.dest.featured !== a.dest.featured) return b.dest.featured ? 1 : -1;
      return a.dest.name.localeCompare(b.dest.name, 'fr');
    })
    .slice(0, max)
    .map(({ dest }) => dest);
}
