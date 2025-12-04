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
class RegisterPage(val email:String, val user:String)

@Serializable
class MainScreenPage()

@Serializable
class BandAePage()

@Serializable
class BandAphxPage()

@Serializable
class BandBocPage()

@Serializable
class BandKyussPage()

@Serializable
class BandToolPage()

@Serializable
class UserInfoPage()

@Serializable class DialogPage(){}
