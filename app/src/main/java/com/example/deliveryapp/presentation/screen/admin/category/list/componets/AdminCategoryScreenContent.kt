package com.example.deliveryapp.presentation.screen.admin.category.list.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.navigation.NavHostController
import com.example.deliveryapp.R
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminCategoryScreen

@Composable
fun AdminCategoryScreenContent(paddingValues: PaddingValues,navController:NavHostController) {

    Column(modifier = Modifier.padding(paddingValues)) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(top = 10.dp, start = 20.dp, end = 20.dp)
                .clickable{
                    navController.navigate(route = AdminCategoryScreen.ProductList.route)

                }

        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.restauran),
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