package com.example.manasik.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.manasik.data.i18n.LocalAppStrings
import com.example.manasik.data.i18n.LocalCurrentLanguage
import com.example.manasik.data.model.QuoteRequest
import com.example.manasik.data.repository.QuotesRepository
import com.example.manasik.util.WhatsAppHelper

@Composable
fun QuoteDialog(
    initialDestination: String = "",
    initialServiceType: String = "Forfait complet",
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val strings = LocalAppStrings.current
    val currentLanguage = LocalCurrentLanguage.current

    var destination by remember { mutableStateOf(initialDestination) }
    var travelersCount by remember { mutableIntStateOf(2) }
    var departureDate by remember { mutableStateOf("") }
    var returnDate by remember { mutableStateOf("") }
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var notes by remember { mutableStateOf("") }
    var isSubmitted by remember { mutableStateOf(false) }
    var submittedQuote by remember { mutableStateOf<QuoteRequest?>(null) }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    Dialog(onDismissRequest = onDismiss) {
        LiquidGlassCard(
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp)
        ) {
            if (isSubmitted && submittedQuote != null) {
                val quote = submittedQuote!!
                Column(
                    modifier = Modifier
                        .padding(24.dp)
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = null,
                        tint = Color(0xFFD4AF37),
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = strings.quoteSentSuccess,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    LiquidGlassBadge(
                        text = "${strings.quoteReference} ${quote.id}",
                        textColor = Color(0xFFD4AF37)
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    val thankYouText = try {
                        String.format(strings.quoteThankYou, quote.fullName)
                    } catch (_: Exception) {
                        "${strings.quoteThankYou} ${quote.fullName}"
                    }
                    Text(
                        text = thankYouText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    // Open / Resend WhatsApp Button
                    LiquidGlassButton(
                        onClick = { WhatsAppHelper.openWhatsApp(context, quote, currentLanguage) },
                        isGold = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("quote_open_whatsapp_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Send,
                            contentDescription = null,
                            tint = Color(0xFF092E52),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = strings.openWhatsAppBtn,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF092E52)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Call Agency Button
                    LiquidGlassButton(
                        onClick = {
                            val intent = Intent(Intent.ACTION_DIAL).apply {
                                data = Uri.parse("tel:+212661631160")
                            }
                            context.startActivity(intent)
                        },
                        isGold = false,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = strings.callAgencyBtn,
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    TextButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("quote_success_close_button")
                    ) {
                        Text(strings.close)
                    }
                }
            } else {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = strings.quoteDialogTitle,
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = strings.quoteDialogSubtitle,
                                style = MaterialTheme.typography.bodySmall,
                                color = Color(0xFFD4AF37)
                            )
                        }
                        IconButton(onClick = onDismiss) {
                            Icon(Icons.Default.Close, contentDescription = strings.close)
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = destination,
                        onValueChange = { destination = it },
                        label = { Text("${strings.formDestination} *") },
                        placeholder = { Text(strings.destinationSearchPlaceholder) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("quote_destination_input"),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = strings.formTravelers,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "$travelersCount ${strings.travelersUnit}",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            FilledTonalIconButton(
                                onClick = { if (travelersCount > 1) travelersCount-- },
                                enabled = travelersCount > 1
                            ) {
                                Icon(Icons.Default.Remove, contentDescription = "-")
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            FilledTonalIconButton(
                                onClick = { if (travelersCount < 50) travelersCount++ }
                            ) {
                                Icon(Icons.Default.Add, contentDescription = "+")
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(modifier = Modifier.fillMaxWidth()) {
                        OutlinedTextField(
                            value = departureDate,
                            onValueChange = { departureDate = it },
                            label = { Text("${strings.formDepartureDate} *") },
                            placeholder = { Text("JJ/MM/AAAA") },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("quote_departure_input"),
                            singleLine = true
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        OutlinedTextField(
                            value = returnDate,
                            onValueChange = { returnDate = it },
                            label = { Text(strings.returnDateLabel) },
                            placeholder = { Text("JJ/MM/AAAA") },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("quote_return_input"),
                            singleLine = true
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = fullName,
                        onValueChange = { fullName = it },
                        label = { Text("${strings.formName} *") },
                        placeholder = { Text(strings.formName) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("quote_name_input"),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = phone,
                        onValueChange = { phone = it },
                        label = { Text("${strings.formPhone} *") },
                        placeholder = { Text("+212 6... / +34 6... / +33 6...") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("quote_phone_input"),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text(strings.formEmail) },
                        placeholder = { Text("exemple@email.com") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("quote_email_input"),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        value = notes,
                        onValueChange = { notes = it },
                        label = { Text("${strings.formMessage} (${strings.formOptional})") },
                        placeholder = { Text("...") },
                        modifier = Modifier.fillMaxWidth(),
                        maxLines = 3
                    )

                    if (errorMessage != null) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = errorMessage ?: "",
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Liquid Glass Submit Button
                    LiquidGlassButton(
                        onClick = {
                            if (destination.isBlank()) {
                                errorMessage = strings.fillFormError
                            } else if (fullName.isBlank()) {
                                errorMessage = strings.fillFormError
                            } else if (phone.isBlank()) {
                                errorMessage = strings.fillFormError
                            } else {
                                val randomNum = (100..999).random()
                                val refId = "DEV-2026-$randomNum"
                                val newRequest = QuoteRequest(
                                    id = refId,
                                    destination = destination.trim(),
                                    travelersCount = travelersCount,
                                    departureDate = if (departureDate.isNotBlank()) departureDate.trim() else "Flexible",
                                    returnDate = if (returnDate.isNotBlank()) returnDate.trim() else "Non spécifié",
                                    fullName = fullName.trim(),
                                    email = email.trim(),
                                    phone = phone.trim(),
                                    serviceType = initialServiceType,
                                    notes = notes.trim()
                                )
                                QuotesRepository.submitQuote(newRequest)
                                submittedQuote = newRequest
                                isSubmitted = true
                                errorMessage = null

                                // Instantly launch WhatsApp with formatted message
                                WhatsAppHelper.openWhatsApp(context, newRequest, currentLanguage)
                            }
                        },
                        isGold = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("submit_quote_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Send,
                            contentDescription = null,
                            tint = Color(0xFF092E52),
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = strings.formSubmitWhatsApp,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF092E52)
                        )
                    }
                }
            }
        }
    }
}
