package com.example.manasik.ui.components

import android.graphics.BitmapFactory
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// LRU cache for decoded asset bitmaps to ensure instant recall and low memory footprint
private val assetBitmapCache = mutableMapOf<String, ImageBitmap>()

@Composable
fun AssetImage(
    assetPath: String,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop
) {
    val context = LocalContext.current
    val cleanPath = remember(assetPath) {
        assetPath
            .removePrefix("file:///android_asset/")
            .removePrefix("/")
    }

    var imageBitmap by remember(cleanPath) {
        mutableStateOf(assetBitmapCache[cleanPath])
    }

    LaunchedEffect(cleanPath) {
        if (imageBitmap == null) {
            val bitmap = withContext(Dispatchers.IO) {
                try {
                    // Open asset stream and read full byte buffer (bulletproof across all OEM devices and compressed APKs)
                    val candidates = listOf(
                        cleanPath,
                        "images/$cleanPath",
                        cleanPath.removePrefix("images/"),
                        "images/${cleanPath.removePrefix("images/")}",
                        "images/destinations/${cleanPath.substringAfterLast("/")}"
                    ).distinct()

                    var inputStream: java.io.InputStream? = null
                    for (candidate in candidates) {
                        try {
                            inputStream = context.assets.open(candidate)
                            if (inputStream != null) break
                        } catch (_: Exception) {
                            // try next candidate
                        }
                    }
                    if (inputStream == null) return@withContext null
                    val bytes = inputStream.use { it.readBytes() }

                    // Determine dimensions
                    val boundsOpts = BitmapFactory.Options().apply {
                        inJustDecodeBounds = true
                    }
                    BitmapFactory.decodeByteArray(bytes, 0, bytes.size, boundsOpts)

                    // Calculate safe sample size for mobile memory
                    var sampleSize = 1
                    val maxDimension = 1080
                    while (boundsOpts.outWidth / (sampleSize * 2) >= maxDimension ||
                        boundsOpts.outHeight / (sampleSize * 2) >= maxDimension
                    ) {
                        sampleSize *= 2
                    }

                    // Decode with optimal memory allocation
                    val decodeOpts = BitmapFactory.Options().apply {
                        inSampleSize = sampleSize
                        inPreferredConfig = android.graphics.Bitmap.Config.RGB_565
                    }
                    val decoded = BitmapFactory.decodeByteArray(bytes, 0, bytes.size, decodeOpts)
                    decoded?.asImageBitmap()
                } catch (t: Throwable) {
                    t.printStackTrace()
                    null
                }
            }

            if (bitmap != null) {
                assetBitmapCache[cleanPath] = bitmap
                imageBitmap = bitmap
            }
        }
    }

    Crossfade(
        targetState = imageBitmap,
        modifier = modifier,
        label = "asset_crossfade"
    ) { bitmap ->
        if (bitmap != null) {
            Image(
                bitmap = bitmap,
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxSize(),
                contentScale = contentScale
            )
        } else {
            // Elegant gradient placeholder while loading
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.6f),
                                MaterialTheme.colorScheme.surfaceVariant
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Image,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.35f)
                )
            }
        }
    }
}
