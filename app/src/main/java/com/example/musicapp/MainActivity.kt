package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.pages.DiscographyScreenPage
import com.example.musicapp.pages.MainScreenPage
import com.example.musicapp.pages.MusicBandScreenPage
import com.example.musicapp.pages.RegisterScreenPage
import com.example.musicapp.pages.UserInfoScreenPage
import com.example.musicapp.ui.theme.MusicAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MusicAppTheme {
                Scaffold {
                    innerPadding->
                    Box(Modifier.padding(innerPadding)){
                        //SplashScreenPage()
                        //LoginScreenPage()
                        //RegisterScreenPage()
                        MainScreenPage()
                        //MusicBandScreenPage()
                        //UserInfoScreenPage()
                        //DiscographyScreenPage()}
                }
            }
        }
    }
}

    @Preview
    @Composable
    fun MusicAppPreviewPage() {

        MusicAppTheme {
            //UserInfoScreenPage()
            MainScreenPage()
        }
    }
}

