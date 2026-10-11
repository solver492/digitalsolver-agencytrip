package com.example.manasik.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.manasik.data.repository.ServicesRepository
import com.example.manasik.ui.components.LiquidGlassBadge
import com.example.manasik.ui.components.LiquidGlassButton
import com.example.manasik.ui.components.LiquidGlassCard
import com.example.manasik.ui.components.ScriptPayConfigSection
import com.example.manasik.ui.components.TravelpayoutsWidgetView
import com.example.manasik.ui.components.getServiceIcon

@Composable
fun ServicesScreen(
    onOpenQuoteDialog: (destination: String, service: String) -> Unit,
    onOpenTravelpayoutsWidget: (serviceSlug: String, destinationHint: String) -> Unit = { _, _ -> }
) {
    val services = remember { ServicesRepository.allServices }
    var expandedWidgetSlug by remember { mutableStateOf<String?>("vols") }
    var showBulkImporter by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Nos Services & Réservations",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "Moteurs de recherche Travelpayouts en direct & devis sur mesure",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            IconButton(
                onClick = { showBulkImporter = !showBulkImporter },
                modifier = Modifier.testTag("services_scriptpay_config_btn")
            ) {
                Icon(
                    imageVector = Icons.Default.Code,
                    contentDescription = "Configurer scriptpay.md",
                    tint = Color(0xFFD4AF37)
                )
            }
        }

        AnimatedVisibility(visible = showBulkImporter) {
            Column {
                Spacer(modifier = Modifier.height(8.dp))
                ScriptPayConfigSection(
                    currentSlug = expandedWidgetSlug ?: "vols",
                    onSaved = { showBulkImporter = false }
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 28.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(services, key = { it.slug }) { service ->
                val isWidgetExpanded = expandedWidgetSlug == service.slug

                LiquidGlassCard(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("service_card_${service.slug}")
                ) {
                    Column(modifier = Modifier.padding(18.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.weight(1f)
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = MaterialTheme.colorScheme.primaryContainer,
                                    modifier = Modifier.size(46.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = getServiceIcon(service.slug),
                                            contentDescription = null,
                                            tint = Color(0xFFD4AF37),
                                            modifier = Modifier.size(26.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(12.dp))
                                Column {
                                    Text(
                                        text = service.title,
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold
                                    )
                                    if (service.badge.isNotEmpty()) {
                                        Spacer(modifier = Modifier.height(2.dp))
                                        LiquidGlassBadge(
                                            text = service.badge,
                                            textColor = Color(0xFFD4AF37)
                                        )
                                    }
                                }
                            }

                            IconButton(
                                onClick = {
                                    expandedWidgetSlug = if (isWidgetExpanded) null else service.slug
                                }
                            ) {
                                Icon(
                                    imageVector = if (isWidgetExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                                    contentDescription = if (isWidgetExpanded) "Masquer le widget" else "Afficher le widget"
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = service.longTitle,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFD4AF37)
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = service.details,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )

                        AnimatedVisibility(visible = isWidgetExpanded) {
                            Column {
                                Spacer(modifier = Modifier.height(14.dp))
                                TravelpayoutsWidgetView(
                                    serviceSlug = service.slug,
                                    minHeight = 300.dp
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            LiquidGlassButton(
                                onClick = {
                                    onOpenTravelpayoutsWidget(service.slug, "")
                                },
                                isGold = true,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("tp_widget_btn_${service.slug}")
                            ) {
                                Icon(
                                    imageVector = Icons.Default.TravelExplore,
                                    contentDescription = null,
                                    tint = Color(0xFF092E52),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Comparateur Direct",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF092E52)
                                )
                            }

                            LiquidGlassButton(
                                onClick = { onOpenQuoteDialog("", service.title) },
                                isGold = false,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("book_service_btn_${service.slug}")
                            ) {
                                Text(
                                    text = "Devis Agence",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.SemiBold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

