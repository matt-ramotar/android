package cc.mightyapp.mighty.data.repository.auth

import cc.mightyapp.mighty.data.api.auth.AuthService
import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse
import javax.inject.Inject

class RealAuthRepository @Inject constructor(
    private val authService: AuthService
) : AuthRepository {
    override suspend fun logInWithEmail(input: LogInWithEmailInput): LogInWithEmailResponse =
        authService.logInWithEmail(input)
}