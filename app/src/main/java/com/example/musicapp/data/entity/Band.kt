package com.example.musicapp.data.entity

import com.google.gson.annotations.SerializedName

data class Band(

    val id: String,
    @SerializedName("nombre") val name: String,
    @SerializedName("texto") val content: String,
    @SerializedName("foto") val photos: List<String>,
    @SerializedName("fotoCabecera") val headPic: String,
    @SerializedName("etiquetas") val tags: String,
    @SerializedName("discos") val albums: List<String>


)
