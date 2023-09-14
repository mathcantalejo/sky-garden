package br.com.fiap.loginskygarden.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.loginskygarden.repository.getAllRegadores
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun RegadoresSection() {
    Column() {
        Text(
            text = " Regadores:",
            color = Color.White,
            fontSize = 13.sp,
            fontFamily = JakartaSemiBold,
            modifier = Modifier.padding(top = 20.dp)
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
                RegadoresCard(regadores = it)
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RegadoresSectionPreview() {
    RegadoresSection()
}