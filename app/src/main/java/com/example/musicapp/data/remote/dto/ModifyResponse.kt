package com.example.musicapp.data.remote.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName

data class ModifyResponse(

    @SerializedName("id")
    val id: String,

    @SerializedName("message")
    val message: String,


    )
