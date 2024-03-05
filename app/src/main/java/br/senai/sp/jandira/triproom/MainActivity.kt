package br.senai.sp.jandira.triproom

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.End
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
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
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
        ){
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
            value = "teste@email.com " ,
            onValueChange ={},
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
            value = "************ " ,
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth(),
            onValueChange ={},
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
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xffCF06F0)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 24.dp)
            ) {
            Text(
                text ="Sign in  ",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            androidx.compose.material3.Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "Sign in")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row (
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 24.dp)
        ){
            Text(
                text = "Don’t have an account?",
                color = Color(0xffA09C9C)
                )
            Text(
                text = "Sign up",
                color = Color(0xffCF06F0)
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

        ){
        }
    }
}


@Composable
fun SignUp () {
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
        Column(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
        Text(text = "Sign in",
            fontSize = 32.sp,
            color = Color(0xffCF06F0),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold

        )
        Text(
            text = "Create a new account",
            color = Color(0xffA09C9C)
        )
        }
        OutlinedTextField(
            value = "Susanna Hoffs" ,
            onValueChange ={},
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
            value = "99999-0987" ,
            onValueChange ={},
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
            value = "susanna@email.com " ,
            onValueChange ={},
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
            value = "******" ,
            onValueChange ={},
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

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TripRoomTheme {
        Greeting()
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    TripRoomTheme {
        SignUp()
    }
}