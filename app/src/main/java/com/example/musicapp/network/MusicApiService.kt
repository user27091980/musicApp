package com.example.musicapp.network

import okhttp3.Response
import com.google.gson.annotations.SerializedName
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MusicApiService {
//RUTA

    @GET("music/{id}")
    //@Path en la ruta que hemos definido arriba va a coger el id que pasamos por parámetro y lo escribmos.
    //toda acción enviada por un retrofit devuelve un objeto response.
    suspend fun getMusic(@Path("id") id: Int): Response<musicResponse>

    @GET("music")
    suspend fun getMusicList(
        @Query("limit") limit: Int = 50,
        @Query("offset") offset: Int = 0
    ): Response<MusicListResponse>

}

//crearemos un dataclass con el nombre del nombreREsponse
data class MusicResponse(
    val id: Int,
    val name: String,
    @SerializedName("sprites") val sprites: Sprites,
    val types: List<TypeEntry> = emptyList(),
    @SerializedName("stats") val stats: List<StatEntry> = emptyList(),
    @SerializedName("moves") val moves: List<MoveEntry> = emptyList()
)

data class MusicListResponse(
    val results: List<MusicListItem>
)

data class MusicListItem(
    val name: String,
    val url: String
)
