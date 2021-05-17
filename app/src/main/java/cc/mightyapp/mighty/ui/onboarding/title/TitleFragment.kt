package cc.mightyapp.mighty.ui.onboarding.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.databinding.TitleFragmentBinding
import cc.mightyapp.mighty.data.repository.Repository
import coil.ImageLoader
import coil.decode.SvgDecoder
import coil.request.ImageRequest

class TitleFragment : Fragment() {
    private lateinit var binding: TitleFragmentBinding
    private lateinit var viewModel: TitleViewModel
    private lateinit var viewModelFactory: TitleViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.title_fragment, container, false
        )

        binding.button.setOnClickListener {
            findNavController().navigate(cc.mightyapp.mighty.ui.title.TitleFragmentDirections.actionTitleFragmentToLoginFragment())
        }

        val repository = Repository()
        viewModelFactory = TitleViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(TitleViewModel::class.java)

        viewModel.getLevel()

        viewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
            binding.levelGraphic.loadUrl(response.graphic)
        })

        return binding.root
    }

    private fun ImageView.loadUrl(url: String) {
        val imageLoader = ImageLoader.Builder(this.context)
            .componentRegistry {
                add(SvgDecoder(this@loadUrl.context))
            }
            .build()

        val request = ImageRequest.Builder(this.context)
            .crossfade(true)
            .crossfade(500)
            .data(url)
            .target(this)
            .build()

        imageLoader.enqueue(request)
    }
}