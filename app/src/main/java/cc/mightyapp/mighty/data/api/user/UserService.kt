package cc.mightyapp.mighty.data.api.user

import cc.mightyapp.mighty.data.models.User

interface UserService {
    suspend fun getUser(userId: String): User
}