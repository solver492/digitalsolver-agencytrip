package com.example.manasik.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import com.example.manasik.data.model.QuoteRequest
import java.net.URLEncoder

object WhatsAppHelper {

    const val AGENCY_PHONE = "212661631160" // +212 661 631 160

    fun formatQuoteMessage(quote: QuoteRequest): String {
        return buildString {
            appendLine("🌟 *NOUVELLE DEMANDE DE DEVIS - MANASIK BAYT TRAVEL* 🌟")
            appendLine()
            appendLine("📋 *Référence :* ${quote.id}")
            appendLine("📍 *Destination :* ${quote.destination}")
            appendLine("👥 *Voyageurs :* ${quote.travelersCount} personne(s)")
            appendLine("📅 *Départ :* ${quote.departureDate}")
            if (quote.returnDate.isNotBlank() && quote.returnDate != "Non spécifié") {
                appendLine("📅 *Retour :* ${quote.returnDate}")
            }
            appendLine("🏷️ *Prestation :* ${quote.serviceType}")
            appendLine()
            appendLine("👤 *Coordonnées client :*")
            appendLine("• Nom : ${quote.fullName}")
            appendLine("• Téléphone : ${quote.phone}")
            if (quote.email.isNotBlank()) {
                appendLine("• Email : ${quote.email}")
            }
            if (quote.notes.isNotBlank()) {
                appendLine()
                appendLine("📝 *Remarques / Souhaits :*")
                appendLine(quote.notes)
            }
            appendLine()
            appendLine("━━━━━━━━━━━━━━━━━━━")
            append("Envoyé depuis l'application mobile *Manasik Bayt Travel*")
        }
    }

    fun openWhatsApp(context: Context, quote: QuoteRequest) {
        val message = formatQuoteMessage(quote)
        try {
            val encodedMessage = URLEncoder.encode(message, "UTF-8")
            val url = "https://api.whatsapp.com/send?phone=$AGENCY_PHONE&text=$encodedMessage"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(context, "Impossible d'ouvrir WhatsApp : ${e.localizedMessage}", Toast.LENGTH_LONG).show()
        }
    }
}
