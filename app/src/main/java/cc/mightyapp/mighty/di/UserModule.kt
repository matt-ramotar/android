package cc.mightyapp.mighty.di

import cc.mightyapp.mighty.data.api.MightyApi
import cc.mightyapp.mighty.data.api.user.RealUserService
import cc.mightyapp.mighty.data.api.user.UserService
import cc.mightyapp.mighty.data.repository.user.RealUserRepository
import cc.mightyapp.mighty.data.repository.user.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UserModule {

    @Provides
    fun provideUserService(api: MightyApi): UserService =
        RealUserService(api)

    @Provides
    fun provideUserRepository(
        userService: UserService
    ): UserRepository = RealUserRepository(userService)
}