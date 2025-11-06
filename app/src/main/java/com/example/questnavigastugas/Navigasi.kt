package com.example.questnavigastugas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
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
){
    Scaffold {isiRuang->
        NavHost(
            navController=navController,
            startDestination = Navigasi.Beranda.name,

            modifier=Modifier
                .padding(paddingValues = isiRuang)

        )
    }
}