package com.example.musicapp.estilos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//values para modificar características visuales.

val boxModifier = Modifier
        .background(color = Color.Blue)
        .fillMaxWidth()
        .fillMaxHeight()


val rowModifierMiddle =  Modifier
        .padding()

val rowModifierButtom = Modifier
    .padding()

val estiloTexto = TextStyle(
    color = (Color.White),
    fontSize = 25.sp,
    textAlign = TextAlign.Center,
)

val estiloTextoTitulo = TextStyle(
        color = (Color.White),
        fontSize = 25.sp,
        textAlign = TextAlign.Center,
    )

val estiloTextoBotones = TextStyle(
    color = (Color.White),
    fontSize = 10.sp,
    textAlign = TextAlign.Center)
val botonLogin = Modifier.padding(start=250.dp,top=600.dp)

val botonRegister = Modifier.padding(start=275.dp,top=650.dp)