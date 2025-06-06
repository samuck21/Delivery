package com.example.deliveryapp.presentation.screen.admin.category.update

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.admin.category.update.componets.AdminUpdateCategoryContent


@Composable
fun AdminUpdateCategoryScreen(navController: NavHostController) {
    Scaffold(

    ){ paddingValues ->
        AdminUpdateCategoryContent(paddingValues,navController)
    }
}