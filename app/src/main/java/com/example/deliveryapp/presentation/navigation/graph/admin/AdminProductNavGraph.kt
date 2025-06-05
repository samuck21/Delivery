package com.example.deliveryapp.presentation.navigation.graph.admin

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminProductsScreen
import com.example.deliveryapp.presentation.screen.admin.product.detail.AdminProductDetailScreen

fun NavGraphBuilder. AdminProductNavGraph(navController: NavHostController){

    navigation(
        route= Graph.ADMIN_PRODUCT,
        startDestination = AdminProductsScreen.ProductDetail.route
    ){
        composable  (route = AdminProductsScreen.ProductDetail.route){
            AdminProductDetailScreen(navController)
        }

    }

}