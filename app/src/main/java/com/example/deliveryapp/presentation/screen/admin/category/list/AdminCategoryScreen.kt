package com.example.deliveryapp.presentation.screen.admin.category.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.screen.admin.category.list.componets.AdminCategoryScreenContent


@Composable

fun AdminCategoryScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .height(80.dp)
            ) {
                Row (modifier = Modifier.padding(top = 40.dp)){
                    Text("CATEGORIAS",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.weight(3f)
                            .padding(start = 20.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(30.dp).weight(1f)
                    )

                }

            }
        },
                floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.DarkGray,
                modifier = Modifier.padding(bottom = 60.dp),
                onClick = {
              navController.navigate(route = Graph.ADMIN_CATEGORY)
                }
            ) {
                Icon(imageVector = Icons.Default.Add,
                    contentDescription = "",
                    tint = Color.White,
                )
            }
        }

    ) { paddingValues ->
        AdminCategoryScreenContent(paddingValues, navController)
    }

}