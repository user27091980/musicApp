package com.example.musicapp.data.repository


/**
 * @author Andrés Canabal
 */
interface AuthRepository {
    suspend fun login(email: String, password: String)
}

class AuthRepositoryImpl : AuthRepository {
    override suspend fun login(email: String, password: String) {
        // Lógica real con Firebase, API, etc.
    }
}
