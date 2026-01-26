package com.example.musicapp.ui.theme.themes

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = SoftGreen80,
    secondary = SoftBlue80,
    tertiary = SoftBlue,
    surface = DarkGray,
    background = Black,

)

private val LightColorScheme = lightColorScheme(
    primary = DarkGreen80,
    secondary = DarkerGreen,
    tertiary = DarkBlue,
    surface = DarkGray,
    background = Black,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

//configuraión de temas por parámetros
@Composable
fun MusicAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),//true (para poner siempre en tema óscuro)
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable (() -> Unit)
) {
    val colorScheme = when {

        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        /*tema óscuro o tema claro, podriamos seleccionarlos por usuarios
            accesibilidad podriamos cambiar los colores de toda la aplicación
         */
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    //cambiamos elso colores
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}