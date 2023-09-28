package com.example.cartaodeaniversario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.sp
import com.example.cartaodeaniversario.ui.theme.CartaoDeAniversarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeAniversarioTheme {
                }
            }
        }
    }

@Preview(showSystemUi = true)
@Composable
fun TelaCartaoPresente(){
        Image(
            painter = painterResource(id = R.drawable.fn) ,
            contentDescription =null,
            contentScale = ContentScale.FillBounds
        )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
     Text(
         text = "Feliz aniversário!",
         fontSize = 50.sp,
         fontWeight = FontWeight.Black,
         color = Color.Green,
         textAlign = TextAlign.Center
     )

     Text(
         text = "De: Jumper",
         fontSize = 45.sp,
         color = Color.White,
         fontWeight = FontWeight.Black
     )

     Text(
         text = "Para: Shibayan",
         fontSize = 45.sp,
         color = Color.Red,
         fontWeight = FontWeight.Black

     )
    }
}