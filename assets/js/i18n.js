// Moteur i18n léger pour le site Manasik Bayt Travel.
// Traduit le contenu (nœuds de texte + attributs) en remplaçant le texte
// français par sa traduction, à partir du dictionnaire i18n-dict.js.
import { dict } from "./i18n-dict.js";

export const LANGS = ["fr", "en", "ar", "es"];

export const LANG_LABELS = {
  fr: "Français",
  en: "English",
  ar: "العربية",
  es: "Español",
};

const LS_KEY = "manasik_lang";
const ATTRS = ["placeholder", "alt", "aria-label", "title"];

function norm(s) {
  return (s || "")
    .replace(/\u00a0/g, " ")
    .replace(/[\u2018\u2019\u201b\u2032]/g, "'")
    .replace(/[\u201c\u201d]/g, '"')
    .replace(/\s+/g, " ")
    .trim();
}

// Normalise les clés du dictionnaire une fois au chargement.
const DICT = { en: {}, es: {}, ar: {} };
for (const lang of ["en", "es", "ar"]) {
  const src = (dict && dict[lang]) || {};
  for (const k of Object.keys(src)) {
    const v = src[k];
    if (v) DICT[lang][norm(k)] = v;
  }
}

let current = "fr";
const listeners = new Set();

export function getLang() {
  return current;
}

function readStored() {
  try {
    const v = localStorage.getItem(LS_KEY);
    if (v && LANGS.includes(v)) return v;
  } catch (_) {}
  return "fr";
}

export function t(str) {
  if (current === "fr") return str;
  const key = norm(str);
  const hit = DICT[current] && DICT[current][key];
  return hit || str;
}

const origText = new WeakMap();
const origAttr = new WeakMap();

function applyTo(root) {
  if (!root) return;
  // Attributs (placeholder, alt, aria-label, title)
  if (root.nodeType === 1) {
    for (const a of ATTRS) {
      if (root.hasAttribute && root.hasAttribute(a)) {
        let store = origAttr.get(root);
        if (!store) { store = {}; origAttr.set(root, store); }
        if (!(a in store)) store[a] = root.getAttribute(a);
        const tr = t(store[a]);
        if (tr !== root.getAttribute(a)) root.setAttribute(a, tr);
      }
    }
  }
  // Nœuds de texte (constantes numériques : indépendantes du global NodeFilter)
  const SHOW_TEXT = 4, ACCEPT = 1, REJECT = 2;
  const walker = document.createTreeWalker(root, SHOW_TEXT, {
    acceptNode(node) {
      const p = node.parentNode;
      if (!p) return REJECT;
      const tag = p.nodeName;
      if (tag === "SCRIPT" || tag === "STYLE" || tag === "TEXTAREA") {
        return REJECT;
      }
      if (p.closest && p.closest('[data-i18n-skip]')) {
        return REJECT;
      }
      if (!norm(node.nodeValue)) return REJECT;
      return ACCEPT;
    },
  });
  let n;
  const nodes = [];
  while ((n = walker.nextNode())) nodes.push(n);
  for (const node of nodes) {
    if (!origText.has(node)) origText.set(node, node.nodeValue);
    const tr = t(origText.get(node));
    if (tr !== node.nodeValue) node.nodeValue = tr;
  }
}

export function applyI18n(root = document.body) {
  applyTo(root);
  const html = document.documentElement;
  html.lang = current;
  const rtl = current === "ar";
  html.dir = rtl ? "rtl" : "ltr";
  html.classList.toggle("is-rtl", rtl);
  // Synchronise tous les sélecteurs présents sur la page.
  document
    .querySelectorAll("[data-lang-select]")
    .forEach((s) => { s.value = current; });
}

export function setLang(lang) {
  if (!LANGS.includes(lang)) return;
  current = lang;
  try { localStorage.setItem(LS_KEY, lang); } catch (_) {}
  applyI18n(document.body);
  listeners.forEach((cb) => { try { cb(lang); } catch (_) {} });
}

export function onLanguageChange(cb) {
  listeners.add(cb);
  return () => listeners.delete(cb);
}

// Injection d'un MutationObserver : traduit le contenu rendu dynamiquement
// (menus, grilles, témoignages, roue). On n'observe que les ajouts de nœuds
// (childList) : remplacer nodeValue / setAttribute ne déclenche pas de boucle.
let mo = null;
function observe() {
  if (mo || !document.body) return;
  if (typeof MutationObserver === "undefined") return;
  mo = new MutationObserver(() => {
    mo.disconnect();
    applyI18n(document.body);
    mo.observe(document.body, { childList: true, subtree: true });
  });
  mo.observe(document.body, { childList: true, subtree: true });
}

function boot() {
  current = readStored();
  applyI18n(document.body);
  observe();
  document.addEventListener("change", (e) => {
    const el = e.target;
    if (el && el.matches && el.matches("[data-lang-select]")) {
      setLang(el.value);
    }
  });
  // Rendus asynchrones éventuels (widgets partenaires...).
  window.addEventListener("load", () => applyI18n(document.body));
}

if (document.readyState === "loading") {
  document.addEventListener("DOMContentLoaded", boot);
} else {
  boot();
}

if (typeof window !== "undefined") {
  window.ManasikI18n = { t, setLang, getLang, applyI18n, onLanguageChange, LANGS, LANG_LABELS };
}
