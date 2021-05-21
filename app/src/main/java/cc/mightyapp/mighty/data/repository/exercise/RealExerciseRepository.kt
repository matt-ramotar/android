package cc.mightyapp.mighty.data.repository.exercise

import cc.mightyapp.mighty.data.api.exercise.ExerciseService
import cc.mightyapp.mighty.data.models.Exercise
import javax.inject.Inject

class RealExerciseRepository @Inject constructor(
    private val exerciseService: ExerciseService
) : ExerciseRepository {
    override suspend fun getExercise(exerciseId: String): Exercise =
        exerciseService.getExercise(exerciseId)

    override suspend fun getExercises(): List<Exercise> = exerciseService.getExercises()

    override suspend fun getExercisesByMuscle(muscleId: String): List<Exercise> =
        exerciseService.getExercisesByMuscle(muscleId)
}