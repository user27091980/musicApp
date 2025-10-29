package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun CampoTextoUI(etiqueta: String, éContrasinal: Boolean = false) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text(etiqueta) },
        singleLine = true,
        visualTransformation = if (éContrasinal) PasswordVisualTransformation() else VisualTransformation.None,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun BotonUI(texto: String) {
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(texto)
    }
}

@Composable
fun LigazonTextoUI(texto: String) {
    TextButton(onClick = {}) {
        Text(texto)
    }
}
