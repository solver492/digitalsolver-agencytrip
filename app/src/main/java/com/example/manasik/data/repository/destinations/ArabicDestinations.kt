package com.example.manasik.data.repository.destinations

import com.example.manasik.data.model.Destination

object ArabicDestinations {
    val list: List<Destination> = listOf(
        Destination(
            slug = "la-mecque",
            name = "مكة المكرمة",
            country = "المملكة العربية السعودية",
            region = "الشرق الأوسط",
            tagline = "مهوى أفئدة المسلمين، وقبلة العالم ومهبط الوحي الشريف.",
            intro = "مكة المكرمة هي أقدس بقاع الأرض، تحتضن المسجد الحرام والكعبة المشرفة التي يتجه إليها أكثر من ملياري مسلم في صلواتهم. أداء مناسك العمرة أو الحج في مكة تجربة إيمانية فريدة تملأ القلب سكينة وروحانية.",
            highlights = listOf(
                "الطواف بالكعبة المشرفة واستلام الحجر الأسود",
                "السعي بين الصفا والمروة",
                "الشرب من ماء زمزم المبارك",
                "جبل النور وغار حراء مهبط الوحي الأول",
                "صعيد عرفات الطاهر ومسجد نمرة",
                "مشعر منى ومزدلفة"
            ),
            tips = listOf(
                "دخول مكة المكرمة مخصص للمسلمين الحاصلين على تصريح نظامي عبر تطبيق نسك.",
                "احجز الفنادق مبكراً لضمان القرب من ساحات الحرم المكي الشريف.",
                "احرص على ارتداء ملابس مريحة وفضفاضة تلائم مناسك العمرة وأجواء الطواف."
            ),
            bestSeason = "العمرة متاحة طوال العام؛ الحج في الميقات الشرعي السنوي",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("مكة", "makkah", "mecca"),
            imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "medine",
            name = "المدينة المنورة",
            country = "المملكة العربية السعودية",
            region = "الشرق الأوسط",
            tagline = "طيبة الطيبة، دار الهجرة ومأوى السلام وسكينة الروح.",
            intro = "المدينة المنورة، مدينة رسول الله ﷺ، تأسر القلوب بمسجدها النبوي الشريف وقبته الخضراء والروضة الشريفة. وجهة الطمأنينة والهدوء والزيارات الإيمانية العطرة.",
            highlights = listOf(
                "المسجد النبوي الشريف والروضة المباركة",
                "مسجد قباء أول مسجد أُسس في الإسلام",
                "مقبرة البقيع ومزارات الصحابة الكرام",
                "مسجد القبلتين التاريخي",
                "جبل أحد ومقبرة شهداء أحد"
            ),
            tips = listOf(
                "التزم بحجز موعد زيارة الروضة الشريفة مسبقاً عبر تطبيق نسك الرسمي.",
                "اختر ساعات الصباح الباكر أو بعد صلاة العشاء لزيارة المزارات بأريحية وهدوء.",
                "الالتزام بالوقار والسكينة واللباس المحتشم في كافة أرجاء المدينة النبوية."
            ),
            bestSeason = "الربيع والخريف لأجواء معتدلة وممتعة",
            tags = listOf("omra-hajj", "moyen-orient", "spirituel"),
            aliases = listOf("المدينة", "طيبة", "madinah"),
            imageAsset = "file:///android_asset/destinations/medine.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "esim", "bagages"),
            featured = true,
            rating = 5.0f
        ),
        Destination(
            slug = "djeddah",
            name = "جدة",
            country = "المملكة العربية السعودية",
            region = "الشرق الأوسط",
            tagline = "عروس البحر الأحمر، وبوابة الحرمين الشريفين التاريخية.",
            intro = "مدينة جدة الساحلية التاريخية تمزج بين عراقة حي البلد المسجل في اليونسكو برواشينه التراثية وشواطئ الكورنيش والأنشطة البحرية الحديثة والمطاعم البحرية العالمية.",
            highlights = listOf(
                "حي البلد التاريخي ببيوته التراثية وأسواره القديمة المسجل في اليونسكو",
                "نافورة الملك فهد الأطول في العالم على الكورنيش",
                "واجهة جدة البحرية والمنتجعات الراقية",
                "رحلات الغوص والاستجمام في أعماق البحر الأحمر"
            ),
            tips = listOf(
                "ننصح بزيارة حي البلد في المساء للاستمتاع بالأضواء والأسواق التقليدية والمقاهي.",
                "استخدم قطار الحرمين السريع للوصول إلى مكة في 45 دقيقة فقط من محطة المطار."
            ),
            bestSeason = "من نوفمبر إلى مارس لأجواء بحرية عليلة",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("jeddah", "عروس البحر"),
            imageAsset = "file:///android_asset/destinations/djeddah.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "taif",
            name = "الطائف",
            country = "المملكة العربية السعودية",
            region = "الشرق الأوسط",
            tagline = "مدينة الورد وجبال الهدا والشفا العليلة بطبيعتها الغناء.",
            intro = "عروس المصائف السعودية الشهيرة بمزارع الورد الطائفي الفواح، وأجوائها الجبلية المنعشة، وتلفريك الهدا المطل على المنحدرات الساحرة.",
            highlights = listOf(
                "معامل تقطير ماء ودهن الورد الطائفي التقليدية",
                "تلفريك جبل الهدا البانورامي ومناظر الجبال الخلابة",
                "قصر شبرا التاريخي والمتاحف التراثية",
                "بساتين الرمان والمشمش والتين الجبلي الشهير"
            ),
            tips = listOf(
                "احرص على اصطحاب سترة دافئة للمساء فوق المرتفعات الجبلية.",
                "أفضل وقت لزيارة مزارع الورد هو في فصل الربيع وقت موسم القِطاف."
            ),
            bestSeason = "من مايو إلى أكتوبر لاعتدال أجوائها اللطيفة",
            tags = listOf("moyen-orient", "nature"),
            aliases = listOf("taif", "الهدا", "الشفا"),
            imageAsset = "file:///android_asset/destinations/taif.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "alula",
            name = "العُلا",
            country = "المملكة العربية السعودية",
            region = "الشرق الأوسط",
            tagline = "متحف حي مفتوح وسط سحر رمال وتاريخ الصحراء النبطية.",
            intro = "العُلا وجهة أثرية عالمية استثنائية، تحتضن موقع الحِجر النبطي (مدائن صالح) المحفور في الصخور الرملية وواحات النخيل ومسرح مرايا العاكس.",
            highlights = listOf(
                "موقع الحِجر الأثري المسجل في قائمة التراث العالمي (اليونسكو)",
                "صخرة الفيل الشهيرة ومطل حرة عويرض البانورامي",
                "بلدة العلا القديمة وواحة النخيل الغناء",
                "قاعة مرايا الأيقونية الأكبر في العالم بالمرايا العاكسة"
            ),
            tips = listOf(
                "احجز جولات الحِجر مع المرشدين المعتمدين مسبقاً لتنظيم وقتك.",
                "الليالي الشتوية في الصحراء تتطلب ملابس دافئة نظراً لانخفاض درجات الحرارة."
            ),
            bestSeason = "من أكتوبر إلى أبريل",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("alula", "الحجر", "مدائن صالح"),
            imageAsset = "file:///android_asset/destinations/alula.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "riyad",
            name = "الرياض",
            country = "المملكة العربية السعودية",
            region = "الشرق الأوسط",
            tagline = "عاصمة نجد النابضة، تلاقي الأصالة والنهضة المستقبلية.",
            intro = "تجمع الرياض بين ناطحات السحاب العملاقة والتراث النجدي الأصيل في حي الطريف بالدرعية التاريخية مهد الدولة السعودية الأولى.",
            highlights = listOf(
                "حي الطريف بالدرعية التاريخية، مهد الدولة السعودية الأولى (اليونسكو)",
                "قصر المصمك التاريخي باللبن الطيني في قلب الرياض",
                "برج المملكة وجسر المشاهدة المعلق على ارتفاع شاهق",
                "سوق الزل القديم التراثي للمشالح والبخور والسجاد"
            ),
            tips = listOf(
                "تجول في الدرعية التاريخية ليلاً للاستمتاع بالإضاءة الفنية والمطاعم الفاخرة المطلة على الوادي."
            ),
            bestSeason = "من نوفمبر إلى مارس",
            tags = listOf("moyen-orient", "ville"),
            aliases = listOf("riyadh", "الدرعية"),
            imageAsset = "file:///android_asset/destinations/riyad.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "istanbul",
            name = "إسطنبول",
            country = "تركيا",
            region = "أوروبا / آسيا",
            tagline = "ملتقى القارات وسحر العمارة العثمانية على ضفاف البوسفور.",
            intro = "إسطنبول مدينة التاريخ العريق بمساجدها المذهلة مثل جامع آيا صوفيا والجامع الأزرق وقصر توبكابي وأسواقها التراثية ومضيق البوسفور الأسطوري.",
            highlights = listOf(
                "جامع آيا صوفيا التاريخي الشامخ",
                "المسجد الأزرق (جامع السلطان أحمد)",
                "البازار الكبير وسوق التوابل المصري التاريخي",
                "جولة بحرية في مضيق البوسفور عند غروب الشمس",
                "قصر توبكابي ومقتنياته العثمانية والإسلامية النادرة"
            ),
            tips = listOf(
                "اشترِ بطاقة إسطنبول (Istanbulkart) للتنقل السلس عبر الترام والمترو والعبارات البحرية.",
                "ارتدِ ملابس محتشمة وأحضري غطاء الرأس عند زيارة المساجد التاريخية."
            ),
            bestSeason = "من أبريل إلى يونيو ومن سبتمبر إلى نوفمبر",
            tags = listOf("europe", "asie", "ville", "culture"),
            aliases = listOf("istanbul", "القسطنطينية"),
            imageAsset = "file:///android_asset/destinations/istanbul.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "esim"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "antalya",
            name = "أنطاليا",
            country = "تركيا",
            region = "أوروبا / آسيا",
            tagline = "ريفييرا البحر الأبيض المتوسط والشلالات الفيروزية الرائعة.",
            intro = "منتجع تركي ساحلي يجمع بين روعة حي كاليتشي العتيق وشلالات دودين المنحدرة نحو البحر والشواطئ المشمسة والآثار الرومانية التاريخية.",
            highlights = listOf(
                "البلدة القديمة كاليتشي وبوابة هادريان الرومانية",
                "شلالات دودين الساحلية المنهمرة في البحر",
                "شواطئ كونيالتي ولارا الفيروزية النظيفة",
                "مسرح أسبندوس الروماني الأثري المحفوظ بعناية فائقة"
            ),
            tips = listOf(
                "قم بجولة بحرية على متن اليخوت بمحاذاة الشلالات وقت المغيب."
            ),
            bestSeason = "من أبريل إلى أكتوبر",
            tags = listOf("europe", "asie", "plage", "nature"),
            aliases = listOf("antalya", "كاليتشي"),
            imageAsset = "file:///android_asset/destinations/antalya.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "cappadoce",
            name = "كابادوكيا",
            country = "تركيا",
            region = "أوروبا / آسيا",
            tagline = "مداخن الجنيات ومناطيد الهواء في مشهد طبيعي خيالي.",
            intro = "منطقة كابادوكيا الساحرة تشتهر بتكويناتها الصخرية الفريدة وفنادق الكهوف المنحوتة ورحلات المناطيد الهوائية التي تملأ الأفق عند بزوغ الفجر.",
            highlights = listOf(
                "رحلة المنطاد الهوائي الساحرة عند شروق الشمس فوق وادي غوريميه",
                "متحف غوريميه المفتوح والكنائس الصخرية البيزنطية القديمة",
                "المدن التحت أرضية العميقة في ديرينكويو وكايماكلي",
                "وادي الحمام ووادي الرهبان وقلعة أوتشيسار الصخرية"
            ),
            tips = listOf(
                "احجز رحلة المنطاد لليوم الأول من وصولك لتفادي التأجيل المحتمل بسبب الرياح والطقس.",
                "اختر الإقامة في فندق كهفي تقليدي لتجربة فريدة لا تُنسى."
            ),
            bestSeason = "من مايو إلى أكتوبر",
            tags = listOf("europe", "asie", "nature", "culture"),
            aliases = listOf("cappadocia", "كابادوكيا", "غوريميه"),
            imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "trabzon",
            name = "طرابزون",
            country = "تركيا",
            region = "أوروبا / آسيا",
            tagline = "غابات الزمرد وجبال البحر الأسود وبحيرة أوزنجول الساحرة.",
            intro = "عروس الشمال التركي المطلة على البحر الأسود، المتميزة بدير سوميلا المعلق في الصخور وبحيرة أوزنجول الخضراء وسط الغابات الصنوبرية الشاهقة.",
            highlights = listOf(
                "دير سوميلا التاريخي المعلق بإعجاز في قمة الجرف الصخري",
                "بحيرة أوزنجول الألبية والمنازل الخشبية الريفية الخلابة",
                "مرتفعات آيدر الخضراء والينابيع الكبريتية والشلالات",
                "قصر أتاتورك وإطلالاته البانورامية على بحر قزوين والبحر الأسود"
            ),
            tips = listOf(
                "تذوق طبق الكويماك التقليدي اللذيذ المصنوع من أجبان الشمال الطازجة."
            ),
            bestSeason = "من يونيو إلى سبتمبر",
            tags = listOf("europe", "asie", "nature"),
            aliases = listOf("trabzon", "أوزنجول"),
            imageAsset = "file:///android_asset/destinations/trabzon.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "dubai",
            name = "دبي",
            country = "الإمارات العربية المتحدة",
            region = "الشرق الأوسط",
            tagline = "مدينة المستقبل، التسوق الفاخر والمعالم المعمارية المذهلة.",
            intro = "وجهة الابتكار والرفاهية العالمية، حيث برج خليفة الأعلى عالمياً وجزر النخلة والمنتجعات الشاطئية ورحلات السفاري الصحراوية الراقية.",
            highlights = listOf(
                "برج خليفة ومنصة المشاهدة البانورامية في الطابق 148",
                "دبي مول وعروض نافورة دبي الموسيقية الراقصة",
                "رحلة سفاري في الكثبان الذهبية مع عشاء في مخيم بدوي فاخر",
                "جزيرة نخلة جميرا ومنتجعاتها الشاطئية الخلابة"
            ),
            tips = listOf(
                "استخدم مترو دبي المكيف وسيارات الأجرة الرسمية للتنقل السهل والعملي.",
                "خطط للأنشطة الداخلية ومراكز التسوق خلال ساعات الظهيرة."
            ),
            bestSeason = "من نوفمبر إلى أبريل",
            tags = listOf("moyen-orient", "ville", "plage"),
            aliases = listOf("dubai", "الإمارات"),
            imageAsset = "file:///android_asset/destinations/dubai.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites", "yacht"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "abu-dhabi",
            name = "أبوظبي",
            country = "الإمارات العربية المتحدة",
            region = "الشرق الأوسط",
            tagline = "عاصمة الثقافة، جامع الشيخ زايد الكبير ومتحف اللوفر على البحر.",
            intro = "عاصمة دولة الإمارات الهادئة والراقية، المشهورة بجامع الشيخ زايد الأبيض المهيب ومتحف اللوفر أبوظبي ذي القبة العائمة فوق مياه الخليج.",
            highlights = listOf(
                "جامع الشيخ زايد الكبير المشيد بالرخام الأبيض الصافي والمآذن الشامخة",
                "متحف اللوفر أبوظبي العالمي بتصميمه المائي الأيقوني",
                "قصر الوطن الرئاسي وقاعاته الاحتفالية الفخمة",
                "عالم فيراري الترفيهي وحلبة مرسى ياس لسباقات الفورمولا 1"
            ),
            tips = listOf(
                "احرص على اللباس المحتشم عند زيارة جامع الشيخ زايد الكبير."
            ),
            bestSeason = "من نوفمبر إلى أبريل",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("abudhabi", "أبو ظبي"),
            imageAsset = "file:///android_asset/destinations/abu-dhabi.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "doha",
            name = "الدوحة",
            country = "قطر",
            region = "الشرق الأوسط",
            tagline = "أناقة خليجية، متحف الفن الإسلامي وسوق واقف النابض بالحياة.",
            intro = "عاصمة الفن والثقافة على الخليج العربي، تمزج بين أصالة سوق واقف برائحة بخوره ومقاهيه وأحدث المتاحف المعمارية المعاصرة.",
            highlights = listOf(
                "متحف الفن الإسلامي (MIA) الأيقوني بتصميم المهندس آي إم بي",
                "سوق واقف الشعبي وتجارة الصقور والتوابل والمطاعم التقليدية",
                "كورنيش الدوحة وجزيرة اللؤلؤة السكنية الفاخرة",
                "حي كتارا الثقافي والمسرح الروماني المفتوح على البحر"
            ),
            tips = listOf(
                "تجول في سوق واقف في المساء للاستمتاع بأفضل الأجواء والوجبات التقليدية."
            ),
            bestSeason = "من نوفمبر إلى مارس",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("doha", "قطر"),
            imageAsset = "file:///android_asset/destinations/doha.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "le-caire",
            name = "القاهرة",
            country = "مصر",
            region = "إفريقيا",
            tagline = "مدينة الألف مئذنة وأهرامات الجيزة الخالدة على ضفاف النيل.",
            intro = "عاصمة الحضارة الإنسانية والإسلامية، حارسة أهرامات الجيزة الخالدة وتمثال أبو الهول والمتحف المصري الكبير وخان الخليلي الشهير.",
            highlights = listOf(
                "أهرامات الجيزة الثلاثة (خوفو، خفرع، منقرع) وتمثال أبو الهول العظيم",
                "المتحف المصري الكبير (GEM) والمتحف القومي للحضارة",
                "سوق خان الخليلي العتيق المليء بالمشغولات والتحف الفضية",
                "قلعة صلاح الدين الأيوبي وجامع محمد علي الأثري"
            ),
            tips = listOf(
                "احرص على مرافقة مرشد سياحي معتمد للاستفادة الكاملة من التاريخ والحضارة الفرعونية.",
                "جرب ركوب الفلوكة الشراعية التقليدية على مياه النيل الهادئة وقت الغروب."
            ),
            bestSeason = "من أكتوبر إلى أبريل",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("cairo", "مصر"),
            imageAsset = "file:///android_asset/destinations/le-caire.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = true,
            rating = 4.8f
        ),
        Destination(
            slug = "charm-el-cheikh",
            name = "شرم الشيخ",
            country = "مصر",
            region = "إفريقيا",
            tagline = "جنة الاستجمام على البحر الأحمر والشعاب المرجانية العالمية.",
            intro = "منتجع شاطئي عالمي في شبه جزيرة سيناء، يشتهر بمحمية رأس محمد البحرية المذهلة والمنتجعات الشاملة ورحلات جبل موسى ودير سانت كاترين.",
            highlights = listOf(
                "محمية رأس محمد الوطنية للشعاب المرجانية وأسماك البحر الأحمر",
                "رحلات جزيرة تيران والسباحة في المياه الفيروزية الشفافة",
                "رحلة صعود جبل موسى فجراً وزيارة دير سانت كاترين الأثري",
                "شواطئ خليج نعمة الهادئة ومخيمات البدو الساحرة في الصحراء"
            ),
            tips = listOf(
                "احرص على إحضار نظارات السنوركلينغ للاستمتاع بالشعاب من الشاطئ مباشرة."
            ),
            bestSeason = "من أكتوبر إلى مايو",
            tags = listOf("afrique", "plage", "nature"),
            aliases = listOf("sharm", "شرم"),
            imageAsset = "file:///android_asset/destinations/charm-el-cheikh.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "hurghada",
            name = "الغردقة",
            country = "مصر",
            region = "إفريقيا",
            tagline = "مياه صافية، رحلات سفاري صحراوية وجزر رملية ساحرة.",
            intro = "وجهة شاطئية عائلية ممتعة تشتهر بجزر الجفتون الرملية ورحلات الدلافين وسفاري سيارات الدفع الرباعي في صحراء البحر الأحمر.",
            highlights = listOf(
                "رحلة اليخت إلى شواطئ جزيرة الجفتون الرملية البيضاء",
                "السباحة مع الدلافين الحرة في منطقة دولفين هاوس",
                "رحلات سفاري بالبيتش باجي والكثبان الرملية مع عشاء بدوي",
                "مارينا الغردقة الحديثة بمطاعمها وإطلالاتها البحرية الراقية"
            ),
            tips = listOf(
                "مثالية للعطلات العائلية الشاملة مع توفر الألعاب والمنتزهات المائية."
            ),
            bestSeason = "من أكتوبر إلى أبريل",
            tags = listOf("afrique", "plage"),
            aliases = listOf("hurghada", "البحر الأحمر"),
            imageAsset = "file:///android_asset/destinations/hurghada.jpg",
            services = listOf("vols", "hotels", "transferts", "activites", "yacht"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "marrakech",
            name = "مراكش",
            country = "المغرب",
            region = "إفريقيا",
            tagline = "المدينة الحمراء، سحر جامع الفنا وعراقة القصور والرياضات.",
            intro = "عاصمة السياحة المغربية عند سفوح جبال الأطلس، تأسرك بساحة جامع الفنا وصومعة الكتبية وحدائق ماجوريل وأسواق المدينة العتيقة العابقة بالأصالة.",
            highlights = listOf(
                "ساحة جامع الفنا النابضة بالحياة وصومعة الكتبية التاريخية",
                "حديقة ماجوريل الشهيرة ومتحف إيف سان لوران",
                "قصر الباهية التراثي ومدرسة ابن يوسف العريقة",
                "أسواق المدينة القديمة الملونة بالصناعات اليدوية المغربية"
            ),
            tips = listOf(
                "استمتع باحتساء الشاي المغربي بالنعناع في مقاهي السطوح المطلة على جامع الفنا عند الغروب.",
                "اختر الإقامة في رياض تقليدي أصيل داخل أزقة المدينة القديمة لتجربة الضيافة الحقيقية."
            ),
            bestSeason = "من مارس إلى مايو ومن سبتمبر إلى نوفمبر",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("marrakech", "المغرب"),
            imageAsset = "file:///android_asset/destinations/marrakech.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites", "location-voiture"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "casablanca",
            name = "الدار البيضاء",
            country = "المغرب",
            region = "إفريقيا",
            tagline = "العاصمة الاقتصادية على المحيط الأطلسي ومسجد الحسن الثاني الشامخ.",
            intro = "القلب التجاري للمملكة على المحيط الأطلسي، الشهيرة بمسجد الحسن الثاني بمئذنته الباسقة فوق مياه البحر وأحيائها التاريخية المصممة بطراز الآرت ديكو.",
            highlights = listOf(
                "مسجد الحسن الثاني ومئذنته البالغ ارتفاعها 210 أمتار فوق البحر",
                "كورنيش عين الذئاب والمنتجعات الشاطئية والمطاعم البحرية",
                "حي الحبوس التقليدي بأسواقه ومخابزه العريقة",
                "المباني التاريخية والمعالم المعمارية الأنيقة بوسط المدينة"
            ),
            tips = listOf(
                "احرص على حضور الجولة الإرشادية داخل مسجد الحسن الثاني للتعرف على عمارته الإسلامية."
            ),
            bestSeason = "من أبريل إلى أكتوبر",
            tags = listOf("afrique", "ville", "culture"),
            aliases = listOf("كازا", "casablanca"),
            imageAsset = "file:///android_asset/destinations/casablanca.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "tanger",
            name = "طنجة",
            country = "المغرب",
            region = "إفريقيا",
            tagline = "بوابة مضيق جبل طارق حيث يلتقي المحيط الأطلسي بالبحر المتوسط.",
            intro = "مدينة البوغاز الأسطورية البيضاء، ملتقى البحار ومهوى قلوب الأدباء والفنانين بإطلالاتها الساحرة على السواحل الإسبانية المقابلة.",
            highlights = listOf(
                "قصبة طنجة التاريخية ومتحف الثقافات المتوسطية",
                "مغارة هرقل الأسطورية ومنارة رأس سبارطيل",
                "السوق الكبير ومقاهي الحافة التاريخية على الجرف الصخري",
                "مارينا طنجة الحديثة وكورنيش المدينة الأنيق"
            ),
            tips = listOf(
                "ارتشف الشاي بالنعناع في مقهى الحافة وتأمل حركة السفن العابرة في المضيق."
            ),
            bestSeason = "من مايو إلى أكتوبر",
            tags = listOf("afrique", "culture", "ville"),
            aliases = listOf("tangier", "طنجة البوغاز"),
            imageAsset = "file:///android_asset/destinations/tanger.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "chefchaouen",
            name = "شفشاون",
            country = "المغرب",
            region = "إفريقيا",
            tagline = "الجوهرة الزرقاء الهادئة بين أحضان جبال الريف الشامخة.",
            intro = "مدينة الجمال والاسترخاء، بأزقتها الزرقاء النيلية ومنازلها المتدرجة على سفوح الجبال والينابيع الطبيعية العذبة.",
            highlights = listOf(
                "أزقة المدينة العتيقة الملونة باللون الأزرق السماوي الجذاب",
                "ساحة وطاء الحمام والقصبة الأندلسية التاريخية",
                "شلالات رأس الماء العذبة ومقاهي ضفاف النهر",
                "المشي نحو المسجد الإسباني لمشاهدة بانوراما الغروب المذهلة"
            ),
            tips = listOf(
                "اصعد إلى المسجد الإسباني قبيل غروب الشمس للحصول على أروع صورة للمدينة."
            ),
            bestSeason = "من أبريل إلى يونيو ومن سبتمبر إلى أكتوبر",
            tags = listOf("afrique", "nature", "culture"),
            aliases = listOf("chaouen", "المدينة الزرقاء"),
            imageAsset = "file:///android_asset/destinations/chefchaouen.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "agadir",
            name = "أكادير",
            country = "المغرب",
            region = "إفريقيا",
            tagline = "شاطئ الرمال الذهبية على الأطلسي و300 يوم من شمس المغرب الدافئة.",
            intro = "الوجهة الشاطئية الأولى بالمغرب، بخليجها الممتد على 10 كيلومترات وكورنيشها العصري وأجوائها المناسبة لركوب الأمواج في تغازوت المجاورة.",
            highlights = listOf(
                "شاطئ أكادير الممتد برماله الذهبية الناعمة ومياهه الهادئة",
                "أطلال قصبة أكادير أوفلا التاريخية المطلة على كامل الخليج",
                "سوق الأحد التقليدي الضخم للمنتوجات والزيوت الطبيعية (الأركان)",
                "شواطئ تغازوت المشهورة عالمياً برياضة ركوب الأمواج"
            ),
            tips = listOf(
                "قم بزيارة وادي الجنة (Paradise Valley) للاستمتاع ببرك السباحة الصخرية الطبيعية."
            ),
            bestSeason = "طوال العام بفضل اعتدال مناخها الشمسي الدائم",
            tags = listOf("afrique", "plage"),
            aliases = listOf("agadir", "تغازوت"),
            imageAsset = "file:///android_asset/destinations/agadir.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture", "activites"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "paris",
            name = "باريس",
            country = "فرنسا",
            region = "أوروبا",
            tagline = "مدينة النور والأناقة، الفنون والمعالم العالمية الخالدة.",
            intro = "عاصمة الثقافة والجمال الأوربي، تسحر زوارها ببرج إيفل الشامخ، ومتحف اللوفر العظيم، وشارع الشانزليزيه وضفاف نهر السين التاريخية.",
            highlights = listOf(
                "برج إيفل وجولة القارب النهري الساحرة على نهر السين",
                "متحف اللوفر ومقتنياته الفنية الأثرية العالمية",
                "كاتدرائية نوتردام والحي اللاتيني العريق",
                "شارع الشانزليزيه وقوس النصر التذكاري"
            ),
            tips = listOf(
                "احجز تذاكر المتاحف عبر الإنترنت مسبقاً لتوفير ساعات الانتظار.",
                "استخدم قطارات المترو السريعة للتنقل بين المعالم بسهولة."
            ),
            bestSeason = "من أبريل إلى أكتوبر",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("paris", "فرنسا"),
            imageAsset = "file:///android_asset/destinations/paris.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "rome",
            name = "روما",
            country = "إيطاليا",
            region = "أوروبا",
            tagline = "المدينة الخالدة، متحف تاريخي مفتوح للآثار الرومانية العظيمة.",
            intro = "مهد الحضارة الرومانية المليء بالكنوز الخالدة: مدرج الكولوسيوم العظيم، نافورة تريفي، البانثيون وألذ أطباق المطبخ الإيطالي الأصيل.",
            highlights = listOf(
                "مدرج الكولوسيوم والمنتدى الروماني القديم",
                "نافورة تريفي الشهيرة ودرجات ساحة إسبانيا",
                "معبد البانثيون التاريخي وساحة نافونا النابضة",
                "مدينة الفاتيكان وكاتدرائية القديس بطرس"
            ),
            tips = listOf(
                "استكشف أزقة المركز التاريخي سيراً على الأقدام لاكتشاف الساحات الهادئة."
            ),
            bestSeason = "من أبريل إلى يونيو ومن سبتمبر إلى نوفمبر",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("rome", "إيطاليا"),
            imageAsset = "file:///android_asset/destinations/rome.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "barcelone",
            name = "برشلونة",
            country = "إسبانيا",
            region = "أوروبا",
            tagline = "عمارة غاودي الخلابة، شواطئ البحر المتوسط والحي القوطي العتيق.",
            intro = "حاضرة كتالونيا المبهجة حيث تلتقي كاتدرائية ساغرادا فاميليا وحديقة بارك غويل بالشواطئ المتوسطية وثقافة التاباس اللذيذة.",
            highlights = listOf(
                "كاتدرائية ساغرادا فاميليا الأيقونية من إبداع المعماري غاودي",
                "حديقة بارك غويل بإطلالاتها البانورامية الملونة بالموزاييك",
                "شارع الرامبلا الحيوي وسوق لابوكيريا التاريخي للأطعمة الطازجة",
                "الحي القوطي القديم وشواطئ برشلونيتا البحرية"
            ),
            tips = listOf(
                "احجز تذاكر ساغرادا فاميليا قبل سفرك بعدة أسابيع نظراً للإقبال الشديد."
            ),
            bestSeason = "من مايو إلى أكتوبر",
            tags = listOf("europe", "ville", "plage", "culture"),
            aliases = listOf("barcelona", "إسبانيا"),
            imageAsset = "file:///android_asset/destinations/barcelone.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "londres",
            name = "لندن",
            country = "المملكة المتحدة",
            region = "أوروبا",
            tagline = "العاصمة العالمية العريقة، القصور الملكية والمتاحف الكبرى.",
            intro = "عاصمة الضباب والتاريخ الغني، تحتضن ساعة بيغ بن وجسر البرج وقصر باكنغهام وعروض مسارح ويست إند والحدائق الملكية الخضراء.",
            highlights = listOf(
                "ساعة بيغ بن ومبنى البرلمان ودير وستمنستر التاريخي",
                "جسر البرج (تاور بريدج) وقلعة برج لندن",
                "المتحف البريطاني والمعرض الوطني ذو الدخول المجاني",
                "مراسم تبديل الحرس الملكي أمام قصر باكنغهام"
            ),
            tips = listOf(
                "استخدم البطاقات المصرفية اللاتلامسية مباشرة على بوابات المترو للتنقل المريح."
            ),
            bestSeason = "من مايو إلى سبتمبر",
            tags = listOf("europe", "ville", "culture"),
            aliases = listOf("london", "بريطانيا"),
            imageAsset = "file:///android_asset/destinations/londres.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "amman",
            name = "عمّان",
            country = "الأردن",
            region = "الشرق الأوسط",
            tagline = "مدينة التلال السبع، التاريخ الروماني وكرم الضيافة الهاشمية.",
            intro = "بوابة الأردن التاريخية، تجمع بين جبل القلعة الشامخ والمدرج الروماني الأثري وشارع الرينبو بمقاهيه وثقافته الشامية المضيافة.",
            highlights = listOf(
                "جبل القلعة ومعبد هرقل الأثري وإطلالته البانورامية على العاصمة",
                "المدرج الروماني الكبير في قلب وسط البلد القديم",
                "شارع الرينبو بمعارضه الفنية ومطاعمه العريقة",
                "رحلة نهارية للاستجمام في مياه البحر الميت العلاجية"
            ),
            tips = listOf(
                "اشترِ بطاقة جوردان باس (Jordan Pass) للاستفادة من الإعفاء من التأشيرة ودخول المزارات."
            ),
            bestSeason = "من مارس إلى مايو ومن سبتمبر إلى نوفمبر",
            tags = listOf("moyen-orient", "ville", "culture"),
            aliases = listOf("amman", "الأردن"),
            imageAsset = "file:///android_asset/destinations/amman.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "petra",
            name = "البتراء",
            country = "الأردن",
            region = "الشرق الأوسط",
            tagline = "المدينة الوردية المنحوتة في الصخر، إحدى عجائب الدنيا السبع.",
            intro = "كنز الأردن وعاصمة الأنباط القديمة المحفورة في الصخور الجبلية الوردية، تبهر الزوار بممر السيق الملتوي والخزينة الشامخة والدير المنحوت في الصميم.",
            highlights = listOf(
                "الممر الصخري الضيق (السيق) المؤدي إلى واجهة الخزينة الأسطورية",
                "الصعود الممتع نحو الدير الصخري الشامخ (الدير)",
                "المقابر الملكية المنحوتة في واجهة الجبل الوردية",
                "فعالية البتراء ليلاً على ضوء آلاف الشموع المضيئة"
            ),
            tips = listOf(
                "ارتدِ أحذية مشي مريحة، فالاستكشاف يتطلب المشي لمسافات متوسطة عبر الدروب الصخرية."
            ),
            bestSeason = "من مارس إلى مايو ومن سبتمبر إلى نوفمبر",
            tags = listOf("moyen-orient", "culture", "nature"),
            aliases = listOf("petra", "الخزينة"),
            imageAsset = "file:///android_asset/destinations/petra.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "kuala-lumpur",
            name = "كوالالمبور",
            country = "ماليزيا",
            region = "آسيا",
            tagline = "برجا بتروناس التوأمان، كهوف باتو وتنوع الثقافات والمأكولات الحلال.",
            intro = "عاصمة ماليزيا الحديثة والنابضة بالحياة، تجمع بين ناطحات السحاب الفضية وكهوف باتو ومراكز التسوق الفاخرة وخيارات المأكولات الحلال المتنوعة.",
            highlights = listOf(
                "برجا بتروناس التوأمان والجسر المعلق البانورامي (سكاي بريدج)",
                "مجمع كهوف باتو الهندوسي بالسلالم الملونة والتمثال الذهبي الضخم",
                "ساحة مرديكا التاريخية والسوق المركزي للصناعات الحرفية",
                "شارع جالان ألور ومأكولات الشارع الآسيوية الحلال في بوكيت بينتانج"
            ),
            tips = listOf(
                "تعتبر ماليزيا من أفضل وأسهل الوجهات السياحية المناسبة للعائلات والمسافرين المسلمين في العالم."
            ),
            bestSeason = "طوال العام بأجوائها الاستوائية المعتدلة",
            tags = listOf("asie", "ville", "culture"),
            aliases = listOf("kl", "ماليزيا"),
            imageAsset = "file:///android_asset/destinations/kuala-lumpur.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "bali",
            name = "بالي",
            country = "إندونيسيا",
            region = "آسيا",
            tagline = "جزيرة الجمال الاستوائي، مزارع الأرز المدرجة والشواطئ الفاتنة.",
            intro = "جنة إندونيسيا الخلابة، المشهورة بحقول أرز أوبود الخضراء ومعابد السواحل الصخرية والشلالات العذبة وسط الغابات الاستوائية الغناء.",
            highlights = listOf(
                "مدرجات حقول أرز تيغالالانغ وشلالات أوبود العذبة",
                "معبد تاناه لوت البحري القائم على صخرة داخل المحيط",
                "جرف معبد أولواتو الشاهق المطل على أمواج المحيط الهندي",
                "شواطئ نوسا دوا وسيمينياك الهادئة للاستجمام والسباحة"
            ),
            tips = listOf(
                "استأجر سائقاً خاصاً محلياً للتنقل المريح بين معالم الجزيرة المتباعدة."
            ),
            bestSeason = "من مايو إلى أكتوبر في موسم الجفاف المشمس",
            tags = listOf("asie", "nature", "plage"),
            aliases = listOf("bali", "إندونيسيا", "أوبود"),
            imageAsset = "file:///android_asset/destinations/bali.jpg",
            services = listOf("vols", "hotels", "transferts", "guides", "activites"),
            featured = false,
            rating = 4.9f
        ),
        Destination(
            slug = "maldives",
            name = "المالديف",
            country = "المالديف",
            region = "المحيط الهندي",
            tagline = "جزر الفيروز، الفلل المائية وشواطئ الاستجمام الساحرة.",
            intro = "جنة استوائية تطفو على مياه المحيط الهندي الصافية، مثالية للأزواج والعائلات، وتجارب الغوص بين الشعاب المرجانية والاسترخاء التام.",
            highlights = listOf(
                "فلل فاخرة قائمة على الماء مع إطلالة مباشرة على الأفق الفيروزي",
                "الغوص والسنوركلينغ مع أسماك المانتا والسلاحف البحرية الودودة",
                "عشاء رومانسي خاص على شاطئ رملي أبيض منعزل تحت النجوم",
                "منتجعات صحية عائمة وجلسات استجمام واسترخاء متكاملة"
            ),
            tips = listOf(
                "نسق وسيلة النقل (الطائرة المائية أو القارب السريع) مسبقاً مع حجز المنتجع.",
                "اختر باقات الإقامة الشاملة كلياً لتستمتع بجميع الوجبات والأنشطة براحة بال."
            ),
            bestSeason = "من ديسمبر إلى أبريل",
            tags = listOf("asie", "plage", "nature"),
            aliases = listOf("جزر المالديف", "maldives"),
            imageAsset = "file:///android_asset/destinations/maldives.jpg",
            services = listOf("vols", "hotels", "transferts", "yacht"),
            featured = true,
            rating = 4.9f
        ),
        Destination(
            slug = "zanzibar",
            name = "زنجبار",
            country = "تنزانيا",
            region = "إفريقيا",
            tagline = "جزيرة التوابل الساحرة، مدينة ستون تاون التراثية وشواطئ المرجان.",
            intro = "أرخبيل استوائي بديع في المحيط الهندي يجمع بين تاريخ ستون تاون السواحيلي والعربي (اليونسكو) والشواطئ الفيروزية ذات الرمال البيضاء البكر.",
            highlights = listOf(
                "المدينة الحجرية التاريخية ستون تاون وأبوابها الخشبية المنقوشة (اليونسكو)",
                "شواطئ نونغوي وكينيدوا الخلابة بمياهها الفيروزية الثابتة",
                "جولات مزارع التوابل الطبيعية (القرنفل والقرفة والفانيليا)",
                "رحلة جزيرة ناكوبيندا الرملية والسباحة برفقة الدلافين"
            ),
            tips = listOf(
                "تذوق المأكولات البحرية المشوية الطازجة في سوق حدائق فوروداني الليلي."
            ),
            bestSeason = "من يونيو إلى أكتوبر ومن ديسمبر إلى فبراير",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("zanzibar", "تنزانيا"),
            imageAsset = "file:///android_asset/destinations/zanzibar.jpg",
            services = listOf("vols", "hotels", "transferts", "activites"),
            featured = false,
            rating = 4.8f
        ),
        Destination(
            slug = "djerba",
            name = "جربة",
            country = "تونس",
            region = "إفريقيا",
            tagline = "جزيرة الأحلام التونسية، بساتين النخيل وشواطئ الاسترخاء الهادئة.",
            intro = "جزيرة الهدوء والسكينة في الجنوب التونسي، المشهورة بمنازل المنازل البيضاء وقرية جربة هود للفنون الجدارية والشواطئ الرملية الممتدة.",
            highlights = listOf(
                "جداريات الرسم وفنون الشارع العالمية في قرية جربة هود",
                "أسواق حومة السوق التقليدية ومحلات الفخار والخزف اليدوي",
                "الشواطئ الرملية الممتدة على البحر المتوسط المحاطة بأشجار النخيل",
                "كنيس الغريبة التاريخي والمساجد المحصنة القديمة"
            ),
            tips = listOf(
                "استأجر دراجة أو سيارة صغيرة للتجول الممتع بين مسارات الجزيرة الساحلية."
            ),
            bestSeason = "من أبريل إلى أكتوبر",
            tags = listOf("afrique", "plage", "culture"),
            aliases = listOf("djerba", "تونس"),
            imageAsset = "file:///android_asset/destinations/djerba.jpg",
            services = listOf("vols", "hotels", "transferts", "location-voiture"),
            featured = false,
            rating = 4.7f
        ),
        Destination(
            slug = "sarajevo",
            name = "سراييفو",
            country = "البوسنة والهرسك",
            region = "أوروبا",
            tagline = "قدس أوروبا، العمارة العثمانية الخالدة وسحر الطبيعة الجبلية.",
            intro = "عاصمة دافئة محاطة بسلاسل الجبال الأولمبية، تتلاقى فيها المآذن العثمانية بحي باشتشارشيا التاريخي والكنائس والجسور القديمة فوق نهر ميلجاكا.",
            highlights = listOf(
                "حي باشتشارشيا العثماني العريق ونافورة السبيل الخشبية الشهيرة",
                "جامع الغازي خسرو بك التاريخي من القرن السادس عشر",
                "الجسر اللاتيني التاريخي ومتحف نفق الأمل",
                "تلفريك جبل تريبيفيتش وإطلالاته البانورامية الساحرة على الوادي"
            ),
            tips = listOf(
                "تذوق الكباب البوسني التقليدي (الكباب التشيفابي) مع فنجان قهوة بوسنية مهيلة."
            ),
            bestSeason = "من مايو إلى أكتوبر",
            tags = listOf("europe", "culture", "nature"),
            aliases = listOf("sarajevo", "البوسنة"),
            imageAsset = "file:///android_asset/destinations/sarajevo.jpg",
            services = listOf("vols", "hotels", "transferts", "guides"),
            featured = false,
            rating = 4.8f
        )
    )
}
