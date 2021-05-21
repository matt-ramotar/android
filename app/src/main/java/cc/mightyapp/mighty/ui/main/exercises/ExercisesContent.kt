package cc.mightyapp.mighty.ui.main.exercises

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import cc.mightyapp.mighty.data.models.Exercise
import cc.mightyapp.mighty.ui.Content

@ExperimentalAnimationApi
@Composable
fun ExercisesContent(
    viewModel: ExercisesViewModel
) {
    val state by viewModel.state.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()

    Content(isLoading = isLoading) {
        Text(text = "Exercises")

        Column() {
            state.exercises.forEach { exercise ->
                ExerciseRow(exercise = exercise, modifier = Modifier.fillMaxSize())
            }

        }
    }
}


@Composable
fun ExerciseRow(
    exercise: Exercise,
    modifier: Modifier
) {
    Surface(modifier = modifier) {
        Row() {
            Text(text = exercise.name)
            Text(text = exercise.instructions)
        }
    }
}