package cc.mightyapp.mighty.di

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.api.exercise.ExerciseService
import cc.mightyapp.mighty.data.api.exercise.RealExerciseService
import cc.mightyapp.mighty.data.repository.exercise.ExerciseRepository
import cc.mightyapp.mighty.data.repository.exercise.RealExerciseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object ExerciseModule {

    @Provides
    fun provideExerciseService(api: MightyApi): ExerciseService =
        RealExerciseService(api)

    @Provides
    fun provideExerciseRepository(exerciseService: ExerciseService): ExerciseRepository =
        RealExerciseRepository(exerciseService)
}

