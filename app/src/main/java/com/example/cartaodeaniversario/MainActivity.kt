package com.example.cartaodeaniversario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodeaniversario.ui.theme.CartaoDeAniversarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeAniversarioTheme {
                TelaCartaoPresente()
                }
            }
        }
    }

@Preview(showSystemUi = true)
@Composable
fun TelaCartaoPresente(){
    Box {
        Image(
            painter = painterResource(id = R.drawable.fn),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Feliz aniversário!",
                fontSize = 50.sp,
                fontWeight = FontWeight.Black,
                color = Color.Green,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 150.dp),
                lineHeight = 100.sp
            )
            Dedicatoria(text = "De: Jumper", Color.White)
            Dedicatoria(text = "Para: Shibayan", Color.Red)
        }
    }
}

@Composable
fun Dedicatoria (text: String,color: Color){

    Text(
        text = text,
        fontSize = 35.sp,
        color = color,
        fontWeight = FontWeight.Black,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 20.dp)

    )

}