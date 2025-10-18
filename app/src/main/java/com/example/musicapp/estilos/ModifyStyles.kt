package com.example.musicapp.estilos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxSize
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

val columnModifierButtom = Modifier
        .padding(start=275.dp,top=650.dp)


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

    val boxModifier = Modifier
        .background(color = Color.Blue)
        .fillMaxSize()

    val rowModifierMiddle =  Modifier
        .padding(top = 150.dp)
    val rowModifierButtom = Modifier
        .padding()
    val estiloTexto = TextStyle(
        color = (Color.White),
        fontSize = 25.sp,
        textAlign = TextAlign.End
    )
