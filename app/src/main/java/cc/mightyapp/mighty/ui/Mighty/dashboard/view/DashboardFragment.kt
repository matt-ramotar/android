package cc.mightyapp.mighty.ui.Mighty.dashboard.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.data.models.Level
import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.data.repository.Repository
import cc.mightyapp.mighty.databinding.DashboardFragmentBinding
import cc.mightyapp.mighty.ui.Mighty.dashboard.DashboardViewModelFactory
import cc.mightyapp.mighty.ui.Mighty.dashboard.viewmodel.DashboardViewModel

class DashboardFragment : Fragment() {
    private lateinit var binding: DashboardFragmentBinding
    private lateinit var viewModel: DashboardViewModel
    private lateinit var viewModelFactory: DashboardViewModelFactory


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val args: DashboardFragmentArgs by navArgs()
        val userId: String = args.userId

        binding = DataBindingUtil.inflate(inflater, R.layout.dashboard_fragment, container, false)

        val user = User(
            firstName = "Matt",
            lastName = "Ramotar",
            email = "matt@thoughtfultech.co",
            id = "123",
            achievements = listOf(),
            isLoggedIn = true,
            level = "1",
            poundsLiftedTotal = 0,
            xp = 0,
            workouts = listOf(),
            usersFollowedBy = listOf(),
            usersFollowing = listOf(),
            routinesAuthored = listOf(),
            routinesFavorited = listOf(),
            programsAuthored = listOf(),
            programsFollowing = listOf()
        )

        val repository = Repository()
        viewModelFactory = DashboardViewModelFactory(repository, userId)
        viewModel = ViewModelProvider(this, viewModelFactory).get(DashboardViewModel::class.java)

        binding.editTextTextPersonName.setText(userId)

        return binding.root
    }
}