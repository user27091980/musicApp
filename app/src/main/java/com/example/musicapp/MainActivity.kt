package com.example.musicapp
// Android basic imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
//Compose layouts basic imports
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
//Material 3
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
//Compose navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//Navigation routes(sealed classes)
import com.example.musicapp.navigation.BandAeRoute
import com.example.musicapp.navigation.BandAphxRoute
import com.example.musicapp.navigation.BandBocRoute
import com.example.musicapp.navigation.BandKyussRoute
import com.example.musicapp.navigation.BandToolRoute
import com.example.musicapp.navigation.LoginRegRoute
import com.example.musicapp.navigation.LoginRoute
import com.example.musicapp.navigation.MainScreenRoute
import com.example.musicapp.navigation.RegisterRoute
import com.example.musicapp.navigation.SettingsRoute
import com.example.musicapp.navigation.SplashRoute
import com.example.musicapp.navigation.UserInfoRoute
//app theme
import com.example.musicapp.ui.theme.themes.MusicAppTheme
//reused components
import com.example.musicapp.view.myComponents.BottomBar
//Screens
import com.example.musicapp.view.pages.BandAe
import com.example.musicapp.view.pages.BandAphx
import com.example.musicapp.view.pages.BandBoc
import com.example.musicapp.view.pages.BandKyuss
import com.example.musicapp.view.pages.BandTool
import com.example.musicapp.view.pages.Login
import com.example.musicapp.view.pages.LoginRegScreen
import com.example.musicapp.view.pages.LoginRoute
import com.example.musicapp.view.pages.MainScreenPage
import com.example.musicapp.view.pages.RegisterScreenPage
import com.example.musicapp.view.pages.SettingsScreen
import com.example.musicapp.view.pages.SplashScreen
import com.example.musicapp.view.pages.UserInfoScreenPage
import com.example.musicapp.vista.myComponents.TopBar

/**App main´s activity
 * App´s entry point
 * @author="Andrés"
 * @param
 * @function
 *
 */
