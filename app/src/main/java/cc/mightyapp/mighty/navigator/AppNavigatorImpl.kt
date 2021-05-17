package cc.mightyapp.mighty.navigator

import androidx.fragment.app.FragmentActivity
import cc.mightyapp.mighty.R
import cc.mightyapp.mighty.ui.main.dashboard.DashboardFragment
import javax.inject.Inject

class AppNavigatorImpl @Inject constructor(
    private val activity: FragmentActivity
) : AppNavigator {
    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.DASHBOARD -> DashboardFragment()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.main_layout, fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }
}


