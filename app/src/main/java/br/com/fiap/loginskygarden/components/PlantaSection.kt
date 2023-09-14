package br.com.fiap.loginskygarden.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.loginskygarden.R
import br.com.fiap.loginskygarden.model.Regadores
import br.com.fiap.loginskygarden.repository.getAllRegadores
import br.com.fiap.loginskygarden.ui.theme.JakartaBold
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun PlantaSection(regadores: Regadores) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)) {
        Text(
            modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
            text = regadores.nome.uppercase(),
            fontFamily = JakartaSemiBold,
            fontSize = 13.sp
        )
        Row(){
          Text(
              text = "Regada em:" + regadores.date + "às" + regadores.horas,
              fontFamily = JakartaBold
          )
            LazyRow(
                Modifier
                    .padding(
                        top = 30.dp
                    )
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(getAllRegadores()) {
                    PlantaCard2("Temperatura", R.drawable.temperatura, regadores.temperaturaSolo)
                    PlantaCard2("Regar em", R.drawable.regar, regadores.regarEmHoras)
                    PlantaCard2("Dias para colheita", R.drawable.colheita, regadores.diasParaColheita)
                }
            }
        }
    }
}