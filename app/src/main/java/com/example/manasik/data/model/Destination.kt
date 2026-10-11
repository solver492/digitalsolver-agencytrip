package com.example.manasik.data.model

data class Destination(
    val slug: String,
    val name: String,
    val country: String,
    val region: String,
    val tagline: String,
    val intro: String,
    val highlights: List<String>,
    val tips: List<String>,
    val bestSeason: String,
    val tags: List<String>,
    val aliases: List<String>,
    val imageAsset: String,
    val services: List<String>,
    val featured: Boolean = false,
    val rating: Float = 4.9f
)
