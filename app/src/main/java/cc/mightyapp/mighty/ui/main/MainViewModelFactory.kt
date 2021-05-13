package cc.mightyapp.mighty.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.data.repository.Repository
import cc.mightyapp.mighty.ui.main.viewmodel.MainViewModel

class MainViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}