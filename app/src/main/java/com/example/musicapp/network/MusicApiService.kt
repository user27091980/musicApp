package com.example.musicapp.network

import com.example.musicapp.data.entity.Grupo
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path


interface MusicApiService {
//RUTA

//    @GET("music/{id}")
//    //@Path en la ruta que hemos definido arriba va a coger el id que pasamos por parámetro y lo escribmos.
//    //toda acción enviada por un retrofit devuelve un objeto response.
//    suspend fun getMusic(@Path("id") id: Int): Response<musicResponse>
//
//    @GET("music")
//    suspend fun getMusicList(
//        @Query("") limit: Int = 50,
//        @Query("") offset: Int = 0
//    ): Response<MusicListResponse>
//
    @GET("json/grupo/{id}")
    suspend fun getGroupById(@Path("id") id: String): Response<Grupo>

    @GET("json/grupo")
    suspend fun getGroupAll() : Response<List<Grupo>>

    @PUT("json/grupo")
    suspend fun creaGrupo(@Body grupo: Grupo):



//crearemos un dataclass con el nombre del nombreREsponse

data class MusicListResponse(
    val results: List<MusicListItem>
)

data class MusicListItem(
    val name: String,
    val url: String
)
