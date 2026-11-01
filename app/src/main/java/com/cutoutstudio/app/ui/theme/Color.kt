package com.cutoutstudio.app.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val PrimaryBlue = Color(0xFF4C7CFF)
val AccentCyan = Color(0xFF7BE7DE)
val AccentPurple = Color(0xFF9E7BFF)
val SurfaceDark = Color(0xFF0E1220)
val PanelDark = Color(0xFF171D2B)
val CardDark = Color(0xFF1B2235)
val TextWhite = Color(0xFFEAF0FF)
val MutedText = Color(0xFF9CA7C1)
val AppBackground = Color(0xFF070B13)

val DarkColorScheme = darkColorScheme(
    primary = PrimaryBlue,
    secondary = AccentCyan,
    tertiary = AccentPurple,
    background = AppBackground,
    surface = SurfaceDark,
    onPrimary = TextWhite,
    onSecondary = TextWhite,
    onBackground = TextWhite,
    onSurface = TextWhite,
)

val LightColorScheme = lightColorScheme(
    primary = PrimaryBlue,
    secondary = AccentCyan,
    tertiary = AccentPurple,
    background = Color(0xFFF4F7FB),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color(0xFF0F172A),
    onSecondary = Color(0xFF0F172A),
    onBackground = Color(0xFF0F172A),
    onSurface = Color(0xFF0F172A),
)
