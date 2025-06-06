package com.example.deliveryapp.presentation.navigation.screen.client

sealed class ClientShoppingBagScreen (val  route: String) {
    object  ShoppingBag: ClientShoppingBagScreen("client/shoppingbag")
    object  Address: ClientShoppingBagScreen("client/shoppingbag/address")
}