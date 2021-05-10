package cc.mightyapp.mighty.screens.loginWithEmail

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.repository.Repository
import cc.mightyapp.mighty.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.types.responses.LogInWithEmailResponse
import kotlinx.coroutines.launch

class LogInWithEmailViewModel(private val repository: Repository) : ViewModel() {
    val myResponse: MutableLiveData<LogInWithEmailResponse> = MutableLiveData()

    fun logInWithEmail(input: LogInWithEmailInput) {
        viewModelScope.launch {
            val response: LogInWithEmailResponse = repository.logInWithEmail(input)
            myResponse.value = response
        }
    }
}