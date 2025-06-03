package com.example.deliveryapp.presentation.screen.admin.product.list

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.deliveryapp.presentation.screen.admin.product.list.componets.AdminProductsScreenContent

@Composable
fun AdminProductsScreen(){
    Scaffold { paddingValues ->
        AdminProductsScreenContent(paddingValues)
    }

}