package com.example.deliveryapp.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.RolesScreen
import com.example.deliveryapp.presentation.screen.admin.home.AdminHomeScreen
import com.example.deliveryapp.presentation.screen.client.home.ClientHomeScreen
import com.example.deliveryapp.presentation.screen.roles.RolesScreen

fun NavGraphBuilder.RolesNavGraph(navController: NavHostController) {

    navigation(
        route = Graph.ROLES,
        startDestination = RolesScreen.Roles.route
    ){
        composable(route = RolesScreen.Roles.route) {
            RolesScreen(navController)
        }
        composable (route = Graph.ADMIN) {
            AdminHomeScreen()
        }
        composable (route = Graph.CLIENT){
            ClientHomeScreen()
        }
    }

}