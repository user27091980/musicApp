package com.example.musicapp.viewmodel.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musicapp.data.repository.AuthRepository
import com.example.musicapp.viewmodel.uistate.LoginUiState
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


/**
 * @author Andrés
 *
 */

// In LoginVM.kt
class LoginViewModel(private val authRepository: AuthRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()
    private val _events = MutableSharedFlow<LoginEvent>()
    val events = _events.asSharedFlow()

    fun onEmailChange(newEmail: String) {
        _uiState.update { it.copy(email = newEmail) }
    }

    fun onPasswordChange(newPassword: String) {
        _uiState.update { it.copy(password = newPassword) }
    }

    fun togglePasswordVisibility() {
        _uiState.update { it.copy(passwordVisible = !it.passwordVisible) }
    }

    fun login() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    errorMessage = null
                )
            }

            try {
                authRepository.login(
                    email = uiState.value.email,
                    password = uiState.value.password
                )

                // aquí NO navegamos directamente
                // emitimos un evento
                _events.emit(LoginEvent.NavigateToHome)

            } catch (e: Exception) {
                _uiState.update {
                    it.copy(

                        errorMessage = e.message ?: "Error desconocido"
                    )
                }
            } finally {
                _uiState.update { it.copy(isLoading = false) }
            }
        }
    }
}

// Mejor declarar el evento fuera del VM
sealed interface LoginEvent {
    object NavigateToHome : LoginEvent
}

interface AuthRepo {
    suspend fun login(email: String, password: String)
}





