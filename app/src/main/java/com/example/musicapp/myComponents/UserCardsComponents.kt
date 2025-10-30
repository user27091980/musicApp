package com.example.musicapp.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicapp.estilos.estiloTexto


@Composable
fun UserCardsComponents(modifier: Modifier = Modifier) {

    val boxModifier = Modifier
        .background(color = MaterialTheme.colorScheme.background)
        .fillMaxSize()

    val cardModifier = Modifier
        .size(width = 175.dp, height = 65.dp)
        .background(MaterialTheme.colorScheme.surface)

    Box(boxModifier) {
        Row(modifier = modifier.absolutePadding(left = 20.dp, top = 60.dp, 20.dp)) {
            Text(
                text = "Pérfil de usuario:",
                style = estiloTexto
            )
        }
        Row(modifier = modifier.absolutePadding(left = 20.dp, top = 60.dp, 20.dp)) {


        }

        Row(modifier = modifier.absolutePadding(left = 20.dp, top = 100.dp, 20.dp)) {
            //fila priemra
            Card(cardModifier) {
                Text(
                    text = "nombre usuario:",
                    style = estiloTexto
                )
            }
            //fila priemra
            Card(
                cardModifier
            ) {


                Text("email:")
            }

        }
        Row(modifier = modifier.absolutePadding(left = 20.dp, top = 170.dp, 20.dp)) {
            //fila priemra
            Card(cardModifier) {

                Text("ciudad")
            }

            //fila priemra
            Card(cardModifier) {

                Text("")
            }

        }
        Row(modifier = modifier.absolutePadding(left = 20.dp, top = 240.dp, 20.dp)) {
            //fila priemra
            Card(cardModifier) {

                Text("")
            }
            //tercera fila
            Card(cardModifier) {


                Text("elemento 3X2")
            }
        }
    }
}

