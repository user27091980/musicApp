package com.example.musicapp.myComponents.ButtonInicioSesionUsuario

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.Text

@Composable
fun TextoTituloUI(texto: String) {
    Text(
        text = texto,
        style = MaterialTheme.typography.headlineSmall,
        modifier = Modifier.padding(bottom = 24.dp)
    )
}

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
fun CheckboxUI(texto: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Checkbox(
            checked = false,
            onCheckedChange = {}
        )
        Text(texto)
    }
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
