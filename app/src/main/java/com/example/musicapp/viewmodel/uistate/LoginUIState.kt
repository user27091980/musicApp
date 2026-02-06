package com.example.musicapp.viewmodel.uistate
// A data class to hold all the state for the screen
data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val passwordVisible: Boolean = false,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
) {
    val isLoginButtonEnabled: Boolean
        get() = email.isNotBlank() && password.isNotBlank() && !isLoading
}