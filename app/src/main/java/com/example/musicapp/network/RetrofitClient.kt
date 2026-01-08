package com.example.musicapp.network
//singleton
object RetrofitClient {


    /*patrón checkcommand
    private val okHttpClient: OkHttpClient = OkHttpClient
        .Builder()
        .build()

    patrón factory
    val retrofit: Retrofit = RetrofitClient
        .Builder()
        .baseUrl()
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
     */

    /*servicio(no compartir el servicio si no mejor separado
    val appApiService : AppApiService = retrofit.build().create(AppApiService::class.java)
    */
}