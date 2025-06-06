package com.example.deliveryapp.presentation.navigation.screen.client

sealed class ClientCategoryScreen (val  route: String) {
    object  CategoryCreate: ClientCategoryScreen("client/category/create")
    object  CategoryUpdate: ClientCategoryScreen("client/category/update")
    object  ProductList: ClientCategoryScreen("client/category/products/list")
    object  ProductCreate: ClientCategoryScreen("client/category/products/create")
    object  ProductUpdate: ClientCategoryScreen("client/category/products/update")
}