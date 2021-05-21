package cc.mightyapp.mighty.ui.launcher

import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

private const val SplashWaitTime: Long = 2000

@Composable
fun LauncherView(
    modifier: Modifier = Modifier,
    onLauncherComplete: (LaunchDestination) -> Unit
)