package com.example.manasik.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.manasik.data.model.Destination
import com.example.manasik.data.repository.DestinationsRepository
import com.example.manasik.ui.components.AssetImage
import com.example.manasik.ui.components.LiquidGlassBadge
import com.example.manasik.ui.components.LiquidGlassButton
import com.example.manasik.ui.components.LiquidGlassCard
import com.example.manasik.ui.components.TravelpayoutsWidgetView
import com.example.manasik.ui.components.getServiceIcon

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DestinationDetailScreen(
    destination: Destination,
    onBack: () -> Unit,
    onRequestQuote: (destination: String) -> Unit,
    onOpenTravelpayoutsWidget: (serviceSlug: String, destinationHint: String) -> Unit = { _, _ -> },
    onSelectLanguage: (String) -> Unit = {}
) {
    val strings = com.example.manasik.data.i18n.LocalAppStrings.current
    val currentLanguage = com.example.manasik.data.i18n.LocalCurrentLanguage.current
    var selectedServiceSlug by remember(destination.slug) {
        mutableStateOf(destination.services.firstOrNull() ?: "vols")
    }
    var showLangMenu by remember { mutableStateOf(false) }

    BackHandler {
        onBack()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            AssetImage(
                assetPath = destination.imageAsset,
                contentDescription = destination.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.50f),
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.88f)
                            )
                        )
                    )
            )

            IconButton(
                onClick = onBack,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.TopStart)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.55f))
                    .testTag("destination_back_button")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = strings.back,
                    tint = Color.White
                )
            }

            // Top-right controls: Language Selector + Rating
            Row(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Interactive Language Switcher for instant live translation on the detail screen
                Box {
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = MaterialTheme.colorScheme.surface.copy(alpha = 0.90f),
                        modifier = Modifier
                            .clickable { showLangMenu = true }
                            .testTag("detail_lang_switcher")
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 9.dp, vertical = 6.dp)
                        ) {
                            val flag = when (currentLanguage.uppercase()) {
                                "EN" -> "🇬🇧 EN"
                                "AR" -> "🇸🇦 ع"
                                "ES" -> "🇪🇸 ES"
                                else -> "🇫🇷 FR"
                            }
                            Text(
                                text = flag,
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }

                    DropdownMenu(
                        expanded = showLangMenu,
                        onDismissRequest = { showLangMenu = false }
                    ) {
                        val languages = listOf(
                            Triple("FR", "Français", "🇫🇷"),
                            Triple("EN", "English", "🇬🇧"),
                            Triple("AR", "العربية", "🇸🇦"),
                            Triple("ES", "Español", "🇪🇸")
                        )
                        languages.forEach { (code, name, flag) ->
                            DropdownMenuItem(
                                text = {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Text(text = "$flag  $name", fontWeight = if (currentLanguage == code) FontWeight.Bold else FontWeight.Normal)
                                        if (currentLanguage == code) {
                                            Spacer(modifier = Modifier.width(8.dp))
                                            Text(text = "✓", color = Color(0xFFD4AF37), fontWeight = FontWeight.Bold)
                                        }
                                    }
                                },
                                onClick = {
                                    onSelectLanguage(code)
                                    showLangMenu = false
                                }
                            )
                        }
                    }
                }

                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = MaterialTheme.colorScheme.surface.copy(alpha = 0.90f)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 9.dp, vertical = 6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(0xFFD4AF37),
                            modifier = Modifier.size(15.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "${destination.rating}",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                LiquidGlassBadge(
                    text = "${destination.country} • ${destination.region}",
                    textColor = Color(0xFFD4AF37),
                    modifier = Modifier.padding(bottom = 6.dp)
                )
                Text(
                    text = destination.name,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        Column(modifier = Modifier.padding(20.dp)) {
            Text(
                text = destination.tagline,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFD4AF37)
            )

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = destination.intro,
                style = MaterialTheme.typography.bodyLarge,
                lineHeight = MaterialTheme.typography.bodyLarge.lineHeight,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(24.dp))

            LiquidGlassCard(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = null,
                        tint = Color(0xFFD4AF37),
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = strings.bestSeason,
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFD4AF37)
                        )
                        Text(
                            text = destination.bestSeason,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            if (destination.highlights.isNotEmpty()) {
                Text(
                    text = strings.highlights,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(12.dp))
                destination.highlights.forEach { highlight ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = null,
                            tint = Color(0xFFD4AF37),
                            modifier = Modifier
                                .size(20.dp)
                                .padding(top = 2.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = highlight,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            if (destination.tips.isNotEmpty()) {
                Text(
                    text = strings.travelTips,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(12.dp))
                destination.tips.forEach { tip ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.secondary,
                            modifier = Modifier
                                .size(20.dp)
                                .padding(top = 2.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = tip,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            Text(
                text = "${strings.bookDestination} : ${destination.name}",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = strings.expressBookingSubtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(10.dp))
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                destination.services.forEach { serviceSlug ->
                    val serviceLabel = DestinationsRepository.getServiceLabel(serviceSlug, currentLanguage)
                    FilterChip(
                        selected = selectedServiceSlug == serviceSlug,
                        onClick = { selectedServiceSlug = serviceSlug },
                        leadingIcon = {
                            Icon(
                                imageVector = getServiceIcon(serviceSlug),
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                        },
                        label = { Text(serviceLabel) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            TravelpayoutsWidgetView(
                serviceSlug = selectedServiceSlug,
                destinationHint = destination.name,
                minHeight = 310.dp
            )

            Spacer(modifier = Modifier.height(14.dp))

            LiquidGlassButton(
                onClick = { onOpenTravelpayoutsWidget(selectedServiceSlug, destination.name) },
                isGold = false,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Default.OpenInFull,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = strings.openFullComparator,
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            LiquidGlassButton(
                onClick = { onRequestQuote(destination.name) },
                isGold = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("detail_request_quote_button")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.Send,
                    contentDescription = null,
                    tint = Color(0xFF092E52),
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "${strings.requestQuoteForThis} (${destination.name})",
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF092E52)
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}
