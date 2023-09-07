package br.com.fiap.loginskygarden.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.loginskygarden.R
import br.com.fiap.loginskygarden.model.Regadores
import br.com.fiap.loginskygarden.repository.getAllRegadores
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun TelaMenu(navController: NavController) {

    var regadoresListState by remember {
        mutableStateOf(getAllRegadores())
    }

    Box(modifier = Modifier
        .background(Color(50, 81, 68, 255))
        .fillMaxSize()
        .padding(horizontal = 25.dp)
    ) {
        Column {
            GreetingSection()
        }
        LazyRow() {
            items(regadoresListState) {
                RegadoresCard(regadores = it)
            }
        }
    }

}

@Composable
fun GreetingSection(
    nome: String = "Mariano Alves"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 65.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Olá, $nome!\uD83D\uDC4B",
                fontFamily = JakartaSemiBold,
                color = Color.White,
                fontSize = 20.sp
            )
        }
        Image(
            painter = painterResource(id = R.drawable.marianoalves),
            contentDescription = null,
            modifier = Modifier.size(45.dp)
        )
    }
}

@Composable
fun RegadoresCard(regadores: Regadores) {
    Card(modifier = Modifier.padding(bottom = 8.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .weight(3f)) {
                Text(
                    text = regadores.nome,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(painter = painterResource(id = R.drawable.vectorblack), contentDescription = null)
                if(!regadores.status) {
                    Text(
                        text = "Inativo",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                } else {
                    Text(
                        text = "Ativo",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                
            }

        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TelaMenuPreview() {
    TelaMenu(rememberNavController())
}

