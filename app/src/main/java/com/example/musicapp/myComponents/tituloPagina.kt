package com.example.musicapp.myComponents

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TituloPagina(texto: String) {

    Text(text = texto,
        modifier = Modifier,
        color = MaterialTheme.colorScheme.primary,
        fontSize = MaterialTheme.typography.titleLarge.fontSize,
        fontWeight = MaterialTheme.typography.titleLarge.fontWeight,
        maxLine = 2,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview
@Composable
fun TituloPaginaPreview() {
    TituloPagina("Music App")
}