package com.example.musicapp.view.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.musicapp.view.myComponents.ButtonLogin
import com.example.musicapp.view.myComponents.ButtonRegister

/**
 * @author Andrés
 */
@Composable
fun LoginRegScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.DarkGray, Color.Black) // verde Spotify → negro
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier
                .padding(horizontal = 32.dp)

        ) {

                ButtonLogin(
                    navController = navController,
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                )


            // Botón Registro con estilo tonal

                ButtonRegister(
                    navController = navController,
                    modifier = Modifier
                        .fillMaxWidth(0.5f)

                )


        }

    }
}

@Preview
@Composable
fun LoginRegPrev() {

    LoginRegScreen(navController = rememberNavController())

}



