package com.example.manasik.data.repository

import com.example.manasik.data.model.Testimonial

object TestimonialsRepository {

    val allTestimonials: List<Testimonial>
        get() = getTestimonials("FR")

    fun getTestimonials(languageCode: String): List<Testimonial> {
        return when (languageCode.uppercase()) {
            "AR" -> listOf(
                Testimonial(
                    name = "يوسف وفاطمة ك.",
                    destination = "عمرة رمضان المبارك",
                    comment = "تنظيم نموذجي ومتقن من الانطلاق حتى العودة. الفندق كان حرفياً على بُعد دقيقتين مشياً من الحرم، والمرشد كان في قمة الأخلاق واللطف.",
                    rating = 5,
                    date = "أكتوبر 2026"
                ),
                Testimonial(
                    name = "كريم ب.",
                    destination = "إسطنبول وكابادوكيا",
                    comment = "رحلة المنطاد عند شروق الشمس والجولة في البوسفور ستظل محفورة في ذاكرتنا. فريق مناسك بيت متاح دائماً على واتساب وسريع التجاوب!",
                    rating = 5,
                    date = "سبتمبر 2026"
                ),
                Testimonial(
                    name = "سارة م.",
                    destination = "شرم الشيخ عائلي",
                    comment = "إقامة شاملة مثالية وممتعة برفقة أطفالي الثلاثة. مواعيد التنقلات دقيقة، المنتجع راقٍ والأنشطة البحرية مبهجة للجميع.",
                    rating = 5,
                    date = "أغسطس 2026"
                )
            )

            "EN" -> listOf(
                Testimonial(
                    name = "Youssef & Fatima K.",
                    destination = "Ramadan Umrah",
                    comment = "Exemplary organization from departure to return. The hotel was literally 2 minutes walk from the Haram; our guide was incredibly kind and supportive.",
                    rating = 5,
                    date = "October 2026"
                ),
                Testimonial(
                    name = "Karim B.",
                    destination = "Istanbul & Cappadocia",
                    comment = "The sunrise hot air balloon flight and Bosphorus cruise remain unforgettable memories. Manasik team was always responsive on WhatsApp!",
                    rating = 5,
                    date = "September 2026"
                ),
                Testimonial(
                    name = "Sara M.",
                    destination = "Family Sharm El Sheikh",
                    comment = "Flawless all-inclusive stay with our 3 children. Punctual transfers, high-quality resort, and unforgettable water activities.",
                    rating = 5,
                    date = "August 2026"
                )
            )

            "ES" -> listOf(
                Testimonial(
                    name = "Youssef y Fátima K.",
                    destination = "Umrah de Ramadán",
                    comment = "Una organización ejemplar desde la salida hasta el regreso. El hotel estaba a tan solo 2 minutos a pie del Haram; nuestro guía fue de una amabilidad infinita.",
                    rating = 5,
                    date = "Octubre 2026"
                ),
                Testimonial(
                    name = "Karim B.",
                    destination = "Estambul y Capadocia",
                    comment = "El paseo en globo al amanecer y el crucero por el Bósforo quedan grabados en nuestra memoria. ¡El equipo de Manasik siempre atento por WhatsApp!",
                    rating = 5,
                    date = "Septiembre 2026"
                ),
                Testimonial(
                    name = "Sara M.",
                    destination = "Sharm el-Sheij en Familia",
                    comment = "Estancia con todo incluido perfecta con nuestros 3 hijos. Traslados puntuales, resort de máxima calidad y actividades acuáticas increíbles.",
                    rating = 5,
                    date = "Agosto 2026"
                )
            )

            else -> listOf(
                Testimonial(
                    name = "Youssef & Fatima K.",
                    destination = "Omra Ramadan",
                    comment = "Une organisation exemplaire du départ jusqu'au retour. L'hôtel était littéralement à 2 minutes à pied du Haram, notre guide a été d'une bienveillance infinie.",
                    rating = 5,
                    date = "Octobre 2026"
                ),
                Testimonial(
                    name = "Karim B.",
                    destination = "Istanbul & Cappadoce",
                    comment = "Le vol en montgolfière au lever du soleil et la croisière sur le Bosphore restent gravés dans nos mémoires. Équipe Manasik toujours réactive sur WhatsApp !",
                    rating = 5,
                    date = "Septembre 2026"
                ),
                Testimonial(
                    name = "Sara M.",
                    destination = "Charm el-Cheikh en famille",
                    comment = "Séjour tout compris parfait avec nos 3 enfants. Transferts à l'heure, resort de qualité et activités aquatiques inoubliables.",
                    rating = 5,
                    date = "Août 2026"
                )
            )
        }
    }
}
