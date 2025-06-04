package com.example.deliveryapp.presentation.screen.roles.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.deliveryapp.R
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.graph.admin.AdminNavGraph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminScreen

@Composable
fun RolesScreenContent(paddingValues: PaddingValues,navController: NavHostController){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box (modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.backgroun2),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        ElevatedCard(elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
            modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth().height(400.dp)
        ) {
            Text("Seleccione su rol",
                modifier = Modifier.padding(20.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp

                )
            Row(Modifier.padding(20.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                Card (modifier = Modifier
                    .weight(1f)
                    .height(250.dp)
                    .padding(end = 10.dp)
                    .clickable{

                        navController.navigate(route = Graph.ADMIN){
                            popUpTo(route = Graph.ROLES){
                                inclusive = true
                            }
                        }
                    }
                ) {

                    Column(Modifier.fillMaxSize()) {
                        Image(
                            painter = painterResource(R.drawable.comensal),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.weight(4f).fillMaxSize()
                        )
                        Text(
                            text = "Client",
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp



                        )

                    }

                }
                Card (modifier = Modifier
                    .weight(1f)
                    .height(250.dp)
                    .padding(start = 10.dp
                    )
                    .clickable{
                        navController.navigate(route = Graph.CLIENT)
                    }
                ) {
                    Column(Modifier.fillMaxSize()) {
                        Image(
                            painter = painterResource(R.drawable.restauran),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.weight(4f).fillMaxSize()
                        )
                        Text(
                            text = "Restaurant",
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp



                        )

                    }

                }
            }

        }

    }




}