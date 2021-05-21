package cc.mightyapp.mighty.ui.main

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.domain.exercise.GetExercisesUseCase
import cc.mightyapp.mighty.domain.result.data
import cc.mightyapp.mighty.domain.user.GetUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getUserUseCase: GetUserUseCase,
    private val getExercisesUseCase: GetExercisesUseCase,
) : ViewModel() {

    val isLoading = MutableStateFlow(true)

    private val _state = MutableStateFlow(MainViewState())
    val state: StateFlow<MainViewState>
        get() = _state

    fun loadState(userId: String, token: String) {

        viewModelScope.launch {
            val user = getUserUseCase(userId)
            val exercises = getExercisesUseCase(Unit)

            _state.value = MainViewState(
                user = user.data!!,
                exercises = exercises.data!!,
            )

            isLoading.value = false
        }
    }

}