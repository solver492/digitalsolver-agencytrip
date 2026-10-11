package com.example.manasik.data.repository

import com.example.manasik.data.model.QuoteRequest
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object QuotesRepository {

    private val _quotes = MutableStateFlow<List<QuoteRequest>>(
        listOf(
            QuoteRequest(
                id = "DEV-2026-081",
                destination = "La Mecque & Médine",
                travelersCount = 4,
                departureDate = "15 Nov 2026",
                returnDate = "27 Nov 2026",
                fullName = "Ahmed El Mansouri",
                email = "ahmed.m@example.com",
                phone = "+212 661 234 567",
                serviceType = "Forfait Omra Confort 5*",
                notes = "Chambres communicantes avec vue sur le Haram souhaitées."
            )
        )
    )
    val quotes: StateFlow<List<QuoteRequest>> = _quotes.asStateFlow()

    fun submitQuote(request: QuoteRequest) {
        _quotes.value = listOf(request) + _quotes.value
    }
}
