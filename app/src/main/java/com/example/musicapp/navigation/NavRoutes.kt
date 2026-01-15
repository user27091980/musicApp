package com.example.musicapp.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

//ya tenemos objeto creado para la parte de la rutas
//object lo ponemos si es estático
@Serializable
object SplashScreenPage

@Serializable
class LoginPage(val email:String){}

@Serializable
class RegisterPage(val email:String, val user:String)

@Serializable
object LoginRegScreen

@Serializable
object MainScreenPage

@Serializable
object BandAePage

@Serializable
object BandAphxPage

@Serializable
object BandBocPage

@Serializable
object BandKyussPage

@Serializable
object BandToolPage

@Serializable
object UserInfoPage

@Serializable
object DialogPage
