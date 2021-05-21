package cc.mightyapp.mighty.ui.launcher

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LauncherViewModel @Inject constructor(
    private val onboardingCompletedUseCase: OnboardingCompletedUseCase
) : ViewModel() {

}