package cc.mightyapp.mighty.data.repository.user

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.api.user.UserService
import cc.mightyapp.mighty.data.models.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RealUserRepository @Inject constructor(
    private val userService: UserService
) : UserRepository {
    override suspend fun getUser(userId: String): User = userService.getUser(userId)
}