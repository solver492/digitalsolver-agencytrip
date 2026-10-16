package com.example.manasik.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
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
    var searchQuery by remember { mutableStateOf("") }
    var selectedTag by remember { mutableStateOf("Tous") }

    val tags = listOf("Tous", "omra-hajj", "culture", "plage", "nature", "ville")

    val filteredDestinations = remember(searchQuery, selectedTag) {
        DestinationsRepository.allDestinations.filter { dest ->
            val matchesQuery = searchQuery.isBlank() ||
                    dest.name.contains(searchQuery, ignoreCase = true) ||
                    dest.country.contains(searchQuery, ignoreCase = true) ||
                    dest.tagline.contains(searchQuery, ignoreCase = true) ||
                    dest.aliases.any { it.contains(searchQuery, ignoreCase = true) }

            val matchesTag = selectedTag == "Tous" || dest.tags.contains(selectedTag)

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
                    "Tous" -> strings.catAll
                    "omra-hajj" -> strings.catOmra
                    "culture" -> strings.catMiddleEast
                    "plage" -> "Beach & Relax"
                    "nature" -> "Nature"
                    "ville" -> "Cities"
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
            text = "${filteredDestinations.size} ${strings.navDestinations}",
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(filteredDestinations, key = { it.slug }) { destination ->
                DestinationCard(
                    destination = destination,
                    onSelect = onSelectDestination,
                    onRequestQuote = { onOpenQuoteDialog(destination.name, "Séjour") }
                )
            }
        }
    }
}
