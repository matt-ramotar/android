package cc.mightyapp.mighty.data.repository

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class SharedPreferencesRepository(context: Context) {
    val sharedPreferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    val theme: String?
        get() = sharedPreferences.getString(PREFERENCE_THEME_KEY, PREFERENCE_THEME_DEFAULT_VALUE)

    companion object {
        private const val PREFERENCE_THEME_KEY = "theme"
        private const val PREFERENCE_THEME_DEFAULT_VALUE = "default"
    }
}