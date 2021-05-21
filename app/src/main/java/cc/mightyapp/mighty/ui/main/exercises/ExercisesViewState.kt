package cc.mightyapp.mighty.ui.main.exercises

import cc.mightyapp.mighty.data.models.Exercise

data class ExercisesViewState(
    val exercises: List<Exercise> = emptyList()
)
