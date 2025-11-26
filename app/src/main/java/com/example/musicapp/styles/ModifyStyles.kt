package com.example.musicapp.styles

import androidx.compose.foundation.background
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

/**
 * @author="Andrés"
 * @param
 * @function
 */
//value para el estilo de texto
val estiloTexto = TextStyle(

    fontSize = 15.sp,
    textAlign = TextAlign.Center,

    )

//value para el etilo de texto en los botones
val estiloTextoBotones = TextStyle(

    fontSize = 14.sp,
    textAlign = TextAlign.Center,
    color = Color.Black

)

//value para el tamñao y orientación del boton de Login
val botonLogin = Modifier
    .padding(start = 270.dp, top = 640.dp)
    .size(width = 200.dp, height = 30.dp)

//value para el tamñao y orientación del boton de Registro
val botonRegister = Modifier
    .padding(start = 275.dp, top = 650.dp)
    .size(width = 200.dp, height = 30.dp)

val imageModifier = Modifier
    .fillMaxHeight()
    .fillMaxWidth()
    .size(100.dp)

val boxModifier = Modifier

    .fillMaxSize()
    .padding(5.dp, 100.dp, 5.dp, 100.dp)

val colModifier = Modifier
    .padding(20.dp, 110.dp, 20.dp, 110.dp)

val rowModifier = Modifier
    .padding(1.dp, 5.dp, 1.dp, 375.dp)

val anotherRowMod = Modifier
    .padding(5.dp, 500.dp, 5.dp, 5.dp)

val cardModifier = Modifier
    .size(width = 275.dp, height = 75.dp)
    .padding(20.dp)


