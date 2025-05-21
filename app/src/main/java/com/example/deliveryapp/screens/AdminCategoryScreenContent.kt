package com.example.deliveryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.packInts
import java.nio.file.WatchEvent

@Composable
fun AdminCategoryScreenContent(paddingValues: PaddingValues){

    Column(modifier = Modifier.padding(20.dp)) {
            ElevatedCard(
               elevation = CardDefaults.cardElevation(
                   defaultElevation = 10.dp
               ),
                modifier = Modifier.fillMaxWidth().height(200.dp)

            ) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    ,
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(com.example.deliveryapp.R.drawable.restauran),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "CARNES",
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.White

                    )
                }



            }


    }

}