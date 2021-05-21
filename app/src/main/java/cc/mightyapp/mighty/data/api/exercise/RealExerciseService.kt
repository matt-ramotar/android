package cc.mightyapp.mighty.data.api.exercise

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.models.Exercise
import cc.mightyapp.mighty.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RealExerciseService @Inject constructor(
    private val api: MightyApi,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ExerciseService {
    override suspend fun getExercise(exerciseId: String): Exercise =
        withContext(ioDispatcher) {
            api.getExercise(exerciseId)
        }

    override suspend fun getExercises(): List<Exercise> =
        withContext(ioDispatcher) {
            api.getExercises()
        }

    override suspend fun getExercisesByMuscle(muscleId: String): List<Exercise> =
        withContext(ioDispatcher) {
            api.getExercisesByMuscle(muscleId)
        }
}
