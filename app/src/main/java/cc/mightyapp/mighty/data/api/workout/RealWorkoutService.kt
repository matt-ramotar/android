package cc.mightyapp.mighty.data.api.workout

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.models.Workout
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RealWorkoutService @Inject constructor(
    private val api: MightyApi,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : WorkoutService {
    override suspend fun getWorkoutsByUser(userId: String): List<Workout> =
        withContext(ioDispatcher) {
            api.getWorkoutsByUser(userId)
        }
}