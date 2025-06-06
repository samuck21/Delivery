package com.example.deliveryapp.presentation.navigation.graph.admin

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.category.create.AdminCreateCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.category.update.AdminUpdateCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.product.create.AdminProductCreateScreen
import com.example.deliveryapp.presentation.screen.admin.product.list.AdminProductsScreen
import com.example.deliveryapp.presentation.screen.admin.product.update.AdminProductUpdateScreen


fun NavGraphBuilder.AdminCategoryNavGraph(navController: NavHostController){
    navigation (
        route= Graph.ADMIN_CATEGORY,
        startDestination = AdminCategoryScreen.CategoryCreate.route
    ) {

        composable (route = AdminCategoryScreen.CategoryCreate.route){
            AdminCreateCategoryScreen(navController)
        }
        composable (route = AdminCategoryScreen.CategoryUpdate.route) {
            AdminUpdateCategoryScreen(navController)
        }
        composable (route = AdminCategoryScreen.ProductList.route) {
            AdminProductsScreen(navController)

        }
        composable (route= AdminCategoryScreen.ProductCreate.route) {
            AdminProductCreateScreen(navController)
        }
        composable (route= AdminCategoryScreen.ProductUpdate.route) {
            AdminProductUpdateScreen(navController)
        }


    }


}