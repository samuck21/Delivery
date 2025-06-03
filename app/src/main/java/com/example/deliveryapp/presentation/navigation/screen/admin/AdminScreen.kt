package com.example.deliveryapp.presentation.navigation.screen.admin

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AdminScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object  CategoryList: AdminScreen(
        route = "admin/category/list",
        title = "Categories",
        icon = Icons.Default.List
    )
    object  OrderList: AdminScreen(
        route = "admin/category/list",
        title = "Categories",
        icon = Icons.Default.Info
    )
    object  Profile: AdminScreen(
        route = "admin/category/list",
        title = "Categories",
        icon = Icons.Default.Person
    )

}