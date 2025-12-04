package com.example.musicapp.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

//ya tenemos objeto creado para la parte de la ruta
@Serializable
object SplashScreenPage

@Serializable
class LoginPage(val email:String){}

@Serializable
object RegisterPage

@Serializable
object MainScreenPage

@Serializable
object BandAe

@Serializable
object BandAphex

@Serializable
object BandBoc

@Serializable
object BandKyussPage

@Serializable
object BandToolPage

@Serializable
object User

@Serializable class DialogPage(){}
