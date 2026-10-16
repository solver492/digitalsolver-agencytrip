package com.example.manasik.data.repository

import com.example.manasik.data.model.Destination

object DestinationsRepository {

    val allDestinations: List<Destination>
        get() = getDestinations("FR")

    fun getDestinations(languageCode: String): List<Destination> {
        val base = frenchDestinations
        return when (languageCode.uppercase()) {
            "AR" -> base.map { dest ->
                when (dest.slug) {
                    "la-mecque" -> dest.copy(
                        name = "مكة المكرمة",
                        country = "المملكة العربية السعودية",
                        region = "الشرق الأوسط",
                        tagline = "مهوى أفئدة المسلمين، وقبلة العالم ومهبط الوحي الشريف.",
                        intro = "مكة المكرمة هي أقدس بقاع الأرض، تحتضن المسجد الحرام والكعبة المشرفة التي يتجه إليها أكثر من ملياري مسلم في صلواتهم. أداء مناسك العمرة أو الحج في مكة تجربة إيمانية فريدة تملأ القلب سكينة وروحانية.",
                        bestSeason = "العمرة متاحة طوال العام؛ الحج في الميقات الشرعي السنوي",
                        highlights = listOf(
                            "الطواف بالكعبة المشرفة واستلام الحجر الأسود",
                            "السعي بين الصفا والمروة",
                            "الشرب من ماء زمزم المبارك",
                            "جبل النور وغار حراء مهبط الوحي الأول",
                            "صعيد عرفات الطاهر ومسجد نمرة",
                            "مشعر منى ومزدلفة"
                        )
                    )
                    "medine" -> dest.copy(
                        name = "المدينة المنورة",
                        country = "المملكة العربية السعودية",
                        region = "الشرق الأوسط",
                        tagline = "طيبة الطيبة، دار الهجرة ومأوى السلام وسكينة الروح.",
                        intro = "المدينة المنورة، مدينة رسول الله ﷺ، تأسر القلوب بمسجدها النبوي الشريف وقبته الخضراء والروضة الشريفة. وجهة الطمأنينة والهدوء والزيارات الإيمانية العطرة.",
                        bestSeason = "الربيع والخريف لأجواء معتدلة وممتعة",
                        highlights = listOf(
                            "المسجد النبوي الشريف والروضة المباركة",
                            "مسجد قباء أول مسجد أُسس في الإسلام",
                            "مقبرة البقيع ومزارات الصحابة الكرام",
                            "مسجد القبلتين التاريخي",
                            "جبل أحد ومقبرة شهداء أحد"
                        )
                    )
                    "djeddah" -> dest.copy(
                        name = "جدة",
                        country = "المملكة العربية السعودية",
                        region = "الشرق الأوسط",
                        tagline = "عروس البحر الأحمر، وبوابة الحرمين الشريفين التاريخية.",
                        intro = "مدينة جدة الساحلية التاريخية، تمزج بين عراقة حي البلد المسجل في اليونسكو برواشينه التراثية وشواطئ الكورنيش والأنشطة البحرية الحديثة.",
                        bestSeason = "من نوفمبر إلى مارس لأجواء بحرية عليلة",
                        highlights = listOf(
                            "حي البلد التاريخي ببيوته التراثية وأسواره القديمة",
                            "نافورة الملك فهد الأطول في العالم على الكورنيش",
                            "واجهة جدة البحرية والمنتجعات الراقية",
                            "رحلات الغوص والاستجمام في أعماق البحر الأحمر"
                        )
                    )
                    "alula" -> dest.copy(
                        name = "العُلا",
                        country = "المملكة العربية السعودية",
                        region = "الشرق الأوسط",
                        tagline = "متحف حي مفتوح وسط سحر رمال وتاريخ الصحراء النبطية.",
                        intro = "العُلا وجهة أثرية عالمية استثنائية، تحتضن موقع الحِجر النبطي (مدائن صالح) المحفور في الصخور الرملية وواحات النخيل ومسرح مرايا العاكس.",
                        bestSeason = "من أكتوبر إلى أبريل",
                        highlights = listOf(
                            "موقع الحِجر الأثري المسجل في قائمة التراث العالمي (اليونسكو)",
                            "صخرة الفيل الشهيرة ومطل حرة عويرض",
                            "بلدة العلا القديمة وواحة النخيل الغناء",
                            "قاعة مرايا الأيقونية الأكبر في العالم"
                        )
                    )
                    "riyad" -> dest.copy(
                        name = "الرياض",
                        country = "المملكة العربية السعودية",
                        region = "الشرق الأوسط",
                        tagline = "عاصمة نجد النابضة، تلاقي الأصالة والنهضة المستقبلية.",
                        intro = "تجمع الرياض بين ناطحات السحاب العملاقة والتراث النجدي الأصيل في الدرعية التاريخية مهد الدولة السعودية الأولى.",
                        bestSeason = "من نوفمبر إلى مارس"
                    )
                    "istanbul" -> dest.copy(
                        name = "إسطنبول",
                        country = "تركيا",
                        region = "أوروبا / آسيا",
                        tagline = "ملتقى القارات وسحر العمارة العثمانية على ضفاف البوسفور.",
                        intro = "إسطنبول مدينة التاريخ العريق بمساجدها المذهلة مثل جامع آيا صوفيا والجامع الأزرق وقصر توبكابي وأسواقها التراثية.",
                        bestSeason = "من أبريل إلى يونيو ومن سبتمبر إلى نوفمبر"
                    )
                    "cappadoce" -> dest.copy(
                        name = "كابادوكيا",
                        country = "تركيا",
                        region = "أوروبا / آسيا",
                        tagline = "مداخن الجنيات ومناطيد الهواء في مشهد طبيعي خيالي.",
                        intro = "منطقة كابادوكيا الساحرة تشتهر بتكويناتها الصخرية الفريدة وفنادق الكهوف ورحلات المناطيد الهوائية عند بزوغ الفجر.",
                        bestSeason = "من مايو إلى أكتوبر"
                    )
                    "dubai" -> dest.copy(
                        name = "دبي",
                        country = "الإمارات العربية المتحدة",
                        region = "الشرق الأوسط",
                        tagline = "مدينة المستقبل، التسوق الفاخر والمعالم المعمارية المذهلة.",
                        intro = "وجهة الابتكار والرفاهية، حيث برج خليفة الأعلى عالمياً وجزر النخلة والمنتجعات الشاطئية ورحلات السفاري.",
                        bestSeason = "من نوفمبر إلى أبريل"
                    )
                    "marrakech" -> dest.copy(
                        name = "مراكش",
                        country = "المغرب",
                        region = "شمال إفريقيا",
                        tagline = "المدينة الحمراء، سحر جامع الفنا وعراقة القصور والرياضات.",
                        intro = "عاصمة السياحة المغربية، تأسرك بساحة جامع الفنا وصومعة الكتبية وحدائق ماجوريل وأسواق المدينة العتيقة.",
                        bestSeason = "من مارس إلى مايو ومن سبتمبر إلى نوفمبر"
                    )
                    "le-caire" -> dest.copy(
                        name = "القاهرة",
                        country = "مصر",
                        region = "شمال إفريقيا",
                        tagline = "مدينة الألف مئذنة وأهرامات الجيزة الخالدة على ضفاف النيل.",
                        intro = "عاصمة الحضارة الفرعونية والإسلامية، بأهرامات الجيزة وتمثال أبو الهول والمتحف المصري الكبير وخان الخليلي.",
                        bestSeason = "من أكتوبر إلى أبريل"
                    )
                    "petra" -> dest.copy(
                        name = "البتراء",
                        country = "الأردن",
                        region = "الشرق الأوسط",
                        tagline = "المدينة الوردية المنحوتة في الصخر، إحدى عجائب الدنيا السبع.",
                        intro = "كنز الأردن وعاصمة الأنباط القديمة، بممر السيق والخزينة الشامخة والدير المحفور في قلب الجبل.",
                        bestSeason = "من مارس إلى مايو ومن سبتمبر إلى نوفمبر"
                    )
                    "maldives" -> dest.copy(
                        name = "المالديف",
                        country = "المالديف",
                        region = "المحيط الهندي",
                        tagline = "جزر الفيروز، الفلل المائية وشواطئ الاستجمام الساحرة.",
                        intro = "جنة استوائية تطفو على المحيط الهندي، مثالية لشهر العسل والاسترخاء التام وتجارب الغوص بين الشعاب المرجانية.",
                        bestSeason = "من ديسمبر إلى أبريل"
                    )
                    else -> dest
                }
            }
            "EN" -> base.map { dest ->
                when (dest.slug) {
                    "la-mecque" -> dest.copy(
                        name = "Makkah",
                        country = "Saudi Arabia",
                        region = "Middle East",
                        tagline = "The spiritual heart of Islam and sacred destination of millions.",
                        intro = "Makkah is the holiest city in Islam, birthplace of Prophet Muhammad and sanctuary of the Holy Kaaba. Performing Umrah or Hajj here is a life-transforming, profoundly uplifting spiritual journey.",
                        bestSeason = "Umrah available year-round; Hajj during the Islamic lunar calendar dates"
                    )
                    "medine" -> dest.copy(
                        name = "Madinah",
                        country = "Saudi Arabia",
                        region = "Middle East",
                        tagline = "The Radiant City, sanctuary of deep peace and spiritual solace.",
                        intro = "Madinah hosts the Prophet's Mosque (al-Masjid an-Nabawi) and the revered Rawdah. Pilgrims from all over the world come to pray and experience its matchless serenity.",
                        bestSeason = "Spring and autumn for gentle, pleasant temperatures"
                    )
                    "djeddah" -> dest.copy(
                        name = "Jeddah",
                        country = "Saudi Arabia",
                        region = "Middle East",
                        tagline = "Bride of the Red Sea, gateway to the Holy Cities.",
                        intro = "Cosmopolitan coastal metropolis blending historical coral-stone heritage in UNESCO Al-Balad with lively sea-front corniche dining and premier diving.",
                        bestSeason = "November to March for ideal coastal weather"
                    )
                    "alula" -> dest.copy(
                        name = "AlUla",
                        country = "Saudi Arabia",
                        region = "Middle East",
                        tagline = "A living open-air museum in the ancient desert.",
                        intro = "Ancient Nabataean tombs at Hegra carved into red sandstone cliffs, lush date palm oases, and modern architectural marvels like the Maraya Concert Hall.",
                        bestSeason = "October to April"
                    )
                    "riyad" -> dest.copy(
                        name = "Riyadh",
                        country = "Saudi Arabia",
                        region = "Middle East",
                        tagline = "Dynamic capital connecting authentic heritage and futuristic vision.",
                        intro = "Riyadh unites towering modern skyscrapers with the historic adobe-brick birthplace of the kingdom at UNESCO-listed At-Turaif in Diriyah.",
                        bestSeason = "November to March"
                    )
                    "istanbul" -> dest.copy(
                        name = "Istanbul",
                        country = "Turkey",
                        region = "Europe / Asia",
                        tagline = "Crossroads of continents between East and West on the Bosphorus.",
                        intro = "Spanning two continents, Istanbul enchants with Hagia Sophia, the Blue Mosque, Topkapi Palace, and bustling historic spice bazaars.",
                        bestSeason = "April to June and September to November"
                    )
                    "cappadoce" -> dest.copy(
                        name = "Cappadocia",
                        country = "Turkey",
                        region = "Europe / Asia",
                        tagline = "Fairy chimneys, cave retreats, and sunrise hot air balloon rides.",
                        intro = "A surreal wonderland of volcanic rock formations, underground cities, and magical dawn balloon flights over Göreme valley.",
                        bestSeason = "May to October"
                    )
                    "dubai" -> dest.copy(
                        name = "Dubai",
                        country = "United Arab Emirates",
                        region = "Middle East",
                        tagline = "Futuristic metropolis of golden dunes, luxury, and world records.",
                        intro = "Home to Burj Khalifa, Palm Jumeirah, premier desert safaris, and luxury seaside resorts.",
                        bestSeason = "November to April"
                    )
                    "marrakech" -> dest.copy(
                        name = "Marrakech",
                        country = "Morocco",
                        region = "North Africa",
                        tagline = "The Ochre City of historic palaces, riads, and vibrant souks.",
                        intro = "Imperial jewel at the foot of the Atlas Mountains, famous for Jemaa el-Fna square, Majorelle Gardens, and authentic artisan craftsmanship.",
                        bestSeason = "March to May and September to November"
                    )
                    "le-caire" -> dest.copy(
                        name = "Cairo",
                        country = "Egypt",
                        region = "North Africa",
                        tagline = "City of a thousand minarets and timeless Pyramids of Giza.",
                        intro = "Capital of ancient pharaohs and Islamic architecture, guarding the Great Sphinx, the Nile, and the Grand Egyptian Museum.",
                        bestSeason = "October to April"
                    )
                    "petra" -> dest.copy(
                        name = "Petra",
                        country = "Jordan",
                        region = "Middle East",
                        tagline = "The rose-red city carved directly into Nabataean sandstone.",
                        intro = "One of the New Seven Wonders of the World, revealed after the winding Siq canyon with the legendary Treasury (Al-Khazneh).",
                        bestSeason = "March to May and September to November"
                    )
                    "maldives" -> dest.copy(
                        name = "Maldives",
                        country = "Maldives",
                        region = "Indian Ocean",
                        tagline = "Turquoise atolls, overwater bungalows, and pristine coral reefs.",
                        intro = "Idyllic island getaway for ultimate relaxation, honeymoons, and world-class scuba diving amidst marine life.",
                        bestSeason = "December to April"
                    )
                    else -> dest
                }
            }
            "ES" -> base.map { dest ->
                when (dest.slug) {
                    "la-mecque" -> dest.copy(
                        name = "La Meca",
                        country = "Arabia Saudita",
                        region = "Oriente Medio",
                        tagline = "El corazón espiritual del Islam y destino sagrado por excelencia.",
                        intro = "La Meca es la ciudad más sagrada del Islam, cuna del Profeta Muhammad y hogar de la Gran Mezquita y la Kaaba. Realizar la Umrah o el Hajj es una experiencia espiritual única y transformadora.",
                        bestSeason = "Umrah disponible todo el año; Hajj según el calendario islámico"
                    )
                    "medine" -> dest.copy(
                        name = "Medina",
                        country = "Arabia Saudita",
                        region = "Oriente Medio",
                        tagline = "La Ciudad Radiante, santuario de paz y recogimiento espiritual.",
                        intro = "Medina acoge la Mezquita del Profeta (al-Masjid an-Nabawi) y la venerada Rawdah. Peregrinos de todo el mundo viajan a sentir su serenidad inigualable.",
                        bestSeason = "Primavera y otoño para temperaturas agradables"
                    )
                    "djeddah" -> dest.copy(
                        name = "Yeda",
                        country = "Arabia Saudita",
                        region = "Oriente Medio",
                        tagline = "La joya del Mar Rojo y puerta histórica hacia los Santos Lugares.",
                        intro = "Metrópoli costera que combina el encanto de coral en el barrio Al-Balad (UNESCO) con el paseo marítimo y buceo de primer nivel.",
                        bestSeason = "Noviembre a marzo"
                    )
                    "alula" -> dest.copy(
                        name = "AlUla",
                        country = "Arabia Saudita",
                        region = "Oriente Medio",
                        tagline = "Un museo al aire libre en medio del desierto milenario.",
                        intro = "Fascinante ciudad nabatea de Hegra esculpida en arenisca roja, palmerales históricos y la emblemática sala de conciertos Maraya.",
                        bestSeason = "Octubre a abril"
                    )
                    "riyad" -> dest.copy(
                        name = "Riad",
                        country = "Arabia Saudita",
                        region = "Oriente Medio",
                        tagline = "Capital moderna y vanguardista, cuna del Reino histórico.",
                        intro = "Riad combina rascacielos vanguardistas con el patrimonio histórico de adobe en Diriyah (UNESCO).",
                        bestSeason = "Noviembre a marzo"
                    )
                    "istanbul" -> dest.copy(
                        name = "Estambul",
                        country = "Turquía",
                        region = "Europa / Asia",
                        tagline = "Cruce de civilizaciones entre Oriente y Occidente en el Bósforo.",
                        intro = "A caballo entre dos continentes, fascina con Santa Sofía, la Mezquita Azul, el Palacio Topkapi y bazares milenarios.",
                        bestSeason = "Abril a junio y septiembre a noviembre"
                    )
                    "cappadoce" -> dest.copy(
                        name = "Capadocia",
                        country = "Turquía",
                        region = "Europa / Asia",
                        tagline = "Chimeneas de hadas y paseos en globo en un paisaje de ensueño.",
                        intro = "Región mágica de Anatolia con valles esculpidos por la erosión, hoteles cueva y vuelos en globo al amanecer.",
                        bestSeason = "Mayo a octubre"
                    )
                    "dubai" -> dest.copy(
                        name = "Dubái",
                        country = "Emiratos Árabes Unidos",
                        region = "Oriente Medio",
                        tagline = "Metrópoli futurista entre dunas doradas y rascacielos infinitos.",
                        intro = "Hogar del Burj Khalifa, islas artificiales Palm Jumeirah, safaris en el desierto y compras de lujo.",
                        bestSeason = "Noviembre a abril"
                    )
                    "marrakech" -> dest.copy(
                        name = "Marrakech",
                        country = "Marruecos",
                        region = "Norte de África",
                        tagline = "La Ciudad Roja de palacios, riads y la plaza Jemaa el-Fna.",
                        intro = "Joya imperial a los pies del Atlas, famosa por sus jardines Majorelle, zocos vibrantes y hospitalidad marroquí.",
                        bestSeason = "Marzo a mayo y septiembre a noviembre"
                    )
                    "le-caire" -> dest.copy(
                        name = "El Cairo",
                        country = "Egipto",
                        region = "Norte de África",
                        tagline = "La ciudad de los mil minaretes y las milenarias Pirámides de Giza.",
                        intro = "Capital de los faraones junto al Nilo, con la Gran Esfinge, el Gran Museo Egipcio y el zoco Jan el-Jalili.",
                        bestSeason = "Octubre a abril"
                    )
                    "petra" -> dest.copy(
                        name = "Petra",
                        country = "Jordania",
                        region = "Oriente Medio",
                        tagline = "La ciudad de piedra rosada labrada por los antiguos nabateos.",
                        intro = "Maravilla del mundo que se descubre tras cruzar el estrecho desfiladero del Siq hasta contemplar El Tesoro.",
                        bestSeason = "Marzo a mayo y septiembre a noviembre"
                    )
                    "maldives" -> dest.copy(
                        name = "Maldivas",
                        country = "Maldivas",
                        region = "Océano Índico",
                        tagline = "Atolones de aguas turquesas, villas sobre el agua y playas paradisíacas.",
                        intro = "Archipiélago de ensueño ideal para desconectar, lunas de miel y buceo en arrecifes coralinos de ensueño.",
                        bestSeason = "Diciembre a abril"
                    )
                    else -> dest
                }
            }
            else -> base
        }
    }

    private val frenchDestinations: List<Destination> = listOf(
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
