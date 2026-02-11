package com.example.musicapp.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.musicapp.myComponentsw.TextFieldsComponent
import com.example.musicapp.view.myComponents.ButtonAcept
import com.example.musicapp.view.myComponents.ButtonCancel

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable

fun RegisterScreenPage(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp, vertical = 100.dp)
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.DarkGray, Color.Black) // verde Spotify → negro
                )
            )
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(32.dp, 60.dp),
            verticalArrangement = Arrangement.SpaceBetween

            ) {
            Column(modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center) {
                TextFieldsComponent()
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            )
            {

                ButtonAcept(
                    { navController.navigate("home") }
                )
                ButtonCancel(navController)
            }

        }



    }

}

@Preview
@Composable
fun RegScreenPrev() {

    RegisterScreenPage(navController = rememberNavController())

}
