package com.example.deliveryapp.presentation.navigation.graph.client

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminCategoryScreen
import com.example.deliveryapp.presentation.navigation.screen.client.ClientCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.category.create.AdminCreateCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.category.update.AdminUpdateCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.product.create.AdminProductCreateScreen
import com.example.deliveryapp.presentation.screen.admin.product.list.AdminProductsScreen
import com.example.deliveryapp.presentation.screen.admin.product.update.AdminProductUpdateScreen
import com.example.deliveryapp.presentation.screen.client.category.create.ClientCreateCategoryScreen
import com.example.deliveryapp.presentation.screen.client.category.list.ClientCategoryScreen
import com.example.deliveryapp.presentation.screen.client.category.update.ClientUpdateCategoryScreen
import com.example.deliveryapp.presentation.screen.client.product.create.ClientProductCreateScreen
import com.example.deliveryapp.presentation.screen.client.product.list.ClientProductsScreen
import com.example.deliveryapp.presentation.screen.client.product.update.ClientProductUpdateScreen

fun NavGraphBuilder.ClientCategoryNavGraph(navController: NavHostController){
    navigation (
        route= Graph.CLIENT_CATEGORY,
        startDestination = ClientCategoryScreen.CategoryCreate.route
    ) {

        composable (route = ClientCategoryScreen.CategoryCreate.route){
            ClientCreateCategoryScreen(navController)
        }
        composable (route = ClientCategoryScreen.CategoryUpdate.route) {
            ClientUpdateCategoryScreen(navController)
        }
        composable (route = ClientCategoryScreen.ProductList.route) {
            ClientProductsScreen(navController)

        }
        composable (route= ClientCategoryScreen.ProductCreate.route) {
            ClientProductCreateScreen(navController)
        }
        composable (route= ClientCategoryScreen.ProductUpdate.route) {
            ClientProductUpdateScreen(navController)
        }


    }


}