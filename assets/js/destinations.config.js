/**
 * destinations.config.js
 * Configuration éditoriale des 33 destinations Tourly-Manasik
 */

export const DESTINATIONS_CONFIG = [
  // ─────────────────────────────────────────────
  // 1. La Mecque
  // ─────────────────────────────────────────────
  {
    slug: 'la-mecque',
    name: 'La Mecque',
    country: 'Arabie saoudite',
    region: 'Moyen-Orient',
    tagline: 'Le cœur spirituel de l\'Islam, destination sacrée par excellence.',
    intro: 'La Mecque est la ville la plus sainte de l\'Islam, lieu de naissance du Prophète Muhammad et point de convergence de millions de pèlerins chaque année. La Grande Mosquée al-Masjid al-Haram abrite la Kaaba, vers laquelle tous les musulmans du monde orientent leurs prières. Accomplir l\'Omra ou le Hajj à La Mecque est une expérience spirituelle transformatrice, unique au monde.',
    highlights: [
      'Circumambulation autour de la Kaaba (Tawaf)',
      'La course rituelle entre Safa et Marwa (Sa\'i)',
      'La fontaine sacrée de Zamzam',
      'La montagne de la Lumière (Jabal al-Nour) et la grotte de Hira',
      'Le mont Arafat, lieu du sermon du Prophète',
      'La Mosquée de la Tente (Masjid al-Khayf) à Mina',
    ],
    tips: [
      'L\'entrée à La Mecque est réservée aux musulmans munis d\'un permis de pèlerinage valide.',
      'Réservez vos hébergements bien à l\'avance, surtout pour la période du Hajj.',
      'Portez des vêtements amples et couvrants, adaptés aux rites du pèlerinage.',
      'Hydratez-vous régulièrement, la chaleur peut être intense quelle que soit la saison.',
    ],
    bestSeason: 'Pèlerinage du Hajj en saison fixée ; Omra possible toute l\'année',
    tags: ['omra-hajj', 'culture'],
    aliases: ['mecca', 'makkah', 'meca', 'مكة', 'mecque'],
    image: 'assets/images/destinations/la-mecque.jpg',
    services: ['vols', 'hotels', 'transferts', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 2. Médine
  // ─────────────────────────────────────────────
  {
    slug: 'medine',
    name: 'Médine',
    country: 'Arabie saoudite',
    region: 'Moyen-Orient',
    tagline: 'La ville lumineuse, sanctuaire de paix et de recueillement.',
    intro: 'Médine est la deuxième ville sainte de l\'Islam, accueillant la Mosquée du Prophète (al-Masjid an-Nabawi) où repose Muhammad. Ville de sérénité et de dévotion, elle attire des pèlerins venus du monde entier pour prier auprès du tombeau du Prophète. Son atmosphère empreinte de spiritualité en fait une étape incontournable de tout voyage en Arabie saoudite.',
    highlights: [
      'La Mosquée du Prophète (al-Masjid an-Nabawi) et le dôme vert',
      'La Mosquée Quba, la première mosquée de l\'histoire de l\'Islam',
      'Le cimetière al-Baqi, où reposent de nombreux compagnons du Prophète',
      'La Mosquée des deux Qiblas (Masjid al-Qiblatayn)',
      'La colline d\'Uhud et le site de la célèbre bataille',
      'Les sept mosquées (Saba Masajid) aux alentours du champ de bataille du Fossé',
    ],
    tips: [
      'Respectez les horaires de prière et les zones réservées aux hommes et aux femmes.',
      'Habillez-vous modestement à tout moment dans l\'enceinte des mosquées.',
      'Planifiez vos visites tôt le matin pour éviter les foules et la chaleur.',
      'Médine est accessible aux non-musulmans dans certaines zones, mais les sites sacrés leur sont interdits.',
    ],
    bestSeason: 'Printemps et automne pour des températures plus clémentes',
    tags: ['omra-hajj', 'culture'],
    aliases: ['medina', 'madinah', 'madineh', 'المدينة', 'medine'],
    image: 'assets/images/destinations/medine.jpg',
    services: ['vols', 'hotels', 'transferts', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 3. Djeddah
  // ─────────────────────────────────────────────
  {
    slug: 'djeddah',
    name: 'Djeddah',
    country: 'Arabie saoudite',
    region: 'Moyen-Orient',
    tagline: 'La perle de la mer Rouge, où modernité et tradition se rencontrent.',
    intro: 'Djeddah est la grande métropole côtière d\'Arabie saoudite, porte d\'entrée vers les Lieux saints et carrefour commercial historique. Son quartier historique de Al-Balad, inscrit au patrimoine mondial de l\'UNESCO, offre une architecture coral-house unique. La corniche animée et les fonds marins exceptionnels de la mer Rouge en font une destination complète pour tous les voyageurs.',
    highlights: [
      'Al-Balad, la vieille ville aux maisons à moucharabiehs (UNESCO)',
      'La fontaine du Roi Fahd, l\'une des plus hautes fontaines du monde',
      'La corniche de Djeddah et ses promenades en bord de mer',
      'Le marché aux épices et souks traditionnels de la vieille ville',
      'La plongée et le snorkeling dans les récifs coralliens de la mer Rouge',
      'Le musée Al-Shafi\'i et les galeries d\'art contemporain',
    ],
    tips: [
      'Al-Balad se visite idéalement à pied, de préférence en soirée quand la chaleur faiblit.',
      'Le vendredi, de nombreux commerces et restaurants ferment en matinée.',
      'Les amateurs de plongée doivent réserver leurs excursions à l\'avance en haute saison.',
      'Pensez à respecter le code vestimentaire, notamment dans les lieux publics et les souks.',
    ],
    bestSeason: 'Automne et hiver pour un climat agréable en bord de mer',
    tags: ['ville', 'culture', 'plage'],
    aliases: ['jeddah', 'jidda', 'jiddah', 'jedda'],
    image: 'assets/images/destinations/djeddah.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 4. Taïf
  // ─────────────────────────────────────────────
  {
    slug: 'taif',
    name: 'Taïf',
    country: 'Arabie saoudite',
    region: 'Moyen-Orient',
    tagline: 'La cité des roses, refuge de fraîcheur sur les hauteurs du Hedjaz.',
    intro: 'Perchée dans les montagnes du Hedjaz, Taïf est connue comme la "ville des roses" grâce à ses célèbres champs de roses damascènes dont on extrait une huile précieuse. Son altitude lui confère un climat nettement plus frais que le reste de l\'Arabie, en faisant une destination de villégiature appréciée. Vergers, jardins fleuris et paysages montagneux en font une escapade nature hors du commun.',
    highlights: [
      'Les champs de roses damascènes et les distilleries d\'eau de rose',
      'Le câble aérien (téléphérique) offrant une vue panoramique sur la ville et les montagnes',
      'Le parc Al-Rudaf et ses jardins verdoyants',
      'Les souks de miel artisanal, spécialité locale réputée',
      'La forteresse historique d\'Al-Shafa',
      'Les zones montagneuses d\'Al-Hada et Al-Shafa pour la randonnée',
    ],
    tips: [
      'L\'altitude apporte une fraîcheur bienvenue ; prévoyez une couche supplémentaire en soirée.',
      'La saison des roses a lieu au printemps, une période très prisée à ne pas manquer.',
      'Le miel de Taïf est un cadeau idéal ; achetez-le directement chez les producteurs locaux.',
      'Louez une voiture pour explorer librement les routes de montagne environnantes.',
    ],
    bestSeason: 'Printemps pour les roses ; été pour fuir la chaleur des plaines',
    tags: ['nature', 'montagne'],
    aliases: ['taef', "ta'if", 'الطائف'],
    image: 'assets/images/destinations/taif.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 5. AlUla
  // ─────────────────────────────────────────────
  {
    slug: 'alula',
    name: 'AlUla',
    country: 'Arabie saoudite',
    region: 'Moyen-Orient',
    tagline: 'Un musée à ciel ouvert au cœur des déserts de grès d\'Arabie.',
    intro: 'AlUla est l\'une des destinations archéologiques les plus spectaculaires du monde arabe, abritant les vestiges nabatéens de Hégra (Madain Saleh), inscrite au patrimoine mondial de l\'UNESCO. Ce paysage de falaises sculptées, de canyons de grès rosé et de tombeaux millénaires offre une expérience unique entre histoire et nature. AlUla représente l\'ambition culturelle de l\'Arabie saoudite sur la scène internationale du tourisme.',
    highlights: [
      'Hégra (Madain Saleh), cité nabatéenne aux tombeaux rupestres monumentaux',
      'La vieille ville d\'AlUla et sa médina abandonnée',
      'L\'Éléphant Rock (Jabal al-Fil), formation rocheuse naturelle emblématique',
      'Les paysages de Dadan et les ruines du royaume de Lihyan',
      'Le festival Winter at Tantora et ses événements culturels',
      'Les randonnées et safaris dans les canyons de grès colorés',
    ],
    tips: [
      'Réservez les visites de Hégra en ligne à l\'avance, l\'accès est réglementé.',
      'La lumière du coucher de soleil magnifie les formations rocheuses — prévoyez du temps libre en soirée.',
      'Habillez-vous en plusieurs couches, les nuits dans le désert peuvent être fraîches.',
      'Un guide local enrichira considérablement la visite des sites archéologiques.',
    ],
    bestSeason: 'Automne et hiver, idéaux pour explorer sans chaleur excessive',
    tags: ['culture', 'nature'],
    aliases: ['al ula', 'al-ula', 'العُلا'],
    image: 'assets/images/destinations/alula.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'guides', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 6. Riyad
  // ─────────────────────────────────────────────
  {
    slug: 'riyad',
    name: 'Riyad',
    country: 'Arabie saoudite',
    region: 'Moyen-Orient',
    tagline: 'La capitale du Royaume, entre tradition ancestrale et ambition futuriste.',
    intro: 'Riyad est le centre politique, économique et culturel de l\'Arabie saoudite, une métropole en pleine transformation portée par la Vision 2030. La ville mêle les tours ultramodernes du quartier d\'affaires aux vestiges de la vieille Diriyah, berceau de la dynasty saoudienne. Les musées, galeries d\'art, restaurants et espaces verts en font une destination urbaine de plus en plus attractive.',
    highlights: [
      'La Tour Kingdom et la Tour Al-Faisaliyah, symboles de la skyline de Riyad',
      'Diriyah, berceau historique de l\'État saoudien inscrit à l\'UNESCO',
      'Le Musée national d\'Arabie saoudite, richesse archéologique et historique',
      'Le parc Al-Murabba et le Palais historique d\'Abdulaziz',
      'Les souks et le quartier de Dira pour les achats traditionnels',
      'Boulevard Riyad, complexe de divertissement moderne à grande échelle',
    ],
    tips: [
      'Le réseau de taxis et de VTC (Uber, Careem) est commode pour se déplacer en ville.',
      'Les températures estivales sont extrêmes ; prévoyez la visite en intérieur aux heures chaudes.',
      'Le code vestimentaire dans les lieux publics est plus souple qu\'auparavant, mais la modestie reste de mise.',
      'La gastronomie locale (mandi, kabsa) vaut le détour ; explorez les restaurants de quartier.',
    ],
    bestSeason: 'Automne et hiver pour des températures agréables',
    tags: ['ville', 'culture'],
    aliases: ['riyadh', 'riad', 'الرياض'],
    image: 'assets/images/destinations/riyad.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 7. Istanbul
  // ─────────────────────────────────────────────
  {
    slug: 'istanbul',
    name: 'Istanbul',
    country: 'Turquie',
    region: 'Europe / Moyen-Orient',
    tagline: 'La ville aux deux continents, où Orient et Occident fusionnent depuis des millénaires.',
    intro: 'Istanbul est une métropole unique au monde, à cheval sur deux continents, héritière de trois empires — romain, byzantin et ottoman. Ses mosquées majestueuses, ses bazars labyrinthiques et son front de mer époustouflant en font l\'une des destinations les plus visitées d\'Europe et du Moyen-Orient. Chaque quartier raconte une histoire différente, du cosmopolite Beyoğlu aux ruelles authentiques de Balat.',
    highlights: [
      'Sainte-Sophie (Ayasofya), chef-d\'œuvre architectural entre basilique et mosquée',
      'La Mosquée Bleue (Sultanahmet) et ses mosaïques de faïence',
      'Le Grand Bazar, l\'un des plus grands et anciens marchés couverts du monde',
      'Le palais de Topkapi et les trésors de l\'Empire ottoman',
      'Une croisière sur le Bosphore entre les deux rives du continent',
      'Le quartier de Balat et ses maisons colorées aux influences juives et grecques',
    ],
    tips: [
      'Achetez la IstanbulKart dès l\'arrivée pour les transports en commun à tarif réduit.',
      'Les grandes mosquées sont gratuites mais fermées aux visiteurs pendant les heures de prière.',
      'Prévoyez de bonnes chaussures pour les pavés des quartiers historiques.',
      'Évitez les restaurants trop touristiques autour de Sultanahmet ; les petites ruelles cachent de meilleures adresses.',
    ],
    bestSeason: 'Printemps et automne pour un climat idéal et moins de foule',
    tags: ['ville', 'culture'],
    aliases: ['istambul', 'constantinople', 'istanbul'],
    image: 'assets/images/destinations/istanbul.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 8. Antalya
  // ─────────────────────────────────────────────
  {
    slug: 'antalya',
    name: 'Antalya',
    country: 'Turquie',
    region: 'Méditerranée',
    tagline: 'La Riviera turque, soleil et eaux turquoise au pied des montagnes.',
    intro: 'Antalya est le joyau balnéaire de la côte méditerranéenne turque, alliant plages de sable fin, criques rocheuses et arrière-pays montagneux. Ses complexes hôteliers tout compris accueillent des familles du monde entier, tandis que la vieille ville de Kaleiçi séduit les amateurs d\'histoire. Ruines antiques, cascades et marchés animés complètent une offre touristique parmi les plus complètes de la région.',
    highlights: [
      'Les plages de Konyaaltı et Lara, longues étendues de sable et de galets',
      'Kaleiçi, le vieux quartier historique aux ruelles ottomanes',
      'Les chutes d\'eau de Düden, spectaculaires et accessibles facilement',
      'Les ruines antiques de Perge, Aspendos et Side aux alentours',
      'Les Cascades de Manavgat et l\'arrière-pays du Taurus',
      'Les parcs aquatiques et activités nautiques pour les familles',
    ],
    tips: [
      'Les formules tout compris offrent un excellent rapport qualité/prix pour les familles.',
      'Louez une voiture pour explorer les sites antiques éparpillés autour d\'Antalya.',
      'L\'été est très animé ; réservez tôt pour bénéficier des meilleurs tarifs.',
      'Le bazar d\'Antalya est idéal pour rapporter épices, cuirs et céramiques locales.',
    ],
    bestSeason: 'Printemps et début d\'automne pour la baignade sans la foule estivale',
    tags: ['plage', 'famille'],
    aliases: ['antallia', 'antaliya'],
    image: 'assets/images/destinations/antalya.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 9. Cappadoce
  // ─────────────────────────────────────────────
  {
    slug: 'cappadoce',
    name: 'Cappadoce',
    country: 'Turquie',
    region: 'Anatolie',
    tagline: 'Un paysage de conte de fées sculpté par les volcans et le vent.',
    intro: 'La Cappadoce est une région de Turquie centrale aux paysages lunaires d\'une beauté irréelle, façonnés par l\'érosion volcanique en cheminées de fées, cônes et grottes troglodytiques. Ses villages creusés dans la roche, ses églises rupestres ornées de fresques byzantines et ses vols en montgolfière au lever du soleil en font une destination inoubliable. Göreme, Ürgüp et les vallées aux noms poétiques constituent un décor naturel unique au monde.',
    highlights: [
      'Vol en montgolfière au lever du soleil sur la vallée de Göreme',
      'Le musée en plein air de Göreme et ses églises rupestres byzantines',
      'La cité souterraine de Derinkuyu, ville creusée sur plusieurs niveaux',
      'La vallée de l\'Amour et la vallée Rouge pour les randonnées',
      'Üçhisar, le château-roche dominant le panorama cappadocien',
      'La poterie traditionnelle d\'Avanos et les ateliers artisanaux',
    ],
    tips: [
      'Réservez le vol en montgolfière plusieurs semaines à l\'avance, les places partent très vite.',
      'Logez dans un hôtel troglodyte pour une expérience d\'hébergement unique.',
      'La randonnée entre les vallées se fait aisément sans guide, mais une carte papier reste utile.',
      'L\'hiver est magnifique avec les cheminées de fées enneigées mais certains hébergements ferment.',
    ],
    bestSeason: 'Printemps et automne pour les randonnées et les montgolfières',
    tags: ['nature', 'culture', 'montagne'],
    aliases: ['cappadocia', 'kapadokya', 'capadoce'],
    image: 'assets/images/destinations/cappadoce.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'guides', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 10. Trabzon
  // ─────────────────────────────────────────────
  {
    slug: 'trabzon',
    name: 'Trabzon',
    country: 'Turquie',
    region: 'Mer Noire',
    tagline: 'La porte de la mer Noire, entre nature luxuriante et histoire médiévale.',
    intro: 'Trabzon est une ville côtière de la région de la mer Noire, entourée de forêts verdoyantes, de plateaux d\'altitude et de monastères perchés dans des falaises. Son monastère de Sümela, suspendu à la paroi rocheuse, est l\'un des sites les plus spectaculaires de Turquie. La région offre également des paysages de hauts plateaux qui tranchent avec le reste du pays et séduisent les amateurs de nature intacte.',
    highlights: [
      'Le monastère de Sümela, accroché à la falaise dans la gorge de l\'Altindere',
      'Le plateau d\'Ayder et ses sources thermales en altitude',
      'La vieille ville de Trabzon et la mosquée Sainte-Sophie de Trabzon',
      'Le plateau de Pokut et les chalets en bois traditionnels',
      'Les forêts de hêtres et de sapins des monts Pontiques',
      'Le marché couvert et la gastronomie locale (hamsi, mıhlama)',
    ],
    tips: [
      'Louez une voiture pour accéder aux plateaux d\'altitude, peu desservis en transports en commun.',
      'Les routes de montagne peuvent être fermées en hiver ; renseignez-vous avant de partir.',
      'Habillez-vous en couches superposées, les plateaux sont frais même en été.',
      'Goûtez au mıhlama, fondue de farine de maïs au fromage, spécialité incontournable de la région.',
    ],
    bestSeason: 'Été et début d\'automne pour les plateaux ; printemps pour les forêts en fleurs',
    tags: ['nature', 'ville'],
    aliases: ['trébizonde', 'trebizond'],
    image: 'assets/images/destinations/trabzon.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 11. Dubaï
  // ─────────────────────────────────────────────
  {
    slug: 'dubai',
    name: 'Dubaï',
    country: 'Émirats arabes unis',
    region: 'Moyen-Orient',
    tagline: 'La ville des superlatifs, où chaque projet repousse les limites du possible.',
    intro: 'Dubaï est devenue en quelques décennies l\'une des métropoles les plus modernes et ambitieuses du monde, réputée pour ses gratte-ciel records, ses îles artificielles et ses centres commerciaux pharaoniques. Derrière ce luxe contemporain, le quartier historique de Deira et les souks d\'or et d\'épices rappellent l\'origine marchande de la cité-État. Dubaï séduit aussi bien les familles que les voyageurs en quête de shopping, gastronomie et expériences hors du commun.',
    highlights: [
      'Le Burj Khalifa et la vue panoramique depuis le sommet',
      'Le Dubai Mall et ses attractions intégrées (aquarium, patinoire)',
      'Le quartier historique de Al Fahidi (Bastakiya) et le Dubai Museum',
      'Les souks de l\'or et des épices à Deira',
      'Palm Jumeirah et ses hôtels et plages privées emblématiques',
      'Le désert de Dubaï et les safaris en 4×4 au coucher du soleil',
    ],
    tips: [
      'Respectez scrupuleusement le code vestimentaire dans les lieux publics et les mosquées.',
      'La période du Ramadan modifie les horaires des restaurants et les activités nocturnes.',
      'Les transports en commun (métro, tram) sont efficaces et bon marché pour se déplacer.',
      'Négociez les tarifs dans les souks traditionnels, c\'est une pratique courante et attendue.',
    ],
    bestSeason: 'Automne et hiver pour éviter la chaleur extrême de l\'été',
    tags: ['luxe', 'ville'],
    aliases: ['dubai', 'dubay', 'دبي', 'dубай'],
    image: 'assets/images/destinations/dubai.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 12. Abu Dhabi
  // ─────────────────────────────────────────────
  {
    slug: 'abu-dhabi',
    name: 'Abu Dhabi',
    country: 'Émirats arabes unis',
    region: 'Moyen-Orient',
    tagline: 'La capitale raffinée des Émirats, entre culture, luxe et désert.',
    intro: 'Abu Dhabi est la capitale des Émirats arabes unis, ville de culture et de prestige qui abrite la Grande Mosquée Sheikh Zayed, l\'une des plus grandes et plus belles mosquées du monde. Plus posée que sa voisine Dubaï, la ville offre des musées de classe internationale (Louvre Abu Dhabi), des plages préservées et un accès direct aux dunes de Liwa. Son mélange d\'ambition culturelle et d\'authenticité arabe en fait une étape marquante.',
    highlights: [
      'La Grande Mosquée Sheikh Zayed, chef-d\'œuvre d\'architecture islamique contemporaine',
      'Le Louvre Abu Dhabi sur l\'île de Saadiyat',
      'La corniche d\'Abu Dhabi et ses parcs en bord de mer',
      'Ferrari World, parc d\'attractions unique dédié à la marque italienne',
      'L\'île de Sir Bani Yas et sa réserve naturelle avec des animaux sauvages',
      'Les dunes de Liwa et les expéditions dans le désert du Rub\' al Khali',
    ],
    tips: [
      'La Grande Mosquée est ouverte aux visiteurs non-musulmans ; des abbayas sont prêtées à l\'entrée.',
      'Réservez en ligne pour le Louvre Abu Dhabi afin d\'éviter les files d\'attente.',
      'Abu Dhabi est plus conservatrice que Dubaï ; vêtements couvrants recommandés dans les lieux publics.',
      'Les taxis et applications de VTC sont le moyen le plus pratique pour se déplacer dans la ville.',
    ],
    bestSeason: 'Octobre à avril pour un climat agréable et propice aux activités de plein air',
    tags: ['luxe', 'ville'],
    aliases: ['abudhabi', 'abu dhabi', 'أبوظبي'],
    image: 'assets/images/destinations/abu-dhabi.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 13. Doha
  // ─────────────────────────────────────────────
  {
    slug: 'doha',
    name: 'Doha',
    country: 'Qatar',
    region: 'Moyen-Orient',
    tagline: 'La capitale avant-gardiste du Golfe, entre tradition bédouine et modernité éclatante.',
    intro: 'Doha est la capitale et principale ville du Qatar, une cité-État du Golfe persique qui a connu une transformation spectaculaire en quelques décennies. La corniche de Doha, la médina restaurée de Souq Waqif et les musées d\'envergure mondiale comme le Musée d\'art islamique illustrent l\'ambition culturelle du pays. Avec des infrastructures hôtelières de classe mondiale et une cuisine internationale, Doha s\'est imposée comme une escale incontournable.',
    highlights: [
      'Le Musée d\'art islamique (MIA) et sa collection de renommée mondiale',
      'Souq Waqif, marché traditionnel animé au cœur de la ville',
      'La corniche de Doha et la skyline distinctive de West Bay',
      'Le quartier de Katara, village culturel dédié aux arts et spectacles',
      'The Pearl-Qatar, île artificielle aux marinas de luxe',
      'Le Musée national du Qatar, en forme de rose des sables',
    ],
    tips: [
      'Le Souq Waqif est idéal le soir, après la prière du Maghreb, pour une ambiance authentique.',
      'Les taxis et applications Careem sont fiables et abordables pour circuler.',
      'La consommation d\'alcool est autorisée dans les hôtels et restaurants agréés uniquement.',
      'Respectez les codes vestimentaires locaux, surtout dans les espaces publics et traditionnels.',
    ],
    bestSeason: 'Hiver et printemps pour profiter de la ville en plein air',
    tags: ['ville', 'luxe'],
    aliases: ['doha', 'الدوحة'],
    image: 'assets/images/destinations/doha.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'guides'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 14. Le Caire
  // ─────────────────────────────────────────────
  {
    slug: 'le-caire',
    name: 'Le Caire',
    country: 'Égypte',
    region: 'Afrique du Nord',
    tagline: 'La mère du monde, où les pharaons veillent encore sur la ville éternelle.',
    intro: 'Le Caire est la plus grande ville d\'Afrique, une mégapole vibrante et chaotique où les pyramides de Gizeh se dressent aux portes d\'un centre-ville ultramoderne. Berceau de la civilisation pharaonique et capitale islamique de premier plan, la ville offre une densité historique exceptionnelle à chaque coin de rue. Le musée égyptien, le vieux Caire copte et les souks de Khan el-Khalili en font une destination inépuisable.',
    highlights: [
      'Les pyramides de Gizeh et le Sphinx, merveilles du monde antique',
      'Le Grand Musée égyptien (GEM) et ses trésors de Toutânkhamon',
      'Le Khan el-Khalili, souk labyrinthique au cœur du Caire islamique',
      'La citadelle de Saladin et la mosquée Muhammad Ali',
      'Le vieux Caire copte et ses églises millénaires',
      'La croisière en felouque sur le Nil au coucher du soleil',
    ],
    tips: [
      'Visitez les pyramides à l\'aube pour éviter la foule et la chaleur du milieu de journée.',
      'Méfiez-vous des guides non officiels aux abords des sites touristiques.',
      'Le métro du Caire est le moyen le plus rapide pour traverser la ville aux heures de pointe.',
      'Marchandez sans hésiter dans les souks, les prix affichés sont souvent un point de départ.',
    ],
    bestSeason: 'Automne et hiver pour des températures agréables',
    tags: ['culture', 'ville'],
    aliases: ['cairo', 'caire', 'القاهرة', 'egypt cairo'],
    image: 'assets/images/destinations/le-caire.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 15. Charm el-Cheikh
  // ─────────────────────────────────────────────
  {
    slug: 'charm-el-cheikh',
    name: 'Charm el-Cheikh',
    country: 'Égypte',
    region: 'Péninsule du Sinaï',
    tagline: 'La cité du soleil, paradis de la plongée sur la mer Rouge.',
    intro: 'Charm el-Cheikh est la grande station balnéaire de l\'extrémité sud de la péninsule du Sinaï, réputée pour ses eaux cristallines, ses récifs coralliens et son ensoleillement généreux tout au long de l\'année. Les complexes hôteliers tout compris au bord de l\'eau accueillent des familles et des plongeurs du monde entier. La proximité du désert du Sinaï et du mont Sinaï permet de combiner plage et aventure.',
    highlights: [
      'La plongée et le snorkeling dans les récifs de Ras Mohammed',
      'Les plages de Naama Bay et leurs eaux turquoise',
      'L\'excursion nocturne au mont Sinaï pour le lever du soleil',
      'Le monastère Sainte-Catherine, plus ancien monastère chrétien habité du monde',
      'Les parcs à dauphins et aquariums pour les familles',
      'La promenade de Naama Bay et ses restaurants en bord de mer',
    ],
    tips: [
      'Choisissez un hôtel avec accès direct à la mer pour les meilleures opportunités de snorkeling.',
      'Le mont Sinaï se grimpe généralement la nuit ; portez des chaussures adaptées et des vêtements chauds.',
      'Un visa peut être obtenu à l\'arrivée pour les ressortissants de nombreux pays.',
      'Les formules tout compris sont très avantageuses dans cette destination.',
    ],
    bestSeason: 'Toute l\'année, avec des températures douces même en hiver',
    tags: ['plage', 'famille'],
    aliases: ['sharm el sheikh', 'sharm', 'شرم الشيخ', 'charm'],
    image: 'assets/images/destinations/charm-el-cheikh.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 16. Hurghada
  // ─────────────────────────────────────────────
  {
    slug: 'hurghada',
    name: 'Hurghada',
    country: 'Égypte',
    region: 'Mer Rouge',
    tagline: 'Station balnéaire au long cours, soleil assuré sur les rives de la mer Rouge.',
    intro: 'Hurghada est la principale station balnéaire de la côte égyptienne de la mer Rouge, connue pour ses hôtels tout compris, ses sports nautiques et ses récifs coralliens accessibles depuis la plage. La ville s\'est développée rapidement pour devenir une destination familiale prisée, alliant détente, plongée et excursions dans le désert. Son accessibilité en vols directs depuis de nombreux pays en fait une option très populaire pour les séjours balnéaires.',
    highlights: [
      'La plongée et le snorkeling dans les récifs coralliens de la mer Rouge',
      'Les excursions en bateau vers les îles de Giftun et leurs lagons',
      'Le safari 4×4 dans le désert du Sinaï et le Wadi al-Hammamat',
      'Les activités nautiques : kitesurf, windsurf, ski nautique',
      'La marina de Hurghada et ses restaurants de fruits de mer',
      'Les excursions au Nil et à Louxor depuis la côte',
    ],
    tips: [
      'La mer Rouge est idéale pour la plongée toute l\'année, mais l\'été peut être très chaud.',
      'Comparez les offres tout compris qui incluent souvent des excursions à prix réduit.',
      'Les plages privées des hôtels sont généralement mieux entretenues que les plages publiques.',
      'Réservez les excursions en bateau auprès d\'opérateurs agréés pour des raisons de sécurité.',
    ],
    bestSeason: 'Automne et hiver pour des températures agréables ; mer bonne toute l\'année',
    tags: ['plage', 'famille'],
    aliases: ['hurgada', 'hurghade', 'الغردقة'],
    image: 'assets/images/destinations/hurghada.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 17. Marrakech
  // ─────────────────────────────────────────────
  {
    slug: 'marrakech',
    name: 'Marrakech',
    country: 'Maroc',
    region: 'Afrique du Nord',
    tagline: 'La ville ocre, un enchantement pour tous les sens au pied de l\'Atlas.',
    intro: 'Marrakech est l\'une des villes les plus envoûtantes du monde, célèbre pour sa médina millénaire, ses palais fastueux, ses jardins secrets et l\'effervescence unique de la place Jemaa el-Fna. Cette ancienne capitale impériale concentre un patrimoine architectural exceptionnel entre mosquées, medersas et riads ornés de zellige et de bois de cèdre sculpté. La ville séduit autant les amateurs de culture que les voyageurs en quête de bien-être dans ses hammams et spas.',
    highlights: [
      'La place Jemaa el-Fna, spectacle vivant du Maroc au coucher du soleil',
      'Les souks de la médina : épices, cuir, tissu, artisanat en labyrinthe',
      'La Koutoubia, mosquée emblématique et minaret emblème de Marrakech',
      'Le jardin Majorelle et le musée Yves Saint Laurent',
      'Le palais Bahia et les ruines du palais El Badi',
      'La medersa Ben Youssef, chef-d\'œuvre de l\'architecture mérinide',
    ],
    tips: [
      'Faites appel à un guide officiel pour explorer la médina sans vous perdre.',
      'Les prix dans les souks se négocient ; commencez à la moitié du prix demandé.',
      'Un séjour en riad authentique offre une expérience bien plus immersive qu\'un grand hôtel.',
      'La place Jemaa el-Fna est à son comble en fin d\'après-midi et en début de soirée.',
    ],
    bestSeason: 'Printemps et automne pour profiter de la ville et envisager une excursion dans l\'Atlas',
    tags: ['culture', 'ville'],
    aliases: ['marrakesh', 'marrakeche', 'مراكش'],
    image: 'assets/images/destinations/marrakech.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 18. Casablanca
  // ─────────────────────────────────────────────
  {
    slug: 'casablanca',
    name: 'Casablanca',
    country: 'Maroc',
    region: 'Afrique du Nord',
    tagline: 'Le poumon économique du Maroc, ville moderne aux accents Art déco.',
    intro: 'Casablanca est la plus grande ville du Maroc et son principal centre économique et commercial, une métropole dynamique ouverte sur l\'Atlantique. Son architecture Art déco des années 1930, héritage de la période coloniale française, côtoie la grandiose mosquée Hassan II, l\'une des plus grandes mosquées du monde bâtie sur l\'océan. Bien que moins touristique que Marrakech ou Fès, Casablanca offre une expérience authentique de la vie urbaine marocaine contemporaine.',
    highlights: [
      'La mosquée Hassan II, monument architectural dressé sur l\'Atlantique',
      'La Corniche de Casablanca et les plages de Aïn Diab',
      'L\'architecture Art déco du quartier des Habous et du centre-ville',
      'La médina de Casablanca, plus authentique et moins fréquentée',
      'Le marché central et la gastronomie de poissons et fruits de mer',
      'Le quartier de Gauthier pour les restaurants et cafés branchés',
    ],
    tips: [
      'La mosquée Hassan II se visite en dehors des heures de prière avec un guide officiel.',
      'Le tramway relie les principaux quartiers de la ville de façon pratique et économique.',
      'La gastronomie de fruits de mer est excellente sur la corniche ; comparez les menus.',
      'Casablanca est souvent une escale ; combinez avec Marrakech ou Fès pour un voyage complet.',
    ],
    bestSeason: 'Printemps et automne pour un climat atlantique tempéré',
    tags: ['ville', 'culture'],
    aliases: ['casa', 'الدار البيضاء', 'casablanka'],
    image: 'assets/images/destinations/casablanca.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 19. Tanger
  // ─────────────────────────────────────────────
  {
    slug: 'tanger',
    name: 'Tanger',
    country: 'Maroc',
    region: 'Afrique du Nord',
    tagline: 'La porte de l\'Afrique, où deux mers et deux continents se font face.',
    intro: 'Tanger occupe une position géographique unique, au carrefour de la Méditerranée et de l\'Atlantique, en vue des côtes espagnoles à quelques kilomètres. Ville mythique qui inspira des générations d\'artistes et d\'écrivains, elle mêle influences arabes, berbères, espagnoles et françaises dans une atmosphère cosmopolite unique. La médina perchée sur la colline, le cap Spartel et les plages atlantiques font de Tanger une destination riche et contrastée.',
    highlights: [
      'La kasbah et la médina surplombant la baie de Tanger',
      'Le cap Spartel, pointe la plus nord-ouest de l\'Afrique continentale',
      'Les grottes d\'Hercule, site naturel et mythologique sur la côte atlantique',
      'Le boulevard Pasteur et l\'architecture de l\'ère internationale',
      'Les plages de la côte atlantique à partir de Asilah',
      'Le musée de la Kasbah (Dar el-Makhzen) et ses collections d\'arts marocains',
    ],
    tips: [
      'Tanger est très accessible depuis l\'Espagne en ferry depuis Algésiras ou Tarifa.',
      'La médina est plus abordable que celles de Fès ou Marrakech, mais le marchandage reste de mise.',
      'Le port de Tanger Med est différent du port de la ville ; vérifiez l\'embarcadère avant de partir.',
      'Les taxis "petits taxis" partagés sont économiques pour se déplacer en ville.',
    ],
    bestSeason: 'Printemps et été pour la plage ; automne pour explorer la médina',
    tags: ['ville', 'plage'],
    aliases: ['tangier', 'tangiers', 'طنجة'],
    image: 'assets/images/destinations/tanger.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 20. Chefchaouen
  // ─────────────────────────────────────────────
  {
    slug: 'chefchaouen',
    name: 'Chefchaouen',
    country: 'Maroc',
    region: 'Afrique du Nord',
    tagline: 'La ville bleue du Rif, un tableau de couleurs suspendu entre ciel et montagne.',
    intro: 'Chefchaouen est sans doute la ville la plus photographiée du Maroc, célèbre pour ses ruelles et maisons peintes en nuances de bleu dans les reliefs du massif du Rif. Fondée au XVe siècle, cette médina préservée exhale une atmosphère de sérénité rare, loin de l\'agitation des grandes villes. La ville est aussi une base idéale pour explorer les randonnées dans la forêt de cèdres et les villages berbères environnants.',
    highlights: [
      'Les ruelles bleues de la médina, une symphonie de bleus et de blancs',
      'La place Uta el-Hammam et la kasbah au cœur de la vieille ville',
      'La cascade d\'Ras el-Maa à l\'entrée de la médina',
      'La randonnée jusqu\'à la grotte du Rif avec vue panoramique sur la ville',
      'La forêt de cèdres de l\'Azrou accessible depuis la région',
      'Les marchés de laine et d\'artisanat berbère des alentours',
    ],
    tips: [
      'La médina se découvre à pied et sans presse ; prévoyez une demi-journée minimum.',
      'Les meilleures lumières pour photographier la ville sont tôt le matin.',
      'Logez dans un riad de la médina pour une immersion complète.',
      'Chefchaouen est facilement accessible en bus depuis Fès, Tétouan ou Tanger.',
    ],
    bestSeason: 'Printemps et automne pour randonnées et températures idéales',
    tags: ['culture', 'nature'],
    aliases: ['chaouen', 'xauen', 'شفشاون', 'chefchaouene'],
    image: 'assets/images/destinations/chefchaouen.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'guides'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 21. Agadir
  // ─────────────────────────────────────────────
  {
    slug: 'agadir',
    name: 'Agadir',
    country: 'Maroc',
    region: 'Afrique du Nord',
    tagline: 'La station soleil du Maroc, plages dorées et douceur atlantique.',
    intro: 'Agadir est la principale station balnéaire du Maroc, bénéficiant d\'un ensoleillement exceptionnel et d\'une longue plage de sable fin face à l\'Atlantique. Reconstruite après le tremblement de terre de 1960, la ville moderne offre des infrastructures hôtelières de qualité et un front de mer animé. Son accès au Souss-Massa, aux arganiers et à la vallée du Paradis en fait aussi une base pour les excursions dans le sud marocain.',
    highlights: [
      'La grande plage d\'Agadir, longue bande de sable doré face à l\'océan',
      'La Kasbah d\'Agadir Oufella et sa vue panoramique sur la baie',
      'Le souk El Had, plus grand marché couvert du Maroc',
      'La vallée du Paradis (Vallée des Oiseaux) pour une excursion nature',
      'Le surf et les sports de glisse sur les vagues atlantiques',
      'La forêt d\'arganiers du Souss-Massa, patrimoine UNESCO',
    ],
    tips: [
      'Agadir est très ventée ; renseignez-vous sur les conditions météo pour les activités nautiques.',
      'Evitez les restaurants du port touristique et explorez les adresses locales du quartier Talborjt.',
      'L\'huile d\'argan est une spécialité locale ; achetez-la dans des coopératives féminines pour garantir l\'authenticité.',
      'La ville dispose de nombreux vols charters depuis l\'Europe, ce qui en fait une destination abordable.',
    ],
    bestSeason: 'Toute l\'année grâce au microclimat ; printemps et automne particulièrement agréables',
    tags: ['plage', 'famille'],
    aliases: ['agadire', 'أكادير'],
    image: 'assets/images/destinations/agadir.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 22. Paris
  // ─────────────────────────────────────────────
  {
    slug: 'paris',
    name: 'Paris',
    country: 'France',
    region: 'Europe',
    tagline: 'La Ville Lumière, capitale intemporelle de l\'art, de la mode et de la gastronomie.',
    intro: 'Paris est l\'une des villes les plus visitées du monde, une métropole de culture et de raffinement dont le patrimoine architectural, artistique et gastronomique n\'a pas d\'équivalent. Des rives de la Seine aux grandes avenues haussmanniennes, chaque quartier possède une identité propre et une histoire à raconter. Musées universels, cafés littéraires, marchés animés et jardins élégants en font une destination qui se redécouvre à chaque visite.',
    highlights: [
      'La Tour Eiffel et la vue sur Paris depuis le Trocadéro',
      'Le musée du Louvre, l\'un des plus riches musées d\'art du monde',
      'La cathédrale Notre-Dame de Paris, joyau du gothique médiéval',
      'Le quartier de Montmartre et la basilique du Sacré-Cœur',
      'Le musée d\'Orsay et ses collections impressionnistes',
      'Les Champs-Élysées et l\'Arc de Triomphe',
    ],
    tips: [
      'Le métro parisien est le moyen le plus efficace pour se déplacer ; achetez un carnet ou un pass.',
      'Les musées nationaux sont gratuits le premier dimanche du mois pour les résidents de l\'UE.',
      'Réservez à l\'avance pour les grandes attractions (Louvre, Tour Eiffel) afin d\'éviter les queues.',
      'Les boulangeries et marchés locaux offrent une expérience gastronomique bien plus authentique que les restaurants touristiques.',
    ],
    bestSeason: 'Printemps et début d\'automne pour le climat et les événements culturels',
    tags: ['ville', 'culture', 'luxe'],
    aliases: ['paris france', 'pariz'],
    image: 'assets/images/destinations/paris.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 23. Rome
  // ─────────────────────────────────────────────
  {
    slug: 'rome',
    name: 'Rome',
    country: 'Italie',
    region: 'Europe',
    tagline: 'La Ville Éternelle, deux mille ans d\'histoire à portée de regard.',
    intro: 'Rome est une ville-musée à ciel ouvert où les vestiges de l\'Antiquité côtoient les trésors de la Renaissance et du baroque. Du Colisée au Vatican, en passant par les fontaines et les piazze animées, la ville déploie une beauté et une richesse historique sans pareille. Sa gastronomie, son art de vivre et la chaleur de ses habitants en font bien plus qu\'une destination touristique : une expérience humaine profonde.',
    highlights: [
      'Le Colisée et le Forum romain, cœur de l\'Empire antique',
      'La Cité du Vatican, la Basilique Saint-Pierre et les Musées du Vatican',
      'La Fontaine de Trevi et le rite du vœu',
      'La Piazza Navona et ses fontaines baroques de Bernin',
      'Le Panthéon, chef-d\'œuvre d\'architecture antique toujours debout',
      'La Villa Borghèse et ses jardins pour une pause verdoyante',
    ],
    tips: [
      'Réservez les Musées du Vatican bien à l\'avance pour éviter plusieurs heures de queue.',
      'Rome se visite à pied ; portez des chaussures confortables pour les pavés sampietrini.',
      'L\'entrée dans les basiliques est gratuite mais une tenue décente est exigée (épaules et genoux couverts).',
      'Évitez les restaurants à proximité immédiate des grands monuments ; deux rues suffisent pour trouver mieux.',
    ],
    bestSeason: 'Printemps et automne pour le climat et des sites moins bondés',
    tags: ['culture', 'ville'],
    aliases: ['roma', 'rome italy'],
    image: 'assets/images/destinations/rome.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'guides', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 24. Barcelone
  // ─────────────────────────────────────────────
  {
    slug: 'barcelone',
    name: 'Barcelone',
    country: 'Espagne',
    region: 'Europe',
    tagline: 'L\'effervescente capitale catalane, entre génie gaudien et plages méditerranéennes.',
    intro: 'Barcelone est une ville unique en son genre qui allie une architecture moderniste flamboyante — dominée par le génie d\'Antoni Gaudí — à des plages de sable fin sur la Méditerranée. La ville catalane vibre de culture, de gastronomie, de musique et de festivals tout au long de l\'année. Du quartier gothique aux marchés de la Boqueria, en passant par les ruelles du Born, Barcelone est une ville qui se déguste sans se presser.',
    highlights: [
      'La Sagrada Família, la basilique inachevée de Gaudí, œuvre de toute une vie',
      'Le parc Güell et ses mosaïques colorées surplombant la ville',
      'Les Ramblas et le marché de la Boqueria',
      'Le quartier gothique (Barri Gòtic) et ses ruelles médiévales',
      'La Casa Batlló et la Casa Milà (La Pedrera)',
      'Les plages de Barceloneta et le front de mer de Port Olimpic',
    ],
    tips: [
      'Réservez les billets de la Sagrada Família et de la Casa Batlló en ligne, plusieurs semaines à l\'avance.',
      'Le métro est efficace pour traverser la ville ; un pass de plusieurs jours est rentable.',
      'Faites attention aux pickpockets sur les Ramblas et dans le métro.',
      'La vie barcelonaise commence tard ; les restaurants ne se remplissent vraiment qu\'après 21h.',
    ],
    bestSeason: 'Printemps et début d\'automne pour un équilibre météo, plage et culture',
    tags: ['ville', 'plage', 'culture'],
    aliases: ['barcelona', 'barcelone espagne'],
    image: 'assets/images/destinations/barcelone.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 25. Londres
  // ─────────────────────────────────────────────
  {
    slug: 'londres',
    name: 'Londres',
    country: 'Royaume-Uni',
    region: 'Europe',
    tagline: 'La capitale mondiale de la diversité, où tradition royale et créativité contemporaine cohabitent.',
    intro: 'Londres est l\'une des villes les plus cosmopolites et dynamiques du monde, une métropole qui conjugue un patrimoine historique royal à une scène culturelle, gastronomique et artistique en perpétuelle effervescence. Ses musées de renommée mondiale sont pour la plupart gratuits, ses parcs immenses offrent des respirations au cœur de la ville, et ses quartiers — de Shoreditch à Chelsea — ont chacun une personnalité distincte. Une semaine ne suffit pas pour en faire le tour.',
    highlights: [
      'Le Tower Bridge et la Tour de Londres, symboles millénaires de la capitale',
      'Les musées gratuits : British Museum, National Gallery, V&A Museum',
      'Buckingham Palace et la relève de la garde',
      'Le marché de Borough Market et la gastronomie londonienne',
      'Les quartiers de Notting Hill et de Shoreditch pour leur atmosphère unique',
      'Hyde Park, Regent\'s Park et les espaces verts royaux',
    ],
    tips: [
      'L\'Oyster Card ou une carte sans contact simplifient grandement les déplacements en tube et bus.',
      'La météo est imprévisible ; un imperméable léger est indispensable quelle que soit la saison.',
      'Beaucoup des plus grands musées sont gratuits, ce qui est un atout majeur pour un budget serré.',
      'Réservez les spectacles de West End à l\'avance ou cherchez les billets de dernière minute pour des tarifs réduits.',
    ],
    bestSeason: 'Printemps et été pour profiter des parcs et de la vie en terrasse',
    tags: ['ville', 'culture'],
    aliases: ['london', 'londre', 'uk london'],
    image: 'assets/images/destinations/londres.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 26. Amman
  // ─────────────────────────────────────────────
  {
    slug: 'amman',
    name: 'Amman',
    country: 'Jordanie',
    region: 'Moyen-Orient',
    tagline: 'La ville blanche de Jordanie, porte d\'entrée vers les trésors du Levant.',
    intro: 'Amman est la capitale de la Jordanie, une ville moderne et accueillante construite sur sept collines, qui mêle quartiers résidentiels huppés et médina animée. Bien que souvent considérée comme une simple escale, la ville mérite une exploration à part entière avec sa citadelle antique, son théâtre romain et ses souks animés du centre historique. Amman est également un excellent point de départ pour Pétra, la mer Morte et Wadi Rum.',
    highlights: [
      'La citadelle d\'Amman (Jabal al-Qal\'a) et le temple d\'Hercule',
      'Le théâtre romain d\'Amman, remarquablement bien conservé',
      'Le centre-ville de Balad et les souks traditionnels',
      'Le musée archéologique de Jordanie sur la citadelle',
      'Rainbow Street et ses cafés, galeries et restaurants bohèmes',
      'Le marché nocturne de Souk Jara en saison estivale',
    ],
    tips: [
      'La Jordan Pass couvre le visa et l\'entrée à Pétra — très rentable si vous visitez plusieurs sites.',
      'Amman est une ville de collines ; comptez du temps pour les trajets à pied entre les quartiers.',
      'Le mansaf (agneau au laban) est le plat national jordanien à ne pas manquer.',
      'Les taxis jaunes sont partout ; négociez le prix avant de monter ou insistez pour le compteur.',
    ],
    bestSeason: 'Printemps et automne pour des températures agréables et des excursions confortables',
    tags: ['culture', 'ville'],
    aliases: ['amman jordan', 'عمان'],
    image: 'assets/images/destinations/amman.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'guides', 'location-voiture'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 27. Pétra
  // ─────────────────────────────────────────────
  {
    slug: 'petra',
    name: 'Pétra',
    country: 'Jordanie',
    region: 'Moyen-Orient',
    tagline: 'La cité rose taillée dans le roc, merveille nabatéenne d\'une beauté intemporelle.',
    intro: 'Pétra est l\'un des sites archéologiques les plus fascinants et les plus spectaculaires du monde, ancienne capitale du royaume nabatéen creusée dans les falaises de grès rose du désert jordanien. Le Trésor (Al-Khazneh), révélé au bout d\'un long défilé rocheux (le Siq), reste l\'une des images les plus iconiques de toute l\'archéologie mondiale. Cette ville rock aux temples, tombeaux et monastères monumentaux se parcourt sur plusieurs jours pour en saisir toute la richesse.',
    highlights: [
      'Al-Khazneh (le Trésor), façade monumentale emblématique de Pétra',
      'Le Siq, le défilé étroit et sinueux qui mène au site',
      'Le Monastère (Ad-Deir), colossal et perché au sommet d\'une colline',
      'La Grande Colonnade et la rue à colonnades de la ville basse',
      'Pétra by Night, visite nocturne aux chandelles pour une atmosphère magique',
      'Le point de vue du Trésor depuis le Jabal al-Khubtha',
    ],
    tips: [
      'Prévoyez au moins deux jours pour explorer Pétra correctement sans se presser.',
      'Portez des chaussures de marche solides, le site comporte de nombreux chemins en pierre.',
      'Les ânes et chevaux proposés à l\'entrée ne sont pas indispensables pour les visiteurs valides.',
      'La Jordan Pass inclut l\'accès à Pétra et représente une économie significative.',
    ],
    bestSeason: 'Printemps et automne pour des températures agréables pour la marche',
    tags: ['culture', 'nature'],
    aliases: ['petра', 'البتراء', 'petra jordan'],
    image: 'assets/images/destinations/petra.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'guides', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 28. Kuala Lumpur
  // ─────────────────────────────────────────────
  {
    slug: 'kuala-lumpur',
    name: 'Kuala Lumpur',
    country: 'Malaisie',
    region: 'Asie du Sud-Est',
    tagline: 'La capitale multicolore de Malaisie, carrefour de cultures et de saveurs.',
    intro: 'Kuala Lumpur est une métropole asiatique vibrante et diverse, où les gratte-ciel ultramodernes côtoient les temples hindous, les mosquées et les quartiers coloniaux. Les Tours Petronas, symboles de l\'essor du pays, dominent une skyline spectaculaire qui révèle l\'ambition de la ville. La ville est aussi un paradis pour les amateurs de gastronomie, avec une scène culinaire qui mêle cuisines malaise, chinoise, indienne et internationale.',
    highlights: [
      'Les Tours Petronas et la skyline de KL depuis le parc KLCC',
      'La tour KL (Menara KL) et son pont suspendu dans la forêt',
      'Les grottes de Batu, temple hindou spectaculaire dans les falaises calcaires',
      'Chinatown (Petaling Street) et le marché nocturne',
      'Little India (Brickfields) et ses couleurs et arômes d\'épices',
      'Le quartier de Bukit Bintang pour le shopping et la gastronomie de rue',
    ],
    tips: [
      'KL dispose d\'un excellent réseau de transports en commun (LRT, MRT, monorail) ; utilisez-le.',
      'La chaleur et l\'humidité sont intenses ; prévoyez des vêtements légers et respirants.',
      'Les centres commerciaux sont très fréquentés par les locaux et offrent la climatisation bienvenue.',
      'La nourriture de rue (hawker centres) est délicieuse et sûre ; c\'est là que les habitants mangent.',
    ],
    bestSeason: 'De mars à fin octobre, en évitant les pics de mousson selon la région',
    tags: ['ville', 'culture'],
    aliases: ['kl', 'kualalumpur', 'كوالالمبور'],
    image: 'assets/images/destinations/kuala-lumpur.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides', 'bagages'],
    featured: true,
  },

  // ─────────────────────────────────────────────
  // 29. Bali
  // ─────────────────────────────────────────────
  {
    slug: 'bali',
    name: 'Bali',
    country: 'Indonésie',
    region: 'Asie du Sud-Est',
    tagline: 'L\'île des dieux, un écrin de spiritualité, de nature et de douceur de vivre.',
    intro: 'Bali est l\'une des destinations les plus envoûtantes d\'Asie du Sud-Est, une île volcanique indonésienne aux rizières en terrasses, aux temples sacrés et aux plages paradisiaques. La richesse de la culture balinaise — avec ses danses, ses offrandes quotidiennes et ses cérémonies — confère à l\'île une atmosphère spirituelle unique. Du surf de Kuta aux retraites de yoga d\'Ubud en passant par les falaises de Uluwatu, Bali propose une palette d\'expériences inoubliables.',
    highlights: [
      'Les rizières en terrasses de Tegalalang à Ubud',
      'Le temple de Tanah Lot, posé sur un rocher dans l\'océan au coucher du soleil',
      'La danse kecak au temple d\'Uluwatu au coucher du soleil',
      'Le marché artisanal d\'Ubud et ses galeries d\'art',
      'Les plages de Seminyak et Canggu pour le surf et la détente',
      'Le volcan Batur et la randonnée au lever du soleil',
    ],
    tips: [
      'Louez un scooter ou un chauffeur privé pour vous déplacer librement dans l\'île.',
      'Respectez les sites sacrés : portez un sarong et une écharpe autour de la taille.',
      'La saison sèche est idéale ; la saison des pluies peut être intense mais les paysages restent splendides.',
      'Ubud est le meilleur choix pour une immersion culturelle ; Seminyak pour la plage et la fête.',
    ],
    bestSeason: 'Saison sèche pour les plages et randonnées ; toute l\'année pour la culture',
    tags: ['plage', 'nature', 'famille'],
    aliases: ["bali indonésie", 'bali island'],
    image: 'assets/images/destinations/bali.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'guides'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 30. Maldives
  // ─────────────────────────────────────────────
  {
    slug: 'maldives',
    name: 'Maldives',
    country: 'Maldives',
    region: 'Océan Indien',
    tagline: 'L\'archipel de l\'absolu, lagons de rêve et sérénité à fleur d\'eau.',
    intro: 'Les Maldives forment l\'un des archipels les plus époustouflants de la planète, avec leurs atolls de corail entourés d\'eaux d\'un bleu irréel et leurs plages de sable blanc immaculé. Cette destination est synonyme de luxe discret, de villas sur pilotis et de plongée en apnée dans des eaux gorgées de vie marine. Loin du monde, les Maldives offrent une déconnexion totale dans un cadre naturel d\'une beauté absolue.',
    highlights: [
      'Les villas sur pilotis au-dessus du lagon, l\'expérience Maldives par excellence',
      'La plongée et le snorkeling avec raies mantas, requins-baleines et tortues',
      'Les plages de sable blanc et les couchers de soleil sur l\'océan',
      'Le bioluminescence nocturne sur certaines plages de l\'archipel',
      'L\'observation des dauphins et les sorties en excursion en bateau dhoni',
      'Les house reefs directement accessibles depuis les resorts',
    ],
    tips: [
      'Comparez les catégories d\'atolls : North Malé, South Malé, Baa Atoll — chacun a ses spécificités.',
      'Les transferts en hydravion ou speedboat depuis Malé représentent un coût significatif à anticiper.',
      'Les guest houses sur les îles locales sont une alternative bien plus abordable aux resorts de luxe.',
      'Respectez les règles locales : tenue décente dans les îles habitées, pas d\'alcool hors des resorts.',
    ],
    bestSeason: 'Saison sèche (côté nord-est) pour des eaux calmes et un ciel clair',
    tags: ['plage', 'luxe'],
    aliases: ['maldive', 'المالديف'],
    image: 'assets/images/destinations/maldives.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 31. Zanzibar
  // ─────────────────────────────────────────────
  {
    slug: 'zanzibar',
    name: 'Zanzibar',
    country: 'Tanzanie',
    region: 'Afrique de l\'Est',
    tagline: 'L\'île aux épices, entre plages de rêve et vieille ville swahilie.',
    intro: 'Zanzibar est une île de l\'océan Indien au large des côtes tanzaniennes, dont les eaux émeraude, les plages de sable blanc et la vieille ville de Stone Town en font une destination de plus en plus prisée. Ancienne capitale de la route des épices, l\'île conserve une architecture arabo-africaine unique et une culture swahilie vivante. La combinaison safari sur le continent et séjour balnéaire à Zanzibar est l\'un des circuits les plus populaires d\'Afrique de l\'Est.',
    highlights: [
      'Stone Town, vieille ville arabo-africaine inscrite au patrimoine UNESCO',
      'Les plages de Nungwi et Kendwa sur la côte nord',
      'La plongée et le snorkeling dans les récifs de Mnemba Atoll',
      'Les plantations d\'épices et les tours de la route des épices',
      'La Plage des tortues à Nungwi et les nurseries de tortues marines',
      'Les excursions pour nager avec les dauphins à Kizimkazi',
    ],
    tips: [
      'Stone Town mérite au moins une nuit pour l\'explorer tranquillement au coucher du soleil.',
      'La saison des pluies courtes peut être intense ; vérifiez les conditions avant de réserver.',
      'Le combiné Tanzanie (safari) + Zanzibar est idéal et ne coûte pas beaucoup plus cher qu\'un seul.',
      'La nourriture de rue swahilie du marché Forodhani Gardens à Stone Town est délicieuse.',
    ],
    bestSeason: 'Saison sèche pour les plages ; toute l\'année pour Stone Town',
    tags: ['plage', 'nature'],
    aliases: ['zanzibare', 'زنجبار'],
    image: 'assets/images/destinations/zanzibar.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'guides', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 32. Djerba
  // ─────────────────────────────────────────────
  {
    slug: 'djerba',
    name: 'Djerba',
    country: 'Tunisie',
    region: 'Afrique du Nord',
    tagline: 'L\'île méditerranéenne de Tunisie, douceur de vivre entre mer et culture.',
    intro: 'Djerba est la plus grande île de l\'Afrique du Nord, une destination balnéaire méditerranéenne appréciée pour ses plages peu profondes, ses complexes hôteliers et son ambiance détendue. L\'île possède aussi un patrimoine historique et culturel riche, avec la célèbre synagogue de la Ghriba, la médina de Houmt Souk et ses fortifications ottomanes. Facilement accessible en vols directs depuis l\'Europe, elle est idéale pour un séjour familial sans complications.',
    highlights: [
      'La zone touristique de Sidi Mahrez et ses plages peu profondes, idéales pour les enfants',
      'La médina de Houmt Souk et ses souks d\'artisanat local',
      'La synagogue de la Ghriba, l\'une des plus anciennes synagogues du monde',
      'Le fort de Bordj el-Kebir et les remparts côtiers',
      'Les villages de potiers de Guellala et leur musée',
      'Le marché hebdomadaire de Houmt Souk pour l\'artisanat et les épices',
    ],
    tips: [
      'Louez un vélo ou un scooter pour explorer l\'intérieur de l\'île à votre rythme.',
      'Les formules tout compris dominent l\'offre hôtelière ; comparez bien les emplacements.',
      'Houmt Souk vaut le détour même si vous logez dans la zone touristique.',
      'La synagogue de la Ghriba est accessible à tous et particulièrement animée lors du pèlerinage annuel.',
    ],
    bestSeason: 'Printemps et été pour la plage ; automne pour explorer l\'île sans chaleur',
    tags: ['plage', 'famille'],
    aliases: ['jerba', 'جربة'],
    image: 'assets/images/destinations/djerba.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'location-voiture', 'bagages'],
    featured: false,
  },

  // ─────────────────────────────────────────────
  // 33. Sarajevo
  // ─────────────────────────────────────────────
  {
    slug: 'sarajevo',
    name: 'Sarajevo',
    country: 'Bosnie-Herzégovine',
    region: 'Europe',
    tagline: 'La Jérusalem d\'Europe, carrefour unique de civilisations et de mémoire.',
    intro: 'Sarajevo est une capitale européenne hors du commun, surnommée la "Jérusalem d\'Europe" pour sa cohabitation unique de mosquées ottomanes, d\'églises orthodoxes et catholiques et de synagogues en plein centre-ville. Marquée par l\'histoire de la guerre des années 1990, la ville s\'est relevée avec une résilience remarquable et offre aujourd\'hui une scène culturelle et gastronomique en plein essor. Ses ruelles de Baščaršija, son architecture austro-hongroise et sa tradition de café oriental en font une destination profondément attachante.',
    highlights: [
      'Baščaršija, le grand bazar ottoman cœur historique de la ville',
      'La mosquée Gazi Husrev-beg, chef-d\'œuvre ottoman du XVIe siècle',
      'La vieille ville et le quartier Ferhadija pour flâner entre cafés et boutiques',
      'Le mémorial de Srebrenica et les musées dédiés à la guerre de Bosnie',
      'Le téléphérique vers la montagne Trebević et ses paysages alpins',
      'Le marché de Markale et la cuisine bosniaque (ćevapi, burek)',
    ],
    tips: [
      'Le café à la bosniaque (kafa) se savoure lentement dans les kafanas traditionnelles.',
      'Sarajevo est une ville très accessible à pied dans le centre historique.',
      'Le sujet de la guerre des années 1990 doit être abordé avec sensibilité et respect.',
      'La ville est très abordable par rapport aux autres capitales européennes.',
    ],
    bestSeason: 'Printemps et été pour la montagne ; automne pour la ville et la culture',
    tags: ['culture', 'ville'],
    aliases: ['sarajevo bosnie', 'сарајево'],
    image: 'assets/images/destinations/sarajevo.jpg',
    services: ['vols', 'hotels', 'transferts', 'activites', 'esim', 'guides'],
    featured: false,
  },
];
