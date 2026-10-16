package com.example.manasik.data.repository.destinations

import com.example.manasik.data.model.Destination

object FrenchDestinations {
    val list: List<Destination> = listOf(
        Destination(
            slug = "la-mecque",
            name = "La Mecque",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "Le cœur spirituel de l'Islam, destination sacrée par excellence.",
            intro = "La Mecque est la ville la plus sainte de l'Islam, berceau de la Révélation et lieu de la Kaaba sacrée vers laquelle prient plus de deux milliards de fidèles. Accomplir l'Omra ou le Hajj ici est une expérience spirituelle unique et inoubliable.",
            highlights = listOf(
                "Tawaf autour de la Kaaba sacrée et salut à la Pierre Noire",
                "Sa'i rituel entre Safa et Marwah",
                "Eau bénite du puits de Zamzam",
                "Montagne de la Lumière (Jabal al-Nour) et grotte de Hira",
                "Mont Arafat et plaine de Mina"
            ),
            tips = listOf(
                "Entrée à La Mecque réservée aux musulmans munis d'un permis Nusuk officiel.",
                "Réservez tôt pour garantir des hôtels face aux esplanades du Haram.",
                "Portez des vêtements amples et confortables adaptés aux rites."
            ),
            bestSeason = "Omra possible toute l'année ; Hajj aux dates du calendrier hégirien",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("makkah", "mecca", "meca"),
            imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "medine",
            name = "Médine",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "La ville lumineuse, sanctuaire de paix et de recueillement.",
            intro = "Médine abrite la Mosquée du Prophète (al-Masjid an-Nabawi) et la sainte Rawdah. Une atmosphère de sérénité inégalée accueille pèlerins et fidèles venus se recueillir et prier.",
            highlights = listOf(
                "La Mosquée du Prophète et la noble Rawdah",
                "Mosquée de Quba, premier édifice de l'Islam",
                "Cimetière d'Al-Baqi et tombes des compagnons",
                "Mosquée des Deux Qiblas (Masjid al-Qiblatayn)",
                "Mont Uhud et mémorial historique des martyrs"
            ),
            tips = listOf(
                "Réservez votre créneau pour la Rawdah via l'application Nusuk.",
                "Privilégiez les visites tôt le matin pour éviter l'affluence.",
                "Atmosphère de recueillement et tenue modeste de rigueur."
            ),
            bestSeason = "Printemps et automne pour un climat doux et agréable",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("madinah", "medina"),
            imageAsset = "file:///android_asset/destinations/medine.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "djeddah",
            name = "Djeddah",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "La perle de la mer Rouge, porte historique des Lieux Saints.",
            intro = "Métropole côtière cosmopolite mêlant le charme coralien d'Al-Balad (UNESCO) aux promenades de la corniche, restaurants marins et plongées exceptionnelles en mer Rouge.",
            highlights = listOf(
                "Quartier historique Al-Balad classé au patrimoine mondial UNESCO",
                "Fontaine du Roi Fahd sur la corniche, la plus haute du monde",
                "Corniche maritime avec sculptures en plein air et marinas",
                "Plongée sous-marine et récifs coralliens préservés"
            ),
            tips = listOf(
                "Visitez Al-Balad en soirée à la lueur des lanternes traditionnelles.",
                "Prenez le train à grande vitesse Haramain pour relier La Mecque en 45 minutes."
            ),
            bestSeason = "Novembre à mars pour des températures douces en bord de mer",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("jeddah", "jidda"),
            imageAsset = "file:///android_asset/destinations/djeddah.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "taif",
            name = "Taïf",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "La cité des roses perchée sur les hauteurs verdoyantes du Hedjaz.",
            intro = "Réputée pour sa fraîcheur montagnarde, ses plantations de roses de renommée mondiale et son téléphérique d'Al Hada offrant des panoramas saisissants.",
            highlights = listOf(
                "Distilleries traditionnelles d'eau de rose de Taïf",
                "Téléphérique panoramique de la montagne Al Hada",
                "Palais historique Shubra et marché artisanal",
                "Vergers d'abricots, figues et grenades en terrasse"
            ),
            tips = listOf(
                "Prévoyez une veste légère pour les soirées en altitude.",
                "Visitez au printemps pour assister à la cueillette des roses parfumées."
            ),
            bestSeason = "Mai à octobre pour échapper aux chaleurs de la plaine",
            tags = listOf("moyen-orient", "nature"),
            aliases = listOf("taif", "al-taif"),
            imageAsset = "file:///android_asset/destinations/taif.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "alula",
            name = "AlUla",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "Un musée à ciel ouvert au cœur du désert millénaire nabatéen.",
            intro = "AlUla dévoile les tombeaux d'Hégra taillés dans le grès rouge, une oasis luxuriante et la majestueuse salle de concerts Maraya, le plus grand édifice en miroirs au monde.",
            highlights = listOf(
                "Site archéologique nabatéen d'Hégra (UNESCO)",
                "Rocher de l'Éléphant (Jabal AlFil) et point de vue Harrat",
                "Vieille ville médiévale et oasis de palmiers-dattiers",
                "Salle de concerts Maraya aux façades miroitantes géantes"
            ),
            tips = listOf(
                "Réservez les visites guidées d'Hégra bien à l'avance.",
                "Apportez un vêtement chaud pour les nuits fraîches dans le désert."
            ),
            bestSeason = "Octobre à avril",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("al-ula", "hegra"),
            imageAsset = "file:///android_asset/destinations/alula.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "riyad",
            name = "Riyad",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "La capitale dynamique, alliance d'audace futuriste et d'histoire.",
            intro = "Riyad associe gratte-ciels spectaculaires et patrimoine de briques crues à Diriyah (UNESCO), berceau historique du premier État saoudien.",
            highlights = listOf(
                "Quartier historique At-Turaif à Diriyah (UNESCO)",
                "Forteresse historique d'Al Masmak en briques crues",
                "Kingdom Centre Tower et son Sky Bridge vertigineux",
                "Souq Al Zal, plus ancien marché traditionnel de tapis et d'encens"
            ),
            tips = listOf(
                "Découvrez Diriyah en soirée pour profiter des terrasses illuminées."
            ),
            bestSeason = "Novembre à mars",
            tags = listOf("moyen-orient", "ville"),
            aliases = listOf("riyadh", "riad"),
            imageAsset = "file:///android_asset/destinations/riyad.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "istanbul",
            name = "Istanbul",
            country = "Turquie",
            region = "Europe / Asie",
            tagline = "Le carrefour des civilisations entre Orient et Occident sur le Bosphore.",
            intro = "À cheval sur deux continents, Istanbul fascine par Sainte-Sophie, la Mosquée Bleue, le Palais de Topkapi et l'animation chaleureuse de ses bazars centenaires.",
            highlights = listOf(
                "Sainte-Sophie (Ayasofya) et la Mosquée Bleue de Sultanahmet",
                "Le Grand Bazar et le Bazar Égyptien aux épices",
                "Croisière panoramique sur le détroit du Bosphore au couchant",
                "Palais de Topkapi et ses collections impériales ottomanes"
            ),
            tips = listOf(
                "Achetez une Istanbulkart pour emprunter tramways, métros et ferries.",
                "Prévoyez un foulard pour visiter les mosquées historiques."
            ),
            bestSeason = "Avril à juin et septembre à novembre",
            tags = listOf("europe", "asie", "ville", "culture"),
            aliases = listOf("constantinople", "turquie"),
            imageAsset = "file:///android_asset/destinations/istanbul.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "esim"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "antalya",
            name = "Antalya",
            country = "Turquie",
            region = "Europe / Asie",
            tagline = "Riviera turque, falaises turquoise et ruines gréco-romaines.",
            intro = "Joyau méditerranéen associant le vieux quartier historique de Kaleiçi, de somptueuses cascades et des plages baignées de soleil toute l'année.",
            highlights = listOf(
                "Vieille ville fortifiée de Kaleiçi et porte d'Hadrien",
                "Cascades côtières de Düden tombant dans la mer",
                "Plages de Konyaaltı et Lara bordées d'eaux cristallines",
                "Théâtre antique d'Aspendos exceptionnellement conservé"
            ),
            tips = listOf(
                "Faites une sortie en bateau le long des falaises au coucher du soleil."
            ),
            bestSeason = "Avril à octobre",
            tags = listOf("europe", "asie", "plage", "nature"),
            aliases = listOf("riviera-turque"),
            imageAsset = "file:///android_asset/destinations/antalya.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "cappadoce",
            name = "Cappadoce",
            country = "Turquie",
            region = "Europe / Asie",
            tagline = "Cheminées de fées et montgolfières dans un décor lunaire féerique.",
            intro = "Valles lunaires sculptées par l'érosion, cités troglodytiques souterraines et inoubliables envols de montgolfières à l'aube au-dessus de Göreme.",
            highlights = listOf(
                "Vol féerique en montgolfière au lever du soleil sur Göreme",
                "Musée en plein air de Göreme et églises rupestres byzantines",
                "Villes souterraines profondes de Derinkuyu et Kaymakli",
                "Vallée de l'Amour, Vallée des Pigeons et forteresse d'Uçhisar"
            ),
            tips = listOf(
                "Réservez votre vol en montgolfière pour le premier matin.",
                "Séjournez dans un hôtel troglodyte traditionnel creusé dans la roche."
            ),
            bestSeason = "Mai à octobre",
            tags = listOf("europe", "asie", "nature", "culture"),
            aliases = listOf("cappadocia", "goreme"),
            imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "trabzon",
            name = "Trabzon",
            country = "Turquie",
            region = "Europe / Asie",
            tagline = "Forêts d'émeraude, brumes et monastères accrochés aux falaises.",
            intro = "Capitale de la mer Noire célèbre pour le monastère suspendu de Sümela et le lac alpin d'Uzungöl entouré de sapinières verdoyantes.",
            highlights = listOf(
                "Monastère spectaculaire de Sümela suspendu à la falaise",
                "Lac alpin d'Uzungöl et ses chalets en bois traditionnels",
                "Plateaux verdoyants d'Ayder et sources thermales",
                "Pavillon Atatürk et panoramas sur la mer Noire"
            ),
            tips = listOf(
                "Goûtez au célèbre plat traditionnel kuymak au fromage fondu."
            ),
            bestSeason = "Juin à septembre",
            tags = listOf("europe", "asie", "nature"),
            aliases = listOf("trebizonde", "uzungol"),
            imageAsset = "file:///android_asset/destinations/trabzon.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "dubai",
            name = "Dubaï",
            country = "Émirats arabes unis",
            region = "Moyen-Orient",
            tagline = "La métropole futuriste entre désert doré et gratte-ciels scintillants.",
            intro = "Épicentre mondial de l'innovation et du luxe, Dubaï séduit par le Burj Khalifa, l'île Palm Jumeirah, les safaris dans les dunes et ses plages de rêve.",
            highlights = listOf(
                "Le Burj Khalifa et son observatoire au 148e étage",
                "Le Dubai Mall et le spectacle féerique des fontaines dansantes",
                "Safari en 4x4 dans les dunes dorées avec dîner bédouin",
                "L'archipel artificiel de Palm Jumeirah et ses clubs de plage"
            ),
            tips = listOf(
                "Utilisez le métro climatisé pour circuler facilement entre les quartiers.",
                "Prévoyez les activités en intérieur aux heures les plus chaudes de la journée."
            ),
            bestSeason = "Novembre à avril",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("uae", "emirats"),
            imageAsset = "file:///android_asset/destinations/dubai.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites", "yacht"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "abu-dhabi",
            name = "Abou Dabi",
            country = "Émirats arabes unis",
            region = "Moyen-Orient",
            tagline = "Capitale culturelle, Grande Mosquée blanche et Louvre sur l'eau.",
            intro = "Capitale sereine et prestigieuse des Émirats, renommée pour la somptueuse Grande Mosquée Cheikh Zayed et le Louvre Abu Dhabi à la coupole céleste.",
            highlights = listOf(
                "Grande Mosquée Cheikh Zayed de marbre blanc immaculé",
                "Musée du Louvre Abu Dhabi conçu par Jean Nouvel sur l'eau",
                "Palais présidentiel Qasr Al Watan et ses jardins d'apparat",
                "Parc à thème Ferrari World et circuit de Yas Marina"
            ),
            tips = listOf(
                "Respectez le code vestimentaire strict pour visiter la Grande Mosquée."
            ),
            bestSeason = "Novembre à avril",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("abu-dhabi", "aboudabi"),
            imageAsset = "file:///android_asset/destinations/abu-dhabi.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "doha",
            name = "Doha",
            country = "Qatar",
            region = "Moyen-Orient",
            tagline = "Élégance qatarie, musée d'art islamique et souq Waqif vibrant.",
            intro = "Métropole d'art et d'histoire bordant le golfe Persique, combinant l'authenticité parfumée du Souq Waqif et des musées d'envergure planétaire.",
            highlights = listOf(
                "Musée d'Art Islamique (MIA) conçu par I. M. Pei",
                "Souq Waqif animé avec ses fauconniers, épices et cafés",
                "Promenade maritime de la Corniche et quartier The Pearl",
                "Village culturel Katara et ses galeries d'art"
            ),
            tips = listOf(
                "Flânez au Souq Waqif en début de soirée pour l'ambiance la plus chaleureuse."
            ),
            bestSeason = "Novembre à mars",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("qatar"),
            imageAsset = "file:///android_asset/destinations/doha.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "le-caire",
            name = "Le Caire",
            country = "Égypte",
            region = "Afrique",
            tagline = "La cité des mille minarets au pied des pyramides de Gizeh.",
            intro = "Capitale millénaire baignée par le Nil, abritant les célèbres Pyramides de Gizeh, le Sphinx et les chefs-d'œuvre du Grand Musée Égyptien.",
            highlights = listOf(
                "Pyramides de Gizeh (Khéops, Khéphren, Mykérinos) et le Sphinx",
                "Le Grand Musée Égyptien (GEM) et le musée de Tahrir",
                "Bazar historique animé de Khan el-Khalili",
                "Citadelle de Saladin et Mosquée d'albâtre de Mohammed Ali"
            ),
            tips = listOf(
                "Prenez un guide égyptologue agréé pour enrichir vos visites.",
                "Offrez-vous une balade en felouque traditionnelle sur le Nil au crépuscule."
            ),
            bestSeason = "Octobre à avril",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("cairo", "egypte"),
            imageAsset = "file:///android_asset/destinations/le-caire.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "charm-el-cheikh",
            name = "Charm el-Cheikh",
            country = "Égypte",
            region = "Afrique",
            tagline = "Paradis balnéaire de la mer Rouge et récifs sous-marins réputés.",
            intro = "Station balnéaire mondialement réputée pour ses fonds marins du parc national de Ras Mohammed, ses complexes hôteliers tout compris et le mont Sinaï.",
            highlights = listOf(
                "Parc national marin de Ras Mohammed et récifs de corail",
                "Île de Tiran réputée pour ses lagons turquoise",
                "Excursion nocturne au mont Sinaï et monastère Sainte-Catherine",
                "Plages calmes de Naama Bay et marchés bédouins"
            ),
            tips = listOf(
                "Masque et tuba indispensables pour explorer les récifs dès la rive."
            ),
            bestSeason = "Octobre à mai pour éviter les très fortes chaleurs d'été",
            tags = listOf("afrique", "plage", "nature"),
            aliases = listOf("sharm-el-sheikh", "sharm"),
            imageAsset = "file:///android_asset/destinations/charm-el-cheikh.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "hurghada",
            name = "Hurghada",
            country = "Égypte",
            region = "Afrique",
            tagline = "Eaux cristallines, îles de rêve et farniente en mer Rouge.",
            intro = "Station réputée pour ses îles paradisiaques comme Giftun, ses excursions en quad dans le désert et ses hôtels familiaux au bord de l'eau.",
            highlights = listOf(
                "Excursion en bateau vers l'île corallienne de Giftun",
                "Dauphins sauvages à Dolphin House",
                "Safari dans les montagnes du désert arabique au coucher du soleil",
                "Marina animée avec boutiques et restaurants face aux yachts"
            ),
            tips = listOf(
                "Idéal pour des vacances en famille avec clubs enfants et parcs aquatiques."
            ),
            bestSeason = "Octobre à avril",
            tags = listOf("afrique", "plage"),
            aliases = listOf("al-ghardaqa"),
            imageAsset = "file:///android_asset/destinations/hurghada.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "marrakech",
            name = "Marrakech",
            country = "Maroc",
            region = "Afrique",
            tagline = "La ville ocre, ses palais somptueux et l'effervescence de ses souks.",
            intro = "Cité impériale au pied de l'Atlas, Marrakech envoûte par la place Jemaa el-Fna, les jardins Majorelle, ses riads secrets et son artisanat d'exception.",
            highlights = listOf(
                "La place Jemaa el-Fna et le minaret de la Koutoubia",
                "Le Jardin Majorelle et le musée Yves Saint Laurent",
                "Le Palais Bahia et la Medersa Ben Youssef",
                "Les souks colorés d'artisans dans la médina historique"
            ),
            tips = listOf(
                "Prenez un thé à la menthe en terrasse au coucher du soleil.",
                "Séjournez au moins une nuit dans un riad traditionnel au cœur de la médina."
            ),
            bestSeason = "Mars à mai et septembre à novembre",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("morocco", "maroc"),
            imageAsset = "file:///android_asset/destinations/marrakech.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "location-voiture"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "casablanca",
            name = "Casablanca",
            country = "Maroc",
            region = "Afrique",
            tagline = "Capitale économique côtière et majestueuse mosquée Hassan II.",
            intro = "Pôle économique du Royaume sur l'Atlantique, célèbre pour la gigantesque Mosquée Hassan II bâtie sur l'eau et son architecture Art déco.",
            highlights = listOf(
                "Mosquée Hassan II et son minaret de 210 mètres surplombant l'océan",
                "Promenade maritime de la Corniche d'Aïn Diab",
                "Quartier des Habous et palais du Méchouar",
                "Façades Art déco du centre-ville historique"
            ),
            tips = listOf(
                "Visitez la Mosquée Hassan II avec la visite guidée intérieure officielle."
            ),
            bestSeason = "Avril à octobre",
            tags = listOf("afrique", "ville", "culture"),
            aliases = listOf("casa", "dar-al-baida"),
            imageAsset = "file:///android_asset/destinations/casablanca.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "tanger",
            name = "Tanger",
            country = "Maroc",
            region = "Afrique",
            tagline = "La porte du détroit de Gibraltar, entre Atlantique et Méditerranée.",
            intro = "Ville blanche mythique où se rencontrent l'océan Atlantique et la mer Méditerranée, inspiratrice d'artistes et écrivains du monde entier.",
            highlights = listOf(
                "La Kasbah historique et le musée des cultures méditerranéennes",
                "Grottes d'Hercule et cap Spartel où se rencontrent les mers",
                "Grand Socco et terrasses légendaires du Café Hafa",
                "Nouvelle marina moderne et corniche maritime"
            ),
            tips = listOf(
                "Goûtez au thé à la menthe au Café Hafa en contemplant les côtes espagnoles."
            ),
            bestSeason = "Mai à octobre",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("tangier", "tanja"),
            imageAsset = "file:///android_asset/destinations/tanger.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "chefchaouen",
            name = "Chefchaouen",
            country = "Maroc",
            region = "Afrique",
            tagline = "La perle bleue nichée dans les montagnes du Rif.",
            intro = "Cité féerique aux ruelles peintes de nuances de bleu indigo et ciel, offrant une atmosphère paisible et des panoramas montagnards enchanteurs.",
            highlights = listOf(
                "Ruelles emblématiques peintes en bleu indigo de la médina",
                "Place animée Outa el-Hammam et la forteresse de la Kasbah",
                "Cascade de Ras El Maa et lavoirs traditionnels",
                "Randonnées panoramiques vers la mosquée espagnole"
            ),
            tips = listOf(
                "Montez à la mosquée espagnole au coucher du soleil pour une vue magique."
            ),
            bestSeason = "Avril à juin et septembre à octobre",
            tags = listOf("afrique", "nature", "culture"),
            aliases = listOf("chaouen", "blue-city"),
            imageAsset = "file:///android_asset/destinations/chefchaouen.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "agadir",
            name = "Agadir",
            country = "Maroc",
            region = "Afrique",
            tagline = "Plage dorée de l'Atlantique, 300 jours de soleil et surf.",
            intro = "Première station balnéaire du Maroc avec sa baie de sable blond de 10 km, sa promenade maritime animée et la proximité de Taghazout.",
            highlights = listOf(
                "Immense plage de sable fin et front de mer aménagé",
                "Ruines de la Kasbah d'Agadir Oufella dominant la baie",
                "Souk El Had, l'un des plus grands marchés d'Afrique",
                "Spots de surf et criques préservées de Taghazout"
            ),
            tips = listOf(
                "Faites une excursion d'une journée dans la vallée du Paradis."
            ),
            bestSeason = "Toute l'année grâce à son ensoleillement exceptionnel",
            tags = listOf("afrique", "plage"),
            aliases = listOf("taghazout"),
            imageAsset = "file:///android_asset/destinations/agadir.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "paris",
            name = "Paris",
            country = "France",
            region = "Europe",
            tagline = "La Ville Lumière, élégance, art et monuments emblématiques.",
            intro = "Capitale mondiale du romantisme et de la culture, Paris émerveille par la tour Eiffel, le musée du Louvre, les Champs-Élysées et ses quais de Seine.",
            highlights = listOf(
                "La Tour Eiffel et croisière en bateau-mouche sur la Seine",
                "Musée du Louvre et ses chefs-d'œuvre universels",
                "Cathédrale Notre-Dame et quartier historique du Marais",
                "Champs-Élysées et Arc de Triomphe"
            ),
            tips = listOf(
                "Réservez vos billets pour les musées en ligne pour éviter l'attente.",
                "Empruntez le métro parisien pour vous déplacer vite et simplement."
            ),
            bestSeason = "Avril à octobre",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("france"),
            imageAsset = "file:///android_asset/destinations/paris.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "rome",
            name = "Rome",
            country = "Italie",
            region = "Europe",
            tagline = "La Ville Éternelle, musée à ciel ouvert de l'Antiquité.",
            intro = "Capitale historique aux trésors inestimables : le Colisée, la fontaine de Trevi, le Panthéon et la gastronomie italienne la plus authentique.",
            highlights = listOf(
                "Le Colisée et le Forum romain antique",
                "La Fontaine de Trevi et les marches de la Piazza di Spagna",
                "Le Panthéon et la grandiose Piazza Navona",
                "La Cité du Vatican et la basilique Saint-Pierre"
            ),
            tips = listOf(
                "Explorez le centre historique à pied pour tomber sur de superbes fontaines."
            ),
            bestSeason = "Avril à juin et septembre à novembre",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("roma", "italie"),
            imageAsset = "file:///android_asset/destinations/rome.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "barcelone",
            name = "Barcelone",
            country = "Espagne",
            region = "Europe",
            tagline = "Art nouveau de Gaudí, plages méditerranéennes et ruelles gothiques.",
            intro = "Capitale catalane vibrante où se mêlent la Sagrada Família, le parc Güell, les plages urbaines de Barceloneta et la gastronomie des tapas.",
            highlights = listOf(
                "La basilique majestueuse de la Sagrada Família de Gaudí",
                "Le Parc Güell et ses mosaïques multicolores",
                "La célèbre avenue piétonne de La Rambla et marché de La Boqueria",
                "Quartier gothique (Barri Gòtic) et plages de sable"
            ),
            tips = listOf(
                "Réservez impérativement la Sagrada Família plusieurs semaines avant."
            ),
            bestSeason = "Mai à octobre",
            tags = listOf("europe", "ville", "plage", "culture"),
            aliases = listOf("barcelona", "espagne"),
            imageAsset = "file:///android_asset/destinations/barcelone.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "londres",
            name = "Londres",
            country = "Royaume-Uni",
            region = "Europe",
            tagline = "L'énergie cosmopolite, palais royaux et musées de classe mondiale.",
            intro = "Capitale britannique historique offrant Big Ben, le Tower Bridge, Buckingham Palace, les comédies musicales du West End et de splendides parcs.",
            highlights = listOf(
                "Big Ben, le Parlement et l'abbaye de Westminster",
                "Tower Bridge et la forteresse médiévale de la Tour de Londres",
                "British Museum et National Gallery aux entrées gratuites",
                "Relève de la garde devant Buckingham Palace"
            ),
            tips = listOf(
                "Utilisez une carte bancaire sans contact pour payer directement le métro."
            ),
            bestSeason = "Mai à septembre",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("london", "angleterre"),
            imageAsset = "file:///android_asset/destinations/londres.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "amman",
            name = "Amman",
            country = "Jordanie",
            region = "Moyen-Orient",
            tagline = "La capitale aux sept collines, théâtre romain et hospitalité bédouine.",
            intro = "Porte d'entrée vers la Jordanie, Amman réunit la Citadelle juchée sur les hauteurs, le théâtre romain et une scène culinaire riche en saveurs.",
            highlights = listOf(
                "La Citadelle d'Amman avec le temple d'Hercule et vue panoramique",
                "Le Théâtre romain magnifiquement préservé au centre-ville",
                "Quartier piéton animé de Rainbow Street avec galeries et cafés",
                "Excursion vers la mer Morte et ses eaux salées flottantes"
            ),
            tips = listOf(
                "Achetez le Jordan Pass pour inclure le visa et l'entrée aux sites."
            ),
            bestSeason = "Mars à mai et septembre à novembre",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("jordanie"),
            imageAsset = "file:///android_asset/destinations/amman.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "petra",
            name = "Pétra",
            country = "Jordanie",
            region = "Moyen-Orient",
            tagline = "La cité vermeille taillée dans la roche nabatéenne.",
            intro = "Merveille du monde nichée au bout du défilé étroit du Siq. La façade grandiose du Trésor (Al-Khazneh) et le Monastère gravé dans la montagne sont inoubliables.",
            highlights = listOf(
                "Le défilé rocheux du Siq menant à Al-Khazneh (Le Trésor)",
                "L'ascension spectaculaire vers le Monastère (Ad-Deir)",
                "Les Tombeaux royaux taillés dans la roche vermeille",
                "Spectacle de Pétra by Night à la lueur des bougies"
            ),
            tips = listOf(
                "Portez de bonnes chaussures de marche adaptées aux sentiers pierreux."
            ),
            bestSeason = "Mars à mai et septembre à novembre",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("jordan", "al-khazneh"),
            imageAsset = "file:///android_asset/destinations/petra.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "kuala-lumpur",
            name = "Kuala Lumpur",
            country = "Malaisie",
            region = "Asie",
            tagline = "Tours jumelles Petronas, grottes de Batu et multiculturalisme chaleureux.",
            intro = "Capitale ultra-dynamique d'Asie du Sud-Est mariant gratte-ciels scintillants, sanctuaires des grottes de Batu et gastronomie halal d'une richesse exceptionnelle.",
            highlights = listOf(
                "Tours jumelles Petronas et passerelle aérienne Skybridge",
                "Sanctuaire spectaculaire des grottes de Batu et grand escalier coloré",
                "Quartier historique de Merdeka et marché central",
                "Quartier commerçant de Bukit Bintang et cuisine de rue à Jalan Alor"
            ),
            tips = listOf(
                "La Malaisie est l'une des destinations halal-friendly les plus pratiques au monde."
            ),
            bestSeason = "Toute l'année ; climat tropical chaud et régulier",
            tags = listOf("asie", "ville", "culture"),
            aliases = listOf("kl", "malaisie"),
            imageAsset = "file:///android_asset/destinations/kuala-lumpur.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "bali",
            name = "Bali",
            country = "Indonésie",
            region = "Asie",
            tagline = "L'île des dieux, rizières en terrasses et plages paradisiaques.",
            intro = "Joyau indonésien réunissant rizières en terrasses d'Ubud, temples côtiers au coucher du soleil, cascades secrètes et plages de surf réputées.",
            highlights = listOf(
                "Rizières en terrasses de Tegallalang et cascades d'Ubud",
                "Temple marin de Tanah Lot perché sur son îlot rocheux",
                "Falaise et temple d'Uluwatu dominant l'océan Indien",
                "Plages de Nusa Dua et de Seminyak pour la baignade"
            ),
            tips = listOf(
                "Prévoyez un chauffeur privé local pour visiter l'île en toute sérénité."
            ),
            bestSeason = "Mai à octobre pendant la saison sèche",
            tags = listOf("asie", "nature", "plage"),
            aliases = listOf("indonesie", "ubud"),
            imageAsset = "file:///android_asset/destinations/bali.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "maldives",
            name = "Maldives",
            country = "Maldives",
            region = "Océan Indien",
            tagline = "Lagons turquoise, villas sur pilotis et plages de sable blanc.",
            intro = "Archipel paradisiaque dans l'océan Indien, destination de rêve pour les lunes de miel, le repos absolu et la plongée au milieu des raies mantas.",
            highlights = listOf(
                "Villas de luxe sur pilotis au-dessus des eaux turquoise",
                "Snorkeling et plongée avec raies mantas et tortues",
                "Dîner romantique aux chandelles sur une plage déserte",
                "Spas sur pilotis et détente totale"
            ),
            tips = listOf(
                "Organisez les transferts en hydravion ou speed boat dès la réservation.",
                "Privilégiez les formules tout compris pour un séjour en toute quiétude."
            ),
            bestSeason = "Décembre à avril",
            tags = listOf("asie", "plage", "nature"),
            aliases = listOf("maledives", "atolls"),
            imageAsset = "file:///android_asset/destinations/maldives.jpg",
            services = listOf("vols", "hotels", "transferts", "yacht"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "zanzibar",
            name = "Zanzibar",
            country = "Tanzanie",
            region = "Afrique",
            tagline = "L'île aux épices, ruelles de Stone Town et plages de corail.",
            intro = "Archipel enchanteur de l'océan Indien conjuguant l'histoire swahilie et arabe de Stone Town (UNESCO) et plages de sable blanc baignées d'eaux émeraude.",
            highlights = listOf(
                "Cité historique de Stone Town et ses portes de bois sculptées (UNESCO)",
                "Plages paradisiaques de Nungwi et Kendwa sans marée gênante",
                "Visite des plantations d'épices (clous de girofle, vanille, cannelle)",
                "Banc de sable de Nakupenda et nage avec les dauphins"
            ),
            tips = listOf(
                "Goûtez aux spécialités de poissons frais au marché nocturne de Forodhani."
            ),
            bestSeason = "Juin à octobre et décembre à février",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("tanzanie", "stone-town"),
            imageAsset = "file:///android_asset/destinations/zanzibar.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "djerba",
            name = "Djerba",
            country = "Tunisie",
            region = "Afrique",
            tagline = "L'île des Lotophages, palmiers séculaires et douceurs marines.",
            intro = "Île tunisienne réputée pour sa douceur de vivre, ses menzels blancs, le street-art de Djerbahood et ses longues plages de sable fin.",
            highlights = listOf(
                "Fresques monumentales de street-art dans le village de Djerbahood",
                "Marchés traditionnels et poteries artisanales de Houmt Souk",
                "Plages bordées de palmiers et activités nautiques",
                "Synagogue historique de la Ghriba et mosquées fortifiées"
            ),
            tips = listOf(
                "Louez un vélo ou une voiture pour explorer les pistes côtières préservées."
            ),
            bestSeason = "Avril à octobre",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("tunisie"),
            imageAsset = "file:///android_asset/destinations/djerba.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "sarajevo",
            name = "Sarajevo",
            country = "Bosnie-Herzégovine",
            region = "Europe",
            tagline = "La Jérusalem d'Europe, histoire ottomane et montagnes olympiques.",
            intro = "Capitale chaleureuse nichée au creux des montagnes, où se côtoient mosquées ottomanes de Baščaršija, églises et cathédrales au fil de la Miljacka.",
            highlights = listOf(
                "Vieux quartier ottoman de Baščaršija et la fontaine Sebilj",
                "Mosquée historique Gazi Husrev-bey du XVIe siècle",
                "Pont Latin historique et musée du Tunnel de l'Espoir",
                "Téléphérique de la montagne Trebević et piste olympique de bobsleigh"
            ),
            tips = listOf(
                "Savourez les ćevapi traditionnels accompagnés d'un café bosniaque parfumé."
            ),
            bestSeason = "Mai à octobre",
            tags = listOf("europe", "culture", "nature"),
            aliases = listOf("bosnie"),
            imageAsset = "file:///android_asset/destinations/sarajevo.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.8f
        )
    )
}
