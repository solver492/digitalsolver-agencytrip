package com.example.manasik.data.repository

import com.example.manasik.data.model.TravelPackage

object PackagesRepository {

    val allPackages: List<TravelPackage>
        get() = getPackages("FR")

    fun getPackages(languageCode: String): List<TravelPackage> {
        return when (languageCode.uppercase()) {
            "AR" -> listOf(
                TravelPackage(
                    id = "omra-serenite",
                    title = "باقة عمرة السكينة والراحة",
                    description = "رحلة إيمانية لا تُنسى مع إقامة 5 نجوم على بعد خطوات من الحرمين الشريفين، قطار الحرمين السريع وإرشاد ديني متميز.",
                    duration = "12 يوم / 11 ليلة",
                    capacity = "فردي، ثنائي وعائلات",
                    location = "المدينة المنورة ومكة المكرمة",
                    price = "ابتداءً من 1,490 €",
                    rating = 5.0f,
                    reviewsCount = 184,
                    imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
                    highlights = listOf(
                        "طيران مباشر أو ترانزيت مريح مع وزن أمتعة مخصص لماء زمزم",
                        "فندق 5 نجوم أمام الحرم المكي الشريف مباشرة (أبراج الساعة / جبل عمر)",
                        "فندق 5 نجوم مركزي بالمدينة المنورة على بعد 150م من الروضة الشريفة",
                        "تذاكر قطار الحرمين السريع الفاخر مشمولة",
                        "زيارات ومزارات إسلامية موجهة مع مرشد متمرس",
                        "رعاية ومرافقة على مدار الساعة 24/7 وتأشيرة نسك"
                    )
                ),
                TravelPackage(
                    id = "balneaire-famille",
                    title = "إجازة عائلية على شاطئ البحر",
                    description = "استمتع بعطلة مريحة على شاطئ البحر الأحمر: استرخاء، نوادي للأطفال، أنشطة بحرية وذكريات عائلية رائعة.",
                    duration = "7 أيام / 6 ليالٍ",
                    capacity = "حتى 10 أفراد",
                    location = "شرم الشيخ والبحر الأحمر",
                    price = "ابتداءً من 690 €",
                    rating = 4.9f,
                    reviewsCount = 92,
                    imageAsset = "file:///android_asset/images/packege-1.jpg",
                    highlights = listOf(
                        "منتجع 5 نجوم شامل كلياً مع شاطئ خاص",
                        "مسابح مدفأة وألعاب مائية ممتعة للأطفال",
                        "رحلة بحرية باليخت للغطس ومشاهدة الشعاب المرجانية",
                        "نقل خاص ذهاباً وإياباً من وإلى المطار"
                    )
                ),
                TravelPackage(
                    id = "escapade-nature",
                    title = "مغامرة بين أحضان الطبيعة والجبال",
                    description = "إقامة هادئة بين الوديان الخضراء، مزارع الطبيعة والتقاليد الأصيلة في قلب جبال الأطلس.",
                    duration = "5 أيام / 4 ليالٍ",
                    capacity = "حتى 8 أفراد",
                    location = "وادي أوريكا والأطلس الكبير",
                    price = "ابتداءً من 450 €",
                    rating = 4.8f,
                    reviewsCount = 64,
                    imageAsset = "file:///android_asset/images/packege-2.jpg",
                    highlights = listOf(
                        "نُزل بيئي ساحر مع إطلالة بانورامية ساحرة",
                        "جولات مشي بصحبة مرشد نحو الشلالات الطبيعية",
                        "تذوق المنتجات المحلية الأصيلة وشاي الأعشاب",
                        "سائق خاص طيلة فترة الرحلة"
                    )
                ),
                TravelPackage(
                    id = "weekend-iles",
                    title = "عطلة نهاية أسبوع في جزر ساحرة",
                    description = "أيام مبهجة تحت شمس البحر الأبيض المتوسط، مياه فيروزية، خلجان سرية ومأكولات بحرية شهية.",
                    duration = "4 أيام / 3 ليالٍ",
                    capacity = "حتى 6 أفراد",
                    location = "جزر البحر الأبيض المتوسط",
                    price = "ابتداءً من 520 €",
                    rating = 4.9f,
                    reviewsCount = 78,
                    imageAsset = "file:///android_asset/images/packege-3.jpg",
                    highlights = listOf(
                        "فندق بوتيك مطل على البحر مع إفطار فاخر",
                        "جولة خاصة على متن القارب عند الغروب",
                        "زيارة القرى الأثرية والبيوت البيضاء التقليدية"
                    )
                ),
                TravelPackage(
                    id = "istanbul-cappadoce",
                    title = "إسطنبول وسحر كابادوكيا",
                    description = "المزيج المثالي بين عراقة القصور العثمانية على مضيق البوسفور وسحر مناطيد كابادوكيا الخيالية.",
                    duration = "8 أيام / 7 ليالٍ",
                    capacity = "2 إلى 12 فرداً",
                    location = "إسطنبول وكابادوكيا",
                    price = "ابتداءً من 890 €",
                    rating = 5.0f,
                    reviewsCount = 115,
                    imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
                    highlights = listOf(
                        "4 ليالٍ في إسطنبول بفندق فاخر في منطقة السلطان أحمد",
                        "3 ليالٍ في فندق كهفي ساحر في غوريمي (كابادوكيا)",
                        "طيران داخلي إسطنبول - كابادوكيا مشمول",
                        "رحلة بالمنطاد الهوائي عند شروق الشمس",
                        "جولة بحرية خاصة في مضيق البوسفور"
                    )
                )
            )

            "EN" -> listOf(
                TravelPackage(
                    id = "omra-serenite",
                    title = "Umrah Serenity & Comfort Package",
                    description = "An unforgettable spiritual pilgrimage with 5* hotels steps away from the Holy Mosques, Haramain high-speed rail, and dedicated guidance.",
                    duration = "12D / 11N",
                    capacity = "Solo, couple & families",
                    location = "Madinah & Makkah",
                    price = "Starting from €1,490",
                    rating = 5.0f,
                    reviewsCount = 184,
                    imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
                    highlights = listOf(
                        "Direct flights or short layovers with Zamzam water luggage allowance",
                        "5* Hotel facing the Haram in Makkah (Clock Tower / Jabal Omar)",
                        "5* Central Hotel in Madinah 150m from the Prophet's Rawdah",
                        "Haramain High-Speed Train tickets included",
                        "Guided historical Ziyarat tours with multilingual guide",
                        "24/7 on-site assistance and Nusuk visa management"
                    )
                ),
                TravelPackage(
                    id = "balneaire-famille",
                    title = "Family Seaside Holiday",
                    description = "Enjoy a relaxing getaway on the Red Sea coast: leisure, kids clubs, aquatic sports, and memorable shared moments.",
                    duration = "7D / 6N",
                    capacity = "Up to 10 persons",
                    location = "Sharm El Sheikh & Red Sea",
                    price = "Starting from €690",
                    rating = 4.9f,
                    reviewsCount = 92,
                    imageAsset = "file:///android_asset/images/packege-1.jpg",
                    highlights = listOf(
                        "5* All-inclusive resort with private sandy beach",
                        "Heated pools and thrilling waterpark for kids",
                        "Private boat snorkeling tour to coral reefs",
                        "Private roundtrip airport transfers"
                    )
                ),
                TravelPackage(
                    id = "escapade-nature",
                    title = "Nature & Atlas Mountains Escape",
                    description = "A peaceful stay between gentle rivers, green valleys, and authentic Berber hospitality in the heart of the mountains.",
                    duration = "5D / 4N",
                    capacity = "Up to 8 persons",
                    location = "Ourika Valley & Atlas",
                    price = "Starting from €450",
                    rating = 4.8f,
                    reviewsCount = 64,
                    imageAsset = "file:///android_asset/images/packege-2.jpg",
                    highlights = listOf(
                        "Charming eco-lodge with panoramic valley view",
                        "Guided treks to scenic mountain waterfalls",
                        "Local culinary tastings and traditional tea",
                        "Private chauffeur throughout the stay"
                    )
                ),
                TravelPackage(
                    id = "weekend-iles",
                    title = "Dream Mediterranean Island Weekend",
                    description = "A few sunny days enjoying turquoise waters, secret coves, and fresh Mediterranean gastronomy.",
                    duration = "4D / 3N",
                    capacity = "Up to 6 persons",
                    location = "Mediterranean Islands",
                    price = "Starting from €520",
                    rating = 4.9f,
                    reviewsCount = 78,
                    imageAsset = "file:///android_asset/images/packege-3.jpg",
                    highlights = listOf(
                        "Sea-view boutique hotel with gourmet breakfast",
                        "Private catamaran cruise at golden sunset",
                        "Tour of picturesque whitewashed island villages"
                    )
                ),
                TravelPackage(
                    id = "istanbul-cappadoce",
                    title = "Magical Istanbul & Cappadocia",
                    description = "The ultimate combination between Ottoman majesty on the Bosphorus and the enchanting fairy chimneys of Cappadocia.",
                    duration = "8D / 7N",
                    capacity = "2 to 12 persons",
                    location = "Istanbul & Cappadocia",
                    price = "Starting from €890",
                    rating = 5.0f,
                    reviewsCount = 115,
                    imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
                    highlights = listOf(
                        "4 nights in Istanbul charming hotel in Sultanahmet",
                        "3 nights in cave hotel in Göreme (Cappadocia)",
                        "Domestic flight Istanbul - Cappadocia included",
                        "Sunrise hot air balloon flight included",
                        "Private cruise along the Bosphorus Strait"
                    )
                )
            )

            "ES" -> listOf(
                TravelPackage(
                    id = "omra-serenite",
                    title = "Paquete Umrah Serenidad y Confort",
                    description = "Una peregrinación inolvidable con hoteles de 5* a pocos pasos de las Sagradas Mezquitas, tren de alta velocidad Haramain y asesoría espiritual.",
                    duration = "12D / 11N",
                    capacity = "Individual, parejas y familias",
                    location = "Medina y La Meca",
                    price = "Desde 1.490 €",
                    rating = 5.0f,
                    reviewsCount = 184,
                    imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
                    highlights = listOf(
                        "Vuelos regulares directos con franquicia de equipaje para agua Zamzam",
                        "Hotel 5* frente al Haram en La Meca (Torre del Reloj / Jabal Omar)",
                        "Hotel 5* central en Medina a 150m de la Rawdah",
                        "Billetes de tren de alta velocidad Haramain incluidos",
                        "Visitas guiadas históricas Ziyarat con guía bilingüe",
                        "Asistencia 24/7 en destino y visado Nusuk incluido"
                    )
                ),
                TravelPackage(
                    id = "balneaire-famille",
                    title = "Estancia Costera en Familia",
                    description = "Disfrute de una escapada relajante junto al Mar Rojo: descanso, clubes infantiles, deportes acuáticos y momentos inolvidables.",
                    duration = "7D / 6N",
                    capacity = "Hasta 10 pers.",
                    location = "Sharm el-Sheij y Mar Rojo",
                    price = "Desde 690 €",
                    rating = 4.9f,
                    reviewsCount = 92,
                    imageAsset = "file:///android_asset/images/packege-1.jpg",
                    highlights = listOf(
                        "Resort 5* todo incluido con playa privada",
                        "Piscinas climatizadas y parque acuático",
                        "Excursión en barco para snorkel en arrecifes de coral",
                        "Traslados privados ida y vuelta al aeropuerto"
                    )
                ),
                TravelPackage(
                    id = "escapade-nature",
                    title = "Escapada Naturaleza y Montaña",
                    description = "Una estancia serena entre valles verdes, hospitalidad auténtica y paisajes espectaculares de la cordillera del Atlas.",
                    duration = "5D / 4N",
                    capacity = "Hasta 8 pers.",
                    location = "Valle de Ourika y Atlas",
                    price = "Desde 450 €",
                    rating = 4.8f,
                    reviewsCount = 64,
                    imageAsset = "file:///android_asset/images/packege-2.jpg",
                    highlights = listOf(
                        "Lodge ecológico con vista panorámica al valle",
                        "Rutas de senderismo guiadas hacia cascadas",
                        "Degustación de productos locales y té tradicional",
                        "Conductor privado durante toda la estancia"
                    )
                ),
                TravelPackage(
                    id = "weekend-iles",
                    title = "Fin de Semana en Islas Mediterráneas",
                    description = "Días de ensueño bajo el sol mediterráneo, aguas turquesas, calas secretas y exquisita gastronomía marinera.",
                    duration = "4D / 3N",
                    capacity = "Hasta 6 pers.",
                    location = "Islas Mediterráneas",
                    price = "Desde 520 €",
                    rating = 4.9f,
                    reviewsCount = 78,
                    imageAsset = "file:///android_asset/images/packege-3.jpg",
                    highlights = listOf(
                        "Hotel boutique con vistas al mar y desayuno gourmet",
                        "Paseo privado en catamarán al atardecer",
                        "Recorrido por pueblos costeros con encanto"
                    )
                ),
                TravelPackage(
                    id = "istanbul-cappadoce",
                    title = "Estambul y la Mágica Capadocia",
                    description = "La combinación perfecta entre el esplendor otomano del Bósforo y el encanto de los globos aerostáticos en Capadocia.",
                    duration = "8D / 7N",
                    capacity = "2 a 12 pers.",
                    location = "Estambul y Capadocia",
                    price = "Desde 890 €",
                    rating = 5.0f,
                    reviewsCount = 115,
                    imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
                    highlights = listOf(
                        "4 noches en Estambul en hotel con encanto en Sultanahmet",
                        "3 noches en hotel cueva en Göreme (Capadocia)",
                        "Vuelo doméstico Estambul - Capadocia incluido",
                        "Paseo en globo aerostático al amanecer",
                        "Crucero privado por el estrecho del Bósforo"
                    )
                )
            )

            else -> listOf(
                TravelPackage(
                    id = "omra-serenite",
                    title = "Forfait Omra Sérénité & Confort",
                    description = "Un pèlerinage inoubliable avec hébergement 5* à quelques pas des deux Saintes Mosquées, transferts TGV Haramain et encadrement spirituel personnalisé.",
                    duration = "12J / 11N",
                    capacity = "Individuel, couple & famille",
                    location = "Médine & La Mecque",
                    price = "À partir de 1 490 €",
                    rating = 5.0f,
                    reviewsCount = 184,
                    imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
                    highlights = listOf(
                        "Vols réguliers directs ou avec escale courte",
                        "Hôtel 5* face au Haram à La Mecque (Clock Tower / Jabal Omar)",
                        "Hôtel 5* central à Médine à 150m de la Rawdah",
                        "Train à grande vitesse Haramain High-Speed Rail inclus",
                        "Visites guidées Ziyarat avec guide bilingue",
                        "Assistance 24/7 sur place et visa Nusuk inclus"
                    )
                ),
                TravelPackage(
                    id = "balneaire-famille",
                    title = "Séjour balnéaire en famille",
                    description = "Profitez d'une escapade reposante en bord de mer : farniente, clubs enfants, activités nautiques et moments inoubliables partagés.",
                    duration = "7J / 6N",
                    capacity = "Jusqu'à 10 pers.",
                    location = "Charm el-Cheikh & Mer Rouge",
                    price = "À partir de 690 €",
                    rating = 4.9f,
                    reviewsCount = 92,
                    imageAsset = "file:///android_asset/images/packege-1.jpg",
                    highlights = listOf(
                        "Resort 5* tout inclus en bord de plage privée",
                        "Piscines chauffées et parc aquatique",
                        "Excursion en bateau snorkeling aux récifs coralliens",
                        "Transferts privés aller-retour aéroport"
                    )
                ),
                TravelPackage(
                    id = "escapade-nature",
                    title = "Escapade nature au fil de l'eau",
                    description = "Un séjour au calme, entre rivière, vallées verdoyantes et découvertes locales authentiques au cœur des grands espaces.",
                    duration = "5J / 4N",
                    capacity = "Jusqu'à 8 pers.",
                    location = "Vallée d'Ourika & Atlas",
                    price = "À partir de 450 €",
                    rating = 4.8f,
                    reviewsCount = 64,
                    imageAsset = "file:///android_asset/images/packege-2.jpg",
                    highlights = listOf(
                        "Lodge écologique de charme avec vue panoramique",
                        "Randonnées guidées vers les cascades",
                        "Dégustation de produits du terroir et thé traditionnel",
                        "Chauffeur privé durant tout le séjour"
                    )
                ),
                TravelPackage(
                    id = "weekend-iles",
                    title = "Week-end sur une île de rêve",
                    description = "Quelques jours pour profiter du soleil méditerranéen, des eaux turquoise, des criques secrètes et de la gastronomie locale.",
                    duration = "4J / 3N",
                    capacity = "Jusqu'à 6 pers.",
                    location = "Îles méditerranéennes",
                    price = "À partir de 520 €",
                    rating = 4.9f,
                    reviewsCount = 78,
                    imageAsset = "file:///android_asset/images/packege-3.jpg",
                    highlights = listOf(
                        "Hôtel boutique vue mer avec petit-déjeuner gourmand",
                        "Sortie privée en catamaran au coucher du soleil",
                        "Visite des villages typiques aux maisons blanchies à la chaux"
                    )
                ),
                TravelPackage(
                    id = "istanbul-cappadoce",
                    title = "Istanbul & Cappadoce Magique",
                    description = "Le combiné idéal entre le faste ottoman sur le Bosphore et l'envoûtement des cheminées de fées de Cappadoce.",
                    duration = "8J / 7N",
                    capacity = "2 à 12 pers.",
                    location = "Istanbul & Cappadoce",
                    price = "À partir de 890 €",
                    rating = 5.0f,
                    reviewsCount = 115,
                    imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
                    highlights = listOf(
                        "4 nuits à Istanbul en hôtel de charme dans Sultanahmet",
                        "3 nuits en hôtel troglodytique à Göreme (Cappadoce)",
                        "Vol intérieur Istanbul - Cappadoce inclus",
                        "Vol en montgolfière à l'aube inclus",
                        "Croisière privée sur le Bosphore"
                    )
                )
            )
        }
    }
}
