package com.example.deliveryapp.presentation.navigation.graph.client

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.deliveryapp.presentation.navigation.Graph
import com.example.deliveryapp.presentation.navigation.graph.admin.AdminCategoryNavGraph
import com.example.deliveryapp.presentation.navigation.graph.admin.AdminProductNavGraph
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminScreen
import com.example.deliveryapp.presentation.navigation.screen.client.ClientScreen
import com.example.deliveryapp.presentation.screen.admin.category.list.AdminCategoryScreen
import com.example.deliveryapp.presentation.screen.admin.order.paid.AdminOrderListScreen
import com.example.deliveryapp.presentation.screen.client.category.list.ClientCategoryScreen
import com.example.deliveryapp.presentation.screen.client.order.paid.ClientOrderListScreen
import com.example.deliveryapp.presentation.screen.profile.ProfileScreen

@Composable
fun ClientNavGraph(navController: NavHostController){
    NavHost (
        navController = navController,
        route = Graph.CLIENT,
        startDestination = ClientScreen.CategoryList.route
    ){
        composable (route = ClientScreen.CategoryList.route){
            ClientCategoryScreen(navController)
        }
        composable (route = ClientScreen.OrderList.route){
            ClientOrderListScreen(navController)
        }
        composable (route = ClientScreen.Profile.route) {
            ProfileScreen(navController)
        }
        ClientCategoryNavGraph(navController)
        ClientProductNavGraph(navController)
        ClientShoppingBagNavGraph(navController)

    }
}