class MainActivity : ComponentActivity() {
    //Experimental Apis from Material 3
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //allows app uses all the screen (edge-to-edge)
        enableEdgeToEdge()
        //compose content activity
        setContent {
            //navigation av controller
            val navController = rememberNavController()
            //general app theme
            MusicAppTheme {
                //basic App structure,
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    //personalized topbar
                    topBar = { TopBar(navController) },
                    //personalized bottombar
                    bottomBar = { BottomBar(navController) },
                    //main content
                    content = { innerPadding ->
                        //box for wrap the content and apply padding
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                        ) {
                            //Manage the navigation between screens
                            NavHost(
                                navController = navController,
                                //main screen app
                                startDestination = SplashRoute,
                                modifier = Modifier.padding(innerPadding)
                            ) {
                                //SplashScreen
                                composable<SplashRoute> {
                                    SplashScreen(navController)
                                }
                                //register and login screen
                                composable<LoginRegRoute> {
                                    LoginRegScreen(navController)
                                }
                                //login screen
                                composable<LoginRoute> {
                                    LoginRoute(navController = navController)
                                }
                                //register screen
                                composable<RegisterRoute> {
                                    RegisterScreenPage(navController)
                                }
                                //main screen
                                composable<MainScreenRoute> {
                                    MainScreenPage(navController)
                                }
                                //Bands screens
                                composable<BandAeRoute> {
                                    BandAe()
                                }
                                composable<BandAphxRoute> {
                                    BandAphx()
                                }
                                composable<BandBocRoute> {
                                    BandBoc()
                                }
                                composable<BandKyussRoute> {
                                    BandKyuss()
                                }
                                composable<BandToolRoute> {
                                    BandTool()
                                }
                                //User info
                                composable<UserInfoRoute> {
                                    UserInfoScreenPage()
                                }
                                //Settings screen
                                composable<SettingsRoute> {
                                    SettingsScreen(
                                    )
                                }
                                //String routes for bottom bar
                                composable("home") {
                                    MainScreenPage(navController)
                                }
                                composable("search") {
                                    UserInfoScreenPage()
                                }
                                composable("profile") {
                                    UserInfoScreenPage()
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}

/**
 * Notas apuntes:
 *NavHost es el contenedor de navegación en Jetpack Compose.
 * Su trabajo es:
 *
 * Decidir qué pantalla (Composable) se muestra según la ruta actual
 *
 * 1️⃣ navController
 * val navController = rememberNavController()
 * Es el cerebro de la navegación
 * Guarda:
   * Pantalla actualHistorial (back stack)
   * Se usa para navegar

 * 2️⃣ startDestination:
 * Es la primera pantalla que se muestra al abrir la app
 *
 * 3️⃣ El bloque {} de NavHost
    *Aquí defines todas las rutas posibles:
*{
 *  composable<SplashRoute> { ... }
 *
 *   composable<LoginRoute> { ... }
*}
*Cada composable es:

*Una pantalla asociada a una ruta
*¿Qué hace?
*composable<SplashRoute> {
*SplashScreen(navController)
*}
*Esto significa:
*Cuando la ruta actual es SplashRoute
*NavHost muestra:
*👉 SplashScreen
 * ¿Cómo funciona la navegación en tiempo real?
 * Ejemplo real: Splash → Login
 *
 * Desde SplashScreen haces:
 *
 * navController.navigate(LoginRegRoute)
 *
 * Lo que pasa internamente:
 *
 * navController cambia la ruta actual
 *
 * NavHost detecta el cambio
 *
 * Busca esta definición:
 *
 * composable<LoginRegRoute> {
 *     LoginRegScreen(navController)
 * }
 *
 *
 * Muestra LoginRegScreen
 *
 * La pantalla anterior queda en el back stack
 * Back Stack (botón atrás)
 *
 * Cuando navegas:
 *
 * navController.navigate(MainScreenRoute)
 *
 *
 * Se guarda esto:
 *
 * Splash → Login → MainScreen
 *
 *
 * Si llamas:
 *
 * navController.popBackStack()
 *
 *
 * Vuelves a:
 * 👉 Login
 *
 * Rutas tipadas vs rutas String
 * 🟢 Rutas tipadas (las que usas)
 * composable<MainScreenRoute> { ... }
 *
 *
 * Ventajas:
 *
 * Más seguras
 *
 * Menos errores de escritura
 *
 * Mejor escalabilidad
 *
 * 🔵 Rutas String (las del BottomBar)
 * composable("home") { ... }
 *
 *
 * Normalmente se usan cuando:
 *
 * BottomNavigation
 *
 * Rutas simples
 *
 * No necesitas argumentos complejos
 *
 * ⚠️ En tu app tienes ambas mezcladas, lo cual funciona, pero conviene unificarlas.
 * ¿Cómo encaja con Scaffold?
 *
 * Tu estructura real es:
 *
 * MainActivity
 *  └── Scaffold
 *      ├── TopBar
 *      ├── BottomBar
 *      └── NavHost  👈 aquí cambia el contenido
 *
 *
 * TopBar y BottomBar NO cambian
 *
 * Solo cambia lo que hay dentro del NavHost
 *
 * Esto es ideal para apps con navegación fija.
 *
 * Esquema visual rápido
 * NavHost
 *  ├── SplashRoute → SplashScreen
 *  ├── LoginRoute → LoginScreen
 *  ├── MainScreenRoute → MainScreen
 *  ├── BandAeRoute → BandAe
 *  ├── SettingsRoute → Settings
 *
 *  Errores comunes (para que no caigas 😅)
 *
 * ❌ Olvidar pasar navController a la pantalla
 * ❌ Tener dos rutas distintas para la misma pantalla
 * ❌ No limpiar el back stack al hacer login
 *
 * Términos:
 * NavHost = mapa de navegación
 * navController = controla el movimiento
 * startDestination = pantalla inicial
 * composable{} = una pantalla por ruta
 * Cambia la ruta → cambia la pantalla
 */


