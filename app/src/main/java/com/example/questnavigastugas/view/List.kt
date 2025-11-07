package com.example.questnavigastugas.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.questnavigastugas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPeserta(
    OnSubmitBtnClick:()-> Unit
){
    val daftar=listOf(
        Pair(first = stringResource(id=R.string.nama_lengkap), second = "Azira"),
        Pair(first = stringResource(id=R.string.jenis_kelamin), second = "Perempuan"),
        Pair(first = stringResource(id=R.string.status), second = "Lajang"),
        Pair(first = stringResource(id=R.string.alamat), second = "Yogyakarta"),
    )
    Scaffold (modifier = Modifier,
        topBar = { TopAppBar(
            title = { Text(text=stringResource(id=R.string.list),color= Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id=R.color.purple_200))
        )}
    ){ isiRuang->
        Column (modifier = Modifier
            .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween)
        {
            Card (modifier = Modifier
                .padding(all=25.dp)
                .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ))
            {

            }
        }

    }

}