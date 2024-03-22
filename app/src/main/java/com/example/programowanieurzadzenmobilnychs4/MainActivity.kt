package com.example.programowanieurzadzenmobilnychs4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.programowanieurzadzenmobilnychs4.lab2.MojTekst
import com.example.programowanieurzadzenmobilnychs4.lab3.DiceWithButtonAndImage
import com.example.programowanieurzadzenmobilnychs4.ui.theme.ProgramowanieUrzadzenMobilnychS4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProgramowanieUrzadzenMobilnychS4Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    DiceWithButtonAndImage()
                }
            }
        }
    }
}
