# Inventaire des scripts Travelpayouts — Manasik Bayt Travel

> **Source unique** : `assets/js/widgets.config.js`  
> **Injection** : `assets/js/widget-slot.js` → `renderWidgetSlots(pageKey)`  
> **Marqueurs communs** : `trs=499986` · `shmarker=704597`  
> **Règle de discrétion** : les noms de marques partenaires (Aviasales, Kiwitaxi, Klook, Airalo, AirHelp, Compensair) **ne sont jamais affichés** dans l'interface rendue.

---

## Paramètres globaux communs à tous les scripts

| Paramètre | Valeur | Rôle |
|-----------|--------|------|
| `trs` | `499986` | Identifiant tracking Travelpayouts |
| `shmarker` | `704597` | Sous-marqueur de l'éditeur |
| `powered_by` | `false` | Masque le badge « Powered by » |
| `locale` / `language` | `en` (par défaut) | Langue des widgets |
| `currency` | `USD` ou `usd` | Devise d'affichage |

---

## 1. VOLS — Page `services/vols.html` · `campaign_id=100`

### 1.1 `vols-search` — Formulaire de recherche de vols
- **Type** : `search-form`
- **promo_id** : `2811`
- **Détails** : Origine LON → Destination BKK, sans vols directs, 5 lignes min, fond blanc

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&color_button=%23FF0000&target_host=www.aviasales.com%2Fsearch&locale=en&powered_by=false&origin=LON&destination=BKK&with_fallback=false&non_direct_flights=true&min_lines=5&border_radius=0&color_background=%23FFFFFF&color_text=%23000000&color_border=%23FFFFFF&promo_id=2811&campaign_id=100" charset="utf-8"></script>
```

---

### 1.2 `vols-popular-routes` — Destinations populaires / vols pas chers
- **Type** : `popular-routes`
- **promo_id** : `4044`
- **Détails** : 6 résultats, couleur primaire bleue `#0085FF`

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&target_host=www.aviasales.com%2Fsearch&locale=en&limit=6&powered_by=false&primary=%230085FF&promo_id=4044&campaign_id=100" charset="utf-8"></script>
```

---

### 1.3 `vols-prices-map` — Carte des prix
- **Type** : `prices-map`
- **promo_id** : `4054`
- **Détails** : Carte interactive 1500×500px, origine LON, zoom 2, draggable

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&lat=51.5073509&lng=-0.1277583&powered_by=false&search_host=www.aviasales.com%2Fsearch&locale=en&origin=LON&value_min=0&value_max=1000000&round_trip=true&only_direct=false&radius=1&draggable=true&disable_zoom=false&show_logo=false&scrollwheel=false&primary=%233FABDB&secondary=%233FABDB&light=%23ffffff&width=1500&height=500&zoom=2&promo_id=4054&campaign_id=100" charset="utf-8"></script>
```

---

### 1.4 `vols-calendar` — Calendrier des prix bas
- **Type** : `pricing-calendar`
- **promo_id** : `4041`
- **Détails** : Période annuelle, durée 7-14 jours, aller-retour

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&searchUrl=www.aviasales.com%2Fsearch&locale=en&powered_by=false&one_way=false&only_direct=false&period=year&range=7%2C14&primary=%230C73FE&color_background=%23ffffff&dark=%23000000&light=%23FFFFFF&achieve=%2345AD35&promo_id=4041&campaign_id=100" charset="utf-8"></script>
```

---

### 1.5 `vols-search-alt` — Recherche de vols (variante avec hôtels)
- **Type** : `search-form`
- **promo_id** : `7879`
- **Détails** : Affiche aussi les hôtels, couleur bouton `#00A991`

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&show_hotels=true&powered_by=false&locale=en&searchUrl=www.aviasales.com%2Fsearch&primary_override=%2332a8dd&color_button=%2300A991&color_icons=%2332a8dd&dark=%23262626&light=%23FFFFFF&secondary=%23FFFFFF&special=%23C4C4C4&color_focused=%2332a8dd&border_radius=0&plain=false&promo_id=7879&campaign_id=100" charset="utf-8"></script>
```

---

## 2. HÔTELS — Page `services/hotels.html` · `campaign_id=111`

### 2.1 `hotels-search` — Formulaire de recherche d'hôtels
- **Type** : `search-form`
- **promo_id** : `3414`
- **Détails** : Fond blanc, bouton vert `#00A991`, plain mode

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&locale=en&stops=any&show_hotels=true&powered_by=false&border_radius=0&plain=true&color_button=%2300A991&color_button_text=%23ffffff&promo_id=3414&campaign_id=111" charset="utf-8"></script>
```

---

### 2.2 `hotels-popular` — Hôtels populaires
- **Type** : `popular`
- **promo_id** : `4478`
- **Détails** : 3 résultats, couleur primaire `#00AE98`

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&powered_by=false&locale=en&show_header=true&limit=3&primary_color=00AE98&results_background_color=FFFFFF&form_background_color=FFFFFF&campaign_id=111&promo_id=4478" charset="utf-8"></script>
```

---

### 2.3 `hotels-recommended` — Hôtels recommandés
- **Type** : `widget`
- **promo_id** : `4484`

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&powered_by=false&locale=en&campaign_id=111&promo_id=4484" charset="utf-8"></script>
```

