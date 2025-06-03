package com.example.deliveryapp.presentation.screen.admin.home

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.navigation.graph.admin.AdminNavGraph
import com.example.deliveryapp.presentation.screen.admin.home.components.AdminBottomBar

@Composable
fun AdminHomeScreen(navController: NavHostController){
    Scaffold(
         bottomBar = {
             AdminBottomBar(navController)
         }
    ){ paddindValues ->
       AdminNavGraph(navController = navController)
    }

}