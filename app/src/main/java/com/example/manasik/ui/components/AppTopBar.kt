package com.example.manasik.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    isDarkTheme: Boolean,
    onToggleTheme: () -> Unit,
    currentLanguage: String,
    onSelectLanguage: (String) -> Unit
) {
    val context = LocalContext.current
    var showLangMenu by remember { mutableStateOf(false) }

    val strings = com.example.manasik.data.i18n.LocalAppStrings.current

    TopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.testTag("app_top_bar_brand")
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_manasik_header),
                    contentDescription = strings.appName,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(38.dp)
                        .width(88.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF0A2E2E))
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = strings.appName,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = strings.agencySubtitle,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color(0xFFD4AF37)
                    )
                }
            }
        },
        actions = {
            IconButton(
                onClick = {
                    val intent = Intent(Intent.ACTION_DIAL).apply {
                        data = Uri.parse("tel:+212661631160")
                    }
                    context.startActivity(intent)
                },
                modifier = Modifier.testTag("helpline_call_button")
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = strings.callAgency,
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Box {
                FilledTonalButton(
                    onClick = { showLangMenu = true },
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                    modifier = Modifier
                        .height(36.dp)
                        .testTag("lang_switcher_button")
                ) {
                    val currentFlag = when (currentLanguage.uppercase()) {
                        "EN" -> "🇬🇧 EN"
                        "AR" -> "🇸🇦 AR"
                        "ES" -> "🇪🇸 ES"
                        else -> "🇫🇷 FR"
                    }
                    Text(
                        text = currentFlag,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold
                    )
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

            IconButton(
                onClick = onToggleTheme,
                modifier = Modifier.testTag("theme_toggle_button")
            ) {
                Icon(
                    imageVector = if (isDarkTheme) Icons.Default.LightMode else Icons.Default.DarkMode,
                    contentDescription = strings.toggleTheme,
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    )
}

