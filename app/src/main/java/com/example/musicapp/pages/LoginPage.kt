package com.example.musicapp.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.musicapp.myComponents.ButtonAcept
import com.example.musicapp.myComponentsw.TextFieldPassComponent
import com.example.musicapp.myComponentsw.TextFieldUserComponent

/**
 * @author Andrés
 */
@Composable
fun Login() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.DarkGray, Color.Black) // verde Spotify → negro
                )
            )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.padding(50.dp, 340.dp, 10.dp, 150.dp)
        ) {
            Text("LOGIN", color = Color.White)
            TextFieldUserComponent()
            TextFieldPassComponent()
            ButtonAcept(navController)

        }
    }
}

@Preview
@Composable
fun LoginPrev() {

    Login()

}
