package com.example.musicapp.data.entity

import com.google.gson.annotations.SerializedName

data class Grupo(
    val id: String,
    @SerializedName("nombre") val nombre: String,
    val photos: List<String>
)
