package com.example.pokedex.network

import com.example.musicapp.network.AppApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    /**url base de la api (usando jsonplaceholder como ejemplo)
    no ponemos localhost el emulador pone esa ip
     */
    private const val BASE_URL ="http://10.0.2.2:5131"

    /**
     * Cliente http con loggin interceptor
     */
    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BASIC
    }


    private val okHttpClient: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    /**
     * instancia retrofit
     */
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val appApiService: AppApiService = retrofit.create(AppApiService::class.java)
}
