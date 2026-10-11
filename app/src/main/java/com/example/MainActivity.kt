package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Assignment
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.CardTravel
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.MiscellaneousServices
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.manasik.data.model.Destination
import com.example.manasik.ui.components.AppTopBar
import com.example.manasik.ui.components.LiquidGlassButton
import com.example.manasik.ui.components.QuoteDialog
import com.example.manasik.ui.components.TravelpayoutsWidgetDialog
import com.example.manasik.ui.screens.*
import com.example.manasik.ui.theme.ManasikBaytTheme

enum class MainNavigationTab(val title: String, val icon: androidx.compose.ui.graphics.vector.ImageVector) {
    HOME("Accueil", Icons.Default.Home),
    DESTINATIONS("Destinations", Icons.Default.Place),
    SERVICES("Services", Icons.Default.MiscellaneousServices),
    PACKAGES("Forfaits", Icons.Default.CardTravel),
    QUOTES_FAQ("Devis & Aide", Icons.AutoMirrored.Filled.Assignment)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val systemDark = isSystemInDarkTheme()
            var isDarkTheme by remember { mutableStateOf(systemDark) }
            var currentLanguage by remember { mutableStateOf("FR") }
            var selectedTab by remember { mutableStateOf(MainNavigationTab.HOME) }
            var selectedDestination by remember { mutableStateOf<Destination?>(null) }

            var isQuoteDialogOpen by remember { mutableStateOf(false) }
            var quoteInitialDestination by remember { mutableStateOf("") }
            var quoteInitialService by remember { mutableStateOf("Forfait complet") }

            var activeTpDialogServiceSlug by remember { mutableStateOf<String?>(null) }
            var activeTpDialogDestinationHint by remember { mutableStateOf("") }

            fun openQuote(dest: String = "", service: String = "Forfait complet") {
                quoteInitialDestination = dest
                quoteInitialService = service
                isQuoteDialogOpen = true
            }

            fun openTravelpayoutsWidget(serviceSlug: String, destinationHint: String = "") {
                activeTpDialogServiceSlug = serviceSlug
                activeTpDialogDestinationHint = destinationHint
            }

            ManasikBaytTheme(darkTheme = isDarkTheme) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        if (selectedDestination == null) {
                            AppTopBar(
                                isDarkTheme = isDarkTheme,
                                onToggleTheme = { isDarkTheme = !isDarkTheme },
                                currentLanguage = currentLanguage,
                                onSelectLanguage = { currentLanguage = it }
                            )
                        }
                    },
                    bottomBar = {
                        if (selectedDestination == null) {
                            NavigationBar(
                                containerColor = MaterialTheme.colorScheme.surface,
                                modifier = Modifier.testTag("main_bottom_nav")
                            ) {
                                MainNavigationTab.values().forEach { tab ->
                                    NavigationBarItem(
                                        selected = selectedTab == tab,
                                        onClick = { selectedTab = tab },
                                        icon = {
                                            Icon(
                                                imageVector = tab.icon,
                                                contentDescription = tab.title
                                            )
                                        },
                                        label = { Text(tab.title) },
                                        modifier = Modifier.testTag("nav_${tab.name.lowercase()}")
                                    )
                                }
                            }
                        }
                    },
                    floatingActionButton = {
                        if (selectedDestination == null) {
                            LiquidGlassButton(
                                onClick = { openQuote("", "Devis Express") },
                                isGold = true,
                                shape = RoundedCornerShape(percent = 50),
                                modifier = Modifier.testTag("fab_quote")
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.Send,
                                    contentDescription = null,
                                    tint = Color(0xFF092E52),
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    "Devis",
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF092E52)
                                )
                            }
                        }
                    }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        if (selectedDestination != null) {
                            DestinationDetailScreen(
                                destination = selectedDestination!!,
                                onBack = { selectedDestination = null },
                                onRequestQuote = { destName ->
                                    openQuote(destName, "Séjour destination")
                                },
                                onOpenTravelpayoutsWidget = { slug, destHint ->
                                    openTravelpayoutsWidget(slug, destHint)
                                }
                            )
                        } else {
                            AnimatedContent(targetState = selectedTab, label = "tab_animation") { tab ->
                                when (tab) {
                                    MainNavigationTab.HOME -> HomeScreen(
                                        onNavigateToDestinations = { selectedTab = MainNavigationTab.DESTINATIONS },
                                        onNavigateToServices = { selectedTab = MainNavigationTab.SERVICES },
                                        onNavigateToPackages = { selectedTab = MainNavigationTab.PACKAGES },
                                        onSelectDestination = { dest -> selectedDestination = dest },
                                        onOpenQuoteDialog = { dest, serv -> openQuote(dest, serv) },
                                        onOpenTravelpayoutsWidget = { slug, destHint ->
                                            openTravelpayoutsWidget(slug, destHint)
                                        }
                                    )
                                    MainNavigationTab.DESTINATIONS -> DestinationsScreen(
                                        onSelectDestination = { dest -> selectedDestination = dest },
                                        onOpenQuoteDialog = { dest, serv -> openQuote(dest, serv) }
                                    )
                                    MainNavigationTab.SERVICES -> ServicesScreen(
                                        onOpenQuoteDialog = { dest, serv -> openQuote(dest, serv) },
                                        onOpenTravelpayoutsWidget = { slug, destHint ->
                                            openTravelpayoutsWidget(slug, destHint)
                                        }
                                    )
                                    MainNavigationTab.PACKAGES -> PackagesScreen(
                                        onOpenQuoteDialog = { dest, serv -> openQuote(dest, serv) }
                                    )
                                    MainNavigationTab.QUOTES_FAQ -> QuotesAndFaqScreen(
                                        onOpenQuoteDialog = { dest, serv -> openQuote(dest, serv) }
                                    )
                                }
                            }
                        }

                        if (activeTpDialogServiceSlug != null) {
                            TravelpayoutsWidgetDialog(
                                initialServiceSlug = activeTpDialogServiceSlug!!,
                                destinationHint = activeTpDialogDestinationHint,
                                isDarkTheme = isDarkTheme,
                                onDismiss = { activeTpDialogServiceSlug = null },
                                onOpenWhatsAppQuote = { dest, serviceTitle ->
                                    openQuote(dest, serviceTitle)
                                }
                            )
                        }

                        if (isQuoteDialogOpen) {
                            QuoteDialog(
                                initialDestination = quoteInitialDestination,
                                initialServiceType = quoteInitialService,
                                onDismiss = { isQuoteDialogOpen = false }
                            )
                        }
                    }
                }
            }
        }
    }
}
