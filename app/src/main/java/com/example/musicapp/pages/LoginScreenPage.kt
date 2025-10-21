package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.estilos.botonLogin
import com.example.musicapp.estilos.botonRegister
import com.example.musicapp.estilos.boxModifier
import com.example.musicapp.myComponents.BotonLogin
import com.example.musicapp.myComponents.BotonRegister

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