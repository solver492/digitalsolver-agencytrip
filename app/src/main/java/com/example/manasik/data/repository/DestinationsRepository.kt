package com.example.manasik.data.repository

import com.example.manasik.data.model.Destination
import com.example.manasik.data.repository.destinations.ArabicDestinations
import com.example.manasik.data.repository.destinations.EnglishDestinations
import com.example.manasik.data.repository.destinations.FrenchDestinations
import com.example.manasik.data.repository.destinations.SpanishDestinations

object DestinationsRepository {

    val allDestinations: List<Destination>
        get() = getDestinations("FR")

    fun getServiceLabel(serviceSlug: String, languageCode: String): String {
        return when (languageCode.uppercase()) {
            "AR" -> when (serviceSlug) {
                "vols" -> "طيران وتذاكر"
                "hotels" -> "فنادق وإقامات"
                "transferts" -> "مواصلات ونقل"
                "guides" -> "مزارات وإرشاد"
                "activites" -> "أنشطة وجولات"
                "esim" -> "شريحة إنترنت eSIM"
                "location-voiture" -> "تأجير سيارات"
                "yacht" -> "استئجار يخت"
                "bagages" -> "حفظ الأمتعة"
                "indemnisation" -> "تعويضات الطيران"
                else -> serviceSlug.replaceFirstChar { it.uppercase() }
            }
            "EN" -> when (serviceSlug) {
                "vols" -> "Flights"
                "hotels" -> "Hotels & Stays"
                "transferts" -> "Transfers"
                "guides" -> "Guides & Ziyarat"
                "activites" -> "Activities & Tours"
                "esim" -> "International eSIM"
                "location-voiture" -> "Car Rental"
                "yacht" -> "Yacht Rental"
                "bagages" -> "Luggage Storage"
                "indemnisation" -> "Flight Compensation"
                else -> serviceSlug.replaceFirstChar { it.uppercase() }
            }
            "ES" -> when (serviceSlug) {
                "vols" -> "Vuelos"
                "hotels" -> "Hoteles y Alojamientos"
                "transferts" -> "Traslados"
                "guides" -> "Guías y Visitas"
                "activites" -> "Actividades y Excursiones"
                "esim" -> "eSIM Internacional"
                "location-voiture" -> "Alquiler de Coches"
                "yacht" -> "Alquiler de Yates"
                "bagages" -> "Consigna de Equipaje"
                "indemnisation" -> "Indemnización de Vuelo"
                else -> serviceSlug.replaceFirstChar { it.uppercase() }
            }
            else -> when (serviceSlug) {
                "vols" -> "Vols & Billetterie"
                "hotels" -> "Hôtels & Hébergements"
                "transferts" -> "Transferts Privés"
                "guides" -> "Guides & Ziyarat"
                "activites" -> "Activités & Excursions"
                "esim" -> "eSIM Internationale"
                "location-voiture" -> "Location de Voiture"
                "yacht" -> "Location de Yacht"
                "bagages" -> "Consignes à Bagages"
                "indemnisation" -> "Indemnisation Vol"
                else -> serviceSlug.replaceFirstChar { it.uppercase() }
            }
        }
    }

    fun getDestinations(languageCode: String): List<Destination> {
        return when (languageCode.uppercase()) {
            "AR" -> ArabicDestinations.list
            "EN" -> EnglishDestinations.list
            "ES" -> SpanishDestinations.list
            else -> FrenchDestinations.list
        }
    }

    fun getDestinationBySlug(slug: String, languageCode: String): Destination? {
        val list = getDestinations(languageCode)
        return list.find { it.slug == slug }
            ?: FrenchDestinations.list.find { it.slug == slug }
    }
}
