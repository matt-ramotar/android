package cc.mightyapp.mighty.ui.Mighty.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.data.repository.Repository
import cc.mightyapp.mighty.ui.Mighty.dashboard.viewmodel.DashboardViewModel

class DashboardViewModelFactory(
    private val repository: Repository,
    private val userId: String
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DashboardViewModel(repository, userId) as T
    }
}