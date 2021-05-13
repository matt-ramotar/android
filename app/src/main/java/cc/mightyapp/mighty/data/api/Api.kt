package cc.mightyapp.mighty.data.api

import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.data.models.Level
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse
import cc.mightyapp.mighty.util.Constants.Companion.BEARER_TOKEN
import retrofit2.http.*


interface Api {
    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/levels")
    suspend fun getLevels(): List<Level>

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/levels/607d965abd1c9fadaa88f2ff")
    suspend fun getLevel(): Level

    @POST("/auth/login/email")
    suspend fun loginWithEmail(@Body input: LogInWithEmailInput): LogInWithEmailResponse
}