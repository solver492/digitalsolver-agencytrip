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

    TopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.testTag("app_top_bar_brand")
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_manasik_header),
                    contentDescription = "Logo Manasik Bayt Travel",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(40.dp)
                        .width(92.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF0A2E2E))
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Manasik Bayt",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Agence de voyage",
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
                    contentDescription = "Appeler l'agence (+212 661 631 160)",
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Box {
                IconButton(
                    onClick = { showLangMenu = true },
                    modifier = Modifier.testTag("lang_switcher_button")
                ) {
                    Icon(
                        imageVector = Icons.Default.Language,
                        contentDescription = "Changer de langue",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
                DropdownMenu(
                    expanded = showLangMenu,
                    onDismissRequest = { showLangMenu = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("Français (FR)") },
                        onClick = {
                            onSelectLanguage("FR")
                            showLangMenu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("English (EN)") },
                        onClick = {
                            onSelectLanguage("EN")
                            showLangMenu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("العربية (AR)") },
                        onClick = {
                            onSelectLanguage("AR")
                            showLangMenu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Español (ES)") },
                        onClick = {
                            onSelectLanguage("ES")
                            showLangMenu = false
                        }
                    )
                }
            }

            IconButton(
                onClick = onToggleTheme,
                modifier = Modifier.testTag("theme_toggle_button")
            ) {
                Icon(
                    imageVector = if (isDarkTheme) Icons.Default.LightMode else Icons.Default.DarkMode,
                    contentDescription = if (isDarkTheme) "Mode clair" else "Mode sombre",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    )
}
