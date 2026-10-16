package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.*
import androidx.compose.animation.core.*
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
import com.example.manasik.data.repository.DestinationsRepository
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
            var selectedDestinationSlug by remember { mutableStateOf<String?>(null) }
            val selectedDestination: Destination? = remember(selectedDestinationSlug, currentLanguage) {
                selectedDestinationSlug?.let { slug ->
                    DestinationsRepository.getDestinationBySlug(slug, currentLanguage)
                }
            }

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

            val currentStrings = remember(currentLanguage) {
                com.example.manasik.data.i18n.I18nManager.getStrings(currentLanguage)
            }
            val layoutDirection = remember(currentLanguage) {
                com.example.manasik.data.i18n.I18nManager.getLayoutDirection(currentLanguage)
            }

            CompositionLocalProvider(
                com.example.manasik.data.i18n.LocalAppStrings provides currentStrings,
                androidx.compose.ui.platform.LocalLayoutDirection provides layoutDirection,
                com.example.manasik.data.i18n.LocalCurrentLanguage provides currentLanguage
            ) {
                ManasikBaytTheme(darkTheme = isDarkTheme) {
                    BackHandler(enabled = (selectedDestinationSlug == null && selectedTab != MainNavigationTab.HOME)) {
                        selectedTab = MainNavigationTab.HOME
                    }
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        topBar = {
                            if (selectedDestinationSlug == null) {
                                AppTopBar(
                                    isDarkTheme = isDarkTheme,
                                    onToggleTheme = { isDarkTheme = !isDarkTheme },
                                    currentLanguage = currentLanguage,
                                    onSelectLanguage = { currentLanguage = it }
                                )
                            }
                        },
                        bottomBar = {
                            if (selectedDestinationSlug == null) {
                                com.example.manasik.ui.components.ThreeDIconBottomNavBar(
                                    selectedTab = selectedTab,
                                    onTabSelected = { selectedTab = it },
                                    isDark = isDarkTheme
                                )
                            }
                        },
                        floatingActionButton = {
                            if (selectedDestinationSlug == null) {
                                LiquidGlassButton(
                                    onClick = { openQuote("", currentStrings.quote) },
                                    isGold = true,
                                    shape = RoundedCornerShape(percent = 50),
                                    modifier = Modifier.testTag("fab_quote")
                                ) {
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.Send,
                                        contentDescription = currentStrings.quote,
                                        tint = Color(0xFF092E52),
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        currentStrings.quote,
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
                                    destination = selectedDestination,
                                    onBack = { selectedDestinationSlug = null },
                                    onRequestQuote = { destName ->
                                        openQuote(destName, currentStrings.quote)
                                    },
                                    onOpenTravelpayoutsWidget = { slug, destHint ->
                                        openTravelpayoutsWidget(slug, destHint)
                                    },
                                    onSelectLanguage = { currentLanguage = it }
                                )
                            } else {
                            AnimatedContent(
                                targetState = selectedTab,
                                label = "tab_animation",
                                transitionSpec = {
                                    val forward = targetState.ordinal > initialState.ordinal
                                    val enterSpec = slideInHorizontally(
                                        animationSpec = spring(
                                            dampingRatio = Spring.DampingRatioLowBouncy,
                                            stiffness = Spring.StiffnessMediumLow
                                        )
                                    ) { width -> if (forward) width / 3 else -width / 3 } +
                                    fadeIn(
                                        animationSpec = tween(durationMillis = 280, easing = FastOutSlowInEasing)
                                    )

                                    val exitSpec = slideOutHorizontally(
                                        animationSpec = spring(
                                            dampingRatio = Spring.DampingRatioNoBouncy,
                                            stiffness = Spring.StiffnessMediumLow
                                        )
                                    ) { width -> if (forward) -width / 3 else width / 3 } +
                                    fadeOut(
                                        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing)
                                    )

                                    (enterSpec togetherWith exitSpec).using(SizeTransform(clip = false))
                                }
                            ) { tab ->
                                when (tab) {
                                    MainNavigationTab.HOME -> HomeScreen(
                                        onNavigateToDestinations = { selectedTab = MainNavigationTab.DESTINATIONS },
                                        onNavigateToServices = { selectedTab = MainNavigationTab.SERVICES },
                                        onNavigateToPackages = { selectedTab = MainNavigationTab.PACKAGES },
                                        onSelectDestination = { dest -> selectedDestinationSlug = dest.slug },
                                        onOpenQuoteDialog = { dest, serv -> openQuote(dest, serv) },
                                        onOpenTravelpayoutsWidget = { slug, destHint ->
                                            openTravelpayoutsWidget(slug, destHint)
                                        }
                                    )
                                    MainNavigationTab.DESTINATIONS -> DestinationsScreen(
                                        onSelectDestination = { dest -> selectedDestinationSlug = dest.slug },
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
}
