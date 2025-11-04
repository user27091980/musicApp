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
import com.example.musicapp.myComponents.BottomBar
import com.example.musicapp.myComponents.TopBar
import com.example.musicapp.pages.DiscographyScreenPage
import com.example.musicapp.ui.theme.MusicAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicAppTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopBar() },
                    bottomBar = { BottomBar() },
                    content = { innerPadding ->
                        //SplashScreenPage()
                        //LoginScreenPage()
                        //RegisterScreenPage()
                        //MainScreenPage(modifier=Modifier.padding(innerPadding))
                        //MusicBandScreenPage(modifier=Modifier.padding(innerPadding))
                        //UserInfoScreenPage(modifier=Modifier.padding(innerPadding))
                        DiscographyScreenPage(modifier=Modifier.padding(innerPadding))
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

        DiscographyScreenPage()

    }
}


