package com.example.musicapp.viewmodel.vm

//Viewmodel for lifecycle-bound coroutines
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
//Repository that manages autenthication
import com.example.musicapp.data.repository.AuthRepository
//UI login State
import com.example.musicapp.viewmodel.uistate.LoginUiState
//kotlin´s flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


/**
 * Viewmodel that manages the login screen login.
 *
 * - uses the UI state (email, password, loading, errors)
 * - for emited events of only one time (navigation)
 *
 * @author Andrés
 *
 */

//Authenticaion repository
class LoginViewModel(private val authRepository: AuthRepository) : ViewModel() {
    /**
     * UI mutable internal state only viewmodel can modified it
     */
    private val _uiState = MutableStateFlow(LoginUiState())

    /**
     * only read UI state. UI views it with collectAsSTate()
     */
    val uiState = _uiState.asStateFlow()

    /**
     * one-shot events, for navigation, etc
     */
    private val _events = MutableSharedFlow<LoginEvent>()

    /**
     * secure exposition of events flow
     */
    val events = _events.asSharedFlow()

    /**
     * Updates the email when user writes
     */
    fun onEmailChange(newEmail: String) {
        _uiState.update { it.copy(email = newEmail) }
    }

    /**
     * UPdates password when user writes it
     */
    fun onPasswordChange(newPassword: String) {
        _uiState.update { it.copy(password = newPassword) }
    }

    /**
     * alternates the password visibility
     */
    fun togglePasswordVisibility() {
        _uiState.update { it.copy(passwordVisible = !it.passwordVisible) }
    }

    /**
     * Executes login process
     *
     * -Activates the load state
     * -Call to the repository
     * -Broadcast a navigation event if it´s success
     * -manage errors
     */
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

/**
 * one single execution for login screen
 * it´s positioned outside the viewmodel for mayor clarity
 */
sealed interface LoginEvent {
    //Event for navigation to main screen
    object NavigateToHome : LoginEvent
}

/**
 * Authenticacion Repository interface
 * Allows disengage the logic from the ViewMOdel
 */
interface AuthRepo {
    suspend fun login(email: String, password: String)
}





