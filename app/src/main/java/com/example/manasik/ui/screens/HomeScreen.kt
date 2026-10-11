package com.example.manasik.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.manasik.data.model.Destination
import com.example.manasik.data.repository.DestinationsRepository
import com.example.manasik.data.repository.PackagesRepository
import com.example.manasik.data.repository.ServicesRepository
import com.example.manasik.data.repository.TestimonialsRepository
import com.example.manasik.ui.components.AssetImage
import com.example.manasik.ui.components.LiquidGlassBadge
import com.example.manasik.ui.components.LiquidGlassButton
import com.example.manasik.ui.components.LiquidGlassCard
import com.example.manasik.ui.components.TravelpayoutsWidgetView
import com.example.manasik.ui.components.getServiceIcon

@Composable
fun HomeScreen(
    onNavigateToDestinations: () -> Unit,
    onNavigateToServices: () -> Unit,
    onNavigateToPackages: () -> Unit,
    onSelectDestination: (Destination) -> Unit,
    onOpenQuoteDialog: (destination: String, service: String) -> Unit,
    onOpenTravelpayoutsWidget: (serviceSlug: String, destinationHint: String) -> Unit = { _, _ -> }
) {
    val context = LocalContext.current
    var searchDestination by remember { mutableStateOf("") }
    var travelersCount by remember { mutableIntStateOf(2) }
    var selectedDates by remember { mutableStateOf("") }
    var activeTpTabSlug by remember { mutableStateOf("vols") }
    var showHomeLiveWidget by remember { mutableStateOf(true) }

    val featuredDestinations = remember {
        DestinationsRepository.allDestinations.filter { it.featured }
    }
    val services = remember { ServicesRepository.allServices }
    val featuredPackages = remember { PackagesRepository.allPackages.take(3) }
    val testimonials = remember { TestimonialsRepository.allTestimonials }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Hero Section with AssetImage
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(310.dp)
        ) {
            AssetImage(
                assetPath = "images/hero-banner.jpg",
                contentDescription = "Bannière Manasik Bayt Travel",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            // Liquid Dark Gradient Overlay
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.35f),
                                Color.Black.copy(alpha = 0.88f)
                            )
                        )
                    )
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(20.dp)
            ) {
                LiquidGlassBadge(
                    text = "AGENCE DE VOYAGE AGRÉÉE",
                    textColor = Color(0xFFD4AF37),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Voyagez avec\nManasik Bayt Travel",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Vols, hôtels, transferts, forfaits Omra & séjours sur mesure au meilleur prix.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }

        // Travelpayouts Multi-Service Search Widget & Quick Quote Card
        LiquidGlassCard(
            shape = RoundedCornerShape(22.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .testTag("home_quick_quote_card")
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.TravelExplore,
                            contentDescription = null,
                            tint = Color(0xFFD4AF37)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Réservation & Devis Express",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    TextButton(
                        onClick = { showHomeLiveWidget = !showHomeLiveWidget },
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = if (showHomeLiveWidget) "Mode Formulaire" else "Widget Direct",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFD4AF37)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Quick Service Selector Tabs for Travelpayouts Scripts
                val quickTabs = listOf(
                    "vols" to "Vols",
                    "hotels" to "Hôtels",
                    "transferts" to "Transferts",
                    "esim" to "eSIM",
                    "location-voiture" to "Voitures",
                    "activites" to "Activités"
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(quickTabs) { (slug, label) ->
                        FilterChip(
                            selected = activeTpTabSlug == slug,
                            onClick = { activeTpTabSlug = slug },
                            leadingIcon = {
                                Icon(
                                    imageVector = getServiceIcon(slug),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                            },
                            label = { Text(label) },
                            modifier = Modifier.testTag("home_tp_tab_$slug")
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                if (showHomeLiveWidget) {
                    TravelpayoutsWidgetView(
                        serviceSlug = activeTpTabSlug,
                        destinationHint = searchDestination,
                        minHeight = 290.dp
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

                OutlinedTextField(
                    value = searchDestination,
                    onValueChange = { searchDestination = it },
                    label = { Text("Destination souhaitée") },
                    placeholder = { Text("La Mecque, Médine, Istanbul, Dubaï...") },
                    leadingIcon = {
                        Icon(Icons.Default.LocationOn, contentDescription = null, tint = Color(0xFFD4AF37))
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("home_search_destination_input"),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Departure period input
                OutlinedTextField(
                    value = selectedDates,
                    onValueChange = { selectedDates = it },
                    label = { Text("Période souhaitée") },
                    placeholder = { Text("Ex: Novembre 2026, Ramadan...") },
                    leadingIcon = {
                        Icon(Icons.Default.CalendarToday, contentDescription = null, tint = Color(0xFFD4AF37))
                    },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Travelers Count Selector (Full width, no cramped text)
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Group,
                                contentDescription = null,
                                tint = Color(0xFFD4AF37),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Nombre de voyageurs :",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            FilledTonalIconButton(
                                onClick = { if (travelersCount > 1) travelersCount-- },
                                enabled = travelersCount > 1,
                                modifier = Modifier.size(36.dp)
                            ) {
                                Icon(Icons.Default.Remove, contentDescription = "Moins", modifier = Modifier.size(16.dp))
                            }
                            Text(
                                text = " $travelersCount ",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                            FilledTonalIconButton(
                                onClick = { if (travelersCount < 50) travelersCount++ },
                                modifier = Modifier.size(36.dp)
                            ) {
                                Icon(Icons.Default.Add, contentDescription = "Plus", modifier = Modifier.size(16.dp))
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Liquid Glass Button
                LiquidGlassButton(
                    onClick = {
                        onOpenQuoteDialog(searchDestination, "Devis Express")
                    },
                    isGold = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("home_submit_quote_btn")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = null,
                        tint = Color(0xFF092E52),
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Demander un devis gratuit",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF092E52)
                    )
                }
            }
        }

        // Section: Destinations Coup de Cœur
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Destinations Phares",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "Lieux saints & escapades d'exception",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            TextButton(
                onClick = onNavigateToDestinations,
                modifier = Modifier.testTag("see_all_destinations_btn")
            ) {
                Text("Tout voir")
            }
        }

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(featuredDestinations) { dest ->
                LiquidGlassCard(
                    shape = RoundedCornerShape(18.dp),
                    modifier = Modifier
                        .width(230.dp)
                        .clickable { onSelectDestination(dest) }
                        .testTag("featured_dest_${dest.slug}")
                ) {
                    Box(modifier = Modifier.height(140.dp)) {
                        AssetImage(
                            assetPath = dest.imageAsset,
                            contentDescription = dest.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp))
                        )
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = MaterialTheme.colorScheme.surface.copy(alpha = 0.85f),
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(8.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFD4AF37),
                                    modifier = Modifier.size(12.dp)
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(
                                    text = "${dest.rating}",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                    Column(modifier = Modifier.padding(14.dp)) {
                        Text(
                            text = dest.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = dest.country,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFFD4AF37),
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        LiquidGlassButton(
                            onClick = { onSelectDestination(dest) },
                            isGold = false,
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                "Découvrir",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Section: Nos Services
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Nos Services",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "Tout pour organiser votre voyage sereinement",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            TextButton(
                onClick = onNavigateToServices,
                modifier = Modifier.testTag("see_all_services_btn")
            ) {
                Text("Explorer")
            }
        }

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(services) { service ->
                LiquidGlassCard(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(190.dp)
                        .clickable { onOpenTravelpayoutsWidget(service.slug, searchDestination) }
                        .testTag("home_service_${service.slug}")
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = MaterialTheme.colorScheme.primaryContainer,
                            modifier = Modifier.size(42.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = getServiceIcon(service.slug),
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = service.title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = service.shortDesc,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 2
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Section: Forfaits en Vedette
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Forfaits Populaires",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "Formules complètes clés en main",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            TextButton(
                onClick = onNavigateToPackages,
                modifier = Modifier.testTag("see_all_packages_btn")
            ) {
                Text("Voir tout")
            }
        }

        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            featuredPackages.forEach { pkg ->
                LiquidGlassCard(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onOpenQuoteDialog(pkg.location, pkg.title) }
                        .testTag("home_package_${pkg.id}")
                ) {
                    Box(modifier = Modifier.height(160.dp)) {
                        AssetImage(
                            assetPath = pkg.imageAsset,
                            contentDescription = pkg.title,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                        )
                        LiquidGlassBadge(
                            text = pkg.price,
                            textColor = Color(0xFFD4AF37),
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(10.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = pkg.title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = pkg.description,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.AccessTime,
                                    contentDescription = null,
                                    tint = Color(0xFFD4AF37),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = pkg.duration,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                            LiquidGlassButton(
                                onClick = { onOpenQuoteDialog(pkg.location, pkg.title) },
                                isGold = true,
                                shape = RoundedCornerShape(14.dp)
                            ) {
                                Text(
                                    "En savoir plus",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF092E52)
                                )
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Section: Avis Voyageurs
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f))
                .padding(vertical = 20.dp)
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "Avis Voyageurs",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Ils voyagent en toute confiance avec Manasik Bayt Travel",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.height(14.dp))
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                items(testimonials) { test ->
                    LiquidGlassCard(
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier.width(290.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = test.name,
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold
                                )
                                Row {
                                    repeat(test.rating) {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = null,
                                            tint = Color(0xFFD4AF37),
                                            modifier = Modifier.size(14.dp)
                                        )
                                    }
                                }
                            }
                            Text(
                                text = "${test.destination} • ${test.date}",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color(0xFFD4AF37)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "« ${test.comment} »",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Contact Agency Banner (Fixed layout: perfectly balanced buttons without text wrapping)
        LiquidGlassCard(
            shape = RoundedCornerShape(22.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .testTag("home_contact_banner")
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Prêt pour votre prochain voyage ?",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Notre équipe d'experts est disponible pour concevoir votre itinéraire sur mesure.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(18.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    LiquidGlassButton(
                        onClick = {
                            val intent = Intent(Intent.ACTION_DIAL).apply {
                                data = Uri.parse("tel:+212661631160")
                            }
                            context.startActivity(intent)
                        },
                        isGold = true,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            Icons.Default.Phone,
                            contentDescription = null,
                            tint = Color(0xFF092E52),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            "+212 661 631 160",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF092E52),
                            maxLines = 1
                        )
                    }

                    LiquidGlassButton(
                        onClick = {
                            val intent = Intent(Intent.ACTION_SENDTO).apply {
                                data = Uri.parse("mailto:contact@manasiktravelagency.com")
                                putExtra(Intent.EXTRA_SUBJECT, "Demande d'information voyage")
                            }
                            context.startActivity(intent)
                        },
                        isGold = false,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            Icons.Default.Email,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            "Envoyer Email",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface,
                            maxLines = 1
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(80.dp))
    }
}
