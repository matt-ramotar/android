package cc.mightyapp.mighty.data.repository.workout

import cc.mightyapp.mighty.data.models.User

interface WorkoutRepository {
    suspend fun getWorkoutsByUser(userId: String): User
}