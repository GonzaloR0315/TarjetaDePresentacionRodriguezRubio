package com.example.tarjetadepresentacionrodriguezrubio

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacionrodriguezrubio.ui.theme.TarjetaDePresentacionRodriguezRubioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionRodriguezRubioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    GreetingImage(
                        getString(R.string.nombre) + ": ",
                        getString(R.string.daniel),
                        getString(R.string.gonzalo),
                        getString(R.string.cargo),
                        getString(R.string.delega),
                        getString(R.string.subDelega),
                        getString(R.string.curso),
                        getString(R.string.wem),
                    )
                }
            }
        }
    }
}
@Composable
fun GreetingImage(message: String, from: String, last: String,
                  cargo: String,delega: String,subDelega: String,
                  curso: String,wem: String,modifier: Modifier = Modifier) {
    //Step 3 create a box to overlap image and texts
    Box (modifier = Modifier
        .background(color = Color(red = 158 , green = 157 , blue = 153 ))
    ){

        GreetingText(
            message = message,
            from = from,
            last = last,
            cargo = cargo,
            delega = delega,
            subDelega = subDelega,
            curso = curso,
            wem = wem,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )

    }
}



@Composable
fun GreetingText(message: String, from: String, last: String,
                 cargo: String,delega: String,subDelega: String,
                 curso: String,wem: String,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
    ) {
        Row{
            val image = painterResource(R.drawable.presentacion)

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Inside,
                modifier = Modifier.aspectRatio(1.7f)

            )
        }
        Row {
            Column {
                val image2 = painterResource(R.drawable.icononombre)
                Image(
                    painter = image2,
                    contentDescription = null,
                    /*contentScale = ContentScale.Inside,
                    modifier = Modifier.aspectRatio(1.7f)*/
                )
                Row {


                    Text(
                        text = message,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 50.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )
                    Text(
                        text = last,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }
                Row {
                    Text(
                        text = cargo,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 50.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )
                    Text(
                        text = delega,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }
                Row {
                    Text(
                        text = curso,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 50.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )
                    Text(
                        text = wem,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }
            }
        }
        Row {
            Column {
                val image2 = painterResource(R.drawable.icononombre)
                Image(
                    painter = image2,
                    contentDescription = null,
                    /*contentScale = ContentScale.Inside,
                    modifier = Modifier.aspectRatio(1.7f)*/
                )
                Row {


                    Text(
                        text = message,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 50.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )
                    Text(
                        text = from,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }
                Row {
                    Text(
                        text = cargo,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 50.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )
                    Text(
                        text = subDelega,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }
                Row {
                    Text(
                        text = curso,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        lineHeight = 50.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                    )
                    Text(
                        text = wem,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaDePresentacionRodriguezRubioTheme {
      //  GreetingImage("Nombres" + ": ", "Daniel Rodriguez" , "Gonzalo Rubio")
    }
}