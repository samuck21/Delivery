package com.example.deliveryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.AuthScreen
import com.example.deliveryapp.presentation.navigation.screen.RolesScreen

@Composable
fun AuthLoginScreenContent(paddingValues: PaddingValues,navController: NavHostController){
  var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box (modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = com.example.deliveryapp.R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
        Card (Modifier.padding(20.dp).height(440.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )

        ) {
            Column(modifier = Modifier.padding(paddingValues)){
                Text(
                    text = "Login",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(20.dp)
                )
                Text(
                    "Ingrese su correo y contraseña",
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )

                OutlinedTextField(
                    value = email,
                    onValueChange = {email= it},
                    label = {Text("Email")},
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth()
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = {password= it},
                    label = {Text("Password")},
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp).fillMaxWidth()
                )
                Button(
                    shape = RoundedCornerShape(4.dp),
                    onClick = {
                        navController.navigate(route = RolesScreen.Roles.route)

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Green
                    ) ,
                    modifier = Modifier.padding(20.dp).fillMaxWidth()
                ) {
                    Text("INICIAR SESION")
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp)
                        .clickable{
                            navController.navigate(route = AuthScreen.Register.route)

                        },
                    contentAlignment = Alignment.Center
                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier.size(50.dp)
                        )
                        Text("Registarte aqui")
                    }


                }



            }

        }
    }




}