package com.example.musicapp.styles

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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

    fontSize = 18.sp,
    textAlign = TextAlign.Center,

    )
val estiloTextoCardBand = TextStyle(

    fontSize = 18.sp,
    textAlign = TextAlign.Start,

    )

//value para el etilo de texto en los botones
val estiloTextoBotones = TextStyle(

    fontSize = 15.sp,
    textAlign = TextAlign.Center,
    color = Color.Black

)

//modificador para boton
val button = Modifier
    .size(width = 300.dp, height = 50.dp)

//modificador para imagéns
val imageModifier = Modifier
    .fillMaxHeight()
    .fillMaxWidth()
    .size(100.dp)

//modificadores para elementos box, column y row
val boxModifier = Modifier
    .fillMaxSize()
    .padding(5.dp, 60.dp, 5.dp, 100.dp)

val colModifier = Modifier
    .padding(20.dp, 130.dp, 20.dp, 110.dp)

val rowModifier = Modifier
    .padding(1.dp, 3.dp, 1.dp, 20.dp)

val rowCardModifier = Modifier
    .padding(10.dp, 120.dp, 10.dp, 200.dp)

val anotherRowMod = Modifier
    .padding(5.dp, 500.dp, 5.dp, 5.dp)

//modificadores para cards
val cardModifier = Modifier
    .size(width = 275.dp, height = 75.dp)
    .padding(20.dp)

val cardWithTextMod = Modifier
    .size(width = 400.dp, height = 600.dp)
    .padding(15.dp)


