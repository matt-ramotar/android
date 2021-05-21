package cc.mightyapp.mighty.ui.onboarding.title

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TitleViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TitleViewModel(repository) as T
    }
}