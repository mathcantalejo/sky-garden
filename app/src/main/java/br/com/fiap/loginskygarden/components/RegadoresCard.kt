package br.com.fiap.loginskygarden.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.loginskygarden.R
import br.com.fiap.loginskygarden.model.Regadores
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun RegadoresCard(regadores: Regadores) {
    Card(
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(Color(0xFFE3F2D4))
    ) {
        Column(
            Modifier
                .height(180.dp)
                .width(124.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(35.dp)) {
                Text(
                    text = regadores.nome,
                    fontSize = 14.sp,
                    fontFamily = JakartaSemiBold,
                    fontWeight = FontWeight(500),

                    )
                Image(
                    painter = painterResource(id = R.drawable.vectorblack),
                    contentDescription = null,
                    Modifier.size(40.dp)
                )
                if (!regadores.status) {
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
