package cc.mightyapp.mighty.screens.loginWithEmail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.databinding.LoginFragmentBinding
import cc.mightyapp.mighty.models.User
import cc.mightyapp.mighty.repository.Repository
import cc.mightyapp.mighty.screens.title.TitleViewModel
import cc.mightyapp.mighty.types.inputs.LogInWithEmailInput

class LogInWithEmailFragment : Fragment() {
    private lateinit var binding: LoginFragmentBinding
    private lateinit var viewModel: LogInWithEmailViewModel
    private lateinit var viewModelFactory: LogInWithEmailViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.login_fragment, container, false
        )

        val repository = Repository()
        viewModelFactory = LogInWithEmailViewModelFactory(repository)
        viewModel =
            ViewModelProvider(this, viewModelFactory).get(LogInWithEmailViewModel::class.java)

        binding.button2.setOnClickListener {

            val input = LogInWithEmailInput(
                binding.editTextTextEmailAddress.toString(),
                binding.editTextTextPassword.toString()
            )

            viewModel.logInWithEmail(input)

            viewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
                Log.i("Response", response.user.id)
            })
        }

        return binding.root
    }

}