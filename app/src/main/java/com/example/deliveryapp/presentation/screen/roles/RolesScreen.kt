package com.example.deliveryapp.presentation.screen.roles

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.roles.componets.RolesScreenContent

@Composable

fun RolesScreen(navController: NavHostController){
    Scaffold { paddingValues ->
        RolesScreenContent(paddingValues, navController)
    }

}