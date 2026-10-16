package com.example.manasik.data.repository

import com.example.manasik.data.model.FaqItem

object FaqRepository {

    val allFaqs: List<FaqItem>
        get() = getFaqs("FR")

    fun getFaqs(languageCode: String): List<FaqItem> {
        return when (languageCode.uppercase()) {
            "AR" -> listOf(
                FaqItem(
                    category = "عمرة وحج",
                    question = "ما هي الإجراءات المطلوبة لأداء مناسك العمرة؟",
                    answer = "لأداء العمرة يلزمك جواز سفر صالح لمدة 6 أشهر على الأقل بعد تاريخ العودة، تأشيرة إلكترونية (سياحة أو عمرة عبر منصة نسك الرسمية)، وحجز تصاريح الطواف والروضة الشريفة. فريقنا يتكفل بكافة هذه الإجراءات نيابة عنكم."
                ),
                FaqItem(
                    category = "عمرة وحج",
                    question = "هل تقدمون باقات عمرة مخصصة أو باقات جماعية؟",
                    answer = "نعم، نقدم الخيارين : رحلات جماعية بصحبة مرشد ديني طوال العام (بما في ذلك شهر رمضان المبارك)، وأيضاً برامج مخصصة 100% وفق تواريخكم واختياركم للفنادق وخطوط الطيران."
                ),
                FaqItem(
                    category = "الحجز والأسعار",
                    question = "كيف يتم طلب واستلام عرض الأسعار؟",
                    answer = "طلب عرض الأسعار مجاني تماماً وبدون أي التزام. تحدد وجهتك وتواريخك وعدد المسافرين، وسيرسل لك مستشار مناسك بيت عرضاً مخصصاً ومفصلاً في أقل من 24 ساعة بأفضل الأسعار."
                ),
                FaqItem(
                    category = "الحجز والأسعار",
                    question = "هل يمكنني تعديل مواعيد السفر أو بيانات المشاركين؟",
                    answer = "نعم، التعديل متاح وفق شروط خطوط الطيران وسياسات الفنادق الشريكة. يرجى التواصل مع مستشاركم المخصص في أقرب وقت لإجراء التعديلات بأقل تكلفة ممكنة."
                ),
                FaqItem(
                    category = "الدفع والأمان",
                    question = "ما هي وسائل الدفع المعتمدة لديكم؟",
                    answer = "نقبل الدفع الآمن بالبطاقات المصرفية (Visa وMasterCard)، التحويل البنكي، بالإضافة إلى إمكانية التقسيط بدون فوائد لتيسير رحلتكم براحة بال."
                ),
                FaqItem(
                    category = "الخدمات والمساعدة",
                    question = "هل تتوفر مساعدة ميدانية في المملكة العربية السعودية وخارجها؟",
                    answer = "بالتأكيد. فور وصولكم إلى المطار وحتى عودتكم بسلام، فريقنا الميداني متاح على مدار الساعة 24/7 عبر الهاتف وواتساب للمساعدة في أي استفسار أو ظرف طارئ."
                ),
                FaqItem(
                    category = "الخدمات والمساعدة",
                    question = "كيف تعمل خدمة تعويضات الطيران عند التأخير؟",
                    answer = "في حال تأخر الرحلة أكثر من 3 ساعات أو إلغائها، يمنحك القانون الأوروبي (CE 261/2004) حق التعويض حتى 600 € لكل مسافر. يتولى فريقنا القانوني المطالبة دون أي دفع مسبق منكم، ونقتطع أتعابنا فقط عند استلام التعويض."
                )
            )

            "EN" -> listOf(
                FaqItem(
                    category = "Umrah & Pilgrimage",
                    question = "What are the requirements to perform Umrah?",
                    answer = "To perform Umrah, you need a passport valid for at least 6 months after your return date, an electronic visa (tourist or Umrah issued via the official Nusuk platform), and reserved slots for Tawaf and the Noble Rawdah in the Nusuk app. Our team handles all these procedures for you."
                ),
                FaqItem(
                    category = "Umrah & Pilgrimage",
                    question = "Do you provide custom tailor-made or group Umrah packages?",
                    answer = "Yes, we offer both formats: organized group departures with an accompanying spiritual guide year-round (including Ramadan), as well as 100% tailor-made trips according to your exact dates, chosen hotels, and preferred airlines."
                ),
                FaqItem(
                    category = "Booking & Quotes",
                    question = "How does the quote request process work?",
                    answer = "Your quote request is completely free with no obligation. Simply provide your destination, preferred dates, and number of travelers. A dedicated Manasik Bayt Travel consultant will deliver a personalized proposal within 24 hours at the best price-to-quality ratio."
                ),
                FaqItem(
                    category = "Booking & Quotes",
                    question = "Can I modify my travel dates or traveler details?",
                    answer = "Yes, modifications are possible according to the fare conditions of airlines and partner hotels. Contact your assigned consultant as soon as possible to make changes with minimal fees."
                ),
                FaqItem(
                    category = "Payment & Security",
                    question = "Which payment methods do you accept?",
                    answer = "We accept secure payments via credit card (Visa, MasterCard), bank wire transfers, and flexible interest-free installment plans to help you prepare your journey with total peace of mind."
                ),
                FaqItem(
                    category = "Services & Assistance",
                    question = "Do you provide on-site assistance in Saudi Arabia and abroad?",
                    answer = "Absolutely. From the moment you land at the airport until your return flight, our local representatives and assistance team are available 24/7 by phone and WhatsApp to assist you with any inquiries or emergencies."
                ),
                FaqItem(
                    category = "Services & Assistance",
                    question = "How does the flight compensation service work?",
                    answer = "If your flight was delayed by more than 3 hours, cancelled, or overbooked, European regulation (EC 261/2004) entitles you to up to €600 compensation per passenger. Our legal partners handle everything with zero upfront cost—fees only apply if compensation is successfully obtained."
                )
            )

            "ES" -> listOf(
                FaqItem(
                    category = "Umrah y Peregrinación",
                    question = "¿Cuáles son los requisitos para realizar la Umrah?",
                    answer = "Para realizar la Umrah necesita un pasaporte válido durante al menos 6 meses tras el regreso, visado electrónico (turismo o Umrah tramitado mediante la plataforma oficial Nusuk) y reserva de turnos para el Tawaf y la Rawdah en la app Nusuk. Nuestro equipo se encarga de todos estos trámites."
                ),
                FaqItem(
                    category = "Umrah y Peregrinación",
                    question = "¿Ofrecen paquetes de Umrah a medida o en grupo?",
                    answer = "Sí, ofrecemos ambas modalidades: salidas en grupo con guía espiritual durante todo el año (incluido el mes de Ramadán), así como viajes 100% personalizados según sus fechas deseadas, hoteles preferidos y aerolíneas."
                ),
                FaqItem(
                    category = "Reservas y Presupuestos",
                    question = "¿Cómo funciona la solicitud de presupuesto?",
                    answer = "Su solicitud de presupuesto es totalmente gratuita y sin compromiso. Indique su destino, fechas y número de viajeros. Un asesor experto de Manasik Bayt Travel le enviará una propuesta adaptada en menos de 24 horas con las mejores tarifas garantizadas."
                ),
                FaqItem(
                    category = "Reservas y Presupuestos",
                    question = "¿Puedo modificar las fechas o los viajeros de mi viaje?",
                    answer = "Sí, las modificaciones son posibles según las condiciones tarifarias de las aerolíneas y los hoteles asociados. Póngase en contacto con su asesor personal lo antes posible para tramitar el cambio con los menores costes."
                ),
                FaqItem(
                    category = "Pago y Seguridad",
                    question = "¿Qué métodos de pago aceptan?",
                    answer = "Aceptamos pagos seguros con tarjeta bancaria (Visa, MasterCard), transferencia bancaria y opciones de pago fraccionado sin comisiones para su total comodidad."
                ),
                FaqItem(
                    category = "Servicios y Asistencia",
                    question = "¿Disponemos de asistencia in situ en Arabia Saudí y en el extranjero?",
                    answer = "Por supuesto. Desde su llegada al aeropuerto hasta su regreso, nuestro equipo local está disponible 24/7 por teléfono y WhatsApp para atender cualquier consulta o necesidad médica y práctica."
                ),
                FaqItem(
                    category = "Servicios y Asistencia",
                    question = "¿Cómo funciona el servicio de indemnización de vuelos?",
                    answer = "En caso de retraso superior a 3 horas, cancelación o sobreventa, la normativa europea (CE 261/2004) le otorga hasta 600 € de indemnización por pasajero. Nuestro equipo legal se encarga de toda la reclamación sin ningún anticipo económico."
                )
            )

            else -> listOf(
                FaqItem(
                    category = "Omra & Pèlerinage",
                    question = "Quelles sont les formalités pour accomplir une Omra ?",
                    answer = "Pour effectuer une Omra, vous devez disposer d'un passeport valide au moins 6 mois après la date de retour, d'un visa électronique (tourisme ou Omra délivré via la plateforme officielle Nusuk), et réserver vos créneaux pour le Tawaf et la Rawdah Charifa dans l'application Nusuk. Notre équipe s'occupe de l'intégralité de ces démarches pour vous."
                ),
                FaqItem(
                    category = "Omra & Pèlerinage",
                    question = "Proposez-vous des forfaits Omra sur mesure ou en groupe ?",
                    answer = "Oui, nous proposons les deux formules : des départs groupés avec guide spirituel accompagnateur toute l'année (y compris pendant le Ramadan), ainsi que des séjours 100% sur mesure selon vos dates exactes, avec le choix de vos hôtels et compagnies aériennes."
                ),
                FaqItem(
                    category = "Réservation & Devis",
                    question = "Comment se déroule la demande de devis ?",
                    answer = "Votre demande de devis est totalement gratuite et sans engagement. Vous renseignez votre destination, vos dates et le nombre de voyageurs. Un conseiller expert Manasik Bayt Travel vous transmet sous 24h une proposition personnalisée au meilleur rapport qualité-prix."
                ),
                FaqItem(
                    category = "Réservation & Devis",
                    question = "Puis-je modifier les dates ou les participants de mon voyage ?",
                    answer = "Oui, les modifications sont possibles selon les conditions tarifaires des compagnies aériennes et des hôtels partenaires. Contactez directement votre conseiller attitré dès que possible pour effectuer le changement au moindre coût."
                ),
                FaqItem(
                    category = "Paiement & Sécurité",
                    question = "Quels modes de paiement acceptez-vous ?",
                    answer = "Nous acceptons les paiements sécurisés par carte bancaire (Visa, MasterCard), virement bancaire, ainsi que les règlements échelonnés en plusieurs fois sans frais pour vous permettre de préparer votre voyage en toute sérénité."
                ),
                FaqItem(
                    category = "Services & Assistance",
                    question = "Bénéficie-t-on d'une assistance sur place en Arabie saoudite et à l'étranger ?",
                    answer = "Absolument. Dès votre arrivée à l'aéroport jusqu'à votre retour, notre équipe locale et nos référents sont joignables 24h/24 et 7j/7 par téléphone et WhatsApp pour vous assister en cas d'imprévu, de besoin médical ou de question pratique."
                ),
                FaqItem(
                    category = "Services & Assistance",
                    question = "Comment fonctionne le service d'indemnisation de vol ?",
                    answer = "En cas de retard supérieur à 3 heures, d'annulation ou de surbooking, la législation européenne (CE 261/2004) vous ouvre droit jusqu'à 600 € d'indemnisation par passager. Notre équipe juridique prend en charge la réclamation de A à Z : aucune avance de frais requise, nous percevons une commission uniquement en cas de versement d'indemnité."
                )
            )
        }
    }
}
