package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.estilos.botonLogin
import com.example.musicapp.estilos.botonRegister
import com.example.musicapp.estilos.imageModifier

import com.example.musicapp.myComponents.BotonLogin
import com.example.musicapp.myComponents.BotonRegister



@Composable
fun LoginScreen(){

    Box(Modifier
        .background(MaterialTheme.colorScheme.onBackground)
    ){

        Column(modifier=Modifier
            .padding(160.dp,250.dp)
            .background(MaterialTheme.colorScheme.onBackground)

            ){


            BotonLogin(botonLogin)

            BotonRegister(botonRegister)

        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}