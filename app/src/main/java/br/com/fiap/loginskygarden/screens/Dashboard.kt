package br.com.fiap.loginskygarden.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.loginskygarden.components.BottomNavigationBar
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold

@Composable
fun TelaDashboard(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(50, 81, 68, 255))
            .padding(start = 25.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 65.dp, end = 25.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Dashboard",
                    fontFamily = JakartaSemiBold,
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }
    }
    BottomNavigationBar(navController = navController)
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DashboardPreview() {
    TelaDashboard(rememberNavController())
}