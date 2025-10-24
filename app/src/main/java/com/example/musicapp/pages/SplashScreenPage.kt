package com.example.musicapp.pages

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.SplashScreenComponent

@Composable
fun SplashScreen(){

    SplashScreenComponent();

}

@Preview
@Composable
fun SplasPreview(){

    SplashScreen()

}