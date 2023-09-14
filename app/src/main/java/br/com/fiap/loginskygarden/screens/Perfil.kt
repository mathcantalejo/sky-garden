package br.com.fiap.loginskygarden.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.loginskygarden.R
import br.com.fiap.loginskygarden.ui.theme.JakartaBold
import br.com.fiap.loginskygarden.ui.theme.JakartaSemiBold
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaPerfil(navController: NavController) {
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
                text = "Meu Perfil",
                fontFamily = JakartaSemiBold,
                color = Color.White,
                fontSize = 20.sp
            )
        }
        Column(
            Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(30.dp))
            Image(
                painterResource(id = R.drawable.marianoalves),
                contentDescription = null,
                Modifier
                    .size(80.dp)
                    .border(
                        BorderStroke(2.dp, Color(0xFF19A22F)),
                        CircleShape
                    )
            )
            Spacer(Modifier.height(30.dp))
            var nome = remember {
                mutableStateOf("")
            }
            Text(
                text = "Nome",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp),
                fontFamily = JakartaSemiBold
            )
            TextField(
                value = nome.value,
                onValueChange = { novoValor ->
                    nome.value = novoValor
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(219, 234, 208)),
            )
            Spacer(Modifier.height(25.dp))
            var email = remember {
                mutableStateOf("")
            }
            Text(
                text = "E-mail",
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
            Spacer(Modifier.height(25.dp))
            var senha = remember {
                mutableStateOf("")
            }
            Text(
                text = "Senha",
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
            Spacer(Modifier.height(25.dp))
            var confirmarSenha = remember {
                mutableStateOf("")
            }
            Text(
                text = "Confirmar senha",
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
            Spacer(Modifier.height(25.dp))
            Button(
                onClick = { navController.navigate("dashboard") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF98D060)
                )
            ) {
                Text(
                    text = "Salvar alterações",
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
fun TelaPerfilPreview() {
    TelaPerfil(rememberNavController())
}
