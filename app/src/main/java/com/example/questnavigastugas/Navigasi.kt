package com.example.questnavigastugas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Beranda,
    Formulir,
    List
}
@Composable
fun HomeApp(
    navController: NavHostController= rememberNavController(),
    modifier: Modifier
){}