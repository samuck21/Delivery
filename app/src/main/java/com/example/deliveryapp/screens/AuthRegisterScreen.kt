package com.example.deliveryapp.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable

fun AuthRegisterScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        AuthRegisterScreenContent(paddingValues, navController)
    }

}