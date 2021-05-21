package cc.mightyapp.mighty.data.repository.auth

import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse

interface AuthRepository {

    suspend fun logInWithEmail(input: LogInWithEmailInput): LogInWithEmailResponse
}