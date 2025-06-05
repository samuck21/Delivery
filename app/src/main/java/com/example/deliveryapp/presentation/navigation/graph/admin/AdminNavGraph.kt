package com.example.deliveryapp.presentation.navigation.graph.admin

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminScreen
import com.example.deliveryapp.presentation.screen.admin.category.list.AdminCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.order.paid.AdminOrderListScreen
import com.example.deliveryapp.presentation.screen.profile.ProfileScreen

@Composable
fun AdminNavGraph(navController: NavHostController){
    NavHost (
        navController = navController,
        route = Graph.ADMIN,
        startDestination = AdminScreen.CategoryList.route
    ){
        composable (route = AdminScreen.CategoryList.route){
            AdminCategoryScreen(navController)
        }
        composable (route = AdminScreen.OrderList.route){
            AdminOrderListScreen(navController)
        }
        composable (route = AdminScreen.Profile.route) {
            ProfileScreen(navController)
        }
        AdminCategoryNavGraph(navController)
        AdminProductNavGraph(navController)

    }
}