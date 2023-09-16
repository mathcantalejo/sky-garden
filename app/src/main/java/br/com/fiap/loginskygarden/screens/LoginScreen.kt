package br.com.fiap.loginskygarden.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.loginskygarden.R
import br.com.fiap.loginskygarden.ui.theme.JakartaBold
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold
import br.com.fiap.loginskygarden.ui.theme.LoginSkyGardenTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaLogin(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(50, 81, 68, 255))
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .padding(top = 125.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .size(100.dp)
            ) }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 26.dp
                )
        ) {
            var usuario = remember {
                mutableStateOf("")
            }
            Text(
                text = "Usuário/E-mail:",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp),
                fontFamily = JakartaSemiBold
            )
            TextField(
                value = usuario.value,
                onValueChange = { novoValor ->
                    usuario.value = novoValor
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(219, 234, 208)),
            )
            Spacer(modifier = Modifier.height(42.dp))
            var senha = remember {
                mutableStateOf("")
            }
            Text(
                text = "Senha:",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp),
                fontFamily = JakartaSemiBold
            )
            TextField(
                value = senha.value,
                onValueChange = { novoValor ->
                    senha.value = novoValor
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(219, 234, 208)),
            )
            Spacer(modifier = Modifier.height(63.dp))
            Button(onClick = { navController.navigate("menu") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1C3128)
                )
            ) {
                Text(
                    text = "ENTRAR",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = JakartaBold
                )
            }
            Spacer(modifier = Modifier.height(21.dp))
            Text(
                text = "Esqueceu sua senha?",
                modifier = Modifier.fillMaxWidth()
                    .clickable {  navController.navigate("esqueceusenha") },
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = JakartaSemiBold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(63.dp))
            Row(horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Não tem uma conta? ",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = JakartaSemiBold
                )
                Text(
                    text = "Cadastre-se",
                    Modifier.clickable { navController.navigate("cadastrar") },
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = JakartaBold
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TelaLoginPreview() {
    TelaLogin(rememberNavController())
}
