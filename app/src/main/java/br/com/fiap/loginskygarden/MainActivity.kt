package br.com.fiap.loginskygarden

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.loginskygarden.screens.TelaDashboard
import br.com.fiap.loginskygarden.screens.TelaEsqueceuSenha
import br.com.fiap.loginskygarden.screens.TelaLogin
import br.com.fiap.loginskygarden.screens.TelaMenu
import br.com.fiap.loginskygarden.screens.TelaNotificacoes
import br.com.fiap.loginskygarden.screens.TelaPerfil
import br.com.fiap.loginskygarden.screens.TelaRegadores
import br.com.fiap.loginskygarden.screens.TelaSignUp
import br.com.fiap.loginskygarden.ui.theme.LoginSkyGardenTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginSkyGardenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(50, 81, 68, 255)
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            TelaLogin(navController)
                        }
                        composable(route = "esqueceusenha") {
                            TelaEsqueceuSenha(navController)
                        }
                        composable(route = "cadastrar") {
                            TelaSignUp(navController)
                        }
                        composable(route = "menu") {
                            TelaMenu(navController)
                        }
                        composable(route = "dashboard") {
                            TelaDashboard(navController)
                        }
                        composable(route = "notificações") {
                            TelaNotificacoes(navController)
                        }
                        composable(route = "perfil") {
                            TelaPerfil(navController)
                        }
                        composable(route = "regadores") {
                            TelaRegadores(navController)
                        }
                    }
                }
            }
        }
    }
}
