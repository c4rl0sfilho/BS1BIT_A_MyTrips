package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Usuarios
import br.senai.sp.jandira.triproom.repository.UsuariosRepository
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun TelaSignUp (controleDeNavegacao: NavHostController) {

    val cr = UsuariosRepository(LocalContext.current)

    var usuarioState = remember {
        mutableStateOf("")
    }
    var numeroState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var adultState = remember {
        mutableStateOf(false)
    }
    var isErrorState = remember {
        mutableStateOf(false)
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }





    TripRoomTheme {
        Surface {
            Column (modifier = Modifier.fillMaxSize()){
                Row(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            Color(0xffCF06F0),
                            shape = RoundedCornerShape(bottomStart = 16.dp)
                        )
                        .align(Alignment.End)
                ){
                }
                Spacer(modifier = Modifier.height(10.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Sign in",
                        fontSize = 32.sp,
                        color = Color(0xffCF06F0),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.ExtraBold

                    )
                    Text(
                        text = "Create a new account",
                        color = Color(0xffA09C9C)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Box (
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.foto),
                            contentDescription = "",
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                                .offset(x = 55.dp, y = 35.dp)
                        )
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .border(
                                    BorderStroke(
                                        2.dp, Brush.horizontalGradient(
                                            0.2f to Color(0xffCF06F0),
                                            0.6f to Color.White,
                                            0.4f to Color.White,
                                            startX = 0.0f,
                                            endX = 430.0f
                                        )
                                    ), shape = RoundedCornerShape(360.dp)
                                )
                            //.background(color = Color.White)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Person,
                                contentDescription = "Foto De Perfil",
                                tint = Color(0xffCF06F0),
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                }
                OutlinedTextField(
                    value = usuarioState.value ,
                    onValueChange ={
                                   usuarioState.value = it
                    },
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = "Username",
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
                            imageVector = Icons.Filled.Person,
                            contentDescription = "",
                            tint = Color(0xffCF06F0)
                        )
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = numeroState.value ,
                    onValueChange ={
                                   numeroState.value = it
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = {
                        Text(
                            text = "Phone",
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
                            imageVector = Icons.Rounded.Phone,
                            contentDescription = "",
                            tint = Color(0xffCF06F0)
                        )
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange ={
                                   emailState.value = it
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
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
                    onValueChange ={
                           senhaState.value = it
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp)
                        .align(Alignment.Start)
                ) {
                    Checkbox(
                        checked = adultState.value,

                        onCheckedChange = {
                            adultState.value = true
                        })
                    Text(
                        text = "Over 18?",
                        modifier = Modifier.padding(top = 8.dp, start = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {
                              //cria um objeto usuario
                              val usuario = Usuarios(
                                nome = usuarioState.value,
                                email = emailState.value,
                                telefone = numeroState.value,
                                password = senhaState.value,
                                isAdult = adultState.value
                                      )
                        if (usuarioState.value == "" || emailState.value == "" || numeroState.value == "" || senhaState.value == ""){
                            isErrorState.value = true
                        }else{
                            cr.salvar(usuario)
                            controleDeNavegacao.navigate("login")
                        }

                    },
                    colors = ButtonDefaults.buttonColors(Color(0xffCF06F0)),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 24.dp, start = 24.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text ="CREATE ACCOUNT",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row (
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 24.dp)
                ){
                    Text(
                        text = "Already have an account?",
                        color = Color(0xffA09C9C)
                    )
                    Text(
                        text = "Sign in",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xffCF06F0),
                        modifier = Modifier.clickable { controleDeNavegacao.navigate("Login") }
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            Color(0xffCF06F0),
                            shape = RoundedCornerShape(topEnd = 16.dp)
                        )
                        .align(Alignment.Start)

                ){
                }

            }
        }

    }
    }
