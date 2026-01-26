package com.example.musicapp.data.remote.dto

import com.google.gson.annotations.SerializedName

class UsuarioDto(

    @SerializedName("id")
    val id: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("passwd")
    val passwd: String,
    
    )