package com.example.musicapp.data.repository

import kotlinx.coroutines.flow.Flow
//repositorio para la configuración.
class SettingsRepository(
    private val dataStoreManager: DataStoreManager,
    private var darkModeFlow: Boolean,
) {

    val darkModeFlow: Flow<Boolean> = dataStoreManager.darkModeFlow

    suspend fun setDarkMode(enabled: Boolean) {
        dataStoreManager.setDarkMode(enabled)
    }
}