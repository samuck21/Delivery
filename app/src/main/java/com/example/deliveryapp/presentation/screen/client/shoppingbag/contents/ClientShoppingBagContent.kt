package com.example.deliveryapp.presentation.screen.client.shoppingbag.contents

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun ClientShoppingBagContent(paddingValues: PaddingValues,navController: NavHostController){
    var checked by remember { mutableStateOf(true) }
    Column(modifier = Modifier.padding(paddingValues)){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
                .background(Color.LightGray)
        ){

        }

        Text("Productos",
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp)
            ,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
            )
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 3.dp)

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            ){
                Column (modifier = Modifier.padding(20.dp)) {
                    Row {
                        Image(
                        painter = painterResource(
                            id = com.example.deliveryapp.R.drawable.pizzapepperoni
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(70.dp).clip(shape = RoundedCornerShape(10.dp))
                    )
                        Column (
                            modifier = Modifier.padding(start = 20.dp)
                        ) {
                            Text("Pizza de peperoni",
                                fontWeight = FontWeight.Medium,
                                fontSize = 20.sp,
                                color = Color.Black

                            )
                            Text("Eliminar",
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp,
                                color = Color.Blue

                            )

                        }
                    }
                    Row {
                        Spacer(modifier = Modifier
                            .width(80.dp)
                            .weight(2f)
                        )
                        Text("2u",
                            modifier = Modifier.weight(1f)

                        )
                        Text("$ 109.90",
                            modifier = Modifier.weight(2f),
                            fontWeight = FontWeight.Medium,
                            fontSize = 22.sp,
                            color = Color.Black
                        )
                    }
                }
            }

        // Segundo Item

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        ){
            Column (modifier = Modifier.padding(20.dp)) {
                Row {
                    Image(
                        painter = painterResource(
                            id = com.example.deliveryapp.R.drawable.pizzapepperoni
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(70.dp).clip(shape = RoundedCornerShape(10.dp))
                    )
                    Column (
                        modifier = Modifier.padding(start = 20.dp)
                    ) {
                        Text("Pizza de peperoni",
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            color = Color.Black

                        )
                        Text("Eliminar",
                            fontWeight = FontWeight.Medium,
                            fontSize = 15.sp,
                            color = Color.Blue

                        )

                    }
                }
                Row {

                    Spacer(modifier = Modifier
                        .width(80.dp)
                        .weight(2f)
                    )
                    Text("2u",
                        modifier = Modifier.weight(1f)

                    )
                    Text("$ 109.90",
                        modifier = Modifier.weight(2f),
                        fontWeight = FontWeight.Medium,
                        fontSize = 22.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}