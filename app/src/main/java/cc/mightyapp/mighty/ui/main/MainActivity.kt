package cc.mightyapp.mighty.ui.main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.lifecycle.ViewTreeLifecycleOwner
import cc.mightyapp.android.ui.theme.MightyTheme
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.ui.onboarding.loginwithemail.LogInWithEmailContent
import dagger.hilt.android.AndroidEntryPoint
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

const val USER_ID = "cc.mightyapp.mighty.ui.main.USER_ID"
const val TOKEN = "cc.mightyapp.mighty.ui.main.TOKEN"

fun launchMainActivity(context: Context, user: User, token: String) {
    val intent = Intent(context, MainActivity::class.java).apply {
        putExtra(USER_ID, user.id)
        putExtra(TOKEN, token)
    }
    context.startActivity(intent)
}


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @ExperimentalFoundationApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userId = intent.getStringExtra(USER_ID)
        val token = intent.getStringExtra(TOKEN)

        setContent {
            ProvideWindowInsets {
                MightyTheme {
                    MainContent(userId = userId!!, token = token!!)
                }
            }
        }
    }
}
