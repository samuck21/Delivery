package com.example.deliveryapp.presentation.navigation.screen.admin

sealed class AdminCategoryScreen (val  route: String) {
    object  CategoryCreate: AdminCategoryScreen("admin/category/create")
    object  CategoryUpdate: AdminCategoryScreen("admin/category/update")
    object  ProductList: AdminCategoryScreen("admin/category/products/list")
    object  ProductCreate: AdminCategoryScreen("admin/category/products/create")
    object  ProductUpdate: AdminCategoryScreen("admin/category/products/update")
}