package com.example.deliveryapp.presentation.screen.admin.home.components


import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminScreen

@Composable

fun AdminBottomBar(navController: NavHostController){
  val screens = listOf(
      AdminScreen.CategoryList,
      AdminScreen.Profile,
      AdminScreen.OrderList
  )
    val navBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackEntry?.destination
    val bottomBarDestination = screens.any{
        it.route == currentDestination?.route
    }
    if(bottomBarDestination){
        BottomNavigation {
            screens.forEach { screen ->
                AdminBottomBarItem(
                    screen=screen,
                    currentDestination = currentDestination,
                    navController = navController

                )

            }
        }


    }

}