package com.example.deliveryapp.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.AuthScreen
import com.example.deliveryapp.screens.AuthLoginScreen
import com.example.deliveryapp.screens.AuthRegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {

    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route) {
            AuthLoginScreen(navController = navController)
        }
        composable(route = AuthScreen.Register.route) {
            AuthRegisterScreen(navController = navController)
        }
    }

}