package cc.mightyapp.mighty.data.repository.workout

import cc.mightyapp.mighty.data.api.workout.WorkoutService
import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.data.models.Workout

class RealWorkoutRepository @Inject constructor(
    private val workoutService: WorkoutService
) : WorkoutRepository {
    override suspend fun getWorkoutsByUser(userId: String): List<Workout> =
        workoutService.getWorkoutsByUser(userId)
}