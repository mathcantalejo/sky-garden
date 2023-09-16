package br.com.fiap.loginskygarden.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.loginskygarden.R

@Composable
fun BottomNavigationBar(navController: NavController) {
    Column(Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom) {
        Card(
            shape = RoundedCornerShape(5.dp),
            colors = CardDefaults.cardColors(Color(0xFFD1FFDB)),
            modifier = Modifier
                .fillMaxWidth()
                .height(47.dp)
        ) {
            Row(
                Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(painterResource(id = R.drawable.dashboard), contentDescription = null, Modifier.size(20.dp).clickable { navController.navigate("dashboard")})
                Image(painterResource(id = R.drawable.regadores), contentDescription = null, Modifier.size(20.dp).clickable { navController.navigate("regadores")})
                Image(painterResource(id = R.drawable.menu), contentDescription = null, Modifier.size(20.dp).clickable { navController.navigate("menu")})
                Image(painterResource(id = R.drawable.notificacoes), contentDescription = null, Modifier.size(20.dp).clickable { navController.navigate("notificações")})
                Image(painterResource(id = R.drawable.profile), contentDescription = null, Modifier.size(20.dp).clickable { navController.navigate("perfil")})
            }
        }
    }
}
