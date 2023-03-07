package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                tripRoomScreen(

                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun tripRoomScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column() {
            Row(
                Modifier
                    .fillMaxSize()
                    .height(48.dp),
                horizontalArrangement = Arrangement.End
                ) {
            Card(modifier = Modifier
                .width(96.dp)
                .height(48.dp),

                shape = RoundedCornerShape(
                    bottomStart = 24.dp
                ),
                backgroundColor = Color(
                    207,
                    6,
                    240
                )

            ) {}
            }
            Column() {
                Text(
                    text = stringResource(id = R.string.app_name),
                    fontSize = 32.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 4.sp

                    )

            }
            Column() {

            }
            Column() {

            }
            Column() {

            }
        }
    }
}