package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.BotonAceptar

import com.example.musicapp.myComponents.RegisterScreenTextFieldComponent

@Composable

fun RegistrationScreen(){


    RegisterScreenTextFieldComponent()

    BotonAceptar()

}

@Preview
@Composable
fun RegPreview(){
    RegistrationScreen()






}