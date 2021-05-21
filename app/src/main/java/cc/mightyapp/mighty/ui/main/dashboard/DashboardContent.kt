package cc.mightyapp.mighty.ui.main.dashboard

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.res.stringResource
import cc.mightyapp.mighty.R

@ExperimentalFoundationApi
@ExperimentalAnimationApi
@Composable
fun DashboardContent(
    viewModel: DashboardViewModel
) {
    val state: DashboardViewState by viewModel.state.collectAsState()

    Box {
        Text(text = stringResource(id = R.string.app_name))
    }
}