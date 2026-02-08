package com.example.musicapp.network

import com.example.musicapp.data.entity.Band
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/*
@Path → se usa para reemplazar partes de la URL ({id}).
@Query → se usa para parámetros de consulta (?id=...).
 */
interface MusicApiService {

    // Obtener banda por id
    @GET("json/band/{id}")
    suspend fun getBandById(@Path("id") id: String): Response<Band>

    // Obtener banda por nombre
    @GET("json/nombre/{nombre}")
    suspend fun getBandName(@Path("nombre") name: String): Response<Band>

    // Obtener texto de la banda
    @GET("json/band/texto")
    suspend fun getBandText(@Query("texto") content: String): Response<Band>

    // Obtener fotos de la banda
    @GET("json/band/{id}/foto")
    suspend fun getBandPic(@Path("id") id: String): Response<List<Band>>

    // Foto de cabecera de la banda
    @GET("json/band/{id}/fotoCabecera")
    suspend fun getBandHeader(@Path("id") id: String): Response<Band>

    // Etiquetas
    @GET("json/etiquetas")
    suspend fun getBandTags(@Query("etiquetas") tags: String): Response<Band>

    // Discos
    @GET("json/band/{id}/discos")
    suspend fun getBandDiscos(@Path("id") id: String): Response<List<Band>>

    // Clases auxiliares
    data class Tag(val id: String, val name: String)
    data class Album(val id: String, val photos: String)
}

//crearemos un dataclass con el nombre del nombreREsponse

data class Tag(
    val id: String,
    val name: String
)

data class Album(
    val id: String,
    val photos: String
)
