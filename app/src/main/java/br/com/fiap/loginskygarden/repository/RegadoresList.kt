package br.com.fiap.loginskygarden.repository

import br.com.fiap.loginskygarden.model.Regadores

fun getAllRegadores(): List<Regadores> {
    return listOf(
        Regadores(nome = "Alface", status = true, "16/09/2023", "8:30", 22, 15, 3),
        Regadores(nome = "Cebolinha", status = false),
        Regadores(nome = "Salsinha", status = true, "11/09/2023", "12:15", 18, 25, 8),
        Regadores(nome = "Salsa", status = true, "22/09/2023", "14:45", 20, 19, 5),
        Regadores(nome = "Manjericão", status = false)
    )
}

