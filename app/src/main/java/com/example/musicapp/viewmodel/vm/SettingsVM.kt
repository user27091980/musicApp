package com.example.musicapp.viewmodel

//Androd Archictecture Components viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

//Settings repository for manage persistence
import com.example.musicapp.data.repository.SettingsRepository
//flows and corrutines
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/**
 * Viewmodel that manages the screen settings logic
 * it´s an intermediate between UI and repository
 */
class SettingsViewModel(
    //repository that save and provides the dark mode state
    private val repository: SettingsRepository
) : ViewModel() {

    val darkMode = repository.darkModeFlow.stateIn(
        //scope for the viewmodel live cycle
        scope = viewModelScope,
        //Flow is active while has suscriptors and cancels after 5 seconds without observers
        started = SharingStarted.WhileSubscribed(5_000),
        //initial value used before the first real value emition
        initialValue = false
    )
    /**
     * It calls when the user active or desactive de dark mode
     *
     * @param enabled true if dark mode is On
     */
    fun onDarkModeChanged(enabled: Boolean) {
        viewModelScope.launch {
            repository.setDarkMode(enabled)
        }
    }
}
/**
 * apuntes:
 *ViewModel: mantiene el estado aunque la pantalla se recomponga
 *
 * Repository: fuente única de datos (single source of truth)
 *
 * Flow → StateFlow: ideal para Compose
 *
 * viewModelScope: evita fugas de memoria
 *
 * stateIn: convierte un Flow frío en uno observable y con estado
 *
 */
