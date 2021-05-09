package cc.mightyapp.mighty.api

import cc.mightyapp.mighty.BuildConfig
import cc.mightyapp.mighty.models.Level
import cc.mightyapp.mighty.util.Constants.Companion.BEARER_TOKEN
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers


interface Api {
    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/levels")
    suspend fun getLevels(): List<Level>

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/levels/607d965abd1c9fadaa88f2ff")
    suspend fun getLevel(): Level
}