package com.example.musicapp.pages

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.BotonAceptar
import com.example.musicapp.myComponents.BotonCancelar
import com.example.musicapp.myComponents.RegisterScreenTextFieldComponent

@Composable

fun RegistrationScreen(){

    Row() {
        RegisterScreenTextFieldComponent()
    }
    Row() {
        BotonAceptar()
        BotonCancelar()
    }

}

@Preview
@Composable
fun RegPreview(){
    RegistrationScreen()






}