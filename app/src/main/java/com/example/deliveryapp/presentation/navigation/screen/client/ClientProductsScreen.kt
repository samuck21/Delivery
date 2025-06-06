package com.example.deliveryapp.presentation.navigation.screen.client

sealed class ClientProductsScreen (val  route: String) {
    object  ProductDetail: ClientProductsScreen("client/products/detail")
}