package com.example.musicapp.myComponents

import androidx.compose.runtime.Composable

@Composable
fun RegisterScreen() {
    ComponentText("Nombre")
    ComponentText("Email", FieldType.Email)
    ComponentText("Contraseña", FieldType.Password)
    ComponentText("Confirmar contraseña", FieldType.Password)
    ComponentText("Teléfono", FieldType.Phone)
    ComponentText("Edad", FieldType.Number)
    ComponentText("Género musical favorito")
    ComponentText("Artista favorito")
}
