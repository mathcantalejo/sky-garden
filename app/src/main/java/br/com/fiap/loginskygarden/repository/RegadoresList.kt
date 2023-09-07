package br.com.fiap.loginskygarden.repository

import br.com.fiap.loginskygarden.model.Regadores

fun getAllRegadores(): List<Regadores> {
    return listOf(
        Regadores(nome = "Salsinha", status = true),
        Regadores(nome = "Cebolinha", status = false),
        Regadores(nome = "Alface", status = true),
        Regadores(nome = "Salsa", status = true),
        Regadores(nome = "Manjericão", status = false)
    )
}

