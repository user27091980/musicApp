package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.musicapp.R
import com.example.musicapp.styles.imageModifier

@Composable
fun SplashScreenComponent(){

    Box {

        Image(
            painter = painterResource(R.drawable.portrait),
            contentDescription = "",
            modifier = imageModifier,
            contentScale = ContentScale.Crop)

    }
}

