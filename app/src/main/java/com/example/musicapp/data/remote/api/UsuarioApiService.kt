package com.example.musicapp.data.remote.api

import retrofit2.Response
import retrofit2.http.GET

interface UsuarioApiService {


    @GET("json/users")
    suspend fun obtenerUsuarios(): Response<>
}