package com.example.manasik.data.repository

import com.example.manasik.data.model.TravelPackage

object PackagesRepository {

    val allPackages: List<TravelPackage> = listOf(
        TravelPackage(
            id = "omra-serenite",
            title = "Forfait Omra Sérénité & Confort",
            description = "Un pèlerinage inoubliable avec hébergement 5* à quelques pas des deux Saintes Mosquées, transferts TGV Haramain et encadrement spirituel personnalisé.",
            duration = "12J / 11N",
            capacity = "Individuel, couple & famille",
            location = "Médine & La Mecque",
            price = "À partir de 1 490 €",
            rating = 5.0f,
            reviewsCount = 184,
            imageAsset = "file:///android_asset/destinations/la-mecque.jpg",
            highlights = listOf(
                "Vols réguliers directs ou avec escale courte",
                "Hôtel 5* face au Haram à La Mecque (Clock Tower / Jabal Omar)",
                "Hôtel 5* central à Médine à 150m de la Rawdah",
                "Train à grande vitesse Haramain High-Speed Rail inclus",
                "Visites guidées Ziyarat avec guide bilingue",
                "Assistance 24/7 sur place et visa Nusuk inclus"
            )
        ),
        TravelPackage(
            id = "balneaire-famille",
            title = "Séjour balnéaire en famille",
            description = "Profitez d'une escapade reposante en bord de mer : farniente, clubs enfants, activités nautiques et moments inoubliables partagés.",
            duration = "7J / 6N",
            capacity = "Jusqu'à 10 pers.",
            location = "Charm el-Cheikh & Mer Rouge",
            price = "À partir de 690 €",
            rating = 4.9f,
            reviewsCount = 92,
            imageAsset = "file:///android_asset/images/packege-1.jpg",
            highlights = listOf(
                "Resort 5* tout inclus en bord de plage privée",
                "Piscines chauffées et parc aquatique",
                "Excursion en bateau snorkeling aux récifs coralliens",
                "Transferts privés aller-retour aéroport"
            )
        ),
        TravelPackage(
            id = "escapade-nature",
            title = "Escapade nature au fil de l'eau",
            description = "Un séjour au calme, entre rivière, vallées verdoyantes et découvertes locales authentiques au cœur des grands espaces.",
            duration = "5J / 4N",
            capacity = "Jusqu'à 8 pers.",
            location = "Vallée d'Ourika & Atlas",
            price = "À partir de 450 €",
            rating = 4.8f,
            reviewsCount = 64,
            imageAsset = "file:///android_asset/images/packege-2.jpg",
            highlights = listOf(
                "Lodge écologique de charme avec vue panoramique",
                "Randonnées guidées vers les cascades",
                "Dégustation de produits du terroir et thé traditionnel",
                "Chauffeur privé durant tout le séjour"
            )
        ),
        TravelPackage(
            id = "weekend-iles",
            title = "Week-end sur une île de rêve",
            description = "Quelques jours pour profiter du soleil méditerranéen, des eaux turquoise, des criques secrètes et de la gastronomie locale.",
            duration = "4J / 3N",
            capacity = "Jusqu'à 6 pers.",
            location = "Îles méditerranéennes",
            price = "À partir de 520 €",
            rating = 4.9f,
            reviewsCount = 78,
            imageAsset = "file:///android_asset/images/packege-3.jpg",
            highlights = listOf(
                "Hôtel boutique vue mer avec petit-déjeuner gourmand",
                "Sortie privée en catamaran au coucher du soleil",
                "Visite des villages typiques aux maisons blanchies à la chaux"
            )
        ),
        TravelPackage(
            id = "istanbul-cappadoce",
            title = "Istanbul & Cappadoce Magique",
            description = "Le combiné idéal entre le faste ottoman sur le Bosphore et l'envoûtement des cheminées de fées de Cappadoce.",
            duration = "8J / 7N",
            capacity = "2 à 12 pers.",
            location = "Istanbul & Cappadoce",
            price = "À partir de 890 €",
            rating = 5.0f,
            reviewsCount = 115,
            imageAsset = "file:///android_asset/destinations/cappadoce.jpg",
            highlights = listOf(
                "4 nuits à Istanbul en hôtel de charme dans Sultanahmet",
                "3 nuits en hôtel troglodytique à Göreme (Cappadoce)",
                "Vol intérieur Istanbul - Cappadoce inclus",
                "Vol en montgolfière à l'aube inclus",
                "Croisière privée sur le Bosphore"
            )
        )
    )
}
