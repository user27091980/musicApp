package com.example.musicapp.view.myComponents

import androidx.activity.ComponentActivity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

/**
 * @author Andrés
 */

class PicCatcher : ComponentActivity(){


}

@Composable
fun FloatCamera(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = { onClick() },
    ) {
        Icon(Icons.Filled.AddAPhoto, "Sacar foto")
    }
}

