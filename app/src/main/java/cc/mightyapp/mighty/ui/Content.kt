package cc.mightyapp.mighty.ui

import androidx.compose.runtime.Composable
import cc.mightyapp.mighty.ui.widget.LoadingContent

@Composable
fun Content(isLoading: Boolean, Content: @Composable () -> Unit) {
    if (isLoading) LoadingContent()
    else Content()
}