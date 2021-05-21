package cc.mightyapp.mighty.ui.main

import androidx.compose.ui.graphics.vector.ImageVector
import cc.mightyapp.mighty.data.models.Exercise
import cc.mightyapp.mighty.data.models.User

data class MainViewState(
    val user: User = User(),
    val exercises: List<Exercise> = listOf(),
    val icons: List<ImageVector> = listOf()
)
