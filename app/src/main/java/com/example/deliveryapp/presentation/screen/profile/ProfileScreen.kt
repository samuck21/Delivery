package com.example.deliveryapp.presentation.screen.profile

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.deliveryapp.presentation.screen.profile.componets.ProfileScreenContent

@Composable

fun ProfileScreen(navController: NavHostController){
    Scaffold { paddingValues ->
      ProfileScreenContent(paddingValues,navController)

        //Text("Profile")
    }

}