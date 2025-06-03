package com.example.deliveryapp.presentation.screen.profile

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.deliveryapp.presentation.screen.profile.componets.ProfileScreenContent

@Composable

fun ProfileScreen(){
    Scaffold { paddingValues ->
        ProfileScreenContent(paddingValues)
    }

}