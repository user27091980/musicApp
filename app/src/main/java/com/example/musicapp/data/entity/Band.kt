package com.example.musicapp.data.entity

import com.google.gson.annotations.SerializedName

/**
 * @author: Andrés y unas gotitas de chatGPT
 */

/*
Representa un modelo de datos simple.
Kotlin generará automáticamente equals(), hashCode(), toString(), copy().
Ideal para JSON, RecyclerView, Room, etc.
 */
data class Band(
    val id: String,
    @SerializedName("nombre") val name: String,
    @SerializedName("texto") val content: String,
    //puede no aparecer la marcamos como nullable ?
    @SerializedName("foto") val photos: List<String>?,
    @SerializedName("fotoCabecera") val headPic: String,
    @SerializedName("etiquetas") val tags: String,
    @SerializedName("discos") val albums: List<String>
)
