package com.example.deliveryapp.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable

fun AuthLoginScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        AuthLoginScreenContent(paddingValues,navController)
    }

}