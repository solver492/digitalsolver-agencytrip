// Configuration des widgets par page (interne).
// Les cles `brand` servent au suivi interne uniquement : NE JAMAIS les afficher.
// `script` contient le code du widget partenaire tel que fourni (ne pas modifier
// les mentions "powered by" ni les parametres de tracking).
//
// Repartition fournie (Aviasales / Travelpayouts) :
//   campaign_id=100 -> vols  (promo 2811, 4054, 4044, 7879, 4041)
//   campaign_id=111 -> hotels (promo 3414, 4478, 4484, 3411, 4563)

export const widgets = {
  vols: [
    { id: "vols-search", label: "Formulaire de recherche de vols (defaut sur LON-BKK)", brand: "Aviasales", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&color_button=%23FF0000&target_host=www.aviasales.com%2Fsearch&locale=en&powered_by=false&origin=LON&destination=BKK&with_fallback=false&non_direct_flights=true&min_lines=5&border_radius=0&color_background=%23FFFFFF&color_text=%23000000&color_border=%23FFFFFF&promo_id=2811&campaign_id=100" charset="utf-8"></script>` },
    { id: "vols-popular-routes", label: "Vols pas chers / destinations populaires", brand: "Aviasales", type: "popular-routes",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&target_host=www.aviasales.com%2Fsearch&locale=en&limit=6&powered_by=false&primary=%230085FF&promo_id=4044&campaign_id=100" charset="utf-8"></script>` },
    { id: "vols-prices-map", label: "Carte des prix", brand: "Aviasales", type: "prices-map",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&lat=51.5073509&lng=-0.1277583&powered_by=false&search_host=www.aviasales.com%2Fsearch&locale=en&origin=LON&value_min=0&value_max=1000000&round_trip=true&only_direct=false&radius=1&draggable=true&disable_zoom=false&show_logo=false&scrollwheel=false&primary=%233FABDB&secondary=%233FABDB&light=%23ffffff&width=1500&height=500&zoom=2&promo_id=4054&campaign_id=100" charset="utf-8"></script>` },
    { id: "vols-calendar", label: "Calendrier des prix bas", brand: "Aviasales", type: "pricing-calendar",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&searchUrl=www.aviasales.com%2Fsearch&locale=en&powered_by=false&one_way=false&only_direct=false&period=year&range=7%2C14&primary=%230C73FE&color_background=%23ffffff&dark=%23000000&light=%23FFFFFF&achieve=%2345AD35&promo_id=4041&campaign_id=100" charset="utf-8"></script>` },
    { id: "vols-search-alt", label: "Recherche de vols (variante hôtels)", brand: "Aviasales", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&show_hotels=true&powered_by=false&locale=en&searchUrl=www.aviasales.com%2Fsearch&primary_override=%2332a8dd&color_button=%2300A991&color_icons=%2332a8dd&dark=%23262626&light=%23FFFFFF&secondary=%23FFFFFF&special=%23C4C4C4&color_focused=%2332a8dd&border_radius=0&plain=false&promo_id=7879&campaign_id=100" charset="utf-8"></script>` },
  ],
  hotels: [
    { id: "hotels-search", label: "Recherche d'hôtels", brand: "Aviasales", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&locale=en&stops=any&show_hotels=true&powered_by=false&border_radius=0&plain=true&color_button=%2300A991&color_button_text=%23ffffff&promo_id=3414&campaign_id=111" charset="utf-8"></script>` },
    { id: "hotels-popular", label: "Hôtels populaires", brand: "Aviasales", type: "popular",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&powered_by=false&locale=en&show_header=true&limit=3&primary_color=00AE98&results_background_color=FFFFFF&form_background_color=FFFFFF&campaign_id=111&promo_id=4478" charset="utf-8"></script>` },
    { id: "hotels-recommended", label: "Hôtels recommandés", brand: "Aviasales", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&powered_by=false&locale=en&campaign_id=111&promo_id=4484" charset="utf-8"></script>` },
    { id: "hotels-destinations", label: "Hôtels par destination", brand: "Aviasales", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&locale=en&powered_by=false&limit=4&primary_color=00AE98&results_background_color=FFFFFF&form_background_color=FFFFFF&campaign_id=111&promo_id=3411" charset="utf-8"></script>` },
    { id: "hotels-deals", label: "Bonnes affaires hôtels", brand: "Aviasales", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=usd&trs=499986&shmarker=704597&locale=en&powered_by=false&limit=4&primary_color=00AE98&results_background_color=FFFFFF&form_background_color=FFFFFF&promo_id=4563&campaign_id=111" charset="utf-8"></script>` },
  ],
  // Pages avec emplacements prets mais widgets non encore fournis (phase suivante) :
  "location-voiture": [
    { id: "cars-main", label: "Recherche de véhicules (formulaire)", brand: "Generic", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&powered_by=false&border_radius=5&plain=true&color_background=%23ffffff&color_button=%235080c5&promo_id=5472&campaign_id=57" charset="utf-8"></script>` },
    { id: "cars-featured", label: "Véhicules à Tanger", brand: "Generic", type: "featured",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&city=264341&show_header=true&powered_by=false&campaign_id=627&promo_id=8951" charset="utf-8"></script>` },
    { id: "cars-a", label: "Véhicules (option 2)", brand: "Generic", type: "widget",
      script: `<script async src="//tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&country=2&city=264341&powered_by=false&campaign_id=87&promo_id=2466" charset="utf-8"></script>` },
    { id: "cars-b", label: "Véhicules (option 3)", brand: "Generic", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&powered_by=false&country=2&city=264341&lang=en&width=100&background=light&logo=true&header=true&gearbox=false&cars=false&border=true&footer=true&campaign_id=87&promo_id=4322" charset="utf-8"></script>` },
    { id: "cars-c", label: "Badge de marque", brand: "Generic", type: "badge",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&width=100&height=100&powered_by=false&campaign_id=10&promo_id=2082" charset="utf-8" async="true"></script>` },
    { id: "cars-d", label: "Véhicules (via addon)", brand: "Generic", type: "widget",
      script: `<script src="https://tp.media/content?campaign_id=222&promo_id=8813&shmarker=704597&powered_by=false&trs=499986" charset="utf-8"></script>` },
    { id: "cars-moto", label: "Motos et vélos (même widget que voiture, promotion 5472)", brand: "Generic", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&powered_by=false&border_radius=5&plain=true&color_background=%23ffffff&color_button=%235080c5&promo_id=5472&campaign_id=57" charset="utf-8"></script>` },
  ],
  yacht: [
    { id: "yacht-search", label: "Recherche de yacht", brand: "Generic", type: "search-form", script: "" },
    { id: "yacht-featured", label: "Yachts en vedette", brand: "Generic", type: "featured", script: "" },
  ],
  activites: [
    { id: "activities-excursions", label: "Excursions", brand: "Klook", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&language=en&layout=horizontal&orientation=vertical&powered_by=false&campaign_id=89&promo_id=3984" charset="utf-8"></script>` },
    { id: "activities-tours", label: "Balades & visites", brand: "Klook", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&language=en&locale=260932&layout=horizontal&cards=4&powered_by=false&campaign_id=89&promo_id=3947" charset="utf-8"></script>` },
    { id: "activities-hike", label: "Randonnée & montagne", brand: "Klook", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&product=&language=en&layout=horizontal&powered_by=false&campaign_id=89&promo_id=3948" charset="utf-8"></script>` },
  ],
  guides: [
    { id: "guides-audio", label: "Visites guidées et audio", brand: "Generic", type: "widget", script: "" },
  ],
  esim: [
    { id: "esim-search", label: "Recherche eSIM", brand: "Airalo", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&powered_by=false&color_button=%23f2685f&color_focused=%23f2685f&secondary=%23FFFFFF&dark=%2311100f&light=%23FFFFFF&special=%23C4C4C4&border_radius=5&plain=false&no_labels=true&promo_id=8588&campaign_id=541" charset="utf-8"></script>` },
  ],
  bagages: [
    { id: "bagages-storage", label: "Consigne à bagages", brand: "Generic", type: "widget",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&locale=en&city_id=2&category=4&amount=3&powered_by=false&campaign_id=137&promo_id=4497" charset="utf-8"></script>` },
    { id: "bagages-extra", label: "Services bagages", brand: "Generic", type: "widget", script: "" },
  ],
  transferts: [
    { id: "transferts-main", label: "Recherche de transferts (formulaire complet)", brand: "Kiwitaxi", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&locale=en&from=&to=&country=&powered_by=false&height=&wtype=true&transfers_limit=10&bg_color=%23f5f5f5&button_color=%23239a54&button_font_color=%23ffffff&button_hover_color=%230274da&border_color=%23f9ac1a&input_font_color=%23c8ced4&input_bg_color=%23ffffff&input_label_color=%23c8ced4&icon_bg_color=%23ffffff&icon_arrow_color=%236c7c8c&icon_bg_color_mobile=%23f9ac1a&icon_arrow_color_mobile=%23ffffff&autocomplete_font_color=%23373f47&autocomplete_bg_color=%23ffffff&autocomplete_font_color_active=%23ffffff&autocomplete_bg_color_active=%23239a54&loader_color=%23f9ac1a&empty_color=%23373f47&info_bg_color=%23fff0cc&info_icon_color=%234a4a4a&info_caption_color=%234a4a4a&class_background=%23ffffff&class_font_color=%23373f47&class_header_color=%236c7c8c&class_button_background=%2326a65b&class_button_font_color=%23ffffff&class_button_background_hover=%230274da&class_comment_background=%23bfc0c4&class_comment_font=%23bfc0c4&more_background=&more_background_hover=&more_font_color=%230267c1&notification_background=%23f6f1ec&notification_border_color=%23e37f17&notification_color=%23373f47&transfer_background=%23f6f7f8&transfer_background_hover=%23f6f7f8&transfer_font_color=%23373f47&campaign_id=1&promo_id=2949" charset="utf-8" async></script>` },
    { id: "transferts-search-2", label: "Transferts à Tanger", brand: "Kiwitaxi", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&locale=en&from=Tanger&powered_by=false&transfer_options_limit=10&transfer_options=MCR&disable_currency_selector=true&hide_form_extras=true&hide_external_links=true&campaign_id=1&promo_id=3879" charset="utf-8" async="true"></script>` },
    { id: "transferts-search-3", label: "Transferts (thème clair)", brand: "Kiwitaxi", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?currency=USD&trs=499986&shmarker=704597&language=en&theme=1&powered_by=false&campaign_id=1&promo_id=1486" charset="utf-8"></script>` },
    { id: "transferts-search-4", label: "Transferts (adultes)", brand: "Kiwitaxi", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&powered_by=false&locale=en&curr=USD&color=basic&pbi=0&ag=18&ap=34&rid=481&campaign_id=22&promo_id=3507" charset="utf-8"></script>` },
    { id: "transferts-reviews", label: "Transferts : avantages, avis et FAQ", brand: "Kiwitaxi", type: "reviews",
      script: `<script async src="//tpwdgt.com/content?trs=499986&shmarker=704597&locale=en&header=Airport%20transfers%20executed%20by%20local%20Professional%20companies&powered_by=false&color_scheme=bg&b_counter=true&b_benefit=true&b_descr=true&b_about=true&b_map=true&b_reviews=true&b_breadcrumbs=true&b_poweredby=false&b_numbers=true&b_trustpilot=true&b_assortment=true&b_reliable=true&b_extended=true&b_how=true&b_faq=true&b_why=true&b_easybook=true&campaign_id=22&promo_id=1504" charset="utf-8"></script>` },
    { id: "transferts-search-5", label: "Transferts (var. RU - à exclure ?)", brand: "Kiwitaxi", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&powered_by=false&shmarker=704597&language=ru&display_currency=RUB&transfer_type=any&hide_form_extras=false&hide_external_links=false&disable_currency_selector=false&campaign_id=1&promo_id=691" charset="utf-8" async></script>` },
  ],
  indemnisation: [
    { id: "indemnisation-main", label: "Vérification d'éligibilité", brand: "AirHelp", type: "search-form",
      script: `<script async src="https://tpwdgt.com/content?trs=499986&shmarker=704597&lang=en&powered_by=false&campaign_id=120&promo_id=8679" charset="utf-8"></script>` },
    { id: "indemnisation-secondary", label: "Indemnisation (alternative)", brand: "Compensair", type: "widget", script: "" },
  ],
};
