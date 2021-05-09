package cc.mightyapp.mighty.api

import cc.mightyapp.mighty.util.Constants.Companion.API_ROOT
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(API_ROOT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: Api by lazy {
        retrofit.create(Api::class.java)
    }
}