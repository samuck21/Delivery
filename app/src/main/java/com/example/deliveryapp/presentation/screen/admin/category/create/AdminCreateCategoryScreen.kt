package com.example.deliveryapp.presentation.screen.admin.category.create

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.admin.category.create.componets.AdminCreateCategoryScreenContent


@Composable
fun AdminCreateCategoryScreen(navController: NavHostController) {
    Scaffold { paddingValues ->
        AdminCreateCategoryScreenContent(paddingValues,navController)
    }

}