package cc.mightyapp.mighty.data.repository.exercise

import cc.mightyapp.mighty.data.models.Exercise

interface ExerciseRepository {
    suspend fun getExercises(): List<Exercise>

    suspend fun getExercise(exerciseId: String): Exercise

    suspend fun getExercisesByMuscle(muscleId: String): List<Exercise>
}