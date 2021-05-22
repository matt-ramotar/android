package cc.mightyapp.mighty.data.api.workout

import cc.mightyapp.mighty.data.models.Workout

interface WorkoutService {
    suspend fun getWorkoutsByUser(userId: String): List<Workout>
}