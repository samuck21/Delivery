package com.example.deliveryapp.presentation.screen.client.home.components


import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminScreen
import com.example.deliveryapp.presentation.navigation.screen.client.ClientScreen

@Composable
fun ClientBottomBar(navController: NavHostController){
    val screens = listOf(
        // AdminScreen.ProductList,
        ClientScreen.CategoryList,
        ClientScreen.Profile,
        ClientScreen.OrderList
    )
    val navBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackEntry?.destination
    val  bottomBarDestination= screens.any{
        it.route == currentDestination?.route
    }
    if(bottomBarDestination){
        BottomNavigation (){
            screens.forEach { screen->
                ClientBottomBarItem(
                    screen=screen,
                    currenDestination = currentDestination,
                    navController = navController

                )
            }
        }
    }

}