package com.example.manasik.ui.components

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.manasik.data.repository.ServicesRepository
import com.example.manasik.data.repository.TravelpayoutsRepository

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun TravelpayoutsWidgetView(
    serviceSlug: String,
    modifier: Modifier = Modifier,
    destinationHint: String = "",
    minHeight: Dp = 320.dp,
    isDarkTheme: Boolean = isSystemInDarkTheme()
) {
    val context = LocalContext.current
    val config = remember(serviceSlug) {
        TravelpayoutsRepository.getConfigForService(serviceSlug)
    }
    var reloadKey by remember { mutableIntStateOf(0) }
    var isLoading by remember { mutableStateOf(true) }

    val htmlContent = remember(config, destinationHint, isDarkTheme, reloadKey) {
        TravelpayoutsRepository.buildWidgetHtml(
            config = config,
            destinationHint = destinationHint,
            isDarkTheme = isDarkTheme
        )
    }

    Column(modifier = modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = minHeight)
                .clip(RoundedCornerShape(18.dp))
        ) {
            key(serviceSlug, reloadKey, isDarkTheme) {
                AndroidView(
                    factory = { ctx ->
                        WebView(ctx).apply {
                            layoutParams = ViewGroup.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.WRAP_CONTENT
                            )
                            settings.apply {
                                javaScriptEnabled = true
                                domStorageEnabled = true
                                databaseEnabled = true
                                loadsImagesAutomatically = true
                                mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                                javaScriptCanOpenWindowsAutomatically = true
                                setSupportMultipleWindows(false)
                                userAgentString = settings.userAgentString + " ManasikBaytTravelApp/1.0"
                            }
                            webChromeClient = WebChromeClient()
                            webViewClient = object : WebViewClient() {
                                override fun onPageFinished(view: WebView?, url: String?) {
                                    super.onPageFinished(view, url)
                                    isLoading = false
                                }

                                override fun shouldOverrideUrlLoading(
                                    view: WebView?,
                                    request: WebResourceRequest?
                                ): Boolean {
                                    val targetUri = request?.url ?: return false
                                    val host = targetUri.host?.lowercase() ?: ""
                                    // Keep Travelpayouts script loader inside WebView, open external booking/search pages in browser
                                    if (host.contains("tp.media") || host.contains("travelpayouts.com")) {
                                        return false
                                    }
                                    return try {
                                        val intent = Intent(Intent.ACTION_VIEW, targetUri).apply {
                                            flags = Intent.FLAG_ACTIVITY_NEW_TASK
                                        }
                                        context.startActivity(intent)
                                        true
                                    } catch (e: Exception) {
                                        false
                                    }
                                }
                            }
                            loadDataWithBaseURL(
                                "https://agency.manasiktravelagency.com/",
                                htmlContent,
                                "text/html",
                                "UTF-8",
                                null
                            )
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = minHeight)
                        .testTag("travelpayouts_webview_$serviceSlug")
                )
            }

            if (isLoading) {
                LinearProgressIndicator(
                    color = Color(0xFFD4AF37),
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                )
            }
        }
    }
}

/**
 * Full-screen / modal dialog that displays the interactive Travelpayouts widget for a given service
 * (Vols, Hôtels, Transferts, eSIM, Location voiture, Yacht, Bagages, Indemnisation, etc.)
 * and also allows switching to a custom WhatsApp quote if desired.
 */
