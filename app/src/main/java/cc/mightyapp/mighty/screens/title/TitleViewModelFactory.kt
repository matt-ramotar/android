package cc.mightyapp.mighty.screens.title

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.repository.Repository

class TitleViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TitleViewModel(repository) as T
    }
}