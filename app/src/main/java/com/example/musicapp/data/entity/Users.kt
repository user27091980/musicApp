package com.example.musicapp.data.entity

import com.google.gson.annotations.SerializedName

data class Users(

    val id: String,
    @SerializedName("usuario") val user: String,
    @SerializedName("contraseña") val pass: String,


)