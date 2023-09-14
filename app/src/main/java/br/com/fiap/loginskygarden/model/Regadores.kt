package br.com.fiap.loginskygarden.model

data class Regadores(
    val nome: String = "",
    val status: Boolean = false,
    val date: String = "",
    val horas: String = "",
    val temperaturaSolo: Int = 0,
    val diasParaColheita: Int = 0,
    val regarEmHoras: Int = 0
)