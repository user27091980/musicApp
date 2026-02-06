package com.example.musicapp.network

import com.example.musicapp.data.entity.Band
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


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
//==============ENDPOINTS================
    @GET("json/band/{id}")
    suspend fun getBandById(@Query("id") id: String): Response<Band>
    //endpoint dinámico
    @GET("json/nombre/{nombre}")
    suspend fun getBandName(@Query("nombre") name: String) : Response<Band>

    @GET("json/band/texto/")
    suspend fun getBandText(@Query("texto") content: String): Response<Band>

    @GET("json/band/{id}/foto/")
    suspend fun getBandPic(@Query("foto") photos:String ): Response<List<Band>>

    @GET("json/band/{id}/fotoCabecera/")
    suspend fun getBandHeader(@Query("fotoCabecera") headPic: String): Response<Band>

    @GET("json/etiquetas")
    suspend fun getBandTags(@Query("etiquetas") tags:String): Response<Band>

    @GET("json/band/{id}/discos")
    suspend fun getBandDiscos(@Query("discos") albums:String) : Response<List<Band>>
//crearemos un dataclass con el nombre del nombreREsponse

    data class Tag(
        val id:String,
        val name: String
    )

    data class Album(
        val id:String,
        val photos: String
    )
}