package com.example.deliveryapp.presentation.screen.admin.category.list

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.deliveryapp.presentation.screen.admin.category.list.componets.AdminCategoryScreenContent

@Composable

fun AdminCategoryScreen(){
    Scaffold { paddingValues ->
        AdminCategoryScreenContent(paddingValues)
    }

}