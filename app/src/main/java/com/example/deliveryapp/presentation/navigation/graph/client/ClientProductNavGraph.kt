package com.example.deliveryapp.presentation.navigation.graph.client

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminProductsScreen
import com.example.deliveryapp.presentation.navigation.screen.client.ClientProductsScreen
import com.example.deliveryapp.presentation.screen.admin.product.detail.AdminProductDetailScreen
import com.example.deliveryapp.presentation.screen.client.product.detail.ClientProductDetailScreen

fun NavGraphBuilder. ClientProductNavGraph(navController: NavHostController){

    navigation(
        route= Graph.CLIENT_PRODUCT,
        startDestination = ClientProductsScreen.ProductDetail.route
    ){
        composable  (route = ClientProductsScreen.ProductDetail.route){
            ClientProductDetailScreen(navController)
        }

    }

}