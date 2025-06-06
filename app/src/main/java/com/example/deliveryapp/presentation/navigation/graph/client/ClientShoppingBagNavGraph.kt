package com.example.deliveryapp.presentation.navigation.graph.client

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.client.ClientShoppingBagScreen
import com.example.deliveryapp.presentation.screen.client.address.ClientAddressScreen

fun NavGraphBuilder. ClientShoppingBagNavGraph(navController: NavHostController){

    navigation(
        route= Graph.SHOPPING_BAG,
        startDestination = ClientShoppingBagScreen.ShoppingBag.route
    ){
        composable  (route = ClientShoppingBagScreen.ShoppingBag.route){
             com.example.deliveryapp.presentation.screen.client.shoppingbag.ClientShoppingBagScreen(navController)
        }
        composable  (route = ClientShoppingBagScreen.Address.route){
            ClientAddressScreen(navController)
        }


    }

}