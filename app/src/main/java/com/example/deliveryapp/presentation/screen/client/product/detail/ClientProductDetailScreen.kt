package com.example.deliveryapp.presentation.screen.client.product.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.client.product.detail.componets.ClientProductDetailContent

@Composable

fun ClientProductDetailScreen(navController: NavHostController){
    Scaffold (
        topBar = {
            Row (modifier = Modifier.padding(top = 30.dp)){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp)
                        .weight(1f)
                        .clickable{
                            navController.popBackStack()
                        },
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.weight(3f))
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp)
                        .weight(1f),
                    tint = Color.Red
                )
            }
        },
        bottomBar = {
            Button(
                onClick = {

                },
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                )
            ) {
                Text("Agregar Poducto")
            }

        }

    ) { paddingValues ->
        ClientProductDetailContent()
    }

}