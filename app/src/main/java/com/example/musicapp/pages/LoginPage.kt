package com.example.musicapp.pages

/*import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.styles.button
import com.example.musicapp.myComponents.ButtonLogin
import com.example.musicapp.myComponents.ButtonRegister

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun LoginScreenPage() {

    Box(
        Modifier
            .background(MaterialTheme.colorScheme.background)
    ) {


        Row(
            modifier = Modifier
                .padding(150.dp, 350.dp)
        ) {

            ButtonLogin(button)


        }
        Row(
            modifier = Modifier
                .padding(141.dp, 400.dp)
        ) {
            ButtonRegister(button)
        }
    }
}

@Preview
@Composable
fun LoginScreenPagePreview() {
    LoginScreenPage()
}*/

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {
    // Fondo degradado musical
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF1DB954), Color(0xFF191414)) // verde Spotify → negro
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.padding(32.dp)
        ) {
            // Icono musical
            Icon(
                imageVector = Icons.Default.MusicNote,
                contentDescription = "Logo musical",
                tint = Color.White,
                modifier = Modifier.size(64.dp)
            )

            Text(
                text = "MusicApp 🎵",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )

            // Botón Login
            Button(
                onClick = { /* TODO: lógica login */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Login")
            }

            // Botón Registro con estilo tonal
            FilledTonalButton(
                onClick = { /* TODO: lógica registro */ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Registro")
            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPagePreview() {
    LoginScreen()
}