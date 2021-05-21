package cc.mightyapp.mighty.ui.onboarding.loginwithemail

import cc.mightyapp.mighty.data.models.User

data class LogInWithEmailViewState(
    var user: User = User(),
    var token: String = "",
    var isLoggedIn: Boolean = false
)
