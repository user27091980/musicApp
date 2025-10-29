package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AvatarUI(tamaño: Dp = 96.dp) {
    Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = "Avatar",
        modifier = Modifier
            .size(tamaño)
            .padding(bottom = 16.dp)
    )

}

@Composable
fun CampoTextoUI(
    etiqueta: String,
    valor: String,
    editable: Boolean = true,
    altura: Dp? = null,
    maxLines: Int = 1
) {
    OutlinedTextField(
        value = valor,
        onValueChange = {},
        label = { Text(etiqueta) },
        singleLine = maxLines == 1,
        enabled = editable,
        modifier = Modifier
            .fillMaxWidth()
            .then(if (altura != null) Modifier.height(altura) else Modifier),
        maxLines = maxLines
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
