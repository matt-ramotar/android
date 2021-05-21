package cc.mightyapp.mighty.data.api.user

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.models.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RealUserService @Inject constructor(
    private val api: MightyApi,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : UserService {

    override suspend fun getUser(userId: String): User =
        withContext(ioDispatcher) {
            api.getUser(userId)
        }
}