---

### 2.4 `hotels-destinations` — Hôtels par destination
- **Type** : `widget`
- **promo_id** : `3411`
- **Détails** : 4 résultats, couleur primaire `#00AE98`

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&locale=en&powered_by=false&limit=4&primary_color=00AE98&results_background_color=FFFFFF&form_background_color=FFFFFF&campaign_id=111&promo_id=3411" charset="utf-8"></script>
```

---

### 2.5 `hotels-deals` — Bonnes affaires hôtels
- **Type** : `widget`
- **promo_id** : `4563`
- **Détails** : 4 résultats, couleur primaire `#00AE98`

```html
<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&locale=en&powered_by=false&limit=4&primary_color=00AE98&results_background_color=FFFFFF&form_background_color=FFFFFF&promo_id=4563&campaign_id=111" charset="utf-8"></script>
```

---

## 3. LOCATION DE VOITURE — Page `services/location-voiture.html`

### 3.1 `cars-main` — Formulaire principal · `campaign_id=57`
- **Type** : `search-form`
- **promo_id** : `5472`

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&powered_by=false&border_radius=5&plain=true&color_background=%23ffffff&color_button=%235080c5&promo_id=5472&campaign_id=57" charset="utf-8"></script>
```

---

### 3.2 `cars-featured` — Véhicules à Tanger · `campaign_id=627`
- **Type** : `featured`
- **promo_id** : `8951`
- **Détails** : city=264341 (Tanger)

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&city=264341&show_header=true&powered_by=false&campaign_id=627&promo_id=8951" charset="utf-8"></script>
```

---

### 3.3 `cars-a` — Véhicules option 2 · `campaign_id=87`
- **Type** : `widget`
- **promo_id** : `2466`
- **Détails** : country=2 (Maroc), city=264341 (Tanger)

```html
<script async src="//tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&country=2&city=264341&powered_by=false&campaign_id=87&promo_id=2466" charset="utf-8"></script>
```

---

### 3.4 `cars-b` — Véhicules option 3 · `campaign_id=87`
- **Type** : `widget`
- **promo_id** : `4322`
- **Détails** : Affichage complet (en-tête, pied, bordure), fond clair

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&powered_by=false&country=2&city=264341&lang=en&width=100&background=light&logo=true&header=true&gearbox=false&cars=false&border=true&footer=true&campaign_id=87&promo_id=4322" charset="utf-8"></script>
```

---

### 3.5 `cars-c` — Badge de marque · `campaign_id=10`
- **Type** : `badge`
- **promo_id** : `2082`
- **Détails** : Badge 100×100px

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&width=100&height=100&powered_by=false&campaign_id=10&promo_id=2082" charset="utf-8" async="true"></script>
```

---

### 3.6 `cars-d` — Véhicules via addon · `campaign_id=222`
- **Type** : `widget`
- **promo_id** : `8813`
- **Domaine** : `tp.media` (différent des autres)

```html
<script src="https://tp.media/content?campaign_id=222&promo_id=8813&shmarker=704597&powered_by=false&trs=499986" charset="utf-8"></script>
```

---

### 3.7 `cars-moto` — Motos et vélos · `campaign_id=57`
- **Type** : `widget`
- **promo_id** : `5472`
- **Note** : Même script que `cars-main`

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&powered_by=false&border_radius=5&plain=true&color_background=%23ffffff&color_button=%235080c5&promo_id=5472&campaign_id=57" charset="utf-8"></script>
```

---

## 4. ACTIVITÉS & EXCURSIONS — Page `services/activites.html` · `campaign_id=89`

### 4.1 `activities-excursions` — Excursions
- **Type** : `widget`
- **promo_id** : `3984`
- **Détails** : Layout horizontal/vertical

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&language=en&layout=horizontal&orientation=vertical&powered_by=false&campaign_id=89&promo_id=3984" charset="utf-8"></script>
```

---

