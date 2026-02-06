package com.example.musicapp.data.remote.dto

import com.google.gson.annotations.SerializedName

//JSON tiene esas claves (id y message).
//
//Esto asegura que Gson pueda deserializar correctamente aunque los nombres de tus variables sean distintos de los del JSON.
//Nullable si JSON puede faltar
//
//Si tu API a veces no devuelve message o id, considera usar String?:
data class UserModifyResponse(
    @SerializedName("id") val id: String?,
    @SerializedName("message") val message: String?
)
