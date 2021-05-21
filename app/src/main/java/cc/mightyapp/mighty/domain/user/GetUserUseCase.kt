package cc.mightyapp.mighty.domain.user

import cc.mightyapp.mighty.data.models.User
import cc.mightyapp.mighty.data.repository.user.RealUserRepository
import cc.mightyapp.mighty.di.IoDispatcher
import cc.mightyapp.mighty.domain.SuspendedUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: RealUserRepository,
    @IoDispatcher ioDispatcher: CoroutineDispatcher
) : SuspendedUseCase<String, User>(ioDispatcher) {
    override suspend fun execute(parameters: String): User {
        return userRepository.getUser(parameters)
    }
}