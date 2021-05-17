package cc.mightyapp.mighty.navigator


enum class Screens {
    DASHBOARD
}

interface AppNavigator {
    fun navigateTo(screen: Screens)
}
