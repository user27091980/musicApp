package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
import com.example.musicapp.ui.theme.themes.MusicAppTheme
import com.example.musicapp.view.myComponents.BottomBar
import com.example.musicapp.view.myComponents.TopBar
import com.example.musicapp.view.pages.BandAe
import com.example.musicapp.view.pages.BandAphx
import com.example.musicapp.view.pages.BandBoc
import com.example.musicapp.view.pages.BandKyuss
import com.example.musicapp.view.pages.BandTool
import com.example.musicapp.view.pages.Login
import com.example.musicapp.view.pages.LoginRegScreen
import com.example.musicapp.view.pages.MainScreenPage
import com.example.musicapp.view.pages.RegisterScreenPage
import com.example.musicapp.view.pages.SettingsScreen
import com.example.musicapp.view.pages.SplashScreen
import com.example.musicapp.view.pages.UserInfoScreenPage

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
            //creamos el navController
            val navController = rememberNavController()

            MusicAppTheme {
                //andamiaje,
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopBar(navController) },
                    bottomBar = { BottomBar(navController) },
                    content = { innerPadding ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                        ) {
                            NavHost(
                                navController = navController,
                                startDestination = MainScreenRoute
                            ) {
                                composable<SplashRoute> {
                                    SplashScreen(navController)
                                }
                                composable<LoginRegRoute> {
                                    LoginRegScreen(navController)
                                }
                                composable<LoginRoute> {
                                    Login(navController)
                                }
                                composable<RegisterRoute> {
                                    RegisterScreenPage(navController)
                                }
                                composable<MainScreenRoute> {
                                    MainScreenPage()
                                }
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
                                composable<UserInfoRoute> {
                                    UserInfoScreenPage()
                                }
                                composable<SettingsRoute> {
                                    SettingsScreen(navController)
                                }
                                /*composable("home") {
                                    MainScreenPage()
                                }
                                composable("search") {
                                    UserInfoScreenPage()
                                }
                                composable("profile") {
                                    UserInfoScreenPage()
                                }

                                 */
                            }
                        }
                    }
                )
            }
        }
    }
}



