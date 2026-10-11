package com.example.manasik.data.model

data class ServiceItem(
    val slug: String,
    val title: String,
    val iconName: String,
    val shortDesc: String,
    val longTitle: String,
    val details: String,
    val badge: String = ""
)
