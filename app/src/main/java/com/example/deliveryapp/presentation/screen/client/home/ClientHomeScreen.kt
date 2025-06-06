package com.example.deliveryapp.presentation.screen.client.home

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.deliveryapp.presentation.navigation.graph.client.ClientNavGraph
import com.example.deliveryapp.presentation.screen.client.home.components.ClientBottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ClientHomeScreen(navController: NavHostController = rememberNavController()){
    Scaffold (
        bottomBar = {
            ClientBottomBar(navController = navController)
        },
    ) {  paddingValues ->
        ClientNavGraph(navController = navController)

    }

}