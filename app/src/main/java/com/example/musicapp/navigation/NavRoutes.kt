package com.example.musicapp.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface NavRoute

@Serializable
object SplashRoute : NavRoute


@Serializable
data class LoginRoute(val email: String) : NavRoute

@Serializable
data class RegisterRoute(val email: String, val user: String) : NavRoute

@Serializable
object LoginRegRoute : NavRoute

@Serializable
object MainScreenRoute : NavRoute

@Serializable
object BandAeRoute : NavRoute

@Serializable
object BandAphxRoute : NavRoute

@Serializable
object BandBocRoute : NavRoute

@Serializable
object BandKyussRoute : NavRoute

@Serializable
object BandToolRoute : NavRoute

@Serializable
object UserInfoRoute : NavRoute

@Serializable
object DialogPage : NavRoute

@Serializable
object SettingsRoute : NavRoute

/**
 * ===APUNTES====
 * /*emplear data class para rutas con parámetros:
 * Kotlin NO genera automáticamente:
 * equals()
 * hashCode()
 * toString()
 * copy()
 * destructuring (component1())
 * Eso significa que dos rutas con el mismo contenido NO son iguales
 * en Resumen:
 *
 * class → algo con lógica, identidad propia
 * data class → solo datos
 *
 * En navegación:
 * Rutas con parámetros → data class
 * Rutas sin parámetros → object
 *
 * object lo ponemos si es estático
 * no tiene sentido que tengamos clases vacias, es algo innecesario
 *
 */