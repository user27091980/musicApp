package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import com.example.musicapp.navigation.SplashScreenPage
import com.example.musicapp.navigation.UserInfoPage
import com.example.musicapp.pages.Login
import com.example.musicapp.pages.LoginRegScreen
import com.example.musicapp.pages.MainScreenPage
import com.example.musicapp.pages.RegisterScreenPage
import com.example.musicapp.pages.SplashScreenPage
import com.example.musicapp.ui.theme.MusicAppTheme

/*
TODO(revise:
 FATAL EXCEPTION: main Process: com.example.musicapp, PID: 5988 kotlinx.serialization.SerializationException:
    Serializer for class 'Companion' is not found.
    Please ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied..)
*/
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
                    //creamos el NavHost con el grafo de navegación
                        NavHost(
                            navController = navController,
                            startDestination = SplashScreenPage
                        ) {
                            composable<SplashScreenPage>{}
                            composable<LoginRegScreen>{}
                            composable<LoginPage>{}
                            composable<RegisterPage>{}
                            composable<MainScreenPage>{}
                            composable<BandAePage>{}
                            composable<BandAphxPage>{}
                            composable<BandBocPage>{}
                            composable<BandKyussPage>{}
                            composable<BandToolPage>{}
                            composable<UserInfoPage>{ }


                        }
                        //MainScreenPage(modifier = Modifier.padding(innerPadding))
                        //BandAe(modifier = Modifier.padding(innerPadding))
                        //BandAphx(modifier=Modifier.padding(innerPadding))
                        //BandBoc(modifier=Modifier.padding(innerPadding))
                        //BandKyuss(modifier=Modifier.padding(innerPadding))
                        //BandTool(modifier=Modifier.padding(innerPadding))
                        //UserInfoScreenPage(modifier = Modifier.padding(innerPadding))

                    }
                )
                //SplashScreenPage()
                //LoginRegScreen()
                //RegisterScreenPage()
                //Login()
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


