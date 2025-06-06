package com.example.deliveryapp.presentation.screen.client.address

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.client.address.componets.ClientAddressContent

@Composable
fun ClientAddressScreen(navController: NavHostController){
    Scaffold (

    ) { paddingValues ->
        ClientAddressContent(paddingValues,navController)

    }

}