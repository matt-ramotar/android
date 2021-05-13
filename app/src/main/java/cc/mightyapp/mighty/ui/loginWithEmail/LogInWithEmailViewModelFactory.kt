package cc.mightyapp.mighty.ui.loginWithEmail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.data.repository.Repository

class LogInWithEmailViewModelFactory(private val repository: Repository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LogInWithEmailViewModel(repository) as T
    }
}