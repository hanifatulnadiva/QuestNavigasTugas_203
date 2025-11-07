package com.example.questnavigastugas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas.view.welcome
import com.example.questnavigastugas.view.DaftarPeserta
import com.example.questnavigastugas.view.FormulirPendaftaran
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

        ){
            composable (route= Navigasi.Beranda.name)
            {
                welcome(
                    OnSubmitBtnClick={
                        navController.navigate(route=Navigasi.List.name)
                    }
                )
            }
            composable (route=Navigasi.List.name)
            {
                DaftarPeserta(
                    onBackToBerandaClick={cancelAndBackToBeranda(navController)},
                    OnBtnToFormulirClick = {
                        navController.navigate(route= Navigasi.Formulir.name)
                    }
                )
            }
            composable (route= Navigasi.Formulir.name)
            {
                FormulirPendaftaran(
                    onBackToBtnClick={cancelAndBackToList(navController)}

                )
            }

        }
    }
}
private fun cancelAndBackToBeranda(
    navController: NavController
){
    navController.popBackStack(route= Navigasi.Beranda.name, inclusive = false)
}
private fun cancelAndBackToList(
    navController: NavController
){
    navController.popBackStack(route = Navigasi.List.name, inclusive = false)
}