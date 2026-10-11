package com.example.manasik.data.repository

import com.example.manasik.data.model.ServiceItem

object ServicesRepository {

    val allServices: List<ServiceItem> = listOf(
        ServiceItem(
            slug = "vols",
            title = "Vols",
            iconName = "Flight",
            shortDesc = "Réservez vos vols vers La Mecque, Médine et partout dans le monde au meilleur prix.",
            longTitle = "Réservez vos billets d'avion au meilleur tarif",
            details = "Accédez aux meilleures compagnies aériennes (Saudia, Turkish Airlines, Royal Air Maroc, Emirates, Qatar Airways...) avec franchises bagages optimisées pour le transport d'eau de Zamzam et vos séjours en famille.",
            badge = "Populaire"
        ),
        ServiceItem(
            slug = "hotels",
            title = "Hôtels",
            iconName = "Hotel",
            shortDesc = "Trouvez votre hôtel à La Mecque, Médine ou ailleurs, face au Haram ou en centre-ville.",
            longTitle = "Hôtels sélectionnés à proximité immédiate des Lieux saints",
            details = "Hôtels 3*, 4* et 5* à quelques pas de la Grande Mosquée (al-Masjid al-Haram) à La Mecque et du Masjid an-Nabawi à Médine, ainsi qu'une sélection prestigieuse dans toutes nos destinations mondiales.",
            badge = "Recommandé"
        ),
        ServiceItem(
            slug = "transferts",
            title = "Transferts aéroport",
            iconName = "DirectionsBus",
            shortDesc = "Transferts aéroport et navettes privées organisés avec chauffeurs professionnels.",
            longTitle = "Navettes privées et VIP aéroport-hôtel",
            details = "Chauffeur privé climatisé vous attendant à l'arrivée (Djeddah, Médine, Istanbul, Marrakech...) pour vos liaisons vers votre hôtel ou les gares TGV Haramain en toute sérénité.",
            badge = "Essentiel"
        ),
        ServiceItem(
            slug = "guides",
            title = "Guides & Ziyarat",
            iconName = "Explore",
            shortDesc = "Guides francophones, visites guidées et Ziyarat pour explorer sereinement.",
            longTitle = "Visites pieuses (Ziyarat) et excursions culturelles",
            details = "Guides certifiés francophones et arabophones pour vous accompagner lors des rites de l'Omra, de l'ascension du mont de la Lumière (Hira), de la visite de Quba et des batailles d'Uhud.",
            badge = "Spirituel"
        ),
        ServiceItem(
            slug = "activites",
            title = "Activités & Excursions",
            iconName = "Map",
            shortDesc = "Excursions, balades dans le désert, safari et randonnées lors de votre séjour.",
            longTitle = "Découvrez des expériences inoubliables",
            details = "Safaris dans les dunes rouges d'AlUla, plongée sous-marine en mer Rouge à Djeddah ou Charm el-Cheikh, vol en montgolfière en Cappadoce et visites guidées privées.",
            badge = "Aventure"
        ),
        ServiceItem(
            slug = "esim",
            title = "eSIM Internationale",
            iconName = "Wifi",
            shortDesc = "Restez connecté à l'étranger dès l'atterrissage sans frais d'itinérance excessifs.",
            longTitle = "Forfaits Internet haute vitesse instantanés",
            details = "Installation en 1 clic par QR code. Données 4G/5G fiables pour vos appels WhatsApp, GPS et partage de souvenirs sans changer de carte SIM physique.",
            badge = "Pratique"
        ),
        ServiceItem(
            slug = "location-voiture",
            title = "Location de voiture",
            iconName = "DirectionsCar",
            shortDesc = "Louez une berline, un SUV ou un van familial pour vos déplacements en toute liberté.",
            longTitle = "Véhicules récents et adaptés aux familles",
            details = "Tarifs transparents tout compris avec kilométrage illimité, assurance complète et possibilité de prise en charge directement à l'aéroport ou à votre hôtel.",
            badge = "Liberté"
        ),
        ServiceItem(
            slug = "yacht",
            title = "Location de yacht",
            iconName = "DirectionsBoat",
            shortDesc = "Yachts et croisières privées sur mesure en mer Rouge, Méditerranée ou Golfe.",
            longTitle = "Croisières exclusives et bateaux privés",
            details = "Journées en mer, sorties au coucher du soleil et événements privés avec équipage dédié à Djeddah, Dubaï ou dans les îles grecques.",
            badge = "Prestige"
        ),
        ServiceItem(
            slug = "bagages",
            title = "Bagages & Consignes",
            iconName = "Luggage",
            shortDesc = "Consigne et services de transport bagages pour voyager l'esprit léger.",
            longTitle = "Stockage sécurisé et transfert de vos valises",
            details = "Déposez vos valises lors de vos escales ou derniers jours pour profiter de vos visites sans être encombré, avec option de livraison directe à l'aéroport.",
            badge = "Confort"
        ),
        ServiceItem(
            slug = "indemnisation",
            title = "Indemnisation vol",
            iconName = "MonetizationOn",
            shortDesc = "Vol retardé ou annulé ? Vérifiez vos droits et réclamez jusqu'à 600 € d'indemnité.",
            longTitle = "Recouvrement simplifié des indemnités de vol",
            details = "Notre équipe juridique partenaire s'occupe de toutes les démarches auprès des compagnies sans avance de frais. Vous ne payez qu'en cas de succès.",
            badge = "Garantie"
        )
    )
}
