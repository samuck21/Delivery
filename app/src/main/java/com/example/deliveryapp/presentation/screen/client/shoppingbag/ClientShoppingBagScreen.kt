package com.example.deliveryapp.presentation.screen.client.shoppingbag

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.navigation.screen.client.ClientShoppingBagScreen
import com.example.deliveryapp.presentation.screen.client.shoppingbag.contents.ClientShoppingBagContent

@Composable
fun ClientShoppingBagScreen(navController: NavHostController) {
    Scaffold(
        topBar = {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .height(80.dp)
            ) {
                Row(modifier = Modifier.padding(top = 40.dp)) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier
                            .size(30.dp)
                            .weight(1f)
                            .clickable {
                                navController.popBackStack()
                            }
                    )
                    Text(
                        "Carrito de compras",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier
                            .weight(3f)
                            .padding(start = 20.dp)
                    )


                }

            }
        },
        bottomBar = {
            Column(
                modifier = Modifier.height(200.dp)
            ) {
                Divider(thickness = 3.dp, modifier = Modifier.fillMaxWidth())
                Box(modifier = Modifier
                    .fillMaxSize()
                    .shadow(elevation = 4.dp, clip = false)

                ) {
                    Column(Modifier.padding(20.dp)) {
                        Row {
                            Text("Productos 1",
                                modifier = Modifier.weight(1f).fillMaxWidth()
                            )
                            Text("$ 400",
                                modifier = Modifier.weight(1f).fillMaxWidth(),
                                textAlign = TextAlign.End
                            )
                        }
                        Row {
                            Text("Envio",
                                modifier = Modifier.weight(1f).fillMaxWidth()
                            )
                            Text("$ 40",
                                modifier = Modifier.weight(1f).fillMaxWidth(),
                                textAlign = TextAlign.End
                            )
                        }

                            Text("Ingresa código de cupón",
                                modifier = Modifier,
                                color = Color.Blue

                                )

                        Row {
                            Text("Total",
                                modifier = Modifier.weight(1f).fillMaxWidth()

                            )
                            Text("$ 440",
                                modifier = Modifier.weight(1f).fillMaxWidth(),
                                textAlign = TextAlign.End
                            )
                        }



                        Button(
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color.Blue,
                                contentColor = Color.White,
                            ),
                            onClick = {
                                navController.navigate(route = ClientShoppingBagScreen.Address.route)
                            },
                            modifier = Modifier
                                .height(50.dp)
                                .fillMaxWidth()
                        ) {
                            Text("Continuar con la compra")
                        }


                    }

                }

            }


        }
    ) { paddingValues ->
        ClientShoppingBagContent(paddingValues, navController)
    }

}