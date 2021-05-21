package cc.mightyapp.mighty.data.api.auth

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RealAuthService @Inject constructor(
    private val api: MightyApi,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : AuthService {
    override suspend fun logInWithEmail(input: LogInWithEmailInput): LogInWithEmailResponse =
        withContext(ioDispatcher) {
            api.logInWithEmail(input)
        }
}