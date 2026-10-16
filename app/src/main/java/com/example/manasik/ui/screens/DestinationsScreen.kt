package com.example.manasik.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.manasik.data.model.Destination
import com.example.manasik.data.repository.DestinationsRepository
import com.example.manasik.ui.components.DestinationCard

@Composable
fun DestinationsScreen(
    onSelectDestination: (Destination) -> Unit,
    onOpenQuoteDialog: (destination: String, service: String) -> Unit
) {
    val strings = com.example.manasik.data.i18n.LocalAppStrings.current
    val currentLanguage = com.example.manasik.data.i18n.LocalCurrentLanguage.current
    var searchQuery by remember { mutableStateOf("") }
    var selectedTag by remember { mutableStateOf("all") }

    val tags = listOf("all", "omra-hajj", "moyen-orient", "europe", "asie", "afrique", "plage", "nature", "ville")

    val destinations = remember(currentLanguage) {
        DestinationsRepository.getDestinations(currentLanguage)
    }

    val filteredDestinations = remember(searchQuery, selectedTag, destinations) {
        destinations.filter { dest ->
            val matchesQuery = searchQuery.isBlank() ||
                    dest.name.contains(searchQuery, ignoreCase = true) ||
                    dest.country.contains(searchQuery, ignoreCase = true) ||
                    dest.region.contains(searchQuery, ignoreCase = true) ||
                    dest.tagline.contains(searchQuery, ignoreCase = true) ||
                    dest.aliases.any { it.contains(searchQuery, ignoreCase = true) }

            val matchesTag = selectedTag == "all" || dest.tags.contains(selectedTag)

            matchesQuery && matchesTag
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 8.dp)
    ) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text(strings.searchCityCountry) },
            placeholder = { Text(strings.destinationSearchPlaceholder) },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = strings.search, tint = MaterialTheme.colorScheme.primary)
            },
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = { searchQuery = "" }) {
                        Icon(Icons.Default.Clear, contentDescription = strings.cancel)
                    }
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .testTag("destinations_search_input"),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(tags) { tag ->
                val label = when (tag) {
                    "all" -> strings.catAll
                    "omra-hajj" -> strings.catOmra
                    "moyen-orient" -> strings.catMiddleEast
                    "europe" -> strings.catEurope
                    "asie" -> strings.catAsia
                    "afrique" -> strings.catAfrica
                    "plage" -> strings.tagBeach
                    "nature" -> strings.tagNature
                    "ville" -> strings.tagCity
                    else -> tag.replaceFirstChar { it.uppercase() }
                }
                FilterChip(
                    selected = selectedTag == tag,
                    onClick = { selectedTag = tag },
                    label = { Text(label) },
                    modifier = Modifier.testTag("filter_chip_$tag")
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "${filteredDestinations.size} ${strings.destinationsCountLabel}",
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        if (filteredDestinations.isEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 48.dp, horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Place,
                    contentDescription = null,
                    tint = Color(0xFFD4AF37).copy(alpha = 0.5f),
                    modifier = Modifier.size(56.dp)
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    text = strings.noDestinationsFound,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Medium
                )
            }
        } else {
            LazyColumn(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(filteredDestinations, key = { it.slug }) { destination ->
                    DestinationCard(
                        destination = destination,
                        onSelect = onSelectDestination,
                        onRequestQuote = { onOpenQuoteDialog(destination.name, strings.quote) }
                    )
                }
            }
        }
    }
}
