package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.repository.UsuariosRepository
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme
import androidx.compose.material3.Icon as Icon

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {

    var cr = UsuariosRepository(LocalContext.current)
    var listarUsuarios = cr.buscarTodosOsUsuarios()


    var usuarioState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember{
        mutableStateOf("")
    }

    var isErrorState = remember {
        mutableStateOf(false)
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }


    TripRoomTheme {
        Surface {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            Color(0xffCF06F0),
                            shape = RoundedCornerShape(bottomStart = 16.dp)
                        )
                        .align(Alignment.End)
                ) {
                }
                Spacer(modifier = Modifier.height(165.dp))
                Text(
                    text = "Login",
                    fontSize = 48.sp,
                    color = Color(0xffCF06F0),
                    modifier = Modifier
                        .padding(start = 24.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Please sign in to continue.",
                    modifier = Modifier
                        .padding(start = 24.dp),
                    color = Color(0xffA09C9C)
                )
                Spacer(modifier = Modifier.height(60.dp))
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    isError = isErrorState.value,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = "E-mail",
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors
                            (
                            unfocusedBorderColor = Color(0xffCF06F0),
                            focusedBorderColor = Color(0xffCF06F0)
                        ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Email,
                            contentDescription = "",
                            tint = Color(0xffCF06F0)
                        )
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = { senhaState.value = it
                                    },
                    isError = isErrorState.value,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = "Password",
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors
                            (
                            unfocusedBorderColor = Color(0xffCF06F0),
                            focusedBorderColor = Color(0xffCF06F0)
                        ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "",
                            tint = Color(0xffCF06F0)
                        )
                    }
                )
                Text(text = mensagemErroState.value, color = Color.Red,
                    modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),)
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {
                        var usuario = cr.login(emailState.value,senhaState.value)
                        if(true){
                            controleDeNavegacao.navigate("home")
                        } else {
                            mensagemErroState.value = "Usuario ou Senha Incorretos"
                        }
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xffCF06F0)),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 24.dp)
                ) {
                    Text(
                        text = "Sign in  ",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "Sign in")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 24.dp)
                ) {
                    Text(
                        text = "Don’t have an account?",
                        color = Color(0xffA09C9C)
                    )
                    Text(
                        text = "Sign up", fontWeight = FontWeight.Bold,
                        color = Color(0xffCF06F0),
                        modifier = Modifier.clickable { controleDeNavegacao.navigate("signUp")}
                    )
                }
                Spacer(modifier = Modifier.height(120.dp))
                Row(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            Color(0xffCF06F0),
                            shape = RoundedCornerShape(topEnd = 16.dp)
                        )
                        .align(Alignment.Start)

                ) {
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    TripRoomTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {

        }
    }
}
