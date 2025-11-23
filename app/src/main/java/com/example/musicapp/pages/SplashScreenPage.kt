package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.GridViewComponent
import com.example.musicapp.myComponents.SplashScreenComponent

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun SplashScreenPage(){

    //SplashScreenComponent()
    GridViewComponent()

}

@Preview
@Composable
fun SplashPreview(){

    SplashScreenPage()

}