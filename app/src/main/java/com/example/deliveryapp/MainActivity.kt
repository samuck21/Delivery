package com.example.deliveryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.deliveryapp.screens.AdminCategoryScreen
import com.example.deliveryapp.screens.AdminCreateCategoryScreen
import com.example.deliveryapp.screens.AdminProductsScreen
import com.example.deliveryapp.screens.AuthLoginScreen
import com.example.deliveryapp.screens.AuthRegisterScreen
import com.example.deliveryapp.screens.ClientProductDetailScreen
import com.example.deliveryapp.screens.ProfileScreen
import com.example.deliveryapp.screens.RolesScreen
import com.example.deliveryapp.ui.theme.DeliveryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeliveryAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ClientProductDetailScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeliveryAppTheme {
        Greeting("Android")
    }
}