package com.example.deliveryapp.presentation.screen.client.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.navigation.screen.admin.AdminScreen
import com.example.deliveryapp.presentation.navigation.screen.client.ClientScreen

@Composable
fun RowScope.ClientBottomBarItem(
    screen: ClientScreen,
    currenDestination: NavDestination?,
    navController: NavHostController
){
    BottomNavigationItem(
        label = {
            androidx.compose.material.Text(text = screen.title)
        },
        icon = {
            Icon(imageVector = screen.icon, contentDescription = "")
        },
        selected = currenDestination?.hierarchy?.any{
            it.route == screen.route
        } ==true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(route = screen.route){
                popUpTo(navController.graph.findStartDestination().id)
            }
        },
        modifier = Modifier.background(Color.Black)


    )

}