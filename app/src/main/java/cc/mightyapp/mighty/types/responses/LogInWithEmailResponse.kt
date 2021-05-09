package cc.mightyapp.mighty.types.responses

import cc.mightyapp.mighty.models.User

data class LogInWithEmailResponse(
    val token: String,
    val user: User
)
