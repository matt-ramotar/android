package cc.mightyapp.mighty.domain.exercise

import cc.mightyapp.mighty.data.models.Exercise
import cc.mightyapp.mighty.data.repository.exercise.RealExerciseRepository
import cc.mightyapp.mighty.di.IoDispatcher
import cc.mightyapp.mighty.domain.SuspendedUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetExerciseUseCase @Inject constructor(
    private val exerciseRepository: RealExerciseRepository,
    @IoDispatcher ioDispatcher: CoroutineDispatcher
) : SuspendedUseCase<String, Exercise>(ioDispatcher) {
    override suspend fun execute(parameters: String): Exercise {
        return exerciseRepository.getExercise(parameters)
    }
}