package com.example.deliveryapp.presentation.screen.login

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.login.componets.AuthLoginScreenContent

@Composable

fun AuthLoginScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        AuthLoginScreenContent(paddingValues, navController)
    }

}