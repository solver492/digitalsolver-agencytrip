package com.example.manasik.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import com.example.manasik.data.model.QuoteRequest
import java.net.URLEncoder

object WhatsAppHelper {

    const val AGENCY_PHONE = "212661631160" // +212 661 631 160

    fun formatQuoteMessage(quote: QuoteRequest, languageCode: String = "FR"): String {
        return when (languageCode.uppercase()) {
            "AR" -> buildString {
                appendLine("🌟 *طلب عرض أسعار جديد - مناسك بيت للسياحة والأسفار* 🌟")
                appendLine()
                appendLine("📋 *رقم المرجع :* ${quote.id}")
                appendLine("📍 *الوجهة :* ${quote.destination}")
                appendLine("👥 *عدد المسافرين :* ${quote.travelersCount} مسافر")
                appendLine("📅 *تاريخ السفر :* ${quote.departureDate}")
                if (quote.returnDate.isNotBlank() && quote.returnDate != "Non spécifié") {
                    appendLine("📅 *تاريخ العودة :* ${quote.returnDate}")
                }
                appendLine("🏷️ *الخدمة المطلوبة :* ${quote.serviceType}")
                appendLine()
                appendLine("👤 *بيانات العميل :*")
                appendLine("• الاسم : ${quote.fullName}")
                appendLine("• الهاتف : ${quote.phone}")
                if (quote.email.isNotBlank()) {
                    appendLine("• البريد : ${quote.email}")
                }
                if (quote.notes.isNotBlank()) {
                    appendLine()
                    appendLine("📝 *ملاحظات خاصة :*")
                    appendLine(quote.notes)
                }
                appendLine()
                appendLine("━━━━━━━━━━━━━━━━━━━")
                append("تم الإرسال عبر تطبيق *مناسك بيت*")
            }
            "EN" -> buildString {
                appendLine("🌟 *NEW QUOTE REQUEST - MANASIK BAYT TRAVEL* 🌟")
                appendLine()
                appendLine("📋 *Reference:* ${quote.id}")
                appendLine("📍 *Destination:* ${quote.destination}")
                appendLine("👥 *Travelers:* ${quote.travelersCount} person(s)")
                appendLine("📅 *Departure:* ${quote.departureDate}")
                if (quote.returnDate.isNotBlank() && quote.returnDate != "Non spécifié") {
                    appendLine("📅 *Return:* ${quote.returnDate}")
                }
                appendLine("🏷️ *Service:* ${quote.serviceType}")
                appendLine()
                appendLine("👤 *Customer Details:*")
                appendLine("• Name: ${quote.fullName}")
                appendLine("• Phone: ${quote.phone}")
                if (quote.email.isNotBlank()) {
                    appendLine("• Email: ${quote.email}")
                }
                if (quote.notes.isNotBlank()) {
                    appendLine()
                    appendLine("📝 *Special Notes:*")
                    appendLine(quote.notes)
                }
                appendLine()
                appendLine("━━━━━━━━━━━━━━━━━━━")
                append("Sent from the *Manasik Bayt Travel* mobile app")
            }
            "ES" -> buildString {
                appendLine("🌟 *NUEVA SOLICITUD DE PRESUPUESTO - MANASIK BAYT TRAVEL* 🌟")
                appendLine()
                appendLine("📋 *Referencia:* ${quote.id}")
                appendLine("📍 *Destino:* ${quote.destination}")
                appendLine("👥 *Viajeros:* ${quote.travelersCount} persona(s)")
                appendLine("📅 *Salida:* ${quote.departureDate}")
                if (quote.returnDate.isNotBlank() && quote.returnDate != "Non spécifié") {
                    appendLine("📅 *Regreso:* ${quote.returnDate}")
                }
                appendLine("🏷️ *Servicio:* ${quote.serviceType}")
                appendLine()
                appendLine("👤 *Datos del cliente:*")
                appendLine("• Nombre: ${quote.fullName}")
                appendLine("• Teléfono: ${quote.phone}")
                if (quote.email.isNotBlank()) {
                    appendLine("• Email: ${quote.email}")
                }
                if (quote.notes.isNotBlank()) {
                    appendLine()
                    appendLine("📝 *Observaciones:*")
                    appendLine(quote.notes)
                }
                appendLine()
                appendLine("━━━━━━━━━━━━━━━━━━━")
                append("Enviado desde la app móvil *Manasik Bayt Travel*")
            }
            else -> buildString {
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
    }

    fun openWhatsApp(context: Context, quote: QuoteRequest, languageCode: String = "FR") {
        val message = formatQuoteMessage(quote, languageCode)
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
