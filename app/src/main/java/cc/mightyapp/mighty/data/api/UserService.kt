package cc.mightyapp.mighty.data.api

import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.util.Constants
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface UserService {

    @Headers("Authorization: Bearer ${Constants.BEARER_TOKEN}")
    @GET("/v1/users/{userId}")
    suspend fun getUser(
        @Path("userId") userId: String
    ): User
}