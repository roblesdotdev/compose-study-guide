package com.example.csg.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Green500,
    surface = DarkBlue,
    onSurface = White,
    background = DarkBlue,
    onBackground = White,
)

@Composable
fun CSGTheme(content: @Composable () -> Unit) {
    val colors = DarkColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}