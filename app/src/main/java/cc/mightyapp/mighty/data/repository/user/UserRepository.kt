package cc.mightyapp.mighty.data.repository.user

import cc.mightyapp.mighty.data.models.User

interface UserRepository {
    suspend fun getUser(userId: String): User
}
