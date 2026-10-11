package com.example.manasik.data.repository

/**
 * Central repository for Travelpayouts affiliate scripts and widget configurations.
 * Supports raw `<script src="..."></script>` snippets, full HTML blocks, or direct widget URLs
 * corresponding to `scriptpay.md` for each Manasik Bayt Travel service.
 */
object TravelpayoutsRepository {

    data class TravelpayoutsWidgetConfig(
        val slug: String,
        val title: String,
        val subtitle: String,
        val providerLabel: String,
        val scriptSnippet: String,
        val fallbackSearchUrl: String
    )

    // Default scripts mapped by service slug.
    // Paste your exact <script ...></script> tags from scriptpay.md into these fields or via the in-app Configurator.
    private val defaultConfigs = mapOf(
        "vols" to TravelpayoutsWidgetConfig(
            slug = "vols",
            title = "Recherche & Réservation de Vols",
            subtitle = "Comparateur de vols en temps réel (Saudia, Royal Air Maroc, Turkish Airlines, Emirates...)",
            providerLabel = "Travelpayouts Flights / Aviasales",
            scriptSnippet = """
                <script async src="https://tp.media/content?currency=eur&trs=328745&shmarker=548291&locale=fr&powered_by=true&border_radius=16&plain=true&color_button=%23D4AF37&color_button_text=%23092E52&promo_id=7879&campaign_id=100" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://search.aviasales.com/"
        ),
        "hotels" to TravelpayoutsWidgetConfig(
            slug = "hotels",
            title = "Réservation d'Hôtels & Hébergements",
            subtitle = "Hôtels face au Haram à La Mecque & Médine et séjours dans le monde entier",
            providerLabel = "Travelpayouts Hotels / Hotellook",
            scriptSnippet = """
                <script async src="https://tp.media/content?currency=eur&trs=328745&shmarker=548291&locale=fr&powered_by=true&border_radius=16&plain=true&color_button=%23D4AF37&color_button_text=%23092E52&promo_id=4132&campaign_id=101" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://search.hotellook.com/"
        ),
        "transferts" to TravelpayoutsWidgetConfig(
            slug = "transferts",
            title = "Transferts Aéroport & Navettes Privées",
            subtitle = "Chauffeurs privés aéroport Djeddah, Médine, Istanbul, Marrakech, Dubaï",
            providerLabel = "Travelpayouts / Kiwitaxi & GetTransfer",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&from=&to=&powered_by=true&border_radius=16&plain=true&color_button=%23D4AF37&color_button_text=%23092E52&promo_id=2949&campaign_id=1" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://kiwitaxi.fr/"
        ),
        "guides" to TravelpayoutsWidgetConfig(
            slug = "guides",
            title = "Guides, Visites & Ziyarat",
            subtitle = "Visites guidées francophones, excursions culturelles et billets coupe-file",
            providerLabel = "Travelpayouts / GetYourGuide & Viator",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr-FR&powered_by=true&campaign_id=108&promo_id=3992" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.getyourguide.fr/"
        ),
        "activites" to TravelpayoutsWidgetConfig(
            slug = "activites",
            title = "Activités & Excursions sur place",
            subtitle = "Safaris désert, croisières Bosphore, montgolfière en Cappadoce, musées",
            providerLabel = "Travelpayouts / Tiqets & Klook",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&powered_by=true&campaign_id=89&promo_id=2095" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.tiqets.com/fr/"
        ),
        "esim" to TravelpayoutsWidgetConfig(
            slug = "esim",
            title = "eSIM Internationale Instantanée",
            subtitle = "Forfaits data 4G/5G Arabie saoudite, Turquie, Maroc, Émirats et +200 pays",
            providerLabel = "Travelpayouts / Airalo & Yesim",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&powered_by=true&color_button=%23D4AF37&campaign_id=541&promo_id=8588" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.airalo.com/fr"
        ),
        "location-voiture" to TravelpayoutsWidgetConfig(
            slug = "location-voiture",
            title = "Location de Voiture",
            subtitle = "Berlines, SUV et vans familiaux aux aéroports de Djeddah, Médine, Dubaï, Marrakech",
            providerLabel = "Travelpayouts / EconomyBookings & Localrent",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&powered_by=true&border_radius=16&plain=true&campaign_id=109&promo_id=4014" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.economybookings.com/fr"
        ),
        "yacht" to TravelpayoutsWidgetConfig(
            slug = "yacht",
            title = "Location de Yacht & Croisières",
            subtitle = "Yachts privés, voiliers et sorties en mer Rouge, Dubaï, Méditerranée",
            providerLabel = "Travelpayouts / Searadar",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&powered_by=true&campaign_id=258&promo_id=5859" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://searadar.com/"
        ),
        "bagages" to TravelpayoutsWidgetConfig(
            slug = "bagages",
            title = "Consignes à Bagages Sécurisées",
            subtitle = "Stockage de valises vérifié près des gares, mosquées et aéroports",
            providerLabel = "Travelpayouts / Radical Storage",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&powered_by=true&campaign_id=233&promo_id=5369" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://radicalstorage.com/fr"
        ),
        "indemnisation" to TravelpayoutsWidgetConfig(
            slug = "indemnisation",
            title = "Indemnisation Vol Retardé ou Annulé",
            subtitle = "Vérifiez votre éligibilité et réclamez jusqu'à 600 € par passager",
            providerLabel = "Travelpayouts / AirHelp & Compensair",
            scriptSnippet = """
                <script async src="https://tp.media/content?trs=328745&shmarker=548291&locale=fr&powered_by=true&campaign_id=86&promo_id=2058" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.compensair.com/fr/"
        )
    )

    private val customScripts = mutableMapOf<String, String>()

    fun getConfigForService(slug: String): TravelpayoutsWidgetConfig {
        val base = defaultConfigs[slug] ?: defaultConfigs["vols"]!!
        val custom = customScripts[slug]
        return if (!custom.isNullOrBlank()) {
            base.copy(scriptSnippet = custom)
        } else {
            base
        }
    }

    fun updateCustomScript(slug: String, scriptSnippet: String) {
        if (scriptSnippet.isBlank()) {
            customScripts.remove(slug)
        } else {
            customScripts[slug] = scriptSnippet.trim()
        }
    }

    /**
     * Parses a full `scriptpay.md` markdown document or multi-script paste and maps each `<script>`
     * to the matching service slug based on section headers or campaign/promo keywords.
     */
    fun importFromScriptPayMarkdown(markdownContent: String): Int {
        var importedCount = 0
        val scriptRegex = Regex("""<script[^>]*src=["']([^"']+)["'][^>]*>\s*</script>""", RegexOption.IGNORE_CASE)
        val lines = markdownContent.lines()
        var currentSlug = "vols"

        for (line in lines) {
            val lower = line.lowercase()
            when {
                lower.contains("vol") || lower.contains("flight") || lower.contains("aviasales") -> currentSlug = "vols"
                lower.contains("hotel") || lower.contains("hôtel") || lower.contains("hébergement") -> currentSlug = "hotels"
                lower.contains("transfer") || lower.contains("taxi") || lower.contains("navette") -> currentSlug = "transferts"
                lower.contains("guide") || lower.contains("ziyarat") || lower.contains("getyourguide") || lower.contains("viator") -> currentSlug = "guides"
                lower.contains("activit") || lower.contains("excursion") || lower.contains("tiqets") || lower.contains("klook") -> currentSlug = "activites"
                lower.contains("esim") || lower.contains("airalo") || lower.contains("yesim") || lower.contains("drimsim") -> currentSlug = "esim"
                lower.contains("voiture") || lower.contains("auto") || lower.contains("car") || lower.contains("economybookings") || lower.contains("localrent") -> currentSlug = "location-voiture"
                lower.contains("yacht") || lower.contains("bateau") || lower.contains("croisi") || lower.contains("searadar") -> currentSlug = "yacht"
                lower.contains("bagage") || lower.contains("consigne") || lower.contains("radical") -> currentSlug = "bagages"
                lower.contains("indemnis") || lower.contains("compens") || lower.contains("airhelp") || lower.contains("retard") -> currentSlug = "indemnisation"
            }

            val match = scriptRegex.find(line)
            if (match != null) {
                customScripts[currentSlug] = match.value
                importedCount++
            }
        }
        return importedCount
    }

    /**
     * Builds a responsive, self-contained HTML5 page that renders the Travelpayouts `<script>` widget
     * with dark/light theme styling and fallback links.
     */
    fun buildWidgetHtml(
        config: TravelpayoutsWidgetConfig,
        destinationHint: String = "",
        isDarkTheme: Boolean = false
    ): String {
        val bgHex = if (isDarkTheme) "#071E36" else "#F8FAFC"
        val cardHex = if (isDarkTheme) "#0E2A47" else "#FFFFFF"
        val textHex = if (isDarkTheme) "#F1F5F9" else "#0F172A"
        val subTextHex = if (isDarkTheme) "#94A3B8" else "#475569"

        // Ensure protocol-relative //tp.media URLs use https:// inside WebView
        val normalizedScript = config.scriptSnippet
            .replace("src=\"//", "src=\"https://")
            .replace("src='//", "src='https://")

        val destBanner = if (destinationHint.isNotBlank()) {
            """<div class="dest-pill">📍 Destination sélectionnée : <strong>$destinationHint</strong></div>"""
        } else ""

        return """
            <!DOCTYPE html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
                <title>${config.title}</title>
                <style>
                    * { box-sizing: border-box; }
                    body {
                        margin: 0;
                        padding: 12px;
                        font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
                        background-color: $bgHex;
                        color: $textHex;
                    }
                    .widget-shell {
                        background-color: $cardHex;
                        border-radius: 18px;
                        padding: 14px;
                        border: 1px solid rgba(212, 175, 55, 0.35);
                        box-shadow: 0 6px 20px rgba(0, 0, 0, 0.12);
                        min-height: 220px;
                    }
                    .dest-pill {
                        display: inline-block;
                        background: rgba(212, 175, 55, 0.16);
                        color: #D4AF37;
                        border: 1px solid rgba(212, 175, 55, 0.4);
                        border-radius: 999px;
                        padding: 6px 12px;
                        font-size: 12px;
                        margin-bottom: 12px;
                    }
                    .widget-container {
                        width: 100%;
                        min-height: 160px;
                    }
                    .fallback-box {
                        margin-top: 14px;
                        padding-top: 12px;
                        border-top: 1px solid rgba(148, 163, 184, 0.2);
                        display: flex;
                        align-items: center;
                        justify-content: space-between;
                        flex-wrap: wrap;
                        gap: 8px;
                        font-size: 12px;
                        color: $subTextHex;
                    }
                    .direct-btn {
                        display: inline-block;
                        background: linear-gradient(180deg, #E8CA65 0%, #D4AF37 50%, #BA8F1D 100%);
                        color: #092E52;
                        font-weight: 700;
                        text-decoration: none;
                        padding: 8px 14px;
                        border-radius: 999px;
                        font-size: 12px;
                    }
                </style>
            </head>
            <body>
                <div class="widget-shell">
                    $destBanner
                    <div id="tp-widget-mount" class="widget-container">
                        $normalizedScript
                    </div>
                    <div class="fallback-box">
                        <span>Propulsé par ${config.providerLabel}</span>
                        <a class="direct-btn" href="${config.fallbackSearchUrl}" target="_blank" rel="noopener">Ouvrir en plein écran ↗</a>
                    </div>
                </div>
            </body>
            </html>
        """.trimIndent()
    }
}
