package cc.mightyapp.mighty.ui.main

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import cc.mightyapp.mighty.ui.main.dashboard.DashboardContent
import cc.mightyapp.mighty.ui.main.dashboard.DashboardViewModel
import cc.mightyapp.mighty.ui.main.exercises.ExercisesContent
import cc.mightyapp.mighty.ui.main.exercises.ExercisesViewModel
import dev.chrisbanes.accompanist.insets.navigationBarsPadding


@ExperimentalFoundationApi
@ExperimentalAnimationApi
@Composable
fun MainContent(userId: String, token: String) {

    val mainViewModel: MainViewModel = viewModel()
    mainViewModel.loadState(userId = userId, token = token)

    val isLoading: Boolean by mainViewModel.isLoading.collectAsState()
    val state: MainViewState by mainViewModel.state.collectAsState()

    val dashboardViewModel: DashboardViewModel = viewModel()
    dashboardViewModel.loadState(user = state.user)

    val exercisesViewModel: ExercisesViewModel = viewModel()
    exercisesViewModel.loadState()

    val (selectedTab, setSelectedTab) = remember { mutableStateOf(MightyTabs.Dashboard) }
    val tabs = MightyTabs.values()

    Scaffold(
        backgroundColor = MaterialTheme.colors.primarySurface,
        topBar = { MightyTopBar() },
        bottomBar = {
            BottomNavigation {
                tabs.forEach { tab ->
                    BottomNavigationItem(
                        icon = { Icon(imageVector = tab.icon, contentDescription = null) },
                        label = { Text(text = stringResource(id = tab.title)) },
                        selected = tab == selectedTab,
                        onClick = { setSelectedTab(tab) },
                        modifier = Modifier.navigationBarsPadding()
                    )
                }
            }
        }
    ) {
        when (selectedTab) {
            MightyTabs.Dashboard -> DashboardContent(viewModel = dashboardViewModel)
            MightyTabs.Exercises -> ExercisesContent(viewModel = exercisesViewModel)
        }
    }


}