### 4.2 `activities-tours` — Balades & visites
- **Type** : `widget`
- **promo_id** : `3947`
- **Détails** : locale=260932, 4 cartes

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&language=en&locale=260932&layout=horizontal&cards=4&powered_by=false&campaign_id=89&promo_id=3947" charset="utf-8"></script>
```

---

### 4.3 `activities-hike` — Randonnée & montagne
- **Type** : `widget`
- **promo_id** : `3948`

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&product=&language=en&layout=horizontal&powered_by=false&campaign_id=89&promo_id=3948" charset="utf-8"></script>
```

---

## 5. eSIM — Page `services/esim.html` · `campaign_id=541`

### 5.1 `esim-search` — Recherche eSIM (Airalo)
- **Type** : `search-form`
- **promo_id** : `8588`
- **Détails** : Couleur bouton `#f2685f`, fond clair

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&powered_by=false&color_button=%23f2685f&color_focused=%23f2685f&secondary=%23FFFFFF&dark=%2311100f&light=%23FFFFFF&special=%23C4C4C4&border_radius=5&plain=false&no_labels=true&promo_id=8588&campaign_id=541" charset="utf-8"></script>
```

---

## 6. BAGAGES — Page `services/bagages.html` · `campaign_id=137`

### 6.1 `bagages-storage` — Consigne à bagages
- **Type** : `widget`
- **promo_id** : `4497`
- **Détails** : city_id=2, catégorie 4, 3 articles

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&locale=en&city_id=2&category=4&amount=3&powered_by=false&campaign_id=137&promo_id=4497" charset="utf-8"></script>
```

---

## 7. TRANSFERTS — Page `services/transferts.html` · `campaign_id=1` / `22`

### 7.1 `transferts-main` — Formulaire complet (Kiwitaxi) · `campaign_id=1`
- **Type** : `search-form`
- **promo_id** : `2949`
- **Détails** : Thème personnalisé complet (couleurs bouton, fond, auto-complétion)

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&locale=en&from=&to=&country=&powered_by=false&height=&wtype=true&transfers_limit=10&bg_color=%23f5f5f5&button_color=%23239a54&button_font_color=%23ffffff&button_hover_color=%230274da&border_color=%23f9ac1a&input_font_color=%23c8ced4&input_bg_color=%23ffffff&input_label_color=%23c8ced4&icon_bg_color=%23ffffff&icon_arrow_color=%236c7c8c&icon_bg_color_mobile=%23f9ac1a&icon_arrow_color_mobile=%23ffffff&autocomplete_font_color=%23373f47&autocomplete_bg_color=%23ffffff&autocomplete_font_color_active=%23ffffff&autocomplete_bg_color_active=%23239a54&loader_color=%23f9ac1a&empty_color=%23373f47&info_bg_color=%23fff0cc&info_icon_color=%234a4a4a&info_caption_color=%234a4a4a&class_background=%23ffffff&class_font_color=%23373f47&class_header_color=%236c7c8c&class_button_background=%2326a65b&class_button_font_color=%23ffffff&class_button_background_hover=%230274da&class_comment_background=%23bfc0c4&class_comment_font=%23bfc0c4&more_background=&more_background_hover=&more_font_color=%230267c1&notification_background=%23f6f1ec&notification_border_color=%23e37f17&notification_color=%23373f47&transfer_background=%23f6f7f8&transfer_background_hover=%23f6f7f8&transfer_font_color=%23373f47&campaign_id=1&promo_id=2949" charset="utf-8" async></script>
```

---

### 7.2 `transferts-search-2` — Transferts depuis Tanger · `campaign_id=1`
- **Type** : `search-form`
- **promo_id** : `3879`
- **Détails** : Pré-rempli depuis Tanger, limité à MCR, formulaire simplifié

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&locale=en&from=Tanger&powered_by=false&transfer_options_limit=10&transfer_options=MCR&disable_currency_selector=true&hide_form_extras=true&hide_external_links=true&campaign_id=1&promo_id=3879" charset="utf-8" async="true"></script>
```

---

### 7.3 `transferts-search-3` — Transferts thème clair · `campaign_id=1`
- **Type** : `search-form`
- **promo_id** : `1486`
- **Détails** : Thème 1 (clair)

```html
<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&language=en&theme=1&powered_by=false&campaign_id=1&promo_id=1486" charset="utf-8"></script>
```

---

