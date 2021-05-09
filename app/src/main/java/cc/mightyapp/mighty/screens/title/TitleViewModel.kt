package cc.mightyapp.mighty.screens.title

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.mightyapp.mighty.models.Level
import cc.mightyapp.mighty.repository.Repository
import kotlinx.coroutines.launch

class TitleViewModel(private val repository: Repository): ViewModel() {
    val myResponse: MutableLiveData<Level> = MutableLiveData()

    fun getLevel() {
        viewModelScope.launch {
            val response: Level = repository.getLevel()
            myResponse.value = response
            Log.i("Response", response.graphic)
        }
    }
}