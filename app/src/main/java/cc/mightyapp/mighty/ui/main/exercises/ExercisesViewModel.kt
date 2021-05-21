package cc.mightyapp.mighty.ui.main.exercises

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.domain.exercise.GetExercisesUseCase
import cc.mightyapp.mighty.domain.result.data
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExercisesViewModel @Inject constructor(
    private val getExercisesUseCase: GetExercisesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(ExercisesViewState())
    val state: StateFlow<ExercisesViewState>
        get() = _state

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean>
        get() = _isLoading

    fun loadState() {
        viewModelScope.launch {
            val exercises = getExercisesUseCase(Unit)

            _state.value = ExercisesViewState(exercises = exercises.data!!)

            _isLoading.value = false
        }
    }
}