package cc.mightyapp.mighty.ui.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import cc.mightyapp.android.ui.theme.MightyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LauncherActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MightyTheme {
                LauncherView()
            }
        }
    }
}