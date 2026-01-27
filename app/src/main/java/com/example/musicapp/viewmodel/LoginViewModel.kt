package com.example.musicapp.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * @author Andrés
 *
 */

// In LoginViewModel.kt
class LoginViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onEmailChange(newEmail: String) {
        _uiState.update { it.copy(email = newEmail) }
    }

    fun onPasswordChange(newPassword: String) {
        _uiState.update { it.copy(password = newPassword) }
    }

    fun togglePasswordVisibility() {
        _uiState.update { it.copy(passwordVisible = !it.passwordVisible) }
    }
}

// A data class to hold all the state for the screen
data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val passwordVisible: Boolean = false
) {
    // Computed property for enabling the button
    val isLoginButtonEnabled: Boolean
        get() = email.isNotBlank() && password.isNotBlank()
}


