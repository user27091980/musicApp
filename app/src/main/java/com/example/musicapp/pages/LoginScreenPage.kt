package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.estilos.boxModifier
import com.example.musicapp.myComponents.BotonLogin
import com.example.musicapp.myComponents.BotonRegister
import com.example.musicapp.pages.botonRegister

val botonLogin = Modifier.padding(start=250.dp,top=600.dp)

val botonRegister = Modifier.padding(start=275.dp,top=650.dp)
@Composable
fun LoginScreen(){

    Box(boxModifier){


        Column(){
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