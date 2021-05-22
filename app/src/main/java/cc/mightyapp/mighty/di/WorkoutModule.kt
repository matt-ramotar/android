package cc.mightyapp.mighty.di

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.api.workout.RealWorkoutService
import cc.mightyapp.mighty.data.api.workout.WorkoutService
import cc.mightyapp.mighty.data.repository.workout.RealWorkoutRepository
import cc.mightyapp.mighty.data.repository.workout.WorkoutRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object WorkoutModule {

    @Provides
    fun provideWorkoutService(api: MightyApi): WorkoutService = RealWorkoutService(api)

    @Provides
    fun provideWorkoutRepository(workoutService: WorkoutService): WorkoutRepository =
        RealWorkoutRepository(workoutService)
}