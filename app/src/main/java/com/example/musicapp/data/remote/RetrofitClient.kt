package com.example.musicapp.data.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * @author Andrés
 */

//singleton
object RetrofitClient {

    /**url base de la api (usando jsonplaceholder como ejemplo)
    no ponemos localhost el emulador pone esa ip
    */
   private const val BASE_URL ="http://10.0.2.2:5131"

    /**
     * Cliente http con loggin interceptor
     */

    private val okHttpClient: OkHttpClient by lazy{






    }

    /**
     * instancia retrofit
     */
    private val retrofit: Retrofit by lazy{}
}