package com.example.musicapp.data.remote.api

import com.example.musicapp.data.remote.dto.UsuarioDto
import retrofit2.Response
import retrofit2.http.GET

interface UsuarioApiService {


    @GET("json/users")
    suspend fun obtenerUsuarios(): Response<UsuarioDto>
}