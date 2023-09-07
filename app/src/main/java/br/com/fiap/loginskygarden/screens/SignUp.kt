package br.com.fiap.loginskygarden.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaSignUp(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(50, 81, 68, 255))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .padding(top = 125.dp)
        ) {
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
            var email = remember {
                mutableStateOf("")
            }
            Text(
                text = "Trazendo a natureza para o seu espaço.",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp),
                fontFamily = JakartaSemiBold,
                textAlign = TextAlign.Center
            )
            Text(
                text = "E-mail:",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp),
                fontFamily = JakartaSemiBold
            )
            TextField(
                value = email.value,
                onValueChange = { novoValor ->
                    email.value = novoValor
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(219, 234, 208)),
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Nome:",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp),
                fontFamily = JakartaSemiBold
            )
            TextField(
                value = email.value,
                onValueChange = { novoValor ->
                    email.value = novoValor
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(219, 234, 208)),
            )
            Spacer(modifier = Modifier.height(12.dp))
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
            Spacer(modifier = Modifier.height(12.dp))
            var confirmarSenha = remember {
                mutableStateOf("")
            }
            Text(
                text = "Confirmar senha:",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp),
                fontFamily = JakartaSemiBold
            )
            TextField(
                value = confirmarSenha.value,
                onValueChange = { novoValor ->
                    confirmarSenha.value = novoValor
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(219, 234, 208)),
            )
            Spacer(modifier = Modifier.height(21.dp))
            Row(horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Já tem uma conta? ",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = JakartaSemiBold
                )
                Text(
                    text = "Entrar",
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
fun TelaSignUpPreview() {
    TelaSignUp(rememberNavController())
}