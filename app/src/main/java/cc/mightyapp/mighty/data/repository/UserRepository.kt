package cc.mightyapp.mighty.data.repository

import cc.mightyapp.mighty.data.models.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class UserRepository(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {
    suspend fun getUser(userId: String): User {
        return RetroFitInstance.api.getUser(userId)
    }
}