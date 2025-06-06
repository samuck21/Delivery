package com.example.deliveryapp.presentation.screen.client.category.update

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.client.category.update.componets.ClientUpdateCategoryContent

@Composable
fun ClientUpdateCategoryScreen(navController: NavHostController) {
    Scaffold(

    ){ paddingValues ->
        ClientUpdateCategoryContent(paddingValues,navController)
    }
}