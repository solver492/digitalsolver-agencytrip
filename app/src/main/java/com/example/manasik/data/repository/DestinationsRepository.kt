package com.example.manasik.data.repository

import com.example.manasik.data.model.Destination

object DestinationsRepository {

    val allDestinations: List<Destination> = listOf(
        Destination(
            slug = "la-mecque",
            name = "La Mecque",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "Le cœur spirituel de l'Islam, destination sacrée par excellence.",
            intro = "La Mecque est la ville la plus sainte de l'Islam, lieu de naissance du Prophète Muhammad et point de convergence de millions de pèlerins chaque année. La Grande Mosquée al-Masjid al-Haram abrite la Kaaba, vers laquelle tous les musulmans du monde orientent leurs prières. Accomplir l'Omra ou le Hajj à La Mecque est une expérience spirituelle transformatrice, unique au monde.",
            highlights = listOf(
                "Circumambulation autour de la Kaaba (Tawaf)",
                "La course rituelle entre Safa et Marwa (Sa'i)",
                "La fontaine sacrée de Zamzam",
                "La montagne de la Lumière (Jabal al-Nour) et la grotte de Hira",
                "Le mont Arafat, lieu du sermon du Prophète",
                "La Mosquée de la Tente (Masjid al-Khayf) à Mina"
            ),
            tips = listOf(
                "L'entrée à La Mecque est réservée aux musulmans munis d'un permis valide (Nusuk).",
                "Réservez vos hébergements bien à l'avance, surtout pour le Ramadan et le Hajj.",
                "Portez des vêtements amples et couvrants, adaptés aux rites du pèlerinage.",
                "Hydratez-vous régulièrement, la chaleur peut être intense."
            ),
            bestSeason = "Omra possible toute l'année ; Hajj en saison fixée selon le calendrier hégirien",
            tags = listOf("omra-hajj", "culture", "spirituel"),
            aliases = listOf("mecca", "makkah", "meca", "مكة"),
            imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "bagages", "esim"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "medine",
            name = "Médine",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "La ville lumineuse, sanctuaire de paix et de recueillement.",
            intro = "Médine est la deuxième ville sainte de l'Islam, accueillant la Mosquée du Prophète (al-Masjid an-Nabawi) où repose Muhammad. Ville de sérénité et de dévotion, elle attire des pèlerins venus du monde entier pour prier auprès du tombeau du Prophète. Son atmosphère empreinte de spiritualité en fait une étape incontournable.",
            highlights = listOf(
                "La Mosquée du Prophète (al-Masjid an-Nabawi) et le dôme vert",
                "La Mosquée Quba, la première mosquée de l'histoire de l'Islam",
                "Le cimetière al-Baqi, où reposent de nombreux compagnons",
                "La Mosquée des deux Qiblas (Masjid al-Qiblatayn)",
                "La colline d'Uhud et le site de la bataille historique"
            ),
            tips = listOf(
                "Respectez les horaires de prière et les créneaux Rawdah via l'application Nusuk.",
                "Planifiez vos visites tôt le matin pour éviter la forte affluence.",
                "Habillez-vous modestement dans toute la ville sainte."
            ),
            bestSeason = "Printemps et automne pour des températures plus douces",
            tags = listOf("omra-hajj", "culture", "spirituel"),
            aliases = listOf("medina", "madinah", "المدينة"),
            imageAsset = "file:///android_asset/destinations/medine.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "bagages", "esim"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "djeddah",
            name = "Djeddah",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "La perle de la mer Rouge, entre histoire et modernité.",
            intro = "Djeddah est la métropole côtière cosmopolite d'Arabie saoudite, porte d'entrée maritime et aérienne vers les Lieux saints. Son quartier historique Al-Balad, classé à l'UNESCO, séduit par ses façades en corail et moucharabiehs raffinés.",
            highlights = listOf(
                "Al-Balad, quartier historique aux magnifiques maisons traditionnelles",
                "La fontaine du Roi Fahd sur la corniche",
                "La Corniche maritime animée et ses restaurants de poissons frais",
                "Plongée et snorkeling d'exception dans la mer Rouge"
            ),
            tips = listOf(
                "Visitez Al-Balad en fin d'après-midi et en soirée sous les lumières.",
                "Profitez du train express Haramain High Speed Rail pour rejoindre La Mecque en 45 minutes."
            ),
            bestSeason = "Novembre à mars pour un climat doux en bord de mer",
            tags = listOf("ville", "culture", "plage"),
            aliases = listOf("jeddah", "jidda"),
            imageAsset = "file:///android_asset/destinations/djeddah.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "alula",
            name = "AlUla",
            country = "Arabie saoudite",
            region = "Moyen-Orient",
            tagline = "Un musée à ciel ouvert au cœur du désert millénaire.",
            intro = "AlUla est l'un des trésors archéologiques les plus spectaculaires de la péninsule arabique. Cité nabatéenne d'Hégra taillée dans le grès rouge, oasis luxuriante et rochers monumentaux créent un décor grandiose.",
            highlights = listOf(
                "Hégra (Madâin Sâlih), site nabatéen classé au patrimoine mondial UNESCO",
                "Elephant Rock (Jabal AlFil), formation géologique emblématique",
                "La vieille ville médiévale d'AlUla et l'oasis historique",
                "Maraya Concert Hall, le plus grand bâtiment en miroirs du monde"
            ),
            tips = listOf(
                "Réservez les visites d'Hégra à l'avance avec guide officiel.",
                "Les nuits peuvent être fraîches en hiver dans le désert."
            ),
            bestSeason = "Octobre à avril",
            tags = listOf("culture", "nature", "desert"),
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
            tagline = "La capitale dynamique au cœur de la péninsule arabique.",
            intro = "Riyad conjugue gratte-ciels futuristes et patrimoine séculaire du berceau du Royaume avec le quartier historique de Diriyah.",
            highlights = listOf(
                "At-Turaif à Diriyah, berceau du premier État saoudien (UNESCO)",
                "La forteresse d'Al Masmak en briques crues",
                "Kingdom Centre Tower et le Sky Bridge panoramique",
                "Souq Al Zal, le plus ancien marché traditionnel"
            ),
            tips = listOf(
                "Découvrez Diriyah de nuit lorsque les ruelles sont illuminées."
            ),
            bestSeason = "Novembre à mars",
            tags = listOf("ville", "culture"),
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
            tagline = "Le carrefour des civilisations entre Orient et Occident.",
            intro = "À cheval sur le Bosphore, Istanbul émerveille par la majesté de Sainte-Sophie, la Mosquée Bleue, le Palais de Topkapi et l'effervescence de ses bazars légendaires.",
            highlights = listOf(
                "La Basilique Sainte-Sophie (Ayasofya)",
                "La Mosquée Bleue (Sultanahmet)",
                "Le Grand Bazar et le Bazar aux Épices",
                "Croisière sur le détroit du Bosphore au coucher du soleil",
                "Le Palais de Topkapi et ses trésors impériaux"
            ),
            tips = listOf(
                "Procurez-vous une Istanbulkart pour emprunter ferries, trams et métros.",
                "Prévoyez des foulards et une tenue adaptée pour la visite des mosquées."
            ),
            bestSeason = "Avril à juin et septembre à novembre",
            tags = listOf("culture", "ville", "histoire"),
            aliases = listOf("constantinople", "turquie"),
            imageAsset = "file:///android_asset/destinations/istanbul.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "esim"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "cappadoce",
            name = "Cappadoce",
            country = "Turquie",
            region = "Europe / Asie",
            tagline = "Cheminées de fées et montgolfières dans un paysage lunaire.",
            intro = "Région féerique d'Anatolie centrale, la Cappadoce offre des paysages sculptés par l'érosion, des églises rupestres et des vols inoubliables en montgolfière à l'aube.",
            highlights = listOf(
                "Vol féerique en montgolfière au lever du soleil sur Göreme",
                "Musée en plein air de Göreme et peintures byzantines",
                "Villes souterraines de Derinkuyu et Kaymakli",
                "Vallée de l'Amour, Vallée des Pigeons et château d'Uçhisar"
            ),
            tips = listOf(
                "Réservez le vol en montgolfière dès votre premier matin pour parer aux annulations météo.",
                "Logez dans un hôtel troglodytique pour une expérience authentique."
            ),
            bestSeason = "Mai à octobre",
            tags = listOf("nature", "culture", "aventure"),
            aliases = listOf("cappadocia", "goreme"),
            imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "dubai",
            name = "Dubaï",
            country = "Émirats arabes unis",
            region = "Moyen-Orient",
            tagline = "La métropole futuriste entre désert doré et gratte-ciels scintillants.",
            intro = "Dubaï est l'épicentre du luxe, du shopping et de l'architecture audacieuse, offrant également des safaris dans le désert et des plages ensoleillées.",
            highlights = listOf(
                "Le Burj Khalifa et son observatoire au 148e étage",
                "Le Dubai Mall et le spectacle féerique des fontaines",
                "Safari dans les dunes du désert avec dîner bédouin",
                "L'île emblématique de Palm Jumeirah"
            ),
            tips = listOf(
                "Profitez du métro climatisé pour relier les attractions principales.",
                "Prévoyez des activités en intérieur pendant les heures les plus chaudes de l'été."
            ),
            bestSeason = "Novembre à avril",
            tags = listOf("ville", "plage", "luxe"),
            aliases = listOf("uae", "emirats"),
            imageAsset = "file:///android_asset/destinations/dubai.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites", "yacht"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "marrakech",
            name = "Marrakech",
            country = "Maroc",
            region = "Afrique du Nord",
            tagline = "La ville ocre, ses palais somptueux et l'effervescence de ses souks.",
            intro = "Cité impériale au pied de l'Atlas, Marrakech envoûte par la place Jemaa el-Fna, ses jardins de Majorelle, ses riads secrets et son artisanat d'exception.",
            highlights = listOf(
                "La place Jemaa el-Fna et la Koutoubia",
                "Le Jardin Majorelle et le musée Yves Saint Laurent",
                "Le Palais Bahia et la Medersa Ben Youssef",
                "Les souks colorés de la médina"
            ),
            tips = listOf(
                "Prenez le thé à la menthe sur les terrasses au coucher du soleil.",
                "Logez au moins une nuit dans un riad traditionnel au cœur de la médina."
            ),
            bestSeason = "Mars à mai et septembre à novembre",
            tags = listOf("culture", "ville", "histoire"),
            aliases = listOf("morocco", "maroc"),
            imageAsset = "file:///android_asset/destinations/marrakech.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "location-voiture"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "le-caire",
            name = "Le Caire",
            country = "Égypte",
            region = "Afrique du Nord",
            tagline = "La cité des mille minarets au pied des pyramides de Gizeh.",
            intro = "Capitale millénaire de l'Égypte, Le Caire est le gardien des pyramides de Gizeh, du Sphinx et des trésors légendaires de Toutânkhamon.",
            highlights = listOf(
                "Les pyramides de Khéops, Khéphren et Mykérinos avec le Sphinx",
                "Le Grand Musée Égyptien (GEM) et le musée de Tahrir",
                "Le souk animé de Khan el-Khalili",
                "La Citadelle de Saladin et la Mosquée Mohammed Ali"
            ),
            tips = listOf(
                "Privilégiez un guide égyptologue agréé pour enrichir vos visites.",
                "Faites une balade en felouque sur le Nil au coucher du soleil."
            ),
            bestSeason = "Octobre à avril",
            tags = listOf("culture", "histoire"),
            aliases = listOf("cairo", "egypte"),
            imageAsset = "file:///android_asset/destinations/le-caire.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "petra",
            name = "Pétra",
            country = "Jordanie",
            region = "Moyen-Orient",
            tagline = "La cité vermeille taillée dans la roche nabatéenne.",
            intro = "Merveille du monde, Pétra se découvre au bout du défilé étroit du Siq. La façade grandiose du Trésor (Al-Khazneh) et le Monastère taillé dans la montagne laissent un souvenir impérissable.",
            highlights = listOf(
                "Le défilé rocheux du Siq menant à Al-Khazneh (Le Trésor)",
                "L'ascension vers le Monastère (Ad-Deir)",
                "Les tombeaux royaux gravés dans la falaise",
                "Pétra by Night à la lueur des milliers de bougies"
            ),
            tips = listOf(
                "Achetez le Jordan Pass pour inclure le visa et l'entrée à Pétra.",
                "Consacrez au moins une journée entière à la visite à pied."
            ),
            bestSeason = "Mars à mai et septembre à novembre",
            tags = listOf("culture", "nature", "histoire"),
            aliases = listOf("jordan", "jordanie"),
            imageAsset = "file:///android_asset/destinations/petra.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "maldives",
            name = "Maldives",
            country = "Maldives",
            region = "Océan Indien",
            tagline = "Lagons turquoise, villas sur pilotis et plages de sable blanc.",
            intro = "Archipel de rêve dans l'océan Indien, les Maldives proposent un cadre paradisiaque idéal pour les lunes de miel, le repos absolu et l'exploration sous-marine.",
            highlights = listOf(
                "Villas sur pilotis au-dessus des eaux cristallines",
                "Snorkeling avec raies mantas et tortues marines",
                "Dîner romantique aux chandelles sur une plage déserte",
                "Spas flottants et soins bien-être"
            ),
            tips = listOf(
                "Organisez les transferts en hydravion ou speed boat dès la réservation.",
                "Pensez aux formules tout compris pour maîtriser votre budget."
            ),
            bestSeason = "Décembre à avril",
            tags = listOf("plage", "detente", "luxe"),
            aliases = listOf("maledives", "atolls"),
            imageAsset = "file:///android_asset/destinations/maldives.jpg",
            services = listOf("vols", "hotels", "transferts", "yacht"),
            featured = true,
            rating = 4.9f
        )
    )
}
