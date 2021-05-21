package cc.mightyapp.mighty.data.repository.pref

import kotlinx.coroutines.flow.Flow
import androidx.datastore.preferences.core.Preferences
import cc.mightyapp.mighty.domain.result.Result

interface DataStoreOperations {
    suspend fun save(key: Preferences.Key<Boolean>, value: Boolean)
    fun read(key: Preferences.Key<Boolean>): Flow<Result<Boolean>>
}