package cc.mightyapp.mighty.ui.main.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.data.repository.Repository
import cc.mightyapp.mighty.databinding.DashboardFragmentBinding

class DashboardFragment : Fragment() {
    private lateinit var binding: DashboardFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private lateinit var viewModelFactory: DashboardViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val args: cc.mightyapp.mighty.ui.Mighty.dashboard.view.DashboardFragmentArgs by navArgs()
        val args: DashboardFragmentArgs
        val userId: String = args.userId

        binding = DataBindingUtil.inflate(inflater, R.layout.dashboard_fragment, container, false)

        val repository = Repository()
        viewModelFactory = DashboardViewModelFactory(repository, userId)
        viewModel = ViewModelProvider(this, viewModelFactory).get(DashboardViewModel::class.java)

        viewModel.getUser(userId)
        viewModel.user.observe(viewLifecycleOwner, Observer { user ->
            binding.editTextTextPersonName.setText("${user.firstName} ${user.lastName}")
        })

        return binding.root
    }
}