package com.example.musicapp.styles

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//value para el estilo de texto
val estiloTexto = TextStyle(

    fontSize = 10.sp,
    textAlign = TextAlign.Center,
    color = Color.Black
)

val estiloTextoBotones = TextStyle(

    fontSize = 10.sp,
    textAlign = TextAlign.Center,
    color = Color.Black)

val botonLogin = Modifier.padding(start=270.dp,top=640.dp)
    .size(width=100.dp, height = 30.dp)

val botonRegister = Modifier.padding(start=275.dp,top=650.dp)
    .size(width=150.dp, height = 30.dp)


val imageModifier = Modifier
    .fillMaxHeight()
    .fillMaxWidth()
    .size(100.dp)

