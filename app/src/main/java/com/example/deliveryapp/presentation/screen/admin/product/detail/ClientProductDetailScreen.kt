package com.example.deliveryapp.presentation.screen.admin.product.detail

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.deliveryapp.presentation.screen.admin.product.detail.componets.ClientProductDetailContent

@Composable

fun ClientProductDetailScreen(){
    Scaffold { paddingValues ->
        ClientProductDetailContent()
    }

}