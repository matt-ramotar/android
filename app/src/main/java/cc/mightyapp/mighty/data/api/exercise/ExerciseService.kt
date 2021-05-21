package cc.mightyapp.mighty.data.api.exercise

import cc.mightyapp.mighty.data.models.Exercise

interface ExerciseService {
    suspend fun getExercises(): List<Exercise>

    suspend fun getExercise(exerciseId: String): Exercise

    suspend fun getExercisesByMuscle(muscleId: String): List<Exercise>
}