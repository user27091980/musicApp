package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.estilos.botonLogin
import com.example.musicapp.estilos.botonRegister
import com.example.musicapp.estilos.boxModifier
import com.example.musicapp.estilos.skip
import com.example.musicapp.myComponents.BotonLogin
import com.example.musicapp.myComponents.BotonRegister
import com.example.musicapp.myComponents.SkipReg


@Composable
fun LoginScreen(){

    Box(boxModifier){

        Column(modifier=Modifier.padding(160.dp,250.dp)

            ){
            BotonLogin(botonLogin)

            BotonRegister(botonRegister)

            SkipReg(skip)

        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}