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
/**
 * @author="Andrés"
 * @param
 * @function
 */
//value para el estilo de texto
val estiloTexto = TextStyle(

    fontSize = 15.sp,
    textAlign = TextAlign.Center,
    color = Color.LightGray
)

val estiloTextoBotones = TextStyle(

    fontSize = 15.sp,
    textAlign = TextAlign.Center,
    color = Color.LightGray)

val botonLogin = Modifier.padding(start=270.dp,top=640.dp)
    .size(width=150.dp, height = 30.dp)

val botonRegister = Modifier.padding(start=275.dp,top=650.dp)
    .size(width=175.dp, height = 30.dp)


val imageModifier = Modifier
    .fillMaxHeight()
    .fillMaxWidth()
    .size(100.dp)

