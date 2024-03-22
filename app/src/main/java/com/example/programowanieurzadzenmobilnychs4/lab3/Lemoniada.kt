package com.example.programowanieurzadzenmobilnychs4.lab3


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp
import com.example.programowanieurzadzenmobilnychs4.R

@Composable
fun LemonApp(){
    var krok by remember {
        mutableStateOf(1)
    }

    when(krok){
        1 -> {
            Column {
                Text(text = R.string.powitanie, fontSize = 24.sp)
            }
        };
        2 -> {

        };
        else -> {

        }
    }
}