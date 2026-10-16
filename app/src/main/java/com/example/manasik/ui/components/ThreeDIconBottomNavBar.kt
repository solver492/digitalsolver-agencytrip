package com.example.manasik.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.MainNavigationTab

/**
 * Premium Liquid Crystal Glass Bottom Navigation Bar:
 * - Floating pill dock with multi-layer frosted glassmorphism (no harsh circular blobs or cutoffs).
 * - Animated sliding crystal capsule that smoothly glides horizontally between tabs on click.
 * - Dynamic spring scaling and crisp typography for the selected item.
 * - Elegant, refined "NEW" micro-badge on Services and Packages.
 * - Ultra-smooth visual feedback on tap.
 */
@Composable
fun ThreeDIconBottomNavBar(
    selectedTab: MainNavigationTab,
    onTabSelected: (MainNavigationTab) -> Unit,
    modifier: Modifier = Modifier,
    isDark: Boolean = isSystemInDarkTheme()
) {
    val tabs = remember { MainNavigationTab.values() }
    val selectedIndex = selectedTab.ordinal

    Surface(
        color = Color.Transparent,
        modifier = modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 12.dp, vertical = 6.dp)
            .testTag("main_bottom_nav")
    ) {
        // Outer Dock: Pure Frosted Crystal Glass
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    elevation = 16.dp,
                    shape = RoundedCornerShape(30.dp),
                    ambientColor = if (isDark) Color(0x60000000) else Color(0x20000000),
                    spotColor = if (isDark) Color(0x30D4AF37) else Color(0x25092E52)
                )
                .clip(RoundedCornerShape(30.dp))
                .background(
                    Brush.verticalGradient(
                        colors = if (isDark) {
                            listOf(
                                Color(0xE00A1F36), // Deep luxury translucent navy
                                Color(0xF2061526)
                            )
                        } else {
                            listOf(
                                Color(0xF2FFFFFF), // Crisp luminous crystal white
                                Color(0xECF3F6FA)
                            )
                        }
                    )
                )
                .border(
                    width = 1.dp,
                    brush = Brush.verticalGradient(
                        colors = if (isDark) {
                            listOf(
                                Color(0x66D4AF37), // Top delicate gold rim highlight
                                Color(0x1AFFFFFF),
                                Color(0x20092E52)
                            )
                        } else {
                            listOf(
                                Color(0x99FFFFFF), // Top crystal light reflection
                                Color(0x33D4AF37),
                                Color(0x15CBD5E1)
                            )
                        }
                    ),
                    shape = RoundedCornerShape(30.dp)
                )
                .padding(horizontal = 4.dp, vertical = 4.dp)
        ) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp)
            ) {
                val totalTabs = tabs.size
                val tabWidth = maxWidth / totalTabs

                // Smooth Sliding Crystal Pill Capsule (glides seamlessly between buttons)
                val animatedPillOffset by animateDpAsState(
                    targetValue = tabWidth * selectedIndex,
                    animationSpec = spring(
                        dampingRatio = 0.76f,
                        stiffness = Spring.StiffnessMediumLow
                    ),
                    label = "crystal_pill_slide"
                )

                // The single active crystal glass capsule
                Box(
                    modifier = Modifier
                        .offset(x = animatedPillOffset)
                        .width(tabWidth)
                        .fillMaxHeight()
                        .padding(horizontal = 2.dp, vertical = 2.dp)
                        .clip(RoundedCornerShape(22.dp))
                        .background(
                            Brush.verticalGradient(
                                colors = if (isDark) {
                                    listOf(
                                        Color(0x38D4AF37), // Delicate warm gold crystal shimmer
                                        Color(0x180E2B4A),
                                        Color(0x26040F1D)
                                    )
                                } else {
                                    listOf(
                                        Color(0x99FFFFFF), // Soft liquid glass highlight
                                        Color(0x2BD4AF37),
                                        Color(0x10E8CA65)
                                    )
                                }
                            )
                        )
                        .border(
                            width = 1.dp,
                            brush = Brush.verticalGradient(
                                colors = if (isDark) {
                                    listOf(
                                        Color(0x80D4AF37),
                                        Color(0x25FFFFFF),
                                        Color(0x40092E52)
                                    )
                                } else {
                                    listOf(
                                        Color(0xB3FFFFFF),
                                        Color(0x66D4AF37),
                                        Color(0x25092E52)
                                    )
                                }
                            ),
                            shape = RoundedCornerShape(22.dp)
                        )
                ) {
                    // Refined bottom crystal accent indicator
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(bottom = 2.dp)
                            .width(16.dp)
                            .height(2.5.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFE8CA65),
                                        Color(0xFFD4AF37),
                                        Color(0xFFBA8F1D)
                                    )
                                )
                            )
                    )
                }

                // Row of Interactive Buttons (Clean, elegant, NO malformed circle!)
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    tabs.forEach { tab ->
                        val isSelected = selectedTab == tab
                        val interactionSource = remember { MutableInteractionSource() }

                        val iconScale by animateFloatAsState(
                            targetValue = if (isSelected) 1.10f else 0.98f,
                            animationSpec = spring(
                                dampingRatio = Spring.DampingRatioMediumBouncy,
                                stiffness = Spring.StiffnessLow
                            ),
                            label = "icon_scale"
                        )

                        val iconColor by animateColorAsState(
                            targetValue = when {
                                isSelected && isDark -> Color(0xFFF6D878) // Radiant gold for dark
                                isSelected && !isDark -> Color(0xFF092E52) // Royal navy for light
                                isDark -> Color(0xFF8CA3BA) // Elegant muted silver
                                else -> Color(0xFF5A6E85)
                            },
                            animationSpec = spring(stiffness = Spring.StiffnessMedium),
                            label = "icon_tint"
                        )

                        val textColor by animateColorAsState(
                            targetValue = when {
                                isSelected && isDark -> Color(0xFFFFFFFF)
                                isSelected && !isDark -> Color(0xFF092E52)
                                isDark -> Color(0xFF7E95AD)
                                else -> Color(0xFF64748B)
                            },
                            animationSpec = spring(stiffness = Spring.StiffnessMedium),
                            label = "text_color"
                        )

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .clip(RoundedCornerShape(22.dp))
                                .clickable(
                                    interactionSource = interactionSource,
                                    indication = ripple(bounded = true, color = Color(0x40D4AF37)),
                                    onClick = { onTabSelected(tab) }
                                )
                                .padding(vertical = 4.dp)
                                .testTag("nav_${tab.name.lowercase()}")
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                // Icon with Badge Container
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .size(28.dp)
                                        .scale(iconScale)
                                ) {
                                    Icon(
                                        imageVector = tab.icon,
                                        contentDescription = tab.title,
                                        tint = iconColor,
                                        modifier = Modifier.size(21.dp)
                                    )

                                    // Refined "NEW" Micro-Badge (Services & Forfaits)
                                    if (tab == MainNavigationTab.SERVICES || tab == MainNavigationTab.PACKAGES) {
                                        NewBadge(
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .offset(x = 8.dp, y = (-3).dp)
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.height(3.dp))

                                val strings = com.example.manasik.data.i18n.LocalAppStrings.current
                                val tabTitle = when (tab) {
                                    MainNavigationTab.HOME -> strings.navHome
                                    MainNavigationTab.DESTINATIONS -> strings.navDestinations
                                    MainNavigationTab.SERVICES -> strings.navServices
                                    MainNavigationTab.PACKAGES -> strings.navPackages
                                    MainNavigationTab.QUOTES_FAQ -> strings.navQuotesFaq
                                }

                                Text(
                                    text = tabTitle,
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        fontSize = 10.sp,
                                        letterSpacing = (-0.1).sp
                                    ),
                                    fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Medium,
                                    color = textColor,
                                    maxLines = 1
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * Refined Micro-Badge "NEW" with crystal gloss border and gold metallic gradient.
 */
@Composable
fun NewBadge(modifier: Modifier = Modifier) {
    val shape = RoundedCornerShape(
        topStart = 6.dp,
        topEnd = 6.dp,
        bottomEnd = 6.dp,
        bottomStart = 2.dp
    )

    Box(
        modifier = modifier
            .shadow(elevation = 2.dp, shape = shape, spotColor = Color(0x40D4AF37))
            .clip(shape)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFE8CA65),
                        Color(0xFFD4AF37),
                        Color(0xFFA87C1D)
                    )
                )
            )
            .border(
                width = 0.5.dp,
                color = Color(0x99FFFFFF),
                shape = shape
            )
            .padding(horizontal = 4.dp, vertical = 0.5.dp),
        contentAlignment = Alignment.Center
    ) {
        val strings = com.example.manasik.data.i18n.LocalAppStrings.current
        Text(
            text = strings.newBadge,
            color = Color(0xFF092E52),
            fontSize = 7.sp,
            fontWeight = FontWeight.Black,
            letterSpacing = 0.3.sp,
            lineHeight = 8.sp
        )
    }
}
