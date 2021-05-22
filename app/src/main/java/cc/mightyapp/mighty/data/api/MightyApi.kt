package cc.mightyapp.mighty.data.api

import cc.mightyapp.mighty.data.models.Exercise
import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.data.models.Level
import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.data.models.Workout
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse
import cc.mightyapp.mighty.util.Constants.Companion.BEARER_TOKEN
import retrofit2.http.*


interface MightyApi {

    // Auth

    @POST("/auth/login/email")
    suspend fun logInWithEmail(@Body input: LogInWithEmailInput): LogInWithEmailResponse

    // Exercise

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/exercises")
    suspend fun getExercises(): List<Exercise>

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/exercises/{exerciseId}")
    suspend fun getExercise(@Path("exerciseId") exerciseId: String): Exercise

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/exercises/muscles/{muscleId}")
    suspend fun getExercisesByMuscle(@Path("muscleId") muscleId: String): List<Exercise>

    // Level

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/levels")
    suspend fun getLevels(): List<Level>

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/levels/{levelId}")
    suspend fun getLevel(@Path("levelId") levelId: String): Level

    // User

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/users/{userId}")
    suspend fun getUser(@Path("userId") userId: String): User

    // Workouts

    @Headers("Authorization: Bearer $BEARER_TOKEN")
    @GET("/v1/workouts/users/{userId}")
    suspend fun getWorkoutsByUser(@Path("userId") userId: String): List<Workout>
}