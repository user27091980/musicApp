package com.example.musicapp.data.entity

import com.google.gson.annotations.SerializedName

data class Band(

    val id: String,
    @SerializedName("nombre") val nombre: String,
    @SerializedName("texto") val contenido: String,
    @SerializedName("fotos") val photos: List<String>,
    @SerializedName("fotoCabecera") val pic: String,
    @SerializedName("etiquetas") val tags: String

)
