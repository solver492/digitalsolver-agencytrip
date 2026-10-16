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
                <script async src="https://tp.media/content?currency=eur&shmarker=548291&locale=fr&powered_by=true&border_radius=16&plain=true&color_button=%23D4AF37&color_button_text=%23092E52&promo_id=7879&campaign_id=100" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.aviasales.com/?marker=548291"
        ),
        "hotels" to TravelpayoutsWidgetConfig(
            slug = "hotels",
            title = "Réservation d'Hôtels & Hébergements",
            subtitle = "Hôtels face au Haram à La Mecque & Médine et séjours dans le monde entier",
            providerLabel = "Travelpayouts Hotels / Hotellook",
            scriptSnippet = """
                <script async src="https://tp.media/content?currency=eur&shmarker=548291&locale=fr&powered_by=true&border_radius=16&plain=true&color_button=%23D4AF37&color_button_text=%23092E52&promo_id=4132&campaign_id=101" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://search.hotellook.com/?marker=548291"
        ),
        "transferts" to TravelpayoutsWidgetConfig(
            slug = "transferts",
            title = "Transferts Aéroport & Navettes Privées",
            subtitle = "Chauffeurs privés aéroport Djeddah, Médine, Istanbul, Marrakech, Dubaï",
            providerLabel = "Travelpayouts / Kiwitaxi & GetTransfer",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&from=&to=&powered_by=true&border_radius=16&plain=true&color_button=%23D4AF37&color_button_text=%23092E52&promo_id=2949&campaign_id=1" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://kiwitaxi.fr/?pap=548291"
        ),
        "guides" to TravelpayoutsWidgetConfig(
            slug = "guides",
            title = "Guides, Visites & Ziyarat",
            subtitle = "Visites guidées francophones, excursions culturelles et billets coupe-file",
            providerLabel = "Travelpayouts / GetYourGuide & Viator",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr-FR&powered_by=true&campaign_id=108&promo_id=3992" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.getyourguide.fr/?partner_id=548291"
        ),
        "activites" to TravelpayoutsWidgetConfig(
            slug = "activites",
            title = "Activités & Excursions sur place",
            subtitle = "Safaris désert, croisières Bosphore, montgolfière en Cappadoce, musées",
            providerLabel = "Travelpayouts / Tiqets & Klook",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&powered_by=true&campaign_id=89&promo_id=2095" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.tiqets.com/fr/?partner=548291"
        ),
        "esim" to TravelpayoutsWidgetConfig(
            slug = "esim",
            title = "eSIM Internationale Instantanée",
            subtitle = "Forfaits data 4G/5G Arabie saoudite, Turquie, Maroc, Émirats et +200 pays",
            providerLabel = "Travelpayouts / Airalo & Drimsim",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&powered_by=true&color_button=%23D4AF37&campaign_id=175&promo_id=4392" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.airalo.com/fr?partner=548291"
        ),
        "location-voiture" to TravelpayoutsWidgetConfig(
            slug = "location-voiture",
            title = "Location de Voiture",
            subtitle = "Berlines, SUV et vans familiaux aux aéroports de Djeddah, Médine, Dubaï, Marrakech",
            providerLabel = "Travelpayouts / EconomyBookings & Localrent",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&powered_by=true&border_radius=16&plain=true&campaign_id=109&promo_id=4014" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.economybookings.com/fr?partner=548291"
        ),
        "yacht" to TravelpayoutsWidgetConfig(
            slug = "yacht",
            title = "Location de Yacht & Croisières",
            subtitle = "Yachts privés, voiliers et sorties en mer Rouge, Dubaï, Méditerranée",
            providerLabel = "Travelpayouts / Searadar",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&powered_by=true&campaign_id=258&promo_id=5859" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://searadar.com/?partner=548291"
        ),
        "bagages" to TravelpayoutsWidgetConfig(
            slug = "bagages",
            title = "Consignes à Bagages Sécurisées",
            subtitle = "Stockage de valises vérifié près des gares, mosquées et aéroports",
            providerLabel = "Travelpayouts / Radical Storage",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&powered_by=true&campaign_id=233&promo_id=5369" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://radicalstorage.com/fr?partner=548291"
        ),
        "indemnisation" to TravelpayoutsWidgetConfig(
            slug = "indemnisation",
            title = "Indemnisation Vol Retardé ou Annulé",
            subtitle = "Vérifiez votre éligibilité et réclamez jusqu'à 600 € par passager",
            providerLabel = "Travelpayouts / AirHelp & Compensair",
            scriptSnippet = """
                <script async src="https://tp.media/content?shmarker=548291&locale=fr&powered_by=true&campaign_id=86&promo_id=2058" charset="utf-8"></script>
            """.trimIndent(),
            fallbackSearchUrl = "https://www.compensair.com/fr/?partner=548291"
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
                // Sanitize: strip out invalid trs= parameter that triggers 'traffic_source is not valid'
                val sanitizedScript = match.value
                    .replace(Regex("""[?&]trs=[^&"']+"""), "")
                    .replace("?&", "?")
                customScripts[currentSlug] = sanitizedScript
                importedCount++
            }
        }
        return importedCount
    }

    /**
     * Builds a responsive, self-contained HTML5 page that renders the Travelpayouts `<script>` widget
     * with dark/light theme styling, intelligent fallback form, and error recovery.
     */
    fun buildWidgetHtml(
        config: TravelpayoutsWidgetConfig,
        destinationHint: String = "",
        isDarkTheme: Boolean = false,
        languageCode: String = "FR"
    ): String {
        val bgHex = if (isDarkTheme) "#071E36" else "#F8FAFC"
        val cardHex = if (isDarkTheme) "#0E2A47" else "#FFFFFF"
        val textHex = if (isDarkTheme) "#F1F5F9" else "#0F172A"
        val subTextHex = if (isDarkTheme) "#94A3B8" else "#475569"
        val inputBg = if (isDarkTheme) "#071E36" else "#F1F5F9"
        val inputBorder = if (isDarkTheme) "#1E4068" else "#CBD5E1"

        val isRtl = languageCode.equals("AR", ignoreCase = true)
        val htmlLang = languageCode.lowercase()
        val htmlDir = if (isRtl) "rtl" else "ltr"

        // Ensure protocol-relative //tp.media URLs use https:// inside WebView
        // and remove invalid trs parameter that throws 400 'traffic_source is not valid'
        // also remove 'async' attribute so script executes synchronously with document.currentScript bound
        // and adapt locale parameter to match current user language
        val targetLocale = when (languageCode.uppercase()) {
            "AR" -> "ar"
            "EN" -> "en"
            "ES" -> "es"
            else -> "fr"
        }

        var normalizedScript = config.scriptSnippet
            .replace("src=\"//", "src=\"https://")
            .replace("src='//", "src='https://")
            .replace(Regex("""[?&]trs=[^&"']+"""), "")
            .replace("?&", "?")
            .replace(Regex("""[?&]locale=[a-zA-Z-]+"""), "&locale=$targetLocale")
            .replace(Regex("""\s+async(\s*=\s*["']?true["']?)?""", RegexOption.IGNORE_CASE), " ")

        val destBanner = if (destinationHint.isNotBlank()) {
            """<div class="dest-pill">📍 Destination : <strong>$destinationHint</strong></div>"""
        } else ""

        val placeholderOrigin = when (languageCode.uppercase()) {
            "AR" -> "الدار البيضاء / باريس"
            "EN" -> "London / Paris / New York"
            "ES" -> "Madrid / Barcelona"
            else -> "Paris (CDG/ORY)"
        }
        val placeholderDest = if (destinationHint.isNotBlank()) destinationHint else when (languageCode.uppercase()) {
            "AR" -> "مكة المكرمة / المدينة المنورة"
            "EN" -> "Jeddah / Madinah (JED)"
            "ES" -> "Yeda / Medina (JED)"
            else -> "Djeddah / Médine (JED)"
        }

        val labelOrigin = when (languageCode.uppercase()) {
            "AR" -> "مدينة الانطلاق"
            "EN" -> "Departure"
            "ES" -> "Ciudad de Salida"
            else -> "Départ"
        }
        val labelDest = when (languageCode.uppercase()) {
            "AR" -> "الوصول / الوجهة"
            "EN" -> "Arrival / Destination"
            "ES" -> "Llegada / Destino"
            else -> "Arrivée / Destination"
        }
        val searchBtnText = when (languageCode.uppercase()) {
            "AR" -> "🔍 البحث في محرك المقارنة المباشر"
            "EN" -> "🔍 Search on Live Comparator"
            "ES" -> "🔍 Buscar en el comparador en vivo"
            else -> "🔍 Lancer la recherche sur le comparateur"
        }
        val partnerLabel = when (languageCode.uppercase()) {
            "AR" -> "الشريك المعتمد :"
            "EN" -> "Partner:"
            "ES" -> "Socio colaborador:"
            else -> "Partenaire :"
        }
        val openPartnerText = when (languageCode.uppercase()) {
            "AR" -> "فتح في موقع الشريك ↗"
            "EN" -> "Open on partner site ↗"
            "ES" -> "Abrir en portal asociado ↗"
            else -> "Ouvrir sur le portail partenaire ↗"
        }

        return """
            <!DOCTYPE html>
            <html lang="$htmlLang" dir="$htmlDir">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
                <title>${config.title}</title>
                <script>
                    // Polyfill document.currentScript for WebView compatibility
                    (function() {
                        try {
                            var origDesc = Object.getOwnPropertyDescriptor(Document.prototype, 'currentScript');
                            Object.defineProperty(document, 'currentScript', {
                                get: function() {
                                    var el = origDesc && origDesc.get ? origDesc.get.call(document) : null;
                                    if (el) return el;
                                    return document.querySelector('script[src*="tp.media"]') ||
                                           document.querySelector('script[src*="content"]') ||
                                           document.querySelector('script[src*="travelpayouts"]') ||
                                           (document.scripts.length > 0 ? document.scripts[document.scripts.length - 1] : null);
                                },
                                configurable: true
                            });
                        } catch(e) { console.warn("currentScript polyfill error", e); }
                    })();
                </script>
                <style>
                    * { box-sizing: border-box; }
                    body {
                        margin: 0;
                        padding: 8px;
                        font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
                        background-color: $bgHex;
                        color: $textHex;
                        min-height: 100%;
                    }
                    .widget-shell {
                        background-color: $cardHex;
                        border-radius: 18px;
                        padding: 14px;
                        border: 1px solid rgba(212, 175, 55, 0.35);
                        box-shadow: 0 4px 18px rgba(0, 0, 0, 0.10);
                        min-height: 380px;
                    }
                    .dest-pill {
                        display: inline-block;
                        background: rgba(212, 175, 55, 0.16);
                        color: #D4AF37;
                        border: 1px solid rgba(212, 175, 55, 0.4);
                        border-radius: 999px;
                        padding: 5px 12px;
                        font-size: 12px;
                        margin-bottom: 12px;
                        font-weight: 600;
                    }
                    .widget-container {
                        width: 100%;
                        min-height: 120px;
                    }
                    /* Backup search form styled like Travelpayouts when script is still loading or partner unapproved */
                    .native-search-card {
                        display: none;
                        padding: 14px;
                        background: $inputBg;
                        border-radius: 14px;
                        border: 1px dashed rgba(212, 175, 55, 0.4);
                        margin-top: 8px;
                    }
                    .form-grid {
                        display: grid;
                        grid-template-columns: 1fr 1fr;
                        gap: 10px;
                        margin-bottom: 12px;
                    }
                    @media (max-width: 480px) {
                        .form-grid { grid-template-columns: 1fr; }
                    }
                    .form-field label {
                        display: block;
                        font-size: 11px;
                        font-weight: 700;
                        color: #D4AF37;
                        margin-bottom: 4px;
                        text-transform: uppercase;
                    }
                    .form-field input, .form-field select {
                        width: 100%;
                        padding: 10px 12px;
                        border-radius: 10px;
                        border: 1px solid $inputBorder;
                        background: $cardHex;
                        color: $textHex;
                        font-size: 13px;
                        outline: none;
                    }
                    .btn-search {
                        width: 100%;
                        display: block;
                        background: linear-gradient(180deg, #E8CA65 0%, #D4AF37 50%, #BA8F1D 100%);
                        color: #092E52;
                        font-weight: 800;
                        text-align: center;
                        text-decoration: none;
                        padding: 12px;
                        border-radius: 12px;
                        font-size: 14px;
                        border: none;
                        cursor: pointer;
                        box-shadow: 0 4px 12px rgba(212, 175, 55, 0.3);
                    }
                    .fallback-box {
                        margin-top: 14px;
                        padding-top: 10px;
                        border-top: 1px solid rgba(148, 163, 184, 0.2);
                        display: flex;
                        align-items: center;
                        justify-content: space-between;
                        flex-wrap: wrap;
                        gap: 8px;
                        font-size: 11px;
                        color: $subTextHex;
                    }
                    .direct-link {
                        color: #D4AF37;
                        font-weight: 700;
                        text-decoration: none;
                    }
                </style>
            </head>
            <body>
                <div class="widget-shell">
                    $destBanner
                    <div id="tp-widget-mount" class="widget-container">
                        $normalizedScript
                    </div>

                    <!-- Instant Search Form (Guarantees user always sees an interactive travel search) -->
                    <div id="tp-fallback-form" class="native-search-card">
                        <div class="form-grid">
                            <div class="form-field">
                                <label>$labelOrigin</label>
                                <input type="text" id="origin-input" value="$placeholderOrigin" />
                            </div>
                            <div class="form-field">
                                <label>$labelDest</label>
                                <input type="text" id="dest-input" value="$placeholderDest" />
                            </div>
                        </div>
                        <a id="btn-do-search" class="btn-search" href="${config.fallbackSearchUrl}" target="_blank" rel="noopener">
                            $searchBtnText
                        </a>
                    </div>

                    <div class="fallback-box">
                        <span>$partnerLabel <strong>${config.providerLabel}</strong></span>
                        <a class="direct-link" href="${config.fallbackSearchUrl}" target="_blank" rel="noopener">
                            $openPartnerText
                        </a>
                    </div>
                </div>

                <script>
                    // If tp-cascoon customElement is not mounted after 1.8s, reveal the fallback search card
                    setTimeout(function() {
                        var mount = document.getElementById('tp-widget-mount');
                        var cascoon = mount ? mount.querySelector('tp-cascoon, iframe, form, div.app--tab, div[class*="widget"]') : null;
                        if (!cascoon || mount.offsetHeight < 50) {
                            var fb = document.getElementById('tp-fallback-form');
                            if (fb) fb.style.display = 'block';
                        }
                    }, 1800);

                    // Dynamic search link updating based on user inputs
                    var originInput = document.getElementById('origin-input');
                    var destInput = document.getElementById('dest-input');
                    var searchBtn = document.getElementById('btn-do-search');

                    function updateSearchUrl() {
                        if (!searchBtn) return;
                        var o = encodeURIComponent(originInput ? originInput.value : '');
                        var d = encodeURIComponent(destInput ? destInput.value : '');
                        var base = '${config.fallbackSearchUrl}';
                        searchBtn.href = base + (base.indexOf('?') >= 0 ? '&' : '?') + 'origin=' + o + '&destination=' + d;
                    }
                    if (originInput) originInput.addEventListener('input', updateSearchUrl);
                    if (destInput) destInput.addEventListener('input', updateSearchUrl);
                </script>
            </body>
            </html>
        """.trimIndent()
    }
}

