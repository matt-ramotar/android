package cc.mightyapp.mighty

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.models.Level
import cc.mightyapp.mighty.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {
    val myResponse: MutableLiveData<List<Level>> = MutableLiveData()

    fun getLevels() {
        viewModelScope.launch {
            val response: List<Level> = repository.getLevels()
            myResponse.value = response
        }
    }
}