### 7.4 `transferts-search-4` — Transferts adultes · `campaign_id=22`
- **Type** : `search-form`
- **promo_id** : `3507`
- **Détails** : 18 adultes, 34 options, rid=481, couleur basique

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&powered_by=false&locale=en&curr=USD&color=basic&pbi=0&ag=18&ap=34&rid=481&campaign_id=22&promo_id=3507" charset="utf-8"></script>
```

---

### 7.5 `transferts-reviews` — Avantages, avis et FAQ · `campaign_id=22`
- **Type** : `reviews`
- **promo_id** : `1504`
- **Détails** : Bloc complet (compteur, avantages, description, carte, avis, FAQ, Trustpilot)
- **Domaine** : `//tpwdgt.com` (sans protocole)

```html
<script async src="//tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&header=Airport%20transfers%20executed%20by%20local%20Professional%20companies&powered_by=false&color_scheme=bg&b_counter=true&b_benefit=true&b_descr=true&b_about=true&b_map=true&b_reviews=true&b_breadcrumbs=true&b_poweredby=false&b_numbers=true&b_trustpilot=true&b_assortment=true&b_reliable=true&b_extended=true&b_how=true&b_faq=true&b_why=true&b_easybook=true&campaign_id=22&promo_id=1504" charset="utf-8"></script>
```

---

### 7.6 `transferts-search-5` — Transferts variante RU · `campaign_id=1`
- **Type** : `search-form`
- **promo_id** : `691`
- **⚠️ Note** : Langue `ru`, devise `RUB` — à exclure ou adapter si la cible est francophone/arabophone

```html
<script async src="https://tpwdgt.com/content?trs=499986&powered_by=false&shmarker=704597&language=ru&display_currency=RUB&transfer_type=any&hide_form_extras=false&hide_external_links=false&disable_currency_selector=false&campaign_id=1&promo_id=691" charset="utf-8" async></script>
```

---

## 8. INDEMNISATION — Page `services/indemnisation.html`

### 8.1 `indemnisation-main` — Éligibilité AirHelp · `campaign_id=120`
- **Type** : `search-form`
- **promo_id** : `8679`
- **Statut** : ✅ Script configuré

```html
<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&lang=en&powered_by=false&campaign_id=120&promo_id=8679" charset="utf-8"></script>
```

---

### 8.2 `indemnisation-secondary` — Compensair
- **Type** : `widget`
- **Statut** : 🔲 **À venir** — script non encore fourni

---

## 9. EMPLACEMENTS VIDES (scripts manquants)

Ces slots sont déclarés dans la config mais **sans script** — les sections sont masquées automatiquement par `widget-slot.js` jusqu'à ce qu'un script soit fourni :

| id DOM | Page | Partenaire prévu | Priorité |
|--------|------|-----------------|----------|
| `yacht-search` | services/yacht.html | À définir | Moyenne |
| `yacht-featured` | services/yacht.html | À définir | Moyenne |
| `guides-audio` | services/guides.html | À définir | Basse |
| `bagages-extra` | services/bagages.html | À définir | Basse |
| `indemnisation-secondary` | services/indemnisation.html | Compensair | Basse |

---

## 10. Récapitulatif par campaign_id

| campaign_id | Service Travelpayouts | Nombre de scripts |
|-------------|----------------------|-------------------|
| `100` | Vols (Aviasales) | 5 |
| `111` | Hôtels (Aviasales/Hotellook) | 5 |
| `57` | Location de voiture | 2 |
| `627` | Location de voiture (featured) | 1 |
| `87` | Location de voiture (options) | 2 |
| `10` | Badge marque | 1 |
| `222` | Voiture addon (tp.media) | 1 |
| `89` | Activités & excursions (Klook) | 3 |
| `541` | eSIM (Airalo) | 1 |
| `137` | Bagages | 1 |
| `1` | Transferts aéroport (Kiwitaxi) | 4 |
| `22` | Transferts aéroport (Kiwitaxi) | 2 |
| `120` | Indemnisation vol (AirHelp) | 1 |
| **Total** | | **29 scripts actifs** |

---

## 11. Domaines CDN utilisés

| Domaine | Usage |
|---------|-------|
| `https://tpwdgt.com/content` | 27 scripts (CDN principal Travelpayouts) |
| `//tpwdgt.com/content` | 2 scripts (sans protocole — `cars-a`, `transferts-reviews`) |
| `https://tp.media/content` | 1 script (`cars-d`) |

---

## 12. Architecture d'injection

```
widgets.config.js          ← source unique de tous les scripts
       │
       ▼
widget-slot.js             ← renderWidgetSlots(pageKey)
       │                      • parcourt les .widget-slot dans la page
       │                      • masque les slots sans script
       │                      • injecte les <script> dynamiquement
       ▼
services/*.html            ← chaque page déclare ses <div class="widget-slot" id="...">
```

---

*Généré le 2026-10-11 — Manasik Bayt Travel / DigitalSolverLand*
