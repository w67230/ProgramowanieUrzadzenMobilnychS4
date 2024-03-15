package com.example.programowanieurzadzenmobilnychs4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.programowanieurzadzenmobilnychs4.ui.theme.ProgramowanieUrzadzenMobilnychS4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProgramowanieUrzadzenMobilnychS4Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MojTekst(message = "Najlepszego Ukasz", sMessage = "Tak to ja")
                }
            }
        }
    }
}

@Composable
fun MojTekst(message: String, sMessage: String, wlaczKolorki: Boolean = false, modifier: Modifier = Modifier){
    Column{
        var fColor = Color.Unspecified
        var sColor = Color.Unspecified
        if(wlaczKolorki){
            fColor = Color.Blue
            sColor = Color.DarkGray
        }
        Text(text = message, fontSize = 56.sp, lineHeight = 70.sp, textAlign = TextAlign.Center, color = fColor)
        Text(text = sMessage, fontSize = 32.sp, modifier = Modifier.align(Alignment.End), color = sColor)

    }

}

@Composable
fun MojTekstImage(message: String, sMessage: String, wlaczKolorki: Boolean = false, modifier: Modifier = Modifier){
    Box(modifier) {
        val image = painterResource(R.drawable.androidparty)
        Image(painter = image,
            contentDescription = null,
            modifier = modifier.alpha(0.5F))

        var fColor = Color.Unspecified
        var sColor = Color.Unspecified
        if(wlaczKolorki){
            fColor = Color.Blue
            sColor = Color.DarkGray
        }
        Text(text = message,
            fontSize = 56.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.align(Alignment.Center),
            color = fColor)

        Text(text = sMessage,
            fontSize = 32.sp,
            modifier = Modifier.align(Alignment.BottomEnd),
            color = sColor)

    }

}



@Preview(showBackground = true)
@Composable
fun MojTekstPreview() {
    ProgramowanieUrzadzenMobilnychS4Theme {
        MojTekstImage("Najlepszego Ukasz", "Tak to ja", false)
    }
}