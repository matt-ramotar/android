package cc.mightyapp.mighty.data.repository

import cc.mightyapp.mighty.data.api.RetroFitInstance
import cc.mightyapp.mighty.data.models.Level
import cc.mightyapp.mighty.util.types.inputs.LogInWithEmailInput
import cc.mightyapp.mighty.util.types.responses.LogInWithEmailResponse

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