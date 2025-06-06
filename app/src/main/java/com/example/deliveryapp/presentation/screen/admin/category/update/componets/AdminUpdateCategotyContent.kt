package com.example.deliveryapp.presentation.screen.admin.category.update.componets

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.deliveryapp.R

@Composable

fun AdminUpdateCategoryContent(paddingValues: PaddingValues,navController: NavHostController){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box (modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.backgroun2),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Icon(
            imageVector = Icons.Default.KeyboardArrowLeft,
            contentDescription = "",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.TopStart)
                .padding(20.dp)
                .clickable{
                    navController.popBackStack()
                },
            tint = Color.White
        )
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column {

            ElevatedCard(elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
                modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth().height(600.dp)
            ) {
                Column {

                    androidx.compose.material3.Text(
                        "Crear Categoria",
                        modifier = Modifier.padding(20.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp

                    )
                    Box(
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, top = 20.dp)
                            .height(120.dp)
                            .fillMaxWidth()


                    ){

                        Image(
                            painter = painterResource(R.drawable.restauran),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(
                                    shape = RoundedCornerShape(10.dp)
                                ),
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "",
                            modifier = Modifier.align(Alignment.CenterStart).size(30.dp),
                            tint = Color.White

                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier.align(Alignment.CenterEnd).size(30.dp),
                            tint = Color.White

                        )
                    }

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { androidx.compose.material3.Text("Nombre de la categoria") },
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = password,
                        onValueChange = { email = it },
                        label = { androidx.compose.material3.Text("Descripcion") },
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 5.dp).fillMaxWidth().height(250.dp)
                    )



                    Button(
                        onClick = {
                         navController.popBackStack()
                        },
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 10.dp).fillMaxWidth(),
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black
                        )
                    ) {
                        Row {
                            Icon(
                                imageVector = Icons.Default.ArrowForward,
                                contentDescription = ""
                            )
                            androidx.compose.material3.Text("Crear Categoria")
                        }
                    }

                }


            }
        }



    }





}