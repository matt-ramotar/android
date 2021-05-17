package cc.mightyapp.mighty.ui.main.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.data.repository.Repository
import kotlinx.coroutines.launch

class DashboardViewModel(
    private val repository: Repository,
    private val userId: String
) : ViewModel() {

    val user: MutableLiveData<User> = MutableLiveData()

    fun getUser(userId: String) {
        viewModelScope.launch {
            val response: User = repository.getUser(userId)
            user.value = response
        }
    }
}