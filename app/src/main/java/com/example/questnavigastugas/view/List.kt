package com.example.questnavigastugas.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
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

}