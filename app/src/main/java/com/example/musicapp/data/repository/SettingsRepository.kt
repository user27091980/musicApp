package com.example.musicapp.data.repository

import kotlinx.coroutines.flow.Flow

class SettingsRepository(
    private val dataStoreManager: DataStoreManager
) {

    val darkModeFlow: Flow<Boolean> =
        dataStoreManager.darkModeFlow

    suspend fun setDarkMode(enabled: Boolean) {
        dataStoreManager.setDarkMode(enabled)
    }
}

class DataStoreManager {

    val darkModeFlow: Flow<Boolean> = TODO()

    suspend fun setDarkMode(enabled: Boolean) {
        // guardar en DataStore
    }
}
