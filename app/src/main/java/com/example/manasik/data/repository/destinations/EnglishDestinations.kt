package com.example.manasik.data.repository.destinations

import com.example.manasik.data.model.Destination

object EnglishDestinations {
    val list: List<Destination> = listOf(
        Destination(
            slug = "la-mecque",
            name = "Makkah",
            country = "Saudi Arabia",
            region = "Middle East",
            tagline = "The spiritual heart of Islam and sacred sanctuary of millions.",
            intro = "Makkah is the holiest city in Islam, birthplace of Prophet Muhammad and home to the Holy Kaaba towards which over two billion Muslims turn in prayer. Performing Umrah or Hajj here is a deeply transformative and uplifting spiritual journey.",
            highlights = listOf(
                "Tawaf around the Holy Kaaba and greeting the Black Stone",
                "Ritual walking between Safa and Marwah (Sa'i)",
                "Blessed water from the well of Zamzam",
                "Mount of Light (Jabal al-Nour) and the Cave of Hira",
                "Mount Arafat and the tent valley of Mina"
            ),
            tips = listOf(
                "Entry to Makkah is restricted to Muslims holding an official Nusuk permit.",
                "Book early to secure premium hotels overlooking the Haram courtyards.",
                "Wear light, comfortable, and modest clothing suitable for pilgrimage rites."
            ),
            bestSeason = "Umrah is available year-round; Hajj during the Islamic lunar calendar dates",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("mecca", "meca", "la mecque"),
            imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "medine",
            name = "Madinah",
            country = "Saudi Arabia",
            region = "Middle East",
            tagline = "The Radiant City, sanctuary of deep peace and spiritual solace.",
            intro = "Madinah hosts the Prophet's Mosque (al-Masjid an-Nabawi) and the revered Rawdah. An atmosphere of matchless peace welcomes pilgrims who come to pray and connect with sacred history.",
            highlights = listOf(
                "The Prophet's Mosque and the blessed Noble Rawdah",
                "Quba Mosque, the first mosque built in Islamic history",
                "Al-Baqi Cemetery and tombs of the Prophet's companions",
                "Mosque of the Two Qiblas (Masjid al-Qiblatayn)",
                "Mount Uhud and the martyrs' historic memorial site"
            ),
            tips = listOf(
                "Book your Rawdah appointment in advance through the official Nusuk app.",
                "Visit sites in the early morning to avoid peak afternoon crowds.",
                "Dress modestly and maintain reverent peace throughout the holy city."
            ),
            bestSeason = "Spring and autumn for mild, comfortable weather",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("medina", "médine"),
            imageAsset = "file:///android_asset/destinations/medine.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "djeddah",
            name = "Jeddah",
            country = "Saudi Arabia",
            region = "Middle East",
            tagline = "Bride of the Red Sea, gateway to the Holy Cities.",
            intro = "Cosmopolitan coastal metropolis blending historical coral-stone heritage in UNESCO-listed Al-Balad with lively corniche dining, open-air art sculptures, and premier Red Sea diving.",
            highlights = listOf(
                "Historic Al-Balad district with ancient coral stone merchant houses (UNESCO)",
                "King Fahd's Fountain, the tallest water fountain in the world",
                "Jeddah Waterfront Corniche with open-air art and seaside promenades",
                "World-class scuba diving and coral reef snorkeling in the Red Sea"
            ),
            tips = listOf(
                "Explore Al-Balad in late afternoon and evening when illuminated lanterns glow.",
                "Take the Haramain High Speed Train from the airport to reach Makkah in 45 minutes."
            ),
            bestSeason = "November to March for ideal coastal weather",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("djeddah", "jidda"),
            imageAsset = "file:///android_asset/destinations/djeddah.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "taif",
            name = "Taif",
            country = "Saudi Arabia",
            region = "Middle East",
            tagline = "The City of Roses perched on the green heights of the Hejaz.",
            intro = "Celebrated for its refreshing mountain breezes, world-famous Damascus rose farms, terraced fruit orchards, and the panoramic Al Hada cable car.",
            highlights = listOf(
                "Traditional Taif rose water distilleries and fragrant farm visits",
                "Al Hada scenic mountain cable car with hairpin gorge views",
                "Historic Shubra Palace museum and local artisan markets",
                "Terraced fruit orchards with fresh figs, pomegranates, and apricots"
            ),
            tips = listOf(
                "Pack a light jacket for cool mountain evenings.",
                "Visit in spring during the annual rose harvest festival."
            ),
            bestSeason = "May to October to escape lower valley heat",
            tags = listOf("moyen-orient", "nature"),
            aliases = listOf("al-taif", "taïf"),
            imageAsset = "file:///android_asset/destinations/taif.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "alula",
            name = "AlUla",
            country = "Saudi Arabia",
            region = "Middle East",
            tagline = "A living open-air museum in the ancient desert.",
            intro = "Ancient Nabataean tombs at Hegra carved into red sandstone cliffs, lush date palm oases, and modern architectural marvels like the Maraya Concert Hall.",
            highlights = listOf(
                "Hegra (Madâin Sâlih) archaeological site, a UNESCO World Heritage treasure",
                "Elephant Rock (Jabal AlFil) and Harrat Uwayrid panoramic viewpoint",
                "Old Town of AlUla and the historic date palm oasis",
                "Maraya Concert Hall, the world's largest mirror-clad building"
            ),
            tips = listOf(
                "Book guided tours to Hegra in advance with certified local heritage guides.",
                "Desert nights can be chilly in winter; bring warm layers."
            ),
            bestSeason = "October to April",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("al-ula", "hegra"),
            imageAsset = "file:///android_asset/destinations/alula.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "riyad",
            name = "Riyadh",
            country = "Saudi Arabia",
            region = "Middle East",
            tagline = "Dynamic capital connecting authentic heritage and futuristic vision.",
            intro = "Riyadh unites towering modern skyscrapers with the historic adobe-brick birthplace of the kingdom at UNESCO-listed At-Turaif in Diriyah.",
            highlights = listOf(
                "At-Turaif district in historic Diriyah, cradle of the Saudi state (UNESCO)",
                "Al Masmak historic mud-brick fortress in the heart of old Riyadh",
                "Kingdom Centre Tower and the high-altitude Sky Bridge observatory",
                "Souq Al Zal, Riyadh's oldest traditional antique and spice marketplace"
            ),
            tips = listOf(
                "Visit Diriyah in the evening to enjoy atmospheric lighting and terrace dining."
            ),
            bestSeason = "November to March",
            tags = listOf("moyen-orient", "ville"),
            aliases = listOf("riyad", "riad"),
            imageAsset = "file:///android_asset/destinations/riyad.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "istanbul",
            name = "Istanbul",
            country = "Turkey",
            region = "Europe / Asia",
            tagline = "Crossroads of continents between East and West on the Bosphorus.",
            intro = "Spanning two continents, Istanbul enchants with Hagia Sophia, the Blue Mosque, Topkapi Palace, and bustling historic spice bazaars.",
            highlights = listOf(
                "Hagia Sophia Mosque (Ayasofya) and the Blue Mosque of Sultanahmet",
                "The Grand Bazaar and the historic Egyptian Spice Bazaar",
                "Sunset Bosphorus strait scenic cruise between Europe and Asia",
                "Topkapi Palace and its royal imperial treasures and courtyards"
            ),
            tips = listOf(
                "Get an Istanbulkart contactless card for easy tram, ferry, and metro rides.",
                "Bring a headscarf and dress modestly when entering active historic mosques."
            ),
            bestSeason = "April to June and September to November",
            tags = listOf("europe", "asie", "ville", "culture"),
            aliases = listOf("constantinople", "turkey"),
            imageAsset = "file:///android_asset/destinations/istanbul.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "esim"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "antalya",
            name = "Antalya",
            country = "Turkey",
            region = "Europe / Asia",
            tagline = "Turkish Riviera, turquoise cliffs and ancient Greco-Roman ruins.",
            intro = "Mediterranean jewel featuring the historic old quarter of Kaleiçi, dramatic Düden waterfalls, and sun-drenched beaches year-round.",
            highlights = listOf(
                "Charming fortified old town of Kaleiçi and Hadrian's Gate",
                "Cascading Düden waterfalls dropping directly into the sea",
                "Crystal-clear beaches of Konyaaltı and Lara",
                "Magnificently preserved Greco-Roman theater of Aspendos"
            ),
            tips = listOf(
                "Take a boat excursion along the coastal cliffs at sunset."
            ),
            bestSeason = "April to October",
            tags = listOf("europe", "asie", "plage", "nature"),
            aliases = listOf("turkish-riviera"),
            imageAsset = "file:///android_asset/destinations/antalya.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "cappadoce",
            name = "Cappadocia",
            country = "Turkey",
            region = "Europe / Asia",
            tagline = "Fairy chimneys, cave retreats, and sunrise hot air balloon rides.",
            intro = "A surreal wonderland of volcanic rock formations, underground cities, and magical dawn balloon flights over Göreme valley.",
            highlights = listOf(
                "Magical hot air balloon sunrise flight overlooking Göreme valley",
                "Göreme Open-Air Museum and rock-cut Byzantine cave chapels",
                "Deep underground subterranean cities at Derinkuyu and Kaymakli",
                "Pigeon Valley, Love Valley, and Uçhisar rock-cut castle fortress"
            ),
            tips = listOf(
                "Book balloon flights for your very first morning to allow rescheduling if weather turns windy.",
                "Stay in an authentic boutique cave hotel for an unforgettable Anatolian stay."
            ),
            bestSeason = "May to October",
            tags = listOf("europe", "asie", "nature", "culture"),
            aliases = listOf("cappadoce", "goreme"),
            imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "trabzon",
            name = "Trabzon",
            country = "Turkey",
            region = "Europe / Asia",
            tagline = "Emerald forests, mountain mists, and cliff-hanging monasteries.",
            intro = "Black Sea gateway famous for the cliffside Sumela Monastery and the pristine alpine lake of Uzungöl framed by pine-covered peaks.",
            highlights = listOf(
                "Sumela Monastery dramatically carved into high mountain cliffs",
                "Alpine lake of Uzungöl and traditional wooden valley chalets",
                "Green highlands of Ayder with hot springs and waterfalls",
                "Atatürk Pavilion with scenic panoramic viewpoints of the Black Sea"
            ),
            tips = listOf(
                "Taste the iconic local kuymak dish with melted Black Sea cheese."
            ),
            bestSeason = "June to September",
            tags = listOf("europe", "asie", "nature"),
            aliases = listOf("trebizond", "uzungol"),
            imageAsset = "file:///android_asset/destinations/trabzon.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "dubai",
            name = "Dubai",
            country = "United Arab Emirates",
            region = "Middle East",
            tagline = "Futuristic metropolis of golden dunes, luxury, and world records.",
            intro = "Home to Burj Khalifa, Palm Jumeirah, premier desert safaris, and luxury seaside resorts along the Arabian Gulf.",
            highlights = listOf(
                "Burj Khalifa observation deck on the 148th floor above the clouds",
                "The Dubai Mall and the synchronized musical Dubai Fountain show",
                "Evening red dune desert safari with traditional Bedouin dinner camp",
                "Palm Jumeirah archipelago and pristine coastal private beach clubs"
            ),
            tips = listOf(
                "Use the air-conditioned Dubai Metro to bypass peak traffic between major hubs.",
                "Schedule indoor attractions, museums, and shopping for midday hours."
            ),
            bestSeason = "November to April",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("uae", "emirates"),
            imageAsset = "file:///android_asset/destinations/dubai.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites", "yacht"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "abu-dhabi",
            name = "Abu Dhabi",
            country = "United Arab Emirates",
            region = "Middle East",
            tagline = "Cultural capital, pristine White Mosque, and Louvre on the water.",
            intro = "Serene, sophisticated Emirati capital celebrated for the magnificent Sheikh Zayed Grand Mosque and the Jean Nouvel-designed Louvre Abu Dhabi.",
            highlights = listOf(
                "Sheikh Zayed Grand Mosque made of pure white Macedonian marble",
                "Louvre Abu Dhabi art museum crowned with a floating dome of light",
                "Qasr Al Watan Presidential Palace and monumental ceremonial halls",
                "Ferrari World theme park and Yas Marina Formula 1 circuit"
            ),
            tips = listOf(
                "Follow the modest dress code guidelines when visiting the Grand Mosque."
            ),
            bestSeason = "November to April",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("aboudabi", "abudhabi"),
            imageAsset = "file:///android_asset/destinations/abu-dhabi.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "doha",
            name = "Doha",
            country = "Qatar",
            region = "Middle East",
            tagline = "Qatari elegance, Islamic art museum, and lively Souq Waqif.",
            intro = "Artful Arabian Gulf metropolis combining the authentic spiced alleys of Souq Waqif with world-class museums and futuristic waterfront architecture.",
            highlights = listOf(
                "Museum of Islamic Art (MIA) designed by I. M. Pei",
                "Lively Souq Waqif with falcons, spices, perfumes, and dining",
                "Scenic Corniche promenade and The Pearl luxury island",
                "Katara Cultural Village with art galleries and beachfront amphitheater"
            ),
            tips = listOf(
                "Stroll through Souq Waqif in early evening for the most vibrant ambiance."
            ),
            bestSeason = "November to March",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("qatar"),
            imageAsset = "file:///android_asset/destinations/doha.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "le-caire",
            name = "Cairo",
            country = "Egypt",
            region = "Africa",
            tagline = "City of a thousand minarets and timeless Pyramids of Giza.",
            intro = "Capital of ancient pharaohs and Islamic architecture, guarding the Great Sphinx, the Nile, and the Grand Egyptian Museum.",
            highlights = listOf(
                "Pyramids of Giza (Khufu, Khafre, Menkaure) and the Great Sphinx",
                "The Grand Egyptian Museum (GEM) and historic Tahrir antiquities",
                "Khan el-Khalili centuries-old bazaar lined with copperware and perfumes",
                "Citadel of Saladin and the alabaster Mosque of Muhammad Ali"
            ),
            tips = listOf(
                "Hire a licensed Egyptologist guide for fascinating insights at the monuments.",
                "Take a relaxing traditional wooden felucca sail on the Nile river at golden hour."
            ),
            bestSeason = "October to April",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("le-caire", "egypt"),
            imageAsset = "file:///android_asset/destinations/le-caire.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "charm-el-cheikh",
            name = "Sharm El Sheikh",
            country = "Egypt",
            region = "Africa",
            tagline = "Red Sea beach resort paradise with legendary coral reefs.",
            intro = "World-famous seaside resort acclaimed for crystal reefs in Ras Mohammed National Park, luxury all-inclusive resorts, and Mount Sinai excursions.",
            highlights = listOf(
                "Ras Mohammed National Marine Park and pristine coral reefs",
                "Tiran Island boat tours with crystal turquoise lagoons",
                "Night trek up Mount Sinai and Saint Catherine's ancient Monastery",
                "Sheltered sandy beaches of Naama Bay and Bedouin desert camps"
            ),
            tips = listOf(
                "Bring snorkel gear to enjoy reef marine life straight from the shore."
            ),
            bestSeason = "October to May to avoid peak summer heat",
            tags = listOf("afrique", "plage", "nature"),
            aliases = listOf("charm-el-cheikh", "sharm"),
            imageAsset = "file:///android_asset/destinations/charm-el-cheikh.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "hurghada",
            name = "Hurghada",
            country = "Egypt",
            region = "Africa",
            tagline = "Crystal waters, desert quad safaris, and island getaways.",
            intro = "Popular Red Sea coastal haven renowned for Giftun Island boat trips, exciting desert safaris, and beachfront family resorts.",
            highlights = listOf(
                "Boat cruise to the white sandy shores of Giftun Island",
                "Snorkeling with wild dolphins at Dolphin House",
                "Sunset quad biking safari across red Arabian desert dunes",
                "Modern Hurghada Marina lined with waterside cafés and yachts"
            ),
            tips = listOf(
                "Excellent choice for all-inclusive family holidays with water parks."
            ),
            bestSeason = "October to April",
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
            country = "Morocco",
            region = "Africa",
            tagline = "The Ochre City of historic palaces, riads, and vibrant souks.",
            intro = "Imperial jewel at the foot of the Atlas Mountains, famous for Jemaa el-Fna square, Majorelle Gardens, and authentic artisan craftsmanship.",
            highlights = listOf(
                "Jemaa el-Fna main square performers and the Koutoubia minaret",
                "Jardin Majorelle botanical garden and the Yves Saint Laurent Museum",
                "Bahia Palace intricate mosaic courtyards and Ben Youssef Medersa",
                "Vibrant artisan souks with leather, spices, lanterns, and textiles"
            ),
            tips = listOf(
                "Sip fresh mint tea on a rooftop terrace overlooking Jemaa el-Fna at sunset.",
                "Book at least one night in an authentic riad courtyard inside the historic Medina."
            ),
            bestSeason = "March to May and September to November",
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
            country = "Morocco",
            region = "Africa",
            tagline = "Atlantic economic hub and the grand Hassan II Mosque.",
            intro = "Morocco's vibrant Atlantic metropolis, home to the monumental Hassan II Mosque built partly over the ocean and Art Deco heritage avenues.",
            highlights = listOf(
                "Hassan II Mosque with its 210-meter minaret overlooking the Atlantic",
                "La Corniche seaside promenade and beach clubs in Aïn Diab",
                "Quartier Habous traditional architecture and pastry bakeries",
                "Historic French colonial Art Deco architecture in the city center"
            ),
            tips = listOf(
                "Take the official guided interior tour of Hassan II Mosque."
            ),
            bestSeason = "April to October",
            tags = listOf("afrique", "ville", "culture"),
            aliases = listOf("casa", "dar-al-baida"),
            imageAsset = "file:///android_asset/destinations/casablanca.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "tanger",
            name = "Tangier",
            country = "Morocco",
            region = "Africa",
            tagline = "Gateway to the Strait of Gibraltar where two seas unite.",
            intro = "Legendary white city where the Atlantic Ocean meets the Mediterranean, inspiring international artists, poets, and travelers for centuries.",
            highlights = listOf(
                "Historic Kasbah palace and Mediterranean culture museum",
                "Caves of Hercules and scenic lighthouse at Cap Spartel",
                "Grand Socco marketplace and iconic clifftop Café Hafa",
                "Modern seaside marina and coastal corniche promenade"
            ),
            tips = listOf(
                "Enjoy mint tea at Café Hafa while watching ferry ships cross to Spain."
            ),
            bestSeason = "May to October",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("tanger", "tanja"),
            imageAsset = "file:///android_asset/destinations/tanger.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "chefchaouen",
            name = "Chefchaouen",
            country = "Morocco",
            region = "Africa",
            tagline = "The Blue Pearl nestled in the scenic Rif Mountains.",
            intro = "Fairy-tale mountain town renowned for its iconic blue-washed streets, relaxed pace of life, and breathtaking views of the surrounding peaks.",
            highlights = listOf(
                "Charming blue-washed cobblestone alleyways of the Medina",
                "Plaza Outa el-Hammam and the fortified red Kasbah",
                "Ras El Maa mountain spring waterfalls and riverside cafés",
                "Hike to the Spanish Mosque for panoramic sunset vistas"
            ),
            tips = listOf(
                "Walk up to the Spanish Mosque around sunset for magical views of the town."
            ),
            bestSeason = "April to June and September to October",
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
            country = "Morocco",
            region = "Africa",
            tagline = "Golden Atlantic bay, 300 days of sunshine, and surf breaks.",
            intro = "Morocco's premier Atlantic beach destination featuring a 10-kilometer golden crescent bay, palm-fringed boardwalk, and nearby Taghazout surf culture.",
            highlights = listOf(
                "Wide 10-km golden sand beach with safe swimming waters",
                "Agadir Oufella ancient Kasbah ruins overlooking the entire bay",
                "Souk El Had, one of the largest vibrant markets in North Africa",
                "World-class surf breaks and quiet fishing coves in Taghazout"
            ),
            tips = listOf(
                "Take a day trip to Paradise Valley for scenic mountain rock pools."
            ),
            bestSeason = "Year-round thanks to 300+ days of annual sunshine",
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
            tagline = "The City of Light, world-renowned elegance, and iconic landmarks.",
            intro = "Global capital of romance and culture, Paris enchants with the Eiffel Tower, the Louvre, Notre-Dame, and leisurely walks along the Seine River.",
            highlights = listOf(
                "The Eiffel Tower and scenic Seine riverboat cruise",
                "The Louvre Museum and its priceless world masterpieces",
                "Notre-Dame Cathedral and the charming historic Marais quarter",
                "Champs-Élysées avenue and the monumental Arc de Triomphe"
            ),
            tips = listOf(
                "Book major museum tickets online well in advance to skip lines.",
                "Use the metro system for fast, convenient city travel."
            ),
            bestSeason = "April to October",
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
            country = "Italy",
            region = "Europe",
            tagline = "The Eternal City, an open-air museum of Classical history.",
            intro = "Historic capital overflowing with world treasures: the Colosseum, Trevi Fountain, the Pantheon, and authentic Roman culinary traditions.",
            highlights = listOf(
                "The ancient Colosseum and the Roman Forum",
                "Trevi Fountain and the historic Spanish Steps",
                "The Pantheon temple and majestic Piazza Navona",
                "Vatican City and Saint Peter's Basilica"
            ),
            tips = listOf(
                "Explore the historic cobblestone center on foot to discover quiet fountains."
            ),
            bestSeason = "April to June and September to November",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("roma", "italy"),
            imageAsset = "file:///android_asset/destinations/rome.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "barcelone",
            name = "Barcelona",
            country = "Spain",
            region = "Europe",
            tagline = "Gaudí architecture, Mediterranean beaches, and Gothic alleys.",
            intro = "Vibrant Catalan metropolis where Antoni Gaudí's Sagrada Família and Park Güell meet lively seaside beaches and delicious tapas culture.",
            highlights = listOf(
                "Sagrada Família basilica, Gaudí's unfinished architectural marvel",
                "Park Güell with mosaic-tiled terraces overlooking the city and sea",
                "Lively La Rambla pedestrian boulevard and Mercat de la Boqueria",
                "Historic Gothic Quarter (Barri Gòtic) and Barceloneta beaches"
            ),
            tips = listOf(
                "Reserve Sagrada Família entrance tickets several weeks ahead."
            ),
            bestSeason = "May to October",
            tags = listOf("europe", "ville", "plage", "culture"),
            aliases = listOf("barcelona", "spain"),
            imageAsset = "file:///android_asset/destinations/barcelone.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "londres",
            name = "London",
            country = "United Kingdom",
            region = "Europe",
            tagline = "Cosmopolitan energy, royal palaces, and premier world museums.",
            intro = "Historic British capital showcasing Big Ben, Tower Bridge, Buckingham Palace, West End theater shows, and sprawling royal green parks.",
            highlights = listOf(
                "Big Ben, the Houses of Parliament, and Westminster Abbey",
                "Tower Bridge and the historic medieval Tower of London",
                "British Museum and National Gallery with free admission",
                "Changing of the Guard ceremony at Buckingham Palace"
            ),
            tips = listOf(
                "Use contactless payment cards directly on London Tube turnstiles."
            ),
            bestSeason = "May to September",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("london", "england"),
            imageAsset = "file:///android_asset/destinations/londres.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "amman",
            name = "Amman",
            country = "Jordan",
            region = "Middle East",
            tagline = "Capital of seven hills, ancient Roman ruins, and warm hospitality.",
            intro = "Gateway to Jordan, Amman brings together the high hilltop Citadel, a 2nd-century Roman Theatre, and a rich levantine culinary heritage.",
            highlights = listOf(
                "Amman Citadel with the Temple of Hercules and sweeping panoramas",
                "Grand 6,000-seat Roman Theatre in the heart of downtown",
                "Vibrant Rainbow Street with artisan shops, galleries, and cafés",
                "Excursion to the buoyant, therapeutic mineral waters of the Dead Sea"
            ),
            tips = listOf(
                "Purchase the Jordan Pass before travel to waive visa fees and include attractions."
            ),
            bestSeason = "March to May and September to November",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("jordan"),
            imageAsset = "file:///android_asset/destinations/amman.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "petra",
            name = "Petra",
            country = "Jordan",
            region = "Middle East",
            tagline = "The rose-red city carved directly into Nabataean sandstone.",
            intro = "One of the New Seven Wonders of the World, revealed after the winding Siq canyon with the legendary Treasury (Al-Khazneh).",
            highlights = listOf(
                "The narrow winding Siq canyon opening up to the majestic Treasury",
                "The scenic uphill trail to the monumental Monastery (Ad-Deir)",
                "The Royal Tombs carved deeply into towering pink sandstone cliffs",
                "Petra by Night spectacle illuminated by thousands of candle lanterns"
            ),
            tips = listOf(
                "Wear sturdy hiking shoes; visiting the park involves substantial walking."
            ),
            bestSeason = "March to May and September to November",
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
            country = "Malaysia",
            region = "Asia",
            tagline = "Petronas Twin Towers, Batu Caves, and multicultural street food.",
            intro = "Dynamic Southeast Asian metropolis blending glittering towers, holy shrines at Batu Caves, and one of the finest halal culinary scenes anywhere.",
            highlights = listOf(
                "Petronas Twin Towers and high-altitude Skybridge observatory",
                "Colorful Batu Caves temple complex and monumental golden statue",
                "Historic Merdeka Square and the lively Central Market",
                "Bukit Bintang shopping haven and Jalan Alor street food feasts"
            ),
            tips = listOf(
                "Malaysia is one of the world's most accessible and welcoming halal destinations."
            ),
            bestSeason = "Year-round warm tropical climate",
            tags = listOf("asie", "ville", "culture"),
            aliases = listOf("kl", "malaysia"),
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
            tagline = "Island of the Gods, emerald rice terraces, and paradise beaches.",
            intro = "Indonesian island paradise famed for cascading Ubud rice fields, sea temples set against fiery sunsets, hidden jungle waterfalls, and surfing beaches.",
            highlights = listOf(
                "Tegallalang emerald rice terraces and jungle waterfalls in Ubud",
                "Iconic Tanah Lot sea temple perched on an offshore rocky islet",
                "Dramatic Uluwatu sea cliffs overlooking the Indian Ocean",
                "Tropical beaches of Nusa Dua and Seminyak"
            ),
            tips = listOf(
                "Hire a reputable local private driver to explore the island comfortably."
            ),
            bestSeason = "May to October during the dry season",
            tags = listOf("asie", "nature", "plage"),
            aliases = listOf("indonesia", "ubud"),
            imageAsset = "file:///android_asset/destinations/bali.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "maldives",
            name = "Maldives",
            country = "Maldives",
            region = "Indian Ocean",
            tagline = "Turquoise atolls, overwater bungalows, and pristine coral reefs.",
            intro = "Idyllic island getaway for ultimate relaxation, honeymoons, and world-class scuba diving amidst marine life in the Indian Ocean.",
            highlights = listOf(
                "Private overwater luxury villas suspended above crystal turquoise lagoons",
                "Snorkeling and diving with gentle manta rays, sea turtles, and reef fish",
                "Intimate candlelight private dining on a deserted white sand beach",
                "Overwater wellness spas with soothing ocean vistas"
            ),
            tips = listOf(
                "Coordinate seaplane or speedboat island transfers directly when booking your stay.",
                "Opt for an all-inclusive package for total budget clarity and relaxation."
            ),
            bestSeason = "December to April",
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
            country = "Tanzania",
            region = "Africa",
            tagline = "The Spice Island, historic Stone Town, and coral beaches.",
            intro = "Enchanting Indian Ocean archipelago fusing Swahili and Arab history in UNESCO-listed Stone Town with powdery white-sand beaches.",
            highlights = listOf(
                "UNESCO-listed Stone Town with intricately carved wooden doors",
                "Paradise beaches of Nungwi and Kendwa with minimal tide variation",
                "Organic spice plantation tours (clove, vanilla, cinnamon)",
                "Nakupenda sandbank day trip and swimming with wild dolphins"
            ),
            tips = listOf(
                "Sample fresh grilled seafood at Forodhani Gardens night market."
            ),
            bestSeason = "June to October and December to February",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("tanzania", "stone-town"),
            imageAsset = "file:///android_asset/destinations/zanzibar.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "djerba",
            name = "Djerba",
            country = "Tunisia",
            region = "Africa",
            tagline = "Island of gentle breezes, ancient palms, and coastal tranquility.",
            intro = "Peaceful Tunisian island celebrated for traditional whitewashed menzels, the vibrant Djerbahood street-art village, and wide Mediterranean sands.",
            highlights = listOf(
                "Monumental street-art murals throughout the village of Djerbahood",
                "Artisan pottery workshops and lively markets of Houmt Souk",
                "Long sandy Mediterranean beaches fringed with date palms",
                "Historic El Ghriba Synagogue and fortified desert mosques"
            ),
            tips = listOf(
                "Rent a car or bicycle to discover quiet coastal roads and hidden coves."
            ),
            bestSeason = "April to October",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("tunisia"),
            imageAsset = "file:///android_asset/destinations/djerba.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "sarajevo",
            name = "Sarajevo",
            country = "Bosnia and Herzegovina",
            region = "Europe",
            tagline = "The Jerusalem of Europe, Ottoman history, and Olympic peaks.",
            intro = "Warm mountain capital where historic Ottoman mosques in Baščaršija stand harmoniously alongside churches and cathedrals along the Miljacka River.",
            highlights = listOf(
                "Ottoman historic district of Baščaršija and the wooden Sebilj fountain",
                "16th-century Gazi Husrev-bey Mosque complex",
                "Historic Latin Bridge and the Hope Tunnel Museum",
                "Mount Trebević cable car and historic Olympic bobsleigh track"
            ),
            tips = listOf(
                "Taste traditional grilled ćevapi paired with fragrant Bosnian coffee."
            ),
            bestSeason = "May to October",
            tags = listOf("europe", "culture", "nature"),
            aliases = listOf("bosnia"),
            imageAsset = "file:///android_asset/destinations/sarajevo.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.8f
        )
    )
}
