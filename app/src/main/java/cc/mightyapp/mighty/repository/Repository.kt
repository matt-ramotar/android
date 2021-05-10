package cc.mightyapp.mighty.repository

import cc.mightyapp.mighty.api.RetroFitInstance
import cc.mightyapp.mighty.models.Level
import cc.mightyapp.mighty.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.types.responses.LogInWithEmailResponse

class Repository {

    suspend fun getLevels(): List<Level> {
        return RetroFitInstance.api.getLevels()
    }

    suspend fun getLevel(): Level {
        return RetroFitInstance.api.getLevel()
    }

    suspend fun logInWithEmail(input: LogInWithEmailInput): LogInWithEmailResponse {
        return RetroFitInstance.api.loginWithEmail(input)
    }
}