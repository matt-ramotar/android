package cc.mightyapp.mighty.ui.main.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.data.models.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor() : ViewModel() {

    val isLoading = MutableStateFlow(true)

    private val _state = MutableStateFlow(DashboardViewState())
    val state: StateFlow<DashboardViewState>
        get() = _state

    fun loadState(user: User) {
        _state.value = DashboardViewState(user = user)
        isLoading.value = false
    }
}
