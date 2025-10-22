package com.example.musicapp.estilos

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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

//values para modificar características visuales.

//modifier para Box
val boxModifier = Modifier
        .background(color = Color.Blue)
        .fillMaxWidth()
        .fillMaxHeight()

//value modifier para las fila del medio del SplashScreen
val rowModifierMiddle =  Modifier
        .padding()

//value modifier para el botón de debajo del SplashScreen
val rowModifierButtom = Modifier
    .padding()

//value para el estilo de texto
val estiloTexto = TextStyle(
    color = (Color.White),
    fontSize = 25.sp,
    textAlign = TextAlign.Center,
)

//value para el estilo de texto del titulo
val estiloTextoTitulo = TextStyle(
        color = (Color.White),
        fontSize = 25.sp,
        textAlign = TextAlign.Center,
    )
val estiloTextoBotones = TextStyle(
    color = (Color.White),
    fontSize = 10.sp,
    textAlign = TextAlign.Center)

val botonLogin = Modifier.padding(start=270.dp,top=640.dp)
    .size(width=80.dp, height = 40.dp)

val botonRegister = Modifier.padding(start=275.dp,top=650.dp)
    .size(width=90.dp, height = 40.dp)

val skip =Modifier.clickable(
    interactionSource = TODO(),
    indication = TODO(),
    enabled = true,
    onClickLabel ="skip",
    role = TODO(),
    onClick =TODO()
).padding(start=90.dp,top=670.dp)

