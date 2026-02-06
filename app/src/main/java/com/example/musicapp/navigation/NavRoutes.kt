package com.example.musicapp.navigation

import kotlinx.serialization.Serializable

//ya tenemos objeto creado para la parte de la rut
//object lo ponemos si es estático
//no tiene sentido que tengamos clases vacias, es algo innecesario


//para kotlin serialization ideal agrupar:
@Serializable
sealed interface NavRoute

@Serializable
object SplashScreenPage: NavRoute

/*emplear data class para rutas con parámetros:
Kotlin NO genera automáticamente:
equals()
hashCode()
toString()
copy()
destructuring (component1())
Eso significa que dos rutas con el mismo contenido NO son iguales
en Resumen:

class → algo con lógica, identidad propia
data class → solo datos

En navegación:
Rutas con parámetros → data class
Rutas sin parámetros → object
*/
@Serializable
data class LoginPage(val email: String): NavRoute

@Serializable
data class RegisterPage(val email: String, val user: String): NavRoute

@Serializable
object LoginRegScreen: NavRoute

@Serializable
object MainScreenPage : NavRoute

@Serializable
object BandAePage: NavRoute

@Serializable
object BandAphxPage : NavRoute

@Serializable
object BandBocPage: NavRoute

@Serializable
object BandKyussPage: NavRoute

@Serializable
object BandToolPage: NavRoute

@Serializable
object UserInfoPage: NavRoute

@Serializable
object DialogPage

@Serializable
object SettingsPage: NavRoute
