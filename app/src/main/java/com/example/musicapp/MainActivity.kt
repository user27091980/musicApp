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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musicapp.vista.myComponents.BottomBar
import com.example.musicapp.vista.myComponents.TopBar
import com.example.musicapp.navigation.BandAePage
import com.example.musicapp.navigation.BandAphxPage
import com.example.musicapp.navigation.BandBocPage
import com.example.musicapp.navigation.BandKyussPage
import com.example.musicapp.navigation.BandToolPage
import com.example.musicapp.navigation.LoginPage
import com.example.musicapp.navigation.LoginRegScreen
import com.example.musicapp.navigation.MainScreenPage
import com.example.musicapp.navigation.RegisterPage
import com.example.musicapp.navigation.SettingsPage
import com.example.musicapp.navigation.SplashScreenPage
import com.example.musicapp.navigation.UserInfoPage
import com.example.musicapp.vista.pages.BandAe
import com.example.musicapp.vista.pages.BandAphx
import com.example.musicapp.vista.pages.BandBoc
import com.example.musicapp.vista.pages.BandKyuss
import com.example.musicapp.vista.pages.BandTool
import com.example.musicapp.vista.pages.Login
import com.example.musicapp.vista.pages.LoginRegScreen
import com.example.musicapp.vista.pages.MainScreenPage
import com.example.musicapp.vista.pages.RegisterScreenPage
import com.example.musicapp.vista.pages.SettingsScreen
import com.example.musicapp.vista.pages.SplashScreen
import com.example.musicapp.vista.pages.UserInfoScreenPage
import com.example.musicapp.ui.theme.themes.MusicAppTheme

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
                    topBar = { TopBar() },
                    bottomBar = { BottomBar() },
                    content = { innerPadding ->
                        Box(modifier = Modifier.padding(paddingValues = innerPadding)) {
                            NavHost(
                                navController = navController,
                                startDestination = SplashScreenPage
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
                                    RegisterScreenPage()
                                }
                                composable<MainScreenPage> {
                                    MainScreenPage()
                                }
                                composable<BandAePage> {
                                    BandAe()
                                }
                                composable<BandAphxPage> {
                                    BandAphx()
                                }
                                composable<BandBocPage> {
                                    BandBoc()
                                }
                                composable<BandKyussPage> {
                                    BandKyuss()
                                }
                                composable<BandToolPage> {
                                    BandTool()
                                }
                                composable<UserInfoPage> {
                                    UserInfoScreenPage()
                                }
                                composable<SettingsPage> {
                                    SettingsScreen()
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MusicAppPreviewPage() {
    MusicAppTheme {
        //SplashScreenPage()
        //Login()
        //LoginRegScreen()
        //RegisterScreenPage()
        MainScreenPage()
        //BandAe()
        //BandAphx()
        //BandBoc()
        //BandKyuss()
        //BandTool()
        //UserInfoScreenPage()
    }

}


