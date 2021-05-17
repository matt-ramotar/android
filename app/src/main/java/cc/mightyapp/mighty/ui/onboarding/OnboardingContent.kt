package cc.mightyapp.mighty.ui.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun OnboardingContent(
    onboardingFinished: () -> Unit
) {
    val viewModel: OnboardingViewModel = viewModel()
    
    Box() {
        Text(text = "Welcome!")
    }
    
}