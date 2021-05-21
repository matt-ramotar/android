package cc.mightyapp.mighty.ui.onboarding.loginwithemail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import cc.mightyapp.android.ui.theme.MightyTheme
import dagger.hilt.android.AndroidEntryPoint
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

fun launchLogInWithEmailActivity(context: Context) {
    context.startActivity(Intent(context, LogInWithEmailActivity::class.java))
}

@AndroidEntryPoint
class LogInWithEmailActivity : ComponentActivity() {

    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ProvideWindowInsets {
                MightyTheme {
                    LogInWithEmailContent()
                }
            }
        }
    }
}