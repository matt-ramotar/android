package cc.mightyapp.mighty.ui.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.animation.ExperimentalAnimationApi
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.compose.setContent
import cc.mightyapp.android.ui.theme.MightyTheme

fun launchOnboardingActivity(context: Context) {
    context.startActivity(Intent(context, OnboardingActivity::class.java))
}

@AndroidEntryPoint
class OnboardingActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MightyTheme {
                OnboardingContent {
                    finish()
                }
            }
        }
    }
}