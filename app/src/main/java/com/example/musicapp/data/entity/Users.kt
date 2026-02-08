package com.example.musicapp.data.entity

import com.google.gson.annotations.SerializedName

//usar singular para las clases
data class User(
    val id: String,
    @SerializedName("usuario") val user: String,
    //Guardar contraseñas como String plano puede ser peligroso si se almacena localmente.
    @SerializedName("contraseña") val pass: String
)