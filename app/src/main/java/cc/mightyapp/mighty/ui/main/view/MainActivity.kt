package cc.mightyapp.mighty.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.ui.main.viewmodel.MainViewModel
import cc.mightyapp.mighty.ui.main.MainViewModelFactory
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.data.repository.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getLevels()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Response", response[0].number.toString())
        })
    }
}