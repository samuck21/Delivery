package com.example.deliveryapp.presentation.screen.admin.product.list.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deliveryapp.R

@Composable
fun AdminProductsScreenContent(paddingValues: PaddingValues){

    Column(modifier = Modifier.padding(20.dp)) {
        Row {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                modifier = Modifier.weight(1f).height(200.dp).padding(end = 5.dp)

            ) {
                Box(modifier = Modifier
                    .fillMaxSize()

                ){
                    Image(
                        painter = painterResource(R.drawable.pizzapepperoni),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "PIZZA",
                        modifier = Modifier.align(Alignment.TopStart).padding(10.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Text(
                        text = "3000.34$",
                        modifier = Modifier.align(Alignment.BottomStart).padding(10.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .size(40.dp),
                        tint = Color.Black
                    )
                    Column (modifier = Modifier.align(Alignment.TopEnd)) {
                        Box(modifier = Modifier
                            .background(Color.Transparent)
                            .size(50.dp)
                            .padding(10.dp)
                            .clip(shape = CircleShape)
                        ){
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Green)){
                                Icon(
                                    imageVector = Icons.Default.Edit,
                                    contentDescription = "",
                                    tint = Color.Black,
                                    modifier = Modifier.size(30.dp)
                                )
                            }


                        }
                        Box(modifier = Modifier
                            .background(Color.Transparent)
                            .size(50.dp)
                            .padding(10.dp)
                            .clip(shape = CircleShape)
                        ){
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Red)){
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "",
                                    tint = Color.Black,
                                    modifier = Modifier.size(30.dp)
                                )
                            }


                        }
                    }


                }
            }

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                modifier = Modifier.weight(1f).height(200.dp).padding(end = 5.dp)

            ) {
                Box(modifier = Modifier
                    .fillMaxSize()

                ){
                    Image(
                        painter = painterResource(R.drawable.pizzapepperoni),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "PIZZA",
                        modifier = Modifier.align(Alignment.TopStart).padding(10.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Text(
                        text = "3000.34$",
                        modifier = Modifier.align(Alignment.BottomStart).padding(10.dp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .size(40.dp),
                        tint = Color.Black
                    )
                    Column (modifier = Modifier.align(Alignment.TopEnd)) {
                        Box(modifier = Modifier
                            .background(Color.Transparent)
                            .size(50.dp)
                            .padding(10.dp)
                            .clip(shape = CircleShape)
                        ){
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Green)){
                                Icon(
                                    imageVector = Icons.Default.Edit,
                                    contentDescription = "",
                                    tint = Color.Black,
                                    modifier = Modifier.size(30.dp)
                                )
                            }


                        }
                        Box(modifier = Modifier
                            .background(Color.Transparent)
                            .size(50.dp)
                            .padding(10.dp)
                            .clip(shape = CircleShape)
                        ){
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Red)){
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "",
                                    tint = Color.Black,
                                    modifier = Modifier.size(30.dp)
                                )
                            }


                        }
                    }


                }
            }

        }


    }

}