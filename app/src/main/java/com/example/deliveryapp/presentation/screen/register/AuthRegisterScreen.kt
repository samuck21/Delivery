package com.example.deliveryapp.presentation.screen.register

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.register.componets.AuthRegisterScreenContent

@Composable

fun AuthRegisterScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        AuthRegisterScreenContent(paddingValues, navController)
    }

}