package com.example.manasik.data.repository.destinations

import com.example.manasik.data.model.Destination

object SpanishDestinations {
    val list: List<Destination> = listOf(
        Destination(
            slug = "la-mecque",
            name = "La Meca",
            country = "Arabia Saudita",
            region = "Oriente Medio",
            tagline = "El corazón espiritual del Islam y destino sagrado por excelencia.",
            intro = "La Meca es la ciudad más sagrada del Islam, cuna del Profeta Muhammad y hogar de la Gran Mezquita y la Kaaba hacia donde rezan más de dos mil millones de fieles. Realizar la Umrah o el Hajj es una experiencia espiritual única y transformadora.",
            highlights = listOf(
                "Circunvalación ritual alrededor de la Kaaba (Tawaf)",
                "Recorrido ritual entre Safa y Marwa (Sa'i)",
                "Beber del agua bendita del pozo de Zamzam",
                "El monte de la Luz (Jabal al-Nour) y la cueva de Hira",
                "La llanura sagrada de Arafat y la Mezquita de Nimra",
                "El valle de tiendas de campaña de Mina y Muzdalifah"
            ),
            tips = listOf(
                "La entrada a La Meca está reservada a musulmanes con permiso oficial de la app Nusuk.",
                "Reserve hoteles con antelación, en especial para el mes de Ramadán y Hajj.",
                "Lleve vestimenta amplia y cómoda apropiada para los ritos del peregrinaje."
            ),
            bestSeason = "Umrah disponible todo el año; Hajj según el calendario islámico",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("makkah", "mecca"),
            imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "medine",
            name = "Medina",
            country = "Arabia Saudita",
            region = "Oriente Medio",
            tagline = "La Ciudad Radiante, santuario de paz y recogimiento espiritual.",
            intro = "Medina acoge la Mezquita del Profeta (al-Masjid an-Nabawi) y la venerada Rawdah. Peregrinos de todo el mundo viajan a sentir su serenidad inigualable.",
            highlights = listOf(
                "La Mezquita del Profeta (al-Masjid an-Nabawi) y la Cúpula Verde",
                "La Mezquita de Quba, la primera erigida en la historia del Islam",
                "El cementerio histórico de Al-Baqi y los santos compañeros",
                "La Mezquita de las Dos Qiblas (Masjid al-Qiblatayn)",
                "La colina de Uhud y el monumento a los mártires"
            ),
            tips = listOf(
                "Reserve con tiempo su turno para visitar la noble Rawdah en la app Nusuk.",
                "Planifique las visitas a primera hora de la mañana para evitar aglomeraciones.",
                "Mantenga siempre el recogimiento y la vestimenta modesta en la ciudad santa."
            ),
            bestSeason = "Primavera y otoño para temperaturas agradables",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("madinah", "médine"),
            imageAsset = "file:///android_asset/destinations/medine.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "djeddah",
            name = "Yeda",
            country = "Arabia Saudita",
            region = "Oriente Medio",
            tagline = "La joya del Mar Rojo y puerta histórica hacia los Santos Lugares.",
            intro = "Metrópoli costera cosmopolita que combina el encanto de las fachadas de coral en el barrio Al-Balad (UNESCO) con el paseo marítimo, restaurantes de marisco y buceo de primer nivel.",
            highlights = listOf(
                "Barrio histórico Al-Balad con casas señoriales de coral (UNESCO)",
                "Fuente del Rey Fahd, la más alta del mundo frente a la costa",
                "Paseo marítimo Waterfront Corniche con arte y restaurantes",
                "Inmersiones de buceo y snorkel en arrecifes vírgenes del Mar Rojo"
            ),
            tips = listOf(
                "Visite Al-Balad por la tarde y noche para disfrutar de la iluminación y zocos.",
                "Utilice el tren de alta velocidad Haramain para llegar a La Meca en 45 minutos."
            ),
            bestSeason = "Noviembre a marzo para clima templado",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("jeddah", "djeddah"),
            imageAsset = "file:///android_asset/destinations/djeddah.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "taif",
            name = "Taif",
            country = "Arabia Saudita",
            region = "Oriente Medio",
            tagline = "La ciudad de las rosas sobre las verdes alturas de Hejaz.",
            intro = "Conocida por su clima fresco de montaña, sus campos de rosas perfumadas, huertos frutales y el teleférico de Al Hada que desciende por espectaculares cañones.",
            highlights = listOf(
                "Destilerías tradicionales de agua y aceite de rosas de Taif",
                "Teleférico panorámico de montaña en Al Hada con vistas sobrecogedoras",
                "Palacio histórico Shubra y mercado de artesanía local",
                "Huertos en terrazas de granadas, higos y albaricoques"
            ),
            tips = listOf(
                "Lleve una chaqueta ligera para las frescas noches de montaña.",
                "Viaje en primavera para disfrutar de la floración y cosecha de las rosas."
            ),
            bestSeason = "Mayo a octubre para escapar del calor de las llanuras",
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
            country = "Arabia Saudita",
            region = "Oriente Medio",
            tagline = "Un museo al aire libre en medio del desierto milenario.",
            intro = "Fascinante tesoro arqueológico con las tumbas nabateas de Hegra esculpidas en arenisca roja, palmerales históricos y la emblemática sala de conciertos Maraya.",
            highlights = listOf(
                "Yacimiento arqueológico de Hegra (Madâin Sâlih), Patrimonio UNESCO",
                "La famosa formación rocosa Roca del Elefante (Jabal AlFil)",
                "El casco histórico de AlUla y el oasis de palmeras datileras",
                "Sala de conciertos Maraya, el edificio de espejos más grande del mundo"
            ),
            tips = listOf(
                "Reserve las visitas guiadas a Hegra con antelación con guías oficiales.",
                "Las noches en el desierto son frescas en invierno; lleve abrigo para el atardecer."
            ),
            bestSeason = "Octubre a abril",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("alula", "hegra"),
            imageAsset = "file:///android_asset/destinations/alula.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "riyad",
            name = "Riad",
            country = "Arabia Saudita",
            region = "Oriente Medio",
            tagline = "Capital moderna y vanguardista, cuna del Reino histórico.",
            intro = "Riad combina rascacielos futuristas con el patrimonio histórico de adobe en Diriyah (UNESCO), cuna del primer Estado saudí.",
            highlights = listOf(
                "Distrito histórico At-Turaif en Diriyah, cuna del Estado saudí (UNESCO)",
                "Fortaleza histórica Al Masmak de adobe en el centro de la ciudad",
                "Torre Kingdom Centre con su espectacular pasarela colgante Sky Bridge",
                "Zoco Al Zal, el mercado tradicional más antiguo de Riad"
            ),
            tips = listOf(
                "Descubra Diriyah al atardecer para disfrutar de los paseos iluminados y restaurantes junto al valle."
            ),
            bestSeason = "Noviembre a marzo",
            tags = listOf("moyen-orient", "ville"),
            aliases = listOf("riyadh", "riad"),
            imageAsset = "file:///android_asset/destinations/riyad.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "istanbul",
            name = "Estambul",
            country = "Turquía",
            region = "Europa / Asia",
            tagline = "Cruce de civilizaciones entre Oriente y Occidente en el Bósforo.",
            intro = "A caballo entre dos continentes, fascina con Santa Sofía, la Mezquita Azul, el Palacio Topkapi y bazares milenarios llenos de vida.",
            highlights = listOf(
                "La imponente Mezquita y antigua basílica de Santa Sofía (Ayasofya)",
                "La Mezquita Azul (Mezquita del Sultán Ahmed) y sus seis minaretes",
                "El Gran Bazar y el histórico Bazar de las Especias egipcio",
                "Crucero panorámico por el estrecho del Bósforo al atardecer",
                "Palacio de Topkapi y sus patios con reliquias imperiales"
            ),
            tips = listOf(
                "Compre la tarjeta Istanbulkart para usar ferris, tranvías y metro cómodamente.",
                "Lleve pañuelo y vestimenta respetuosa para acceder a las mezquitas históricas."
            ),
            bestSeason = "Abril a junio y septiembre a noviembre",
            tags = listOf("europe", "asie", "ville", "culture"),
            aliases = listOf("constantinopla", "turquia"),
            imageAsset = "file:///android_asset/destinations/istanbul.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "esim"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "antalya",
            name = "Antalya",
            country = "Turquía",
            region = "Europa / Asia",
            tagline = "Riviera turca, acantilados turquesas y ruinas grecorromanas.",
            intro = "Joya del Mediterráneo con el pintoresco casco antiguo de Kaleiçi, las cascadas de Düden y playas de aguas transparentes bañadas por el sol.",
            highlights = listOf(
                "Casco antiguo fortificado de Kaleiçi y la histórica Puerta de Adriano",
                "Cascadas de Düden cayendo de manera espectacular al mar",
                "Playas cristalinas de Konyaaltı y Lara",
                "Teatro grecorromano de Aspendos excelentemente conservado"
            ),
            tips = listOf(
                "Realice un paseo en barco al atardecer frente a los acantilados."
            ),
            bestSeason = "Abril a octubre",
            tags = listOf("europe", "asie", "plage", "nature"),
            aliases = listOf("riviera-turca"),
            imageAsset = "file:///android_asset/destinations/antalya.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "cappadoce",
            name = "Capadocia",
            country = "Turquía",
            region = "Europa / Asia",
            tagline = "Chimeneas de hadas y paseos en globo en un paisaje de ensueño.",
            intro = "Región mágica de Anatolia con valles esculpidos por la erosión, hoteles cueva y vuelos en globo aerostático al amanecer.",
            highlights = listOf(
                "Inolvidable vuelo en globo aerostático al amanecer sobre el valle de Göreme",
                "Museo al aire libre de Göreme e iglesias bizantinas rupestres",
                "Ciudades subterráneas profundas de Derinkuyu y Kaymakli",
                "Valle del Amor, Valle de las Palomas y castillo rocoso de Uçhisar"
            ),
            tips = listOf(
                "Reserve el paseo en globo para su primera mañana para poder reprogramar si hay viento.",
                "Alójese en un hotel cueva tradicional para vivir una experiencia inolvidable."
            ),
            bestSeason = "Mayo a octubre",
            tags = listOf("europe", "asie", "nature", "culture"),
            aliases = listOf("cappadocia", "goreme"),
            imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "trabzon",
            name = "Trebisonda",
            country = "Turquía",
            region = "Europa / Asia",
            tagline = "Bosques esmeralda, niebla de montaña y monasterios colgados.",
            intro = "Puerta del Mar Negro célebre por el increíble Monasterio de Sumela incrustado en el acantilado y el lago alpino Uzungöl rodeado de pinos.",
            highlights = listOf(
                "Monasterio de Sumela esculpido en lo alto del precipicio montañoso",
                "Lago alpino Uzungöl y sus cabañas tradicionales de madera",
                "Mesetas verdes de Ayder con aguas termales y cascadas",
                "Pabellón Atatürk con vistas panorámicas sobre el Mar Negro"
            ),
            tips = listOf(
                "Pruebe el famoso plato local kuymak de queso fundido tradicional."
            ),
            bestSeason = "Junio a septiembre",
            tags = listOf("europe", "asie", "nature"),
            aliases = listOf("trabzon", "uzungol"),
            imageAsset = "file:///android_asset/destinations/trabzon.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "dubai",
            name = "Dubái",
            country = "Emiratos Árabes Unidos",
            region = "Oriente Medio",
            tagline = "Metrópoli futurista entre dunas doradas y rascacielos infinitos.",
            intro = "Hogar del Burj Khalifa, islas artificiales Palm Jumeirah, safaris en el desierto y centros comerciales de lujo sin igual.",
            highlights = listOf(
                "Mirador panorámico del rascacielos Burj Khalifa en el piso 148",
                "El Dubai Mall y el espectáculo acuático de la fuente danzante",
                "Safari en 4x4 por las dunas rojas con cena en campamento beduino",
                "La icónica isla artificial Palm Jumeirah y sus playas privadas"
            ),
            tips = listOf(
                "Use el metro climatizado de Dubái para moverse fácilmente entre las zonas principales.",
                "Reserve los centros comerciales y atracciones interiores para las horas centrales del día."
            ),
            bestSeason = "Noviembre a abril",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("emiratos", "uae"),
            imageAsset = "file:///android_asset/destinations/dubai.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites", "yacht"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "abu-dhabi",
            name = "Abu Dabi",
            country = "Emiratos Árabes Unidos",
            region = "Oriente Medio",
            tagline = "Capital cultural, mezquita de mármol blanco y Louvre sobre el mar.",
            intro = "Serena y prestigiosa capital emiratí, célebre por la Gran Mezquita Sheikh Zayed y la cúpula flotante de luz del Louvre Abu Dhabi.",
            highlights = listOf(
                "Gran Mezquita Sheikh Zayed de mármol blanco macedonio",
                "Museo Louvre Abu Dhabi con su innovadora arquitectura marina",
                "Palacio presidencial Qasr Al Watan y salones de estado",
                "Parque temático Ferrari World y circuito de Yas Marina"
            ),
            tips = listOf(
                "Cumpla estrictamente el código de vestimenta para visitar la Gran Mezquita."
            ),
            bestSeason = "Noviembre a abril",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("abudhabi", "abu-dhabi"),
            imageAsset = "file:///android_asset/destinations/abu-dhabi.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "doha",
            name = "Doha",
            country = "Catar",
            region = "Oriente Medio",
            tagline = "Elegancia catarí, museo de arte islámico y zoco Waqif tradicional.",
            intro = "Metrópoli costera del Golfo que fusiona la autenticidad especiada del Souq Waqif con vanguardistas museos y arquitectura futurista.",
            highlights = listOf(
                "Museo de Arte Islámico (MIA) diseñado por I. M. Pei",
                "Zoco Waqif tradicional con halcones, aromas, especias y terrazas",
                "Paseo marítimo de la Corniche y la isla residencial The Pearl",
                "Villa cultural Katara con galerías de arte y anfiteatro marítimo"
            ),
            tips = listOf(
                "Pasee por Souq Waqif a primera hora de la noche para sentir la mejor atmósfera."
            ),
            bestSeason = "Noviembre a marzo",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("qatar", "catar"),
            imageAsset = "file:///android_asset/destinations/doha.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "le-caire",
            name = "El Cairo",
            country = "Egipto",
            region = "África",
            tagline = "La ciudad de los mil minaretes y las milenarias Pirámides de Giza.",
            intro = "Capital milenaria junto al Nilo, custodia de las Pirámides de Giza, la Gran Esfinge, el Gran Museo Egipcio y el zoco Jan el-Jalili.",
            highlights = listOf(
                "Las tres Pirámides de Giza (Keops, Kefrén, Micerino) y la Gran Esfinge",
                "El Gran Museo Egipcio (GEM) y los tesoros de la historia faraónica",
                "El histórico y concurrido zoco de Jan el-Jalili",
                "La Ciudadela de Saladino y la Mezquita de Muhammad Alí"
            ),
            tips = listOf(
                "Contrate un guía egiptólogo acreditado para disfrutar plenamente de la historia.",
                "Disfrute de un relajante paseo en falúa tradicional por el Nilo al atardecer."
            ),
            bestSeason = "Octubre a abril",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("egipto", "cairo"),
            imageAsset = "file:///android_asset/destinations/le-caire.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "charm-el-cheikh",
            name = "Sharm el-Sheij",
            country = "Egipto",
            region = "África",
            tagline = "Paraíso playero del Mar Rojo y arrecifes de coral legendarios.",
            intro = "Destino costero de fama mundial por los fondos marinos del Parque Nacional Ras Mohammed, resorts todo incluido y excursiones al Monte Sinaí.",
            highlights = listOf(
                "Parque Nacional Marino Ras Mohammed con arrecifes coralinos vírgenes",
                "Paseos en barco hacia la isla de Tirán y lagunas turquesas",
                "Subida nocturna al Monte Sinaí y visita al Monasterio de Santa Catalina",
                "Playas tranquilas de Naama Bay y cenas en campamentos beduinos"
            ),
            tips = listOf(
                "Lleve equipo de snorkel para contemplar peces de colores directamente desde la playa."
            ),
            bestSeason = "Octubre a mayo para eludir el intenso calor de verano",
            tags = listOf("afrique", "plage", "nature"),
            aliases = listOf("sharm", "sharm-el-sheikh"),
            imageAsset = "file:///android_asset/destinations/charm-el-cheikh.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "hurghada",
            name = "Hurghada",
            country = "Egipto",
            region = "África",
            tagline = "Aguas transparentes, safaris en quads y vacaciones en islas.",
            intro = "Enclave costero perfecto para familias que destaca por las playas de isla Giftun, avistamiento de delfines y safaris en el desierto.",
            highlights = listOf(
                "Excursión en barco a las playas caribeñas de la isla Giftun",
                "Nadar cerca de delfines en su hábitat natural en Dolphin House",
                "Safari al atardecer en quad por las dunas rojizas del desierto",
                "Marina deportiva con terrazas y paseos junto a yates"
            ),
            tips = listOf(
                "Excelente opción para vacaciones familiares con parques acuáticos integrados."
            ),
            bestSeason = "Octubre a abril",
            tags = listOf("afrique", "plage"),
            aliases = listOf("hurgada", "mar-rojo"),
            imageAsset = "file:///android_asset/destinations/hurghada.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "marrakech",
            name = "Marrakech",
            country = "Marruecos",
            region = "África",
            tagline = "La Ciudad Roja de palacios, riads y la plaza Jemaa el-Fna.",
            intro = "Joya imperial a los pies del Atlas, famosa por sus jardines Majorelle, zocos vibrantes, gastronomía exquisita y hospitalidad marroquí.",
            highlights = listOf(
                "La animada plaza Jemaa el-Fna y el minarete de la Koutoubia",
                "Jardín Majorelle y el Museo Yves Saint Laurent",
                "Palacio Bahía de mosaicos andalusíes y Medersa Ben Youssef",
                "Los coloridos zocos de artesanos en la medina histórica"
            ),
            tips = listOf(
                "Tome un té a la menta en las terrazas de Jemaa el-Fna al caer la tarde.",
                "Hospédese al menos una noche en un riad tradicional en el corazón de la medina."
            ),
            bestSeason = "Marzo a mayo y septiembre a noviembre",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("marruecos", "marrakech"),
            imageAsset = "file:///android_asset/destinations/marrakech.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "location-voiture"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "casablanca",
            name = "Casablanca",
            country = "Marruecos",
            region = "África",
            tagline = "Motor económico atlántico y la majestuosa Mezquita Hassan II.",
            intro = "Metrópoli atlántica de Marruecos, conocida por la monumental Mezquita Hassan II levantada sobre el océano y su arquitectura Art Déco.",
            highlights = listOf(
                "Mezquita Hassan II y su alminar de 210 metros sobre el Atlántico",
                "Paseo marítimo de La Corniche en Aïn Diab",
                "Barrio tradicional de Habous y sus pastelerías marroquíes",
                "Arquitectura histórica Art Déco en las avenidas del centro"
            ),
            tips = listOf(
                "Realice la visita guiada al interior de la Mezquita Hassan II."
            ),
            bestSeason = "Abril a octubre",
            tags = listOf("afrique", "ville", "culture"),
            aliases = listOf("casa", "dar-al-baida"),
            imageAsset = "file:///android_asset/destinations/casablanca.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "tanger",
            name = "Tánger",
            country = "Marruecos",
            region = "África",
            tagline = "Puerta del estrecho de Gibraltar donde se abrazan dos mares.",
            intro = "Mítica ciudad blanca donde el Atlántico se funde con el Mediterráneo, fuente de inspiración de pintores y escritores de todo el planeta.",
            highlights = listOf(
                "La histórica Kasbah y el Museo de las Culturas Mediterráneas",
                "Cuevas de Hércules y faro panorámico de Cabo Espartel",
                "El Gran Zoco y las míticas terrazas del Café Hafa sobre el acantilado",
                "Moderna marina deportiva y paseo marítimo de la bahía"
            ),
            tips = listOf(
                "Saboree un té con menta en el Café Hafa mientras divisa las costas de España."
            ),
            bestSeason = "Mayo a octubre",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("tangier", "tanger"),
            imageAsset = "file:///android_asset/destinations/tanger.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "chefchaouen",
            name = "Chefchauen",
            country = "Marruecos",
            region = "África",
            tagline = "La Perla Azul acunada entre los valles del Rif.",
            intro = "Pueblo de ensueño con calles pintadas en hipnóticas gamas de azul, ritmo apacible y vistas panorámicas de las cumbres montañosas.",
            highlights = listOf(
                "Encantadoras callejuelas empedradas teñidas de azul añil",
                "Plaza Uta el-Hammam y la fortaleza de la Kasbah",
                "Manantiales y cascadas de montaña de Ras El Maa",
                "Ruta hacia la Mezquita Española para ver la puesta de sol"
            ),
            tips = listOf(
                "Suba a la Mezquita Española al atardecer para una estampa inolvidable del pueblo azul."
            ),
            bestSeason = "Abril a junio y septiembre a octubre",
            tags = listOf("afrique", "nature", "culture"),
            aliases = listOf("chaouen", "ciudad-azul"),
            imageAsset = "file:///android_asset/destinations/chefchaouen.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "agadir",
            name = "Agadir",
            country = "Marruecos",
            region = "África",
            tagline = "Playa dorada atlántica, 300 días de sol y surf paradisíaco.",
            intro = "Principal destino costero de Marruecos con su bahía de 10 kilómetros, animado paseo marítimo y cercanía al paraíso del surf de Taghazout.",
            highlights = listOf(
                "Playa inmensa de arena fina con aguas tranquilas para el baño",
                "Restos de la antigua Kasbah Agadir Oufella dominando la bahía",
                "Zoco El Had, uno de los mercados más grandes del norte de África",
                "Playas y calas naturales de Taghazout, meca del surf"
            ),
            tips = listOf(
                "Haga una excursión a Paradise Valley para nadar en piscinas naturales entre gargantas."
            ),
            bestSeason = "Todo el año gracias a su clima suave y soleado",
            tags = listOf("afrique", "plage"),
            aliases = listOf("taghazout", "agadir"),
            imageAsset = "file:///android_asset/destinations/agadir.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "paris",
            name = "París",
            country = "Francia",
            region = "Europa",
            tagline = "La Ciudad de la Luz, elegancia, arte y monumentos universales.",
            intro = "Capital mundial del romanticismo y la cultura, seduce con la Torre Eiffel, el Museo del Louvre, los Campos Elíseos y el río Sena.",
            highlights = listOf(
                "La Torre Eiffel y paseo en barco por el río Sena",
                "Museo del Louvre y sus colecciones maestras universales",
                "Catedral de Notre-Dame y el histórico barrio de Le Marais",
                "Avenida de los Campos Elíseos y el Arco de Triunfo"
            ),
            tips = listOf(
                "Compre las entradas a museos por internet para saltarse las colas.",
                "Utilice la red de metro para desplazarse de forma rápida y sencilla."
            ),
            bestSeason = "Abril a octubre",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("paris", "francia"),
            imageAsset = "file:///android_asset/destinations/paris.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "rome",
            name = "Roma",
            country = "Italia",
            region = "Europa",
            tagline = "La Ciudad Eterna, museo viviente de la Antigüedad clásica.",
            intro = "Capital histórica repleta de joyas inestimables: el Coliseo, la Fontana di Trevi, el Panteón y la gastronomía italiana más auténtica.",
            highlights = listOf(
                "El Coliseo y el Foro Romano de la Antigüedad",
                "La Fontana di Trevi y la escalinata de la Plaza de España",
                "El templo del Panteón de Agripa y la señorial Piazza Navona",
                "La Ciudad del Vaticano y la Basílica de San Pedro"
            ),
            tips = listOf(
                "Recorra el centro histórico a pie para descubrir recoletas plazas y fuentes."
            ),
            bestSeason = "Abril a junio y septiembre a noviembre",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("roma", "italia"),
            imageAsset = "file:///android_asset/destinations/rome.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "barcelone",
            name = "Barcelona",
            country = "España",
            region = "Europa",
            tagline = "Arquitectura de Gaudí, playas mediterráneas y barrios góticos.",
            intro = "Vibrante capital catalana donde la Sagrada Família y el Park Güell se funden con animadas playas costeras y una deliciosa tradición gastronómica.",
            highlights = listOf(
                "Basílica de la Sagrada Família, obra cumbre inacabada de Gaudí",
                "Park Güell con sus bancos de mosaicos y vistas al mar",
                "La Rambla peatonal y el mercado de La Boqueria",
                "Barrio Gótico medieval y playas urbanas de la Barceloneta"
            ),
            tips = listOf(
                "Es imprescindible comprar las entradas para la Sagrada Família con semanas de anticipación."
            ),
            bestSeason = "Mayo a octubre",
            tags = listOf("europe", "ville", "plage", "culture"),
            aliases = listOf("barcelona", "espana"),
            imageAsset = "file:///android_asset/destinations/barcelone.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "londres",
            name = "Londres",
            country = "Reino Unido",
            region = "Europa",
            tagline = "Energía cosmopolita, palacios reales y museos de primer orden.",
            intro = "Histórica capital británica con el Big Ben, el Puente de la Torre, el Palacio de Buckingham, los musicales del West End y amplios parques reales.",
            highlights = listOf(
                "El Big Ben, el Parlamento y la Abadía de Westminster",
                "Tower Bridge y la fortaleza medieval de la Torre de Londres",
                "Museo Británico y National Gallery con acceso gratuito",
                "Ceremonia del Cambio de Guardia en el Palacio de Buckingham"
            ),
            tips = listOf(
                "Utilice tarjetas bancarias contactless directamente en los tornos del metro."
            ),
            bestSeason = "Mayo a septiembre",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("london", "inglaterra"),
            imageAsset = "file:///android_asset/destinations/londres.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "amman",
            name = "Amán",
            country = "Jordania",
            region = "Oriente Medio",
            tagline = "La capital de las siete colinas, ruinas romanas y calidez jordana.",
            intro = "Puerta de entrada a Jordania, Amán reúne la Ciudadela sobre las alturas, el Teatro Romano del siglo II y una sabrosa gastronomía levantina.",
            highlights = listOf(
                "La Ciudadela de Amán con el Templo de Hércules y vistas panorámicas",
                "Gran Teatro Romano en el corazón del casco antiguo",
                "La bulliciosa calle Rainbow Street con galerías, terrazas y cafés",
                "Excursión hacia las flotantes y terapéuticas aguas del Mar Muerto"
            ),
            tips = listOf(
                "Adquiera el Jordan Pass antes de viajar para incluir el visado y entradas a sitios."
            ),
            bestSeason = "Marzo a mayo y septiembre a noviembre",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("amman", "jordania"),
            imageAsset = "file:///android_asset/destinations/amman.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "petra",
            name = "Petra",
            country = "Jordania",
            region = "Oriente Medio",
            tagline = "La ciudad de piedra rosada labrada por los antiguos nabateos.",
            intro = "Maravilla del mundo que se descubre tras cruzar el estrecho desfiladero del Siq hasta contemplar El Tesoro y El Monasterio esculpidos en roca viva.",
            highlights = listOf(
                "El desfiladero del Siq que desemboca ante la fachada de El Tesoro (Al-Khazneh)",
                "La subida panorámica hacia el monumental templo de El Monasterio (Ad-Deir)",
                "Las Tumbas Reales esculpidas en el acantilado rosado",
                "El espectáculo nocturno Petra by Night a la luz de miles de velas"
            ),
            tips = listOf(
                "Lleve calzado cómodo de senderismo; la visita al recinto requiere caminar bastante."
            ),
            bestSeason = "Marzo a mayo y septiembre a noviembre",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("petra", "al-khazneh"),
            imageAsset = "file:///android_asset/destinations/petra.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "kuala-lumpur",
            name = "Kuala Lumpur",
            country = "Malasia",
            region = "Asia",
            tagline = "Torres Petronas, cuevas de Batu y rica cocina callejera halal.",
            intro = "Dinámica metrópoli del Sudeste Asiático que aúna torres resplandecientes, templos sagrados en las cuevas de Batu y una gastronomía halal variada.",
            highlights = listOf(
                "Torres Gemelas Petronas y la pasarela aérea Skybridge",
                "Cuevas de Batu con sus escaleras multicolores y estatua dorada gigante",
                "Plaza Merdeka histórica y el animado Central Market de artesanía",
                "Barrio comercial de Bukit Bintang y comida callejera en Jalan Alor"
            ),
            tips = listOf(
                "Malasia es uno de los destinos turísticos halal más cómodos y acogedores del mundo."
            ),
            bestSeason = "Todo el año con su agradable clima tropical cálido",
            tags = listOf("asie", "ville", "culture"),
            aliases = listOf("kl", "malasia"),
            imageAsset = "file:///android_asset/destinations/kuala-lumpur.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "bali",
            name = "Bali",
            country = "Indonesia",
            region = "Asia",
            tagline = "La Isla de los Dioses, terrazas de arroz y playas idílicas.",
            intro = "Paraíso insular indonesio conocido por los bancales de arroz de Ubud, templos marinos sobre acantilados, cascadas y playas de surf.",
            highlights = listOf(
                "Terrazas de arroz de Tegallalang y cascadas tropicales de Ubud",
                "Templo marino de Tanah Lot sobre un islote rocoso",
                "Acantilados de Uluwatu sobre el oleaje del Océano Índico",
                "Playas paradisíacas de Nusa Dua y Seminyak"
            ),
            tips = listOf(
                "Contrate un chófer privado local para recorrer la isla con total comodidad."
            ),
            bestSeason = "Mayo a octubre durante la temporada seca",
            tags = listOf("asie", "nature", "plage"),
            aliases = listOf("indonesia", "ubud"),
            imageAsset = "file:///android_asset/destinations/bali.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "maldives",
            name = "Maldivas",
            country = "Maldivas",
            region = "Océano Índico",
            tagline = "Atolones de aguas turquesas, villas sobre el agua y playas paradisíacas.",
            intro = "Archipiélago de ensueño ideal para desconectar, lunas de miel y buceo en arrecifes coralinos de aguas cristalinas.",
            highlights = listOf(
                "Villas de lujo sobre el agua con acceso directo a lagunas turquesas",
                "Snorkel y buceo con mantarrayas, tortugas marinas y corales multicolores",
                "Cena romántica privada a la luz de las velas en una playa desierta",
                "Spas sobre el mar y tratamientos holísticos de relajación total"
            ),
            tips = listOf(
                "Coordine el traslado en hidroavión o lancha rápida al hacer la reserva del hotel.",
                "Elija regímenes de todo incluido para disfrutar con total tranquilidad presupuestaria."
            ),
            bestSeason = "Diciembre a abril",
            tags = listOf("asie", "plage", "nature"),
            aliases = listOf("maldivas", "atolones"),
            imageAsset = "file:///android_asset/destinations/maldives.jpg",
            services = listOf("vols", "hotels", "transferts", "yacht"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "zanzibar",
            name = "Zanzíbar",
            country = "Tanzania",
            region = "África",
            tagline = "La isla de las especias, Stone Town histórica y playas de coral.",
            intro = "Archipiélago tropical del Océano Índico que aúna la historia suajili y árabe en Stone Town (UNESCO) con playas de arena blanca y aguas esmeralda.",
            highlights = listOf(
                "Centro histórico de Stone Town y sus portales de madera tallados (UNESCO)",
                "Playas paradisíacas de Nungwi y Kendwa de mareas suaves",
                "Visita guiada a plantaciones ecológicas de especias aromáticas",
                "Excursión al banco de arena de Nakupenda y nado con delfines salvajes"
            ),
            tips = listOf(
                "Deguste pescado a la brasa en el animado mercado nocturno de los Jardines Forodhani."
            ),
            bestSeason = "Junio a octubre y diciembre a febrero",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("tanzania", "stone-town"),
            imageAsset = "file:///android_asset/destinations/zanzibar.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "djerba",
            name = "Yerba",
            country = "Túnez",
            region = "África",
            tagline = "La isla de las brisas suaves, palmerales y reposo mediterráneo.",
            intro = "Apacible isla del sur tunecino famosa por sus casas blancas tradicionales (menzels), los murales de arte urbano de Djerbahood y amplias playas de arena.",
            highlights = listOf(
                "Murales monumentales de arte urbano internacional en Djerbahood",
                "Zocos de artesanía y talleres de alfarería en Houmt Souk",
                "Playas mediterráneas orladas de palmeras datileras",
                "Sinagoga histórica de la Ghriba y mezquitas fortificadas"
            ),
            tips = listOf(
                "Alquile una bicicleta o coche para explorar los senderos costeros vírgenes."
            ),
            bestSeason = "Abril a octubre",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("djerba", "tunez"),
            imageAsset = "file:///android_asset/destinations/djerba.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "sarajevo",
            name = "Sarajevo",
            country = "Bosnia y Herzegovina",
            region = "Europa",
            tagline = "La Jerusalén de Europa, herencia otomana y montañas olímpicas.",
            intro = "Acogedora capital rodeada por montañas olímpicas donde conviven mezquitas otomanas en Baščaršija, iglesias y puentes sobre el río Miljacka.",
            highlights = listOf(
                "Barrio otomano histórico de Baščaršija y la fuente de madera Sebilj",
                "Mezquita de Gazi Husrev-bey del siglo XVI",
                "Puente Latino histórico y Museo del Túnel de la Esperanza",
                "Teleférico del monte Trebević y vistas panorámicas sobre el valle"
            ),
            tips = listOf(
                "Pruebe los ćevapi tradicionales a la brasa junto a un aromático café bosnio."
            ),
            bestSeason = "Mayo a octubre",
            tags = listOf("europe", "culture", "nature"),
            aliases = listOf("bosnia"),
            imageAsset = "file:///android_asset/destinations/sarajevo.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.8f
        )
    )
}
