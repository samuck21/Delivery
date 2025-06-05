package com.example.deliveryapp.presentation.screen.admin.order.paid

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.admin.order.paid.components.AdminOrderPaidListContent

@Composable

fun AdminOrderListScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .height(70.dp)
                    .padding(top = 40.dp)

            ) {

                Text(
                    "PAGADO",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clickable{

                        },
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    textAlign = TextAlign.Center

                )
                Text(
                    "DESPACHADO",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clickable{

                        },
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    textAlign = TextAlign.Center

                )
                Text(
                    "EN CAMINO",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clickable{

                        },
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    textAlign = TextAlign.Center

                )
                Text(
                    "ENTREGADO",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clickable{

                        },
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    textAlign = TextAlign.Center

                )




            }
        }
    ) { paddindValues ->
        AdminOrderPaidListContent(paddindValues)

    }

}