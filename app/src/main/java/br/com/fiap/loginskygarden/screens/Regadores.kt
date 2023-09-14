package br.com.fiap.loginskygarden.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.loginskygarden.R
import br.com.fiap.loginskygarden.model.Regadores
import br.com.fiap.loginskygarden.ui.theme.JakartaBold
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun TelaRegadores(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(50, 81, 68, 255))
            .padding(top = 65.dp, start = 25.dp, end = 25.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Regadores",
                fontFamily = JakartaSemiBold,
                color = Color.White,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(35.dp))
        RegadoressCard("Regadores Alface 1")
        RegadoressCard("Regadores Alface 2")
        RegadoressCard("Regadores Alface 3")
        RegadoressCard("Regadores Salsinha")
    }
}


@Composable
fun RegadoressCard(nome: String) {
    Spacer(modifier = Modifier.height(15.dp))
    Card(
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(Color(0xFF1C3128))
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .height(58.dp)

        ) {
            Row(
                Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Spacer(Modifier)
                Image(
                    painterResource(id = R.drawable.vector),
                    contentDescription = null,
                    Modifier.size(30.dp)
                )
                Spacer(Modifier)
                Text(
                    text = nome,
                    fontSize = 11.sp,
                    fontFamily = JakartaBold,
                    color = Color.White,
                )
                Spacer(Modifier.width(55.dp))
                Image(
                    painterResource(id = R.drawable.edit_logo),
                    contentDescription = null,
                    Modifier.size(15.dp)
                )
                Image(
                    painterResource(id = R.drawable.deletewh),
                    contentDescription = null,
                    Modifier
                        .size(15.dp)
                )
                Image(
                    painterResource(id = R.drawable.ellipse_green),
                    contentDescription = null,
                    Modifier.size(8.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TelaRegadoresPreview() {
    TelaRegadores(rememberNavController())
}