@Composable
fun TravelpayoutsWidgetDialog(
    initialServiceSlug: String,
    destinationHint: String = "",
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    onDismiss: () -> Unit,
    onOpenWhatsAppQuote: (destination: String, serviceTitle: String) -> Unit
) {
    val context = LocalContext.current
    var currentSlug by remember { mutableStateOf(initialServiceSlug) }
    var showScriptEditor by remember { mutableStateOf(false) }

    val config = remember(currentSlug, showScriptEditor) {
        TravelpayoutsRepository.getConfigForService(currentSlug)
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        LiquidGlassCard(
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
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
                            modifier = Modifier.size(42.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = getServiceIcon(currentSlug),
                                    contentDescription = null,
                                    tint = Color(0xFFD4AF37),
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = config.title,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = config.providerLabel,
                                style = MaterialTheme.typography.labelSmall,
                                color = Color(0xFFD4AF37)
                            )
                        }
                    }

                    Row {
                        IconButton(
                            onClick = { showScriptEditor = !showScriptEditor },
                            modifier = Modifier.testTag("toggle_script_editor_btn")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Code,
                                contentDescription = "Configurer scriptpay.md",
                                tint = Color(0xFFD4AF37)
                            )
                        }
                        IconButton(
                            onClick = onDismiss,
                            modifier = Modifier.testTag("close_tp_dialog_btn")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Fermer"
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = config.subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(12.dp))

                if (showScriptEditor) {
                    ScriptPayConfigSection(
                        currentSlug = currentSlug,
                        onSaved = { showScriptEditor = false }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

                // Live Travelpayouts Script WebView
                TravelpayoutsWidgetView(
                    serviceSlug = currentSlug,
                    destinationHint = destinationHint,
                    minHeight = 360.dp,
                    isDarkTheme = isDarkTheme
                )

                Spacer(modifier = Modifier.height(14.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    LiquidGlassButton(
                        onClick = {
                            try {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(config.fallbackSearchUrl))
                                context.startActivity(intent)
                            } catch (_: Exception) {
                            }
                        },
                        isGold = false,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.OpenInNew,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Portail Direct",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    LiquidGlassButton(
                        onClick = {
                            onDismiss()
                            onOpenWhatsAppQuote(destinationHint, config.title)
                        },
                        isGold = true,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.SupportAgent,
                            contentDescription = null,
                            tint = Color(0xFF092E52),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Devis Conseiller",
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

/**
 * In-app editor allowing the user to paste their exact `scriptpay.md` content or individual `<script>` snippet
 * for any service and immediately apply it across the app.
 */
@Composable
fun ScriptPayConfigSection(
    currentSlug: String,
    onSaved: () -> Unit
) {
    var selectedMode by remember { mutableIntStateOf(0) } // 0 = Single service script, 1 = Full scriptpay.md import
    val currentConfig = remember(currentSlug) { TravelpayoutsRepository.getConfigForService(currentSlug) }
    var singleScriptInput by remember(currentSlug) { mutableStateOf(currentConfig.scriptSnippet) }
    var bulkMarkdownInput by remember { mutableStateOf("") }
    var statusMessage by remember { mutableStateOf<String?>(null) }

    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.65f),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Configuration Travelpayouts (scriptpay.md)",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD4AF37)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                FilterChip(
                    selected = selectedMode == 0,
                    onClick = { selectedMode = 0 },
                    label = { Text("Script (${currentSlug})") }
                )
                FilterChip(
                    selected = selectedMode == 1,
                    onClick = { selectedMode = 1 },
                    label = { Text("Importer scriptpay.md complet") }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            if (selectedMode == 0) {
                OutlinedTextField(
                    value = singleScriptInput,
                    onValueChange = { singleScriptInput = it },
                    label = { Text("Balise <script> Travelpayouts pour $currentSlug") },
                    placeholder = { Text("<script async src=\"https://tp.media/content?...\" charset=\"utf-8\"></script>") },
                    textStyle = LocalTextStyle.current.copy(fontFamily = FontFamily.Monospace),
                    modifier = Modifier.fillMaxWidth(),
                    minLines = 3,
                    maxLines = 6
                )
                Spacer(modifier = Modifier.height(8.dp))
                LiquidGlassButton(
                    onClick = {
                        TravelpayoutsRepository.updateCustomScript(currentSlug, singleScriptInput)
                        statusMessage = "Script mis à jour pour $currentSlug !"
                        onSaved()
                    },
                    isGold = true,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(Icons.Default.Check, contentDescription = null, tint = Color(0xFF092E52), modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Appliquer ce script", fontWeight = FontWeight.Bold, color = Color(0xFF092E52))
                }
            } else {
                OutlinedTextField(
                    value = bulkMarkdownInput,
                    onValueChange = { bulkMarkdownInput = it },
                    label = { Text("Collez tout le contenu de scriptpay.md") },
                    placeholder = { Text("# Vols\n<script src=\"...\"></script>\n# Hôtels\n<script src=\"...\"></script>") },
                    textStyle = LocalTextStyle.current.copy(fontFamily = FontFamily.Monospace),
                    modifier = Modifier.fillMaxWidth(),
                    minLines = 4,
                    maxLines = 8
                )
                Spacer(modifier = Modifier.height(8.dp))
                LiquidGlassButton(
                    onClick = {
                        val count = TravelpayoutsRepository.importFromScriptPayMarkdown(bulkMarkdownInput)
                        statusMessage = "$count script(s) Travelpayouts importé(s) avec succès !"
                        onSaved()
                    },
                    isGold = true,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(Icons.Default.DownloadDone, contentDescription = null, tint = Color(0xFF092E52), modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Importer tous les scripts", fontWeight = FontWeight.Bold, color = Color(0xFF092E52))
                }
            }

            if (statusMessage != null) {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = statusMessage!!,
                    style = MaterialTheme.typography.labelSmall,
                    color = Color(0xFFD4AF37)
                )
            }
        }
    }
}
