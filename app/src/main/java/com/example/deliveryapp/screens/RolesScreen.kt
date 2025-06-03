package com.example.deliveryapp.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable

fun RolesScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        RolesScreenContent(paddingValues,navController)
    }

}