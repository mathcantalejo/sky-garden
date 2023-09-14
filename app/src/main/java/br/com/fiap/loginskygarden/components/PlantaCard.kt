package br.com.fiap.loginskygarden.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.loginskygarden.ui.theme.JakartaBold
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun PlantaCard() {
    Column() {
        Text(
            text = " Planta:",
            color = Color.White,
            fontSize = 13.sp,
            fontFamily = JakartaSemiBold,
            modifier = Modifier.padding(top = 20.dp, bottom = 15.dp)
        )
        Card(
            shape = RoundedCornerShape(5.dp),
            colors = CardDefaults.cardColors(Color(0xFFE3F2D4))
        ) {
            Column(
                Modifier
                    .height(261.dp)
                    .width(328.dp)
            ) {
                //PlantaSection(regadores = Regadore)
            }
        }
    }
}

@Composable
fun PlantaCard2(title: String, @DrawableRes image: Int, regadores: Int) {
    Card(
        shape = RoundedCornerShape(5.dp)
    ) {
        Column(
            Modifier
                .height(135.dp)
                .width(103.dp)
        ) {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(30.dp)) {
                Text(
                    text = title,
                    fontSize = 10.sp,
                    fontFamily = JakartaSemiBold,
                    fontWeight = FontWeight(500),
                    )
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    Modifier.size(20.dp)
                )
                Text(
                    text = regadores.toString(),
                    fontSize = 12.sp,
                    fontFamily = JakartaBold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlantaCardPreview() {
    PlantaCard()
}

