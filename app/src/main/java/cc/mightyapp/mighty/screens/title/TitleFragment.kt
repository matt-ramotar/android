package cc.mightyapp.mighty.screens.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.databinding.TitleFragmentBinding

class TitleFragment : Fragment() {
    private lateinit var binding: TitleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.title_fragment, container, false
        )

        binding.button.setOnClickListener {
            findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToLoginFragment())
        }
        return binding.root
    }
}