package com.example.musicapp.estilos

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//value para el estilo de texto
val estiloTexto = TextStyle(

    fontSize = 15.sp,
    textAlign = TextAlign.Center,
    color = Color.LightGray
)

val estiloTextoBotones = TextStyle(

    fontSize = 7.sp,
    textAlign = TextAlign.Center,
    color = Color.DarkGray)

val botonLogin = Modifier.padding(start=270.dp,top=640.dp)
    .size(width=100.dp, height = 30.dp)

val botonRegister = Modifier.padding(start=275.dp,top=650.dp)
    .size(width=100.dp, height = 30.dp)


val imageModifier = Modifier
    .fillMaxHeight()
    .fillMaxWidth()



//valores para tarjeta(card)
