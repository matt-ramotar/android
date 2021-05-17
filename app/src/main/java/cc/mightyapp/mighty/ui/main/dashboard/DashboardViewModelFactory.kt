package cc.mightyapp.mighty.ui.main.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.data.repository.Repository

class DashboardViewModelFactory(
    private val repository: Repository,
    private val userId: String
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DashboardViewModel(repository, userId) as T
    }
}