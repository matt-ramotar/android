package cc.mightyapp.mighty.data.api.auth

import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse

interface AuthService {

    suspend fun logInWithEmail(input: LogInWithEmailInput): LogInWithEmailResponse

}