package com.example.gestorclase.data.repositorio

import com.example.musicapp.data.modelo.UsuariosDTO


class UsuarioRepo {

    companion object{
        val usuarios = ArrayList<UsuariosDTO>(
            listOf(
                UsuariosDTO(0, "user1", "1234"),

            ))
        var currId = 4
    }


    //crud


    fun readAll(onSuccess: (List<UsuariosDTO>) -> Unit, onError: () -> Unit) {
        onSuccess(usuarios)
    }

    fun crear(
        est: UsuariosDTO,
        onSuccess: (usuarioCreado: UsuariosDTO) -> Unit,
        onError: () -> Unit
    ) {

        usuarios.add(est.copy(id = currId++))
        onSuccess(usuarios.last())

    }

    fun read(
        id: Int,
        onSuccess: (usuarioCreado: UsuariosDTO?) -> Unit,
        onError: () -> Unit
    ) {

        onSuccess(usuarios.find { it.id == id })
    }

    fun delete(
        id: Int,
        onSuccess: () -> Unit,
        onError: () -> Unit
    ) {
        if(usuarios.removeIf { it.id == id })
            onSuccess()
        else
            onError()
    }


}