package com.example.manasik.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

fun getServiceIcon(slug: String): ImageVector {
    return when (slug) {
        "vols" -> Icons.Default.Flight
        "hotels" -> Icons.Default.Hotel
        "transferts" -> Icons.Default.DirectionsBus
        "guides" -> Icons.Default.Explore
        "activites" -> Icons.Default.Terrain
        "esim" -> Icons.Default.Wifi
        "location-voiture" -> Icons.Default.DirectionsCar
        "yacht" -> Icons.Default.DirectionsBoat
        "bagages" -> Icons.Default.Luggage
        "indemnisation" -> Icons.Default.MonetizationOn
        else -> Icons.Default.Luggage
    }
}
