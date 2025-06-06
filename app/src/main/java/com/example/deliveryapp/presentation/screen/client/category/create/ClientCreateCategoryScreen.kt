package com.example.deliveryapp.presentation.screen.client.category.create

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.client.category.create.componets.ClientCreateCategoryScreenContent

@Composable
fun ClientCreateCategoryScreen(navController: NavHostController) {
    Scaffold { paddingValues ->
        ClientCreateCategoryScreenContent(paddingValues,navController)
    }

}