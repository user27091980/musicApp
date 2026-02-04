package com.example.musicapp.viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musicapp.data.repository.SettingsRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SettingsViewModel(private val repository: SettingsRepository) : ViewModel() {

    val darkMode = repository.darkModeFlow.stateIn(
        viewModelScope,
        SharingStarted.Companion.WhileSubscribed(5_000),
        false
    )

    fun onDarkModeChanged(enabled: Boolean) {
        viewModelScope.launch { repository.setDarkMode(enabled) }
    }
}