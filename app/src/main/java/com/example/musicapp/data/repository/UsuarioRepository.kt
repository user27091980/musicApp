package com.example.musicapp.data.repository

import com.example.musicapp.data.modelo.UsersDTO

//repositorio gestión usuarios
class UserRepository {

    companion object {
        val usuarios = ArrayList<UsersDTO>(
            listOf(
                UsersDTO(0, "user1", "1234"),
            )
        )
        var currId = 4

    }


    //crud

    fun readAll(onSuccess: (List<UsersDTO>) -> Unit, onError: () -> Unit) {
        onSuccess(usuarios)
    }

    fun crear(
        est: UsersDTO,
        onSuccess: (usuarioCreado: UsersDTO) -> Unit,
        onError: () -> Unit
    ) {

        usuarios.add(est.copy(id = currId++))
        onSuccess(usuarios.last())

    }

    fun read(
        id: Int,
        onSuccess: (usuarioCreado: UsersDTO?) -> Unit,
        onError: () -> Unit
    ) {

        onSuccess(usuarios.find { it.id == id })
    }

    fun delete(
        id: Int,
        onSuccess: () -> Unit,
        onError: () -> Unit
    ) {
        if (usuarios.removeIf { it.id == id })
            onSuccess()
        else
            onError()
    }
}