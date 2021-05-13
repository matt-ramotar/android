package cc.mightyapp.mighty.util.types.responses

import cc.mightyapp.mighty.data.models.User

data class LogInWithEmailResponse(
    val token: String,
    val user: User
)
