package cc.mightyapp.mighty.domain.pref

import cc.mightyapp.mighty.data.repository.pref.DataStoreOperations
import cc.mightyapp.mighty.data.repository.pref.PrefKeys
import cc.mightyapp.mighty.di.IoDispatcher
import cc.mightyapp.mighty.domain.SuspendedUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class OnboardingCompletedActionSuspendedUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreOperations,
    @IoDispatcher dispatcher: CoroutineDispatcher
) : SuspendedUseCase<Boolean, Unit>(dispatcher) {
    override suspend fun execute(parameters: Boolean) =
        dataStoreRepository.save(PrefKeys.onboardingCompletedKey, true)
}