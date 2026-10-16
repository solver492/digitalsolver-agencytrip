package com.example.manasik.data.repository

import com.example.manasik.data.model.ServiceItem

object ServicesRepository {

    val allServices: List<ServiceItem>
        get() = getServices("FR")

    fun getServices(languageCode: String): List<ServiceItem> {
        return when (languageCode.uppercase()) {
            "AR" -> listOf(
                ServiceItem(
                    slug = "vols",
                    title = "حجوزات الطيران",
                    iconName = "Flight",
                    shortDesc = "احجز تذاكر طيرانك إلى مكة المكرمة، المدينة المنورة ومختلف أنحاء العالم بأفضل الأسعار.",
                    longTitle = "حجز تذاكر الطيران بأفضل الأسعار التنافسية",
                    details = "إمكانية الوصول لأفضل شركات الطيران (الخطوط السعودية، الخطوط التركية، الملكية المغربية، طيران الإمارات، والقطرية) مع أوزان إضافية مخصصة لماء زمزم.",
                    badge = "الأكثر طلباً"
                ),
                ServiceItem(
                    slug = "hotels",
                    title = "فنادق وإقامات",
                    iconName = "Hotel",
                    shortDesc = "اعثر على فندقك المثالي في مكة المكرمة والمدينة المنورة أمام الحرمين الشريفين.",
                    longTitle = "فنادق منتقاة بعناية على بعد خطوات من ساحات الحرمين",
                    details = "فنادق 3* و4* و5* على مقربة مباشرة من المسجد الحرام بمكة والمسجد النبوي الشريف بالمدينة، إضافة لخيارات فاخرة بجميع وجهاتنا.",
                    badge = "مُوصى به"
                ),
                ServiceItem(
                    slug = "transferts",
                    title = "المواصلات والنقل",
                    iconName = "DirectionsBus",
                    shortDesc = "تنقلات المطار وتوصيل خاص وسيارات عائلية مكيفة مع سائقين محترفين.",
                    longTitle = "سيارات خاصة ونقل VIP من وإلى المطار والفندق",
                    details = "سائق خاص ومكيف في استقبالكم فور الوصول (مطار جدة، المدينة، إسطنبول، مراكش...) لنقلكم إلى الفندق أو محطات قطار الحرمين بكل راحة.",
                    badge = "أساسي"
                ),
                ServiceItem(
                    slug = "guides",
                    title = "المزارات والإرشاد",
                    iconName = "Explore",
                    shortDesc = "مرشدون معتمدون ومرافقة دينية وتاريخية للمزارات الشريفة.",
                    longTitle = "زيارات إيمانية مأثورة وجولات تاريخية موجهة",
                    details = "مرشدون متمرسون يتحدثون العربية والفرنسية لمرافقتكم أثناء مناسك العمرة، زيارة مسجد قباء، جبل الرماة، وموقع غزوة أحد.",
                    badge = "روحاني"
                ),
                ServiceItem(
                    slug = "activites",
                    title = "الأنشطة والجولات",
                    iconName = "Map",
                    shortDesc = "رحلات سفاري صحراوية، غوص بالبحر الأحمر وأنشطة ترفيهية استثنائية.",
                    longTitle = "تجارب وأنشطة سياحية لا تُنسى",
                    details = "سفاري في رمال العلا الذهبية، غوص في أعماق البحر الأحمر بجدة وشرم الشيخ، وركوب المناطيد في كابادوكيا.",
                    badge = "مغامرة"
                ),
                ServiceItem(
                    slug = "esim",
                    title = "شريحة إنترنت eSIM",
                    iconName = "Wifi",
                    shortDesc = "ابقَ على اتصال دائم فور وصولك دون رسوم تجوال باهظة.",
                    longTitle = "باقات إنترنت عالية السرعة وتثبيت فوري",
                    details = "تفعيل في ثوانٍ عبر مسح رمز QR. اتصال إنترنت 4G/5G فائق السرعة لمكالمات واتساب وتطبيقات الحجوزات ونظام تحديد المواقع.",
                    badge = "عملي"
                ),
                ServiceItem(
                    slug = "location-voiture",
                    title = "تأجير السيارات",
                    iconName = "DirectionsCar",
                    shortDesc = "استأجر سيارات حديثة أو فان عائلي لتنقلات حرة ومريحة.",
                    longTitle = "أسطول سيارات حديث ومثالي للعائلات",
                    details = "أسعار واضحة مع كيلومترات غير محدودة وتأمين شامل مع خيار الاستلام والتسليم مباشرة بالمطار أو الفندق.",
                    badge = "حرية"
                ),
                ServiceItem(
                    slug = "yacht",
                    title = "رحلات اليخوت",
                    iconName = "DirectionsBoat",
                    shortDesc = "يخوت وجولات بحرية خاصة في البحر الأحمر والبحر المتوسط والخليج.",
                    longTitle = "رحلات بحرية فاخرة وقوارب خاصة",
                    details = "أيام بحرية ممتعة، جولات عند غروب الشمس ومناسبات خاصة مع طاقم محترف في جدة ودبي وجزر المتوسط.",
                    badge = "فخامة"
                ),
                ServiceItem(
                    slug = "bagages",
                    title = "خدمات الأمتعة",
                    iconName = "Luggage",
                    shortDesc = "حفظ ونقل الأمتعة لتتنقل بحرية وخفة طوال رحلتك.",
                    longTitle = "أمان تام وتوصيل مباشر للأمتعة إلى المطار",
                    details = "إمكانية ترك حقائبك بأمان خلال فترات الترانزيت أو في يوم المغادرة للاستمتاع بزياراتك دون حمل الأمتعة.",
                    badge = "راحة"
                ),
                ServiceItem(
                    slug = "indemnisation",
                    title = "تعويضات الطيران",
                    iconName = "MonetizationOn",
                    shortDesc = "تأخرت رحلتك أو أُلغيت؟ طالب بتعويض يصل إلى 600 € لكل مسافر.",
                    longTitle = "تحصيل مبسط وسريع لتعويضات تأخر الرحلات",
                    details = "يتولى فريقنا القانوني كافة الإجراءات مع شركات الطيران دون أي دفع مسبق. الرسوم فقط في حال النجاح في استلام التعويض.",
                    badge = "ضمان"
                )
            )

            "EN" -> listOf(
                ServiceItem(
                    slug = "vols",
                    title = "Flights",
                    iconName = "Flight",
                    shortDesc = "Book flights to Makkah, Madinah, and worldwide destinations at the best rates.",
                    longTitle = "Book airline tickets at guaranteed best prices",
                    details = "Access premium airlines (Saudia, Turkish Airlines, Royal Air Maroc, Emirates, Qatar Airways...) with optimized baggage allowance for Zamzam water.",
                    badge = "Popular"
                ),
                ServiceItem(
                    slug = "hotels",
                    title = "Hotels",
                    iconName = "Hotel",
                    shortDesc = "Find your hotel in Makkah, Madinah, or worldwide, facing the Haram or city center.",
                    longTitle = "Selected hotels in direct proximity to the Holy Sites",
                    details = "3*, 4*, and 5* hotels just steps from the Grand Mosque in Makkah and Prophet's Mosque in Madinah, plus a prestigious selection across global destinations.",
                    badge = "Recommended"
                ),
                ServiceItem(
                    slug = "transferts",
                    title = "Airport Transfers",
                    iconName = "DirectionsBus",
                    shortDesc = "Private airport transfers and shuttles operated by certified professional drivers.",
                    longTitle = "Private & VIP airport-to-hotel transfers",
                    details = "Air-conditioned private vehicle waiting upon your arrival (Jeddah, Madinah, Istanbul, Marrakech...) for smooth connections to your hotel or Haramain TGV station.",
                    badge = "Essential"
                ),
                ServiceItem(
                    slug = "guides",
                    title = "Guides & Ziyarat",
                    iconName = "Explore",
                    shortDesc = "Multilingual guides, cultural tours, and sacred Ziyarat visits with peace of mind.",
                    longTitle = "Sacred historical tours (Ziyarat) & cultural excursions",
                    details = "Certified guides to accompany you during Umrah rituals, Mount Hira visits, Quba Mosque, and historical battlefields of Uhud.",
                    badge = "Spiritual"
                ),
                ServiceItem(
                    slug = "activites",
                    title = "Activities & Tours",
                    iconName = "Map",
                    shortDesc = "Desert safaris, Red Sea diving, hot air balloon flights, and memorable activities.",
                    longTitle = "Discover unforgettable worldwide experiences",
                    details = "Red dune safaris in AlUla, coral reef diving in the Red Sea, sunrise hot air balloon flights in Cappadocia, and customized private excursions.",
                    badge = "Adventure"
                ),
                ServiceItem(
                    slug = "esim",
                    title = "International eSIM",
                    iconName = "Wifi",
                    shortDesc = "Stay connected immediately upon landing abroad without costly roaming fees.",
                    longTitle = "Instant high-speed mobile internet packages",
                    details = "One-click QR code installation. Reliable 4G/5G data for your WhatsApp calls, maps, and travel apps without swapping physical SIM cards.",
                    badge = "Practical"
                ),
                ServiceItem(
                    slug = "location-voiture",
                    title = "Car Rental",
                    iconName = "DirectionsCar",
                    shortDesc = "Rent modern sedans, family SUVs, or spacious vans for complete travel freedom.",
                    longTitle = "Modern vehicles tailored for individuals and families",
                    details = "Transparent all-inclusive rates with unlimited mileage, comprehensive insurance, and flexible airport or hotel pickup.",
                    badge = "Freedom"
                ),
                ServiceItem(
                    slug = "yacht",
                    title = "Yacht Charters",
                    iconName = "DirectionsBoat",
                    shortDesc = "Private yachts and custom cruises in the Red Sea, Mediterranean, and Gulf.",
                    longTitle = "Exclusive cruises and private yacht rentals",
                    details = "Sunset cruises, daytime island escapes, and private events with dedicated professional crew in Jeddah, Dubai, and Greek Islands.",
                    badge = "Prestige"
                ),
                ServiceItem(
                    slug = "bagages",
                    title = "Luggage Services",
                    iconName = "Luggage",
                    shortDesc = "Secure luggage storage and transfer services to travel light and relaxed.",
                    longTitle = "Safe storage and door-to-airport luggage transit",
                    details = "Drop off your bags during long layovers or final vacation days to explore unhindered, with direct airport delivery options.",
                    badge = "Comfort"
                ),
                ServiceItem(
                    slug = "indemnisation",
                    title = "Flight Compensation",
                    iconName = "MonetizationOn",
                    shortDesc = "Flight delayed or cancelled? Check your rights and claim up to €600 per passenger.",
                    longTitle = "Simplified flight delay and cancellation claims",
                    details = "Our partner legal team handles airline claims from start to finish with no upfront fees. You only pay a success fee upon compensation payout.",
                    badge = "Guaranteed"
                )
            )

            "ES" -> listOf(
                ServiceItem(
                    slug = "vols",
                    title = "Vuelos",
                    iconName = "Flight",
                    shortDesc = "Reserve vuelos a La Meca, Medina y destinos de todo el mundo al mejor precio.",
                    longTitle = "Billetes de avión al mejor precio garantizado",
                    details = "Acceso a las mejores aerolíneas (Saudia, Turkish Airlines, Royal Air Maroc, Emirates, Qatar Airways...) con equipaje adaptado para agua Zamzam.",
                    badge = "Popular"
                ),
                ServiceItem(
                    slug = "hotels",
                    title = "Hoteles",
                    iconName = "Hotel",
                    shortDesc = "Encuentre su hotel ideal en La Meca, Medina o en cualquier destino frente al Haram.",
                    longTitle = "Hoteles seleccionados junto a los Santos Lugares",
                    details = "Hoteles de 3*, 4* y 5* a pocos pasos de la Gran Mezquita en La Meca y de la mezquita del Profeta en Medina, más opciones prémium por el mundo.",
                    badge = "Recomendado"
                ),
                ServiceItem(
                    slug = "transferts",
                    title = "Traslados al Aeropuerto",
                    iconName = "DirectionsBus",
                    shortDesc = "Traslados privados al aeropuerto y vehículos con chóferes profesionales.",
                    longTitle = "Traslados privados y VIP aeropuerto-hotel",
                    details = "Vehículo privado climatizado esperando a su llegada (Yeda, Medina, Estambul, Marrakech...) para un trayecto seguro y cómodo a su hotel o tren Haramain.",
                    badge = "Esencial"
                ),
                ServiceItem(
                    slug = "guides",
                    title = "Guías y Ziyarat",
                    iconName = "Explore",
                    shortDesc = "Guías multilingües, visitas guiadas religiosas y recorridos culturales de confianza.",
                    longTitle = "Visitas piadosas (Ziyarat) y excursiones históricas",
                    details = "Guías certificados para acompañarle en los ritos de la Umrah, ascenso a la cueva de Hira, mezquita de Quba y lugares de Uhud.",
                    badge = "Espiritual"
                ),
                ServiceItem(
                    slug = "activites",
                    title = "Actividades y Excursiones",
                    iconName = "Map",
                    shortDesc = "Safaris en el desierto, buceo en el Mar Rojo, paseos en globo y aventuras inolvidables.",
                    longTitle = "Descubra experiencias únicas por el mundo",
                    details = "Safaris en las dunas de AlUla, buceo en el Mar Rojo, vuelos en globo al amanecer en Capadocia y excursiones privadas.",
                    badge = "Aventura"
                ),
                ServiceItem(
                    slug = "esim",
                    title = "eSIM Internacional",
                    iconName = "Wifi",
                    shortDesc = "Permanezca conectado al aterrizar sin pagar costosas tarifas de roaming.",
                    longTitle = "Planes de internet de alta velocidad al instante",
                    details = "Instalación en 1 clic mediante código QR. Conexión 4G/5G fiable para llamadas de WhatsApp, mapas y aplicaciones de viaje.",
                    badge = "Práctico"
                ),
                ServiceItem(
                    slug = "location-voiture",
                    title = "Alquiler de Coches",
                    iconName = "DirectionsCar",
                    shortDesc = "Alquile berlinas, todoterrenos o furgonetas familiares para viajar con total libertad.",
                    longTitle = "Flota moderna ideal para familias y grupos",
                    details = "Precios claros con kilometraje ilimitado, seguro a todo riesgo y recogida en el aeropuerto o en su hotel.",
                    badge = "Libertad"
                ),
                ServiceItem(
                    slug = "yacht",
                    title = "Alquiler de Yates",
                    iconName = "DirectionsBoat",
                    shortDesc = "Yates y paseos marítimos privados en el Mar Rojo, Mediterráneo o Golfo.",
                    longTitle = "Cruceros exclusivos y barcos privados",
                    details = "Jornadas en el mar, salidas al atardecer y eventos privados con tripulación dedicada en Yeda, Dubái y las islas griegas.",
                    badge = "Prestigio"
                ),
                ServiceItem(
                    slug = "bagages",
                    title = "Custodia de Equipaje",
                    iconName = "Luggage",
                    shortDesc = "Guarda y transporte de equipajes para viajar ligero de equipaje.",
                    longTitle = "Almacenamiento seguro y entrega en el aeropuerto",
                    details = "Deposite sus maletas en sus escalas o últimos días para disfrutar de sus visitas sin cargar peso, con entrega directa en el aeropuerto.",
                    badge = "Confort"
                ),
                ServiceItem(
                    slug = "indemnisation",
                    title = "Compensación de Vuelos",
                    iconName = "MonetizationOn",
                    shortDesc = "¿Vuelo cancelado o con retraso? Reclame hasta 600 € de indemnización.",
                    longTitle = "Recuperación sencilla de compensaciones de vuelo",
                    details = "Nuestro equipo legal se encarga de todo con las aerolíneas sin adelanto de gastos. Solo cobramos en caso de éxito.",
                    badge = "Garantía"
                )
            )

            else -> listOf(
                ServiceItem(
                    slug = "vols",
                    title = "Vols",
                    iconName = "Flight",
                    shortDesc = "Réservez vos vols vers La Mecque, Médine et partout dans le monde au meilleur prix.",
                    longTitle = "Réservez vos billets d'avion au meilleur tarif",
                    details = "Accédez aux meilleures compagnies aériennes (Saudia, Turkish Airlines, Royal Air Maroc, Emirates, Qatar Airways...) avec franchises bagages optimisées pour le transport d'eau de Zamzam et vos séjours en famille.",
                    badge = "Populaire"
                ),
                ServiceItem(
                    slug = "hotels",
                    title = "Hôtels",
                    iconName = "Hotel",
                    shortDesc = "Trouvez votre hôtel à La Mecque, Médine ou ailleurs, face au Haram ou en centre-ville.",
                    longTitle = "Hôtels sélectionnés à proximité immédiate des Lieux saints",
                    details = "Hôtels 3*, 4* et 5* à quelques pas de la Grande Mosquée (al-Masjid al-Haram) à La Mecque et du Masjid an-Nabawi à Médine, ainsi qu'une sélection prestigieuse dans toutes nos destinations mondiales.",
                    badge = "Recommandé"
                ),
                ServiceItem(
                    slug = "transferts",
                    title = "Transferts aéroport",
                    iconName = "DirectionsBus",
                    shortDesc = "Transferts aéroport et navettes privées organisés avec chauffeurs professionnels.",
                    longTitle = "Navettes privées et VIP aéroport-hôtel",
                    details = "Chauffeur privé climatisé vous attendant à l'arrivée (Djeddah, Médine, Istanbul, Marrakech...) pour vos liaisons vers votre hôtel ou les gares TGV Haramain en toute sérénité.",
                    badge = "Essentiel"
                ),
                ServiceItem(
                    slug = "guides",
                    title = "Guides & Ziyarat",
                    iconName = "Explore",
                    shortDesc = "Guides francophones, visites guidées et Ziyarat pour explorer sereinement.",
                    longTitle = "Visites pieuses (Ziyarat) et excursions culturelles",
                    details = "Guides certifiés francophones et arabophones pour vous accompagner lors des rites de l'Omra, de l'ascension du mont de la Lumière (Hira), de la visite de Quba et des batailles d'Uhud.",
                    badge = "Spirituel"
                ),
                ServiceItem(
                    slug = "activites",
                    title = "Activités & Excursions",
                    iconName = "Map",
                    shortDesc = "Excursions, balades dans le désert, safari et randonnées lors de votre séjour.",
                    longTitle = "Découvrez des expériences inoubliables",
                    details = "Safaris dans les dunes rouges d'AlUla, plongée sous-marine en mer Rouge à Djeddah ou Charm el-Cheikh, vol en montgolfière en Cappadoce et visites guidées privées.",
                    badge = "Aventure"
                ),
                ServiceItem(
                    slug = "esim",
                    title = "eSIM Internationale",
                    iconName = "Wifi",
                    shortDesc = "Restez connecté à l'étranger dès l'atterrissage sans frais d'itinérance excessifs.",
                    longTitle = "Forfaits Internet haute vitesse instantanés",
                    details = "Installation en 1 clic par QR code. Données 4G/5G fiables pour vos appels WhatsApp, GPS et partage de souvenirs sans changer de carte SIM physique.",
                    badge = "Pratique"
                ),
                ServiceItem(
                    slug = "location-voiture",
                    title = "Location de voiture",
                    iconName = "DirectionsCar",
                    shortDesc = "Louez une berline, un SUV ou un van familial pour vos déplacements en toute liberté.",
                    longTitle = "Véhicules récents et adaptés aux familles",
                    details = "Tarifs transparents tout compris avec kilométrage illimité, assurance complète et possibilité de prise en charge directement à l'aéroport ou à votre hôtel.",
                    badge = "Liberté"
                ),
                ServiceItem(
                    slug = "yacht",
                    title = "Location de yacht",
                    iconName = "DirectionsBoat",
                    shortDesc = "Yachts et croisières privées sur mesure en mer Rouge, Méditerranée ou Golfe.",
                    longTitle = "Croisières exclusives et bateaux privés",
                    details = "Journées en mer, sorties au coucher du soleil et événements privés avec équipage dédié à Djeddah, Dubaï ou dans les îles grecques.",
                    badge = "Prestige"
                ),
                ServiceItem(
                    slug = "bagages",
                    title = "Bagages & Consignes",
                    iconName = "Luggage",
                    shortDesc = "Consigne et services de transport bagages pour voyager l'esprit léger.",
                    longTitle = "Stockage sécurisé et transfert de vos valises",
                    details = "Déposez vos valises lors de vos escales ou derniers jours pour profiter de vos visites sans être encombré, avec option de livraison directe à l'aéroport.",
                    badge = "Confort"
                ),
                ServiceItem(
                    slug = "indemnisation",
                    title = "Indemnisation vol",
                    iconName = "MonetizationOn",
                    shortDesc = "Vol retardé ou annulé ? Vérifiez vos droits et réclamez jusqu'à 600 € d'indemnité.",
                    longTitle = "Recouvrement simplifié des indemnités de vol",
                    details = "Notre équipe juridique partenaire s'occupe de toutes les démarches auprès des compagnies sans avance de frais. Vous ne payez qu'en cas de succès.",
                    badge = "Garantie"
                )
            )
        }
    }
}
