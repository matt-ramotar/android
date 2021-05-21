package cc.mightyapp.mighty.domain.pref

import cc.mightyapp.mighty.data.repository.pref.DataStoreOperations
import cc.mightyapp.mighty.data.repository.pref.PrefKeys
import cc.mightyapp.mighty.di.IoDispatcher
import cc.mightyapp.mighty.domain.FlowUseCase
import cc.mightyapp.mighty.domain.result.Result
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OnboardingCompletedUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreOperations,
    @IoDispatcher dispatcher: CoroutineDispatcher
) : FlowUseCase<Unit, Boolean>(dispatcher) {
    override fun execute(parameters: Unit): Flow<Result<Boolean>> =
        dataStoreRepository.read(PrefKeys.onboardingCompletedKey)
}