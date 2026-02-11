package com.example.musicapp.data.repository

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// Crear DataStore en el Context
val Context.dataStore by preferencesDataStore(name = "settings")

class DataStoreManager {

    private val context: Context

    constructor(context: Context) {
        this.context = context
        this.darkModeFlow = context.dataStore.data
            .map { preferences ->
                preferences[DARK_MODE_KEY] ?: false
            }
    }

    companion object {
        private val DARK_MODE_KEY = booleanPreferencesKey("dark_mode")
    }

    // Flow que emite el valor actual del modo oscuro
    val darkModeFlow: Flow<Boolean>

    // Función para guardar el valor
    suspend fun setDarkMode(enabled: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[DARK_MODE_KEY] = enabled
        }
    }
}

class SettingsRepository {

    private val dataStoreManager: DataStoreManager

    constructor(dataStoreManager: DataStoreManager) {
        this.dataStoreManager = dataStoreManager
        this.darkModeFlow = dataStoreManager.darkModeFlow
    }

    val darkModeFlow: Flow<Boolean>

    suspend fun setDarkMode(enabled: Boolean) {
        dataStoreManager.setDarkMode(enabled)
    }
}
