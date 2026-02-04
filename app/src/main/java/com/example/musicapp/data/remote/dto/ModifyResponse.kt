package com.example.musicapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ModifyResponse(

    @SerializedName("id")
    val id: String,

    @SerializedName("message")
    val message: String,

    )
