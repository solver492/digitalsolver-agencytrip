package com.example.manasik.data.repository

import com.example.manasik.data.model.Testimonial

object TestimonialsRepository {

    val allTestimonials: List<Testimonial> = listOf(
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
