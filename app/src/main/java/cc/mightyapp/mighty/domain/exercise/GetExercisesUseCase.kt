package cc.mightyapp.mighty.domain.exercise

import cc.mightyapp.mighty.data.models.Exercise
import cc.mightyapp.mighty.data.repository.exercise.RealExerciseRepository
import cc.mightyapp.mighty.di.IoDispatcher
import cc.mightyapp.mighty.domain.SuspendedUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetExercisesUseCase @Inject constructor(
    private val exerciseRepository: RealExerciseRepository,
    @IoDispatcher ioDispatcher: CoroutineDispatcher
) : SuspendedUseCase<Unit, List<Exercise>>(ioDispatcher) {
    override suspend fun execute(parameters: Unit): List<Exercise> {
        return exerciseRepository.getExercises()
    }
}
