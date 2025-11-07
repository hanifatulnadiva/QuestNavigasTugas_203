package com.example.questnavigastugas.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormulirPendaftaran(
    OnSubmitBtnClick:()-> Unit
){
//    var textNama by remember { mutableStateOf(value="") }
//    var textJK by remember { mutableStateOf(value="") }
//    var textStatus by remember { mutableStateOf(value="") }
//    var textAlamat by remember { mutableStateOf(value="") }
//
//    var Nama by remember { mutableStateOf(value = "") }
//    var JK by remember { mutableStateOf(value = "") }
//    var Status by remember { mutableStateOf(value = "") }
//    var Alamat by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-Laki", "Perempuan")
    val status_perkawinan: List<String> = listOf("Janda", "Lajang", "Duda")

    Column  (modifier= Modifier
        .fillMaxSize()
        .background(color=Color.White)
    ){
        Row (modifier= Modifier
            .padding(top = 40.dp)
            .fillMaxWidth()
            .height(height = 100.dp)
            .background(color = colorResource(id = R.color.purple_200)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text= stringResource(id = R.string.formulir),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White
            )
        }
        Box(modifier= Modifier
            .fillMaxSize( )
            .background(color = colorResource(id=R.color.background))
        ){
            Card(
                modifier = Modifier
                    .padding(all = 25.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id=R.color.white)
                )
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(text = stringResource(id=R.string.nama_lengkap))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {  },
                        label = { Text("Isi nama lengkap") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(text = stringResource(id=R.string.jenis_kelamin))
                    Column {
                        gender.forEach { item ->
                            Row (modifier= Modifier .selectable(
                                selected =false,
                                onClick = {}
                            ), verticalAlignment = Alignment.CenterVertically){
                                RadioButton(
                                    selected = false,
                                    onClick = {}
                                )
                                Text(text = item)
                            }
                        }
                    }
                    Text(text = stringResource(id=R.string.status))
                    Column {
                        status_perkawinan.forEach { item->
                            Row(modifier= Modifier
                                .selectable(
                                    selected = false,
                                    onClick = {}
                                ), verticalAlignment = Alignment.CenterVertically){
                                RadioButton(
                                    selected=false,
                                    onClick = {}
                                )
                                Text(text = item)
                            }

                        }
                    }
                    Text(text=stringResource(id=R.string.alamat))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Alamat") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(
                        modifier= Modifier .fillMaxWidth(fraction = 1f),
                        //enabled = textAlamat.isNotEmpty(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id=R.color.purple_500 )
                        ),
                        onClick = OnSubmitBtnClick
                    ){
                        Text(text=stringResource(id=R.string.submit))
                    }
                }

            }
        }

    }

}

