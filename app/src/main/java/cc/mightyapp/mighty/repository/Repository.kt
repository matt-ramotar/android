package cc.mightyapp.mighty.repository

import cc.mightyapp.mighty.api.RetroFitInstance
import cc.mightyapp.mighty.models.Level

class Repository {

    suspend fun getLevels(): List<Level> {
        return RetroFitInstance.api.getLevels()
    }

    suspend fun getLevel(): Level {
        return RetroFitInstance.api.getLevel()
    }
}