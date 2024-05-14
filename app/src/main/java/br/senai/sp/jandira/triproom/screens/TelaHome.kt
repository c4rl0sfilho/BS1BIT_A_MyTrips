package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun TelaHome (controleDeNavegacao: NavHostController){

    var pesquisaState = remember{
        mutableStateOf("")
    }



    TripRoomTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                modifier = Modifier.fillMaxSize()

            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Image(painter = painterResource(
                        id = R.drawable.paris),
                        contentDescription = "Paris",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.porto),
                                contentDescription = "imagem usuario",
                                modifier = Modifier
                                    .size(width = 70.dp, height = 70.dp)
                            )
                            Text(
                                text = "Susanna Hoffs",
                                color = Color.White,
                                modifier = Modifier
                                    .offset(x = -18.dp, y = 6.dp)
                            )
                        }

                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier
                            .width(200.dp)
                            .fillMaxHeight()
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .offset(x = 0.dp, y = -3.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .offset(x = 0.dp, y = 10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.LocationOn,
                                    contentDescription = null,
                                    tint = Color.White
                                )
                                Text(
                                    text = "You're in Paris",
                                    color = Color.White,
                                )
                            }
                            Text(
                                text = "My Trips",
                                fontSize = 30.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }

                }

                Text(text = "Categorias")
                LazyRow{
                    items(3){
                        Card(
                            modifier = Modifier
                                .size(height = 90.dp, width = 120.dp)
                                .padding(4.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xffCF06F0)),


                            ) {
                            Column{
                                Icon(
                                    imageVector = Icons.Filled.Snowboarding,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    text = "Snow",
                                    color = Color.White
                                )

                            }
                        }
                    }
                }
                OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text(text = "Search your Destiny") },
                    trailingIcon = { Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 14.dp)
                    )
                    })
                Text(
                    text = "Past Trips",
                    color = Color(0xFF565654),
                    modifier = Modifier
                        .padding(start = 14.dp)
                )
                LazyColumn{
                    items(2){
                        Card(
                            modifier = Modifier
                                .size(height = 200.dp, width = 350.dp)
                                .padding(6.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF)),
                        ) {
                            Image(painter = painterResource(id = R.drawable.london),
                                contentDescription = "London",
                                modifier = Modifier
                                    .height(110.dp)
                                    .fillMaxWidth()
                                    .padding(top = 5.dp)
                            )
                            Text(
                                text = "London, 2019" ,
                                color = Color(0xffCF06F0),
                                modifier = Modifier
                                    .padding(start = 14.dp)
                            )
                            Text(
                                text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                fontSize = 10.sp,
                                lineHeight = 16.sp,
                                modifier = Modifier
                                    .padding(start = 14.dp, end = 5.dp)

                            )
                            Text(
                                text = "18 Feb - 21 Feb",
                                color = Color(0xffCF06F0),
                                modifier = Modifier
                                    .padding(end = 5.dp)
                                    .align(Alignment.End)
                            )
                        }
                    }
                }
            }

        }




        }
    }
