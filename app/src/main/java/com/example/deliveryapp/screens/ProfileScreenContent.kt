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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.combine

@Composable
fun ProfileScreenContent(paddingValues: PaddingValues){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box (modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = com.example.deliveryapp.R.drawable.backgroun2),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        ElevatedCard(elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
            modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth().height(500.dp)
        ) {
           Column {
               Text("Informacion del usuario",
                   modifier = Modifier.padding(20.dp),
                   fontWeight = FontWeight.Bold,
                   fontSize = 25.sp

               )
               Row(modifier = Modifier.padding(20.dp)) {
                   Icon(
                       imageVector = Icons.Default.Person,
                       contentDescription = "",
                       modifier = Modifier.size(60.dp)
                   )
                   Column {
                       Text("Samuel Vazquez",
                           modifier = Modifier.padding(2.dp),
                           fontWeight = FontWeight.Bold,
                           fontSize = 18.sp
                       )
                       Text("Nombre del usuario",
                           modifier = Modifier.padding(2.dp),
                           fontWeight = FontWeight.Normal,
                           fontSize = 15.sp,
                           color = Color.Gray
                       )
                   }
               }
               Row(modifier = Modifier.padding(20.dp)) {
                   Icon(
                       imageVector = Icons.Default.Email,
                       contentDescription = "",
                       modifier = Modifier.size(60.dp)
                   )
                   Column {
                       Text("samu@gmail.com",
                           modifier = Modifier.padding(2.dp),
                           fontWeight = FontWeight.Bold,
                           fontSize = 18.sp
                       )
                       Text("Correo Electronico",
                           modifier = Modifier.padding(2.dp),
                           fontWeight = FontWeight.Normal,
                           fontSize = 15.sp,
                           color = Color.Gray
                       )
                   }
               }
               Row(modifier = Modifier.padding(20.dp)) {
                   Icon(
                       imageVector = Icons.Default.Phone,
                       contentDescription = "",
                       modifier = Modifier.size(60.dp)
                   )
                   Column {
                       Text("4549396544",
                           modifier = Modifier.padding(2.dp),
                           fontWeight = FontWeight.Bold,
                           fontSize = 18.sp
                       )
                       Text("Telefono",
                           modifier = Modifier.padding(2.dp),
                           fontWeight = FontWeight.Normal,
                           fontSize = 15.sp,
                           color = Color.Gray
                       )
                   }
               }
               Button(
                   onClick = {

                   },
                   modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 20.dp).fillMaxWidth(),
                   shape = RoundedCornerShape(2.dp),
                   colors = ButtonDefaults.buttonColors(
                       containerColor = Color.Black
                   )
               ) {
                   Row {
                       Icon(
                           imageVector = Icons.Default.ArrowForward,
                           contentDescription = ""
                       )
                       Text("Actualizar Informacion")
                   }
               }
               Button(
                   onClick = {

                   },
                   modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth(),
                   shape = RoundedCornerShape(2.dp),
                   colors = ButtonDefaults.buttonColors(
                       containerColor = Color.Black
                   )
               ) {
                   Row {
                       Icon(
                           imageVector = Icons.Default.Person,
                           contentDescription = ""
                       )
                       Text("Seleccione su rol")
                   }
               }
           }


        }

    }
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter){
        Image(
            painter = painterResource(com.example.deliveryapp.R.drawable.client),
            contentDescription = "",
            modifier = Modifier.padding(top = 40.dp)
        )


    }




}