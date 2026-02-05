package com.example.musicapp.network

import com.example.musicapp.data.entity.Band
import retrofit2.Response
import retrofit2.http.GET
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
//==============ENDPOINTS================
    @GET("json/band/{id}")
    suspend fun getBandById(@Path("id") id: String): Response<Band>

    @GET("json/nombre")
    suspend fun getBandName(@Path("nombre") name: String) : Response<Band>

    @GET("json/texto")
    suspend fun getBandText(@Path("texto") content: String): Response<Band>

    @GET("json/foto")
    suspend fun getBandPic(@Path("foto") photos:String ): Response<List<Band>>

    @GET("json/fotoCabecera")
    suspend fun getBandHeader(@Path("fotoCabecera") headPic: String): Response<Band>

    @GET("json/etiquetas")
    suspend fun getBandTags(@Path("etiquetas") tags:String): Response<Band>

    @GET("json/discos")
    suspend fun getBandDiscos(@Path("discos") albums:String) : Response<List<Band>>
//crearemos un dataclass con el nombre del nombreREsponse

    data class MusicListResponse(
        val results: List<MusicListItem>
    )

    data class MusicListItem(
        val name: String,
        val url: String
    )
}