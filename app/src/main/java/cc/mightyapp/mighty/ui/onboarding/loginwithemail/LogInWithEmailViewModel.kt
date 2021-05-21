package cc.mightyapp.mighty.ui.onboarding.loginwithemail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.domain.auth.LogInWithEmailUseCase
import cc.mightyapp.mighty.domain.result.data
import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LogInWithEmailViewModel @Inject constructor(
    private val logInWithEmailUseCase: LogInWithEmailUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(LogInWithEmailViewState())
    val state: StateFlow<LogInWithEmailViewState>
        get() = _state

    fun logInWithEmail(input: LogInWithEmailInput) {
        viewModelScope.launch {
            val response = logInWithEmailUseCase(input)

            val logInWithEmailResponse = response.data
            val user = logInWithEmailResponse!!.user
            val token = logInWithEmailResponse!!.token
            val isLoggedIn = true

            _state.value = LogInWithEmailViewState(user, token, isLoggedIn)
        }
    }
}