package com.example.deliveryapp.presentation.navigation.screen.admin

sealed class AdminProductsScreen (val  route: String) {
    object  ProductDetail: AdminProductsScreen("admin/products/detail")
}