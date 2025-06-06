package com.example.deliveryapp.presentation.screen.client.order.paid.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ClientOrderPaidListItem(

) {
    ElevatedCard(
        elevation = CardDefaults
            .cardElevation(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .height(180.dp)

    ) {
        Column {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.LightGray)
                    .fillMaxWidth()
            ){
                Text("Orden #1",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center

                )
            }
            Column (
                modifier = Modifier.weight(4f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Fecha de pedido:",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Cliente:",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Direccion de Entrega:",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }


        }
    }
}