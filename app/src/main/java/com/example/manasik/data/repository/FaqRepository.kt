package com.example.manasik.data.repository

import com.example.manasik.data.model.FaqItem

object FaqRepository {

    val allFaqs: List<FaqItem> = listOf(
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
            answer = "Nous acceptons les paiements sécurisés par carte bancaire (Visa, MasterCard), virement bancaire, ainsi que les règlements échelonnés en plusieurs fois sans frais pour vous permettre de préparer votre voyage en toute陷tranquillité."
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
