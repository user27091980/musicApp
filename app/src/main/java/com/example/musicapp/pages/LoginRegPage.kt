package com.example.musicapp.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.ButtonLogin
import com.example.musicapp.myComponents.ButtonRegister

/**
 * @author Andrés
 */
@Composable
fun LoginRegScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.DarkGray, Color.Black) // verde Spotify → negro
                )
            )
    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.padding(10.dp, 400.dp, 10.dp, 150.dp)
        ) {

            // Botón Login
            ButtonLogin(navController)

            // Botón Registro con estilo tonal
            ButtonRegister(navController)
        }
    }
}

@Preview
@Composable
fun LoginRegPrev() {

    LoginRegScreen()

}



