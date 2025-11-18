package com.example.musicapp.myComponents

import android.R.attr.padding
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.musicapp.styles.estiloTexto

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun UserCardsComponents(modifier: Modifier = Modifier) {

    val boxModifier = Modifier
        .background(color = Color.Transparent)
        .fillMaxSize()
        .padding(5.dp, 100.dp, 5.dp, 100.dp)

    val colModifier =  Modifier
        .padding(20.dp,110.dp,20.dp,110.dp)
    val cardModifier = Modifier
        .size(width = 250.dp, height = 65.dp)
        .background(color = Color.Transparent)
        .padding(10.dp)

    Box(boxModifier) {
        Column(colModifier) {

            Text(
                text = "Pérfil de usuario:",
                style = estiloTexto
            )

            //fila priemra
            Card(cardModifier) {
                Text(
                    text = "usuario:",
                    style = estiloTexto
                )
            }
            //fila priemra
            Card(
                cardModifier
            ) {


                Text(
                    "nombre:",
                    style = estiloTexto
                )

            }


            //fila priemra
            Card(cardModifier) {

                Text(
                    "ciudad",
                    style = estiloTexto,
                )
            }

            //fila priemra
            Card(cardModifier) {

                Text(
                    "país",
                    style = estiloTexto,
                )
            }
        }

    }
}


