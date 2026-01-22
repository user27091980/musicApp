package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musicapp.myComponents.BottomBar
import com.example.musicapp.myComponents.TopBar
import com.example.musicapp.navigation.BandAePage
import com.example.musicapp.navigation.BandAphxPage
import com.example.musicapp.navigation.BandBocPage
import com.example.musicapp.navigation.BandKyussPage
import com.example.musicapp.navigation.BandToolPage
import com.example.musicapp.navigation.LoginPage
import com.example.musicapp.navigation.LoginRegScreen
import com.example.musicapp.navigation.MainScreenPage
import com.example.musicapp.navigation.RegisterPage
import com.example.musicapp.navigation.SettingsScreen
import com.example.musicapp.navigation.SplashScreenPage
import com.example.musicapp.navigation.UserInfoPage
import com.example.musicapp.pages.BandAe
import com.example.musicapp.pages.BandAphx
import com.example.musicapp.pages.BandBoc
import com.example.musicapp.pages.BandKyuss
import com.example.musicapp.pages.BandTool
import com.example.musicapp.pages.Login
import com.example.musicapp.pages.LoginRegScreen
import com.example.musicapp.pages.MainScreenPage
import com.example.musicapp.pages.RegisterScreenPage
import com.example.musicapp.pages.SettingsScreen
import com.example.musicapp.pages.SplashScreen
import com.example.musicapp.pages.SplashScreenPage
import com.example.musicapp.pages.UserInfoScreenPage
import com.example.musicapp.ui.theme.MusicAppTheme

/**
 * @author="Andrés"
 * @param
 * @function
 *
 */
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //creamos el navController: responsable de navegar entre los destinos
            val navController = rememberNavController()

            MusicAppTheme {
                //andamiaje,
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopBar() },
                    bottomBar = { BottomBar() },
                    content = { innerPadding ->

                        var p = innerPadding;

                        Box(modifier = Modifier) {
                            /**
                             * NavHost: Es el elemento componible que funciona como contenedor para
                             * mostrar el destino actual del NavGraph.
                             */
                            NavHost(
                                navController = navController,
                                startDestination = SplashScreenPage()
                            ) {
                                composable<SplashScreenPage> {
                                    SplashScreen(navController)
                                }
                                composable<LoginRegScreen> {
                                    LoginRegScreen(navController)
                                }
                                composable<LoginPage> {
                                    Login(navController)
                                }
                                composable<RegisterPage> {
                                    RegisterScreenPage(navController)
                                }
                                composable<MainScreenPage> {
                                    MainScreenPage(navController)
                                }
                                composable<BandAePage> {
                                    BandAe()
                                }
                                composable<BandAphxPage> {
                                    BandAphx(navController)
                                }
                                composable<BandBocPage> {
                                    BandBoc(navController)
                                }
                                composable<BandKyussPage> {
                                    BandKyuss(navController)
                                }
                                composable<BandToolPage> {
                                    BandTool(navController)
                                }
                                composable<UserInfoPage> {
                                    UserInfoScreenPage(navController)
                                }
                               /*composable<SettingsScreen>{
                                    SettingsScreen()
                                }*/
                            }
                        }
                    }
                )
            }
        }
    }
}


