package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.styles.botonLogin
import com.example.musicapp.styles.botonRegister
import com.example.musicapp.myComponents.BotonLogin
import com.example.musicapp.myComponents.BotonRegister
import com.example.musicapp.styles.imageModifier


@Composable
fun LoginScreenPage(){

    Box(Modifier
        .background(MaterialTheme.colorScheme.onBackground)
    ){
        Image(
            painter = painterResource(R.drawable.portrait),
            contentDescription = "",
            modifier = imageModifier,
            contentScale = ContentScale.Crop)

        Column(modifier=Modifier
            .padding(160.dp,350.dp)


            ){


            BotonLogin(botonLogin)

            BotonRegister(botonRegister)

        }
    }
}

@Preview
@Composable
fun LoginScreenPagePreview(){
    LoginScreenPage()
}