package com.example.manasik.data.model

data class TravelPackage(
    val id: String,
    val title: String,
    val description: String,
    val duration: String,
    val capacity: String,
    val location: String,
    val price: String,
    val rating: Float = 5.0f,
    val reviewsCount: Int = 42,
    val imageAsset: String,
    val highlights: List<String> = emptyList()
)

data class QuoteRequest(
    val id: String,
    val destination: String,
    val travelersCount: Int,
    val departureDate: String,
    val returnDate: String,
    val fullName: String,
    val email: String,
    val phone: String,
    val serviceType: String = "Forfait complet",
    val notes: String = "",
    val timestamp: Long = System.currentTimeMillis()
)

data class FaqItem(
    val category: String,
    val question: String,
    val answer: String
)

data class Testimonial(
    val name: String,
    val destination: String,
    val comment: String,
    val rating: Int = 5,
    val date: String = "2026"
)
