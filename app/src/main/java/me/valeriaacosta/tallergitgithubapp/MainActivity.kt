package me.valeriaacosta.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.valeriaacosta.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGitGithubAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaEjercicio2(){
    Column(
        modifier = Modifier
            .padding(all = 15.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.foto_perfil1),
            "foto_perfil1",
            modifier = Modifier
            .size(128.dp)
            .clip(CircleShape)
        )
        Text(
            text = "Valeria Acosta",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier

                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = "Ing de Sistemas Jr.",
            fontSize = 16.sp,
            color = Color.Blue
        )
        HorizontalDivider(
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )

        Text(
            text = "Edad"
        )
        Text(
            text = "19 años"
        )
        Text(
            text = "correo"
        )
        Text(
            text = "[vacosta676@unab.edu.co]"
        )
        Text(
            text = "ciudad"
        )
        Text(
            text = "Cucuta, Colombia"
        )
        HorizontalDivider(
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = "SOBRE MI MATERIA FAVORITA"
        )
        Text(
            text = "Mi materia favorita son las ecuaciones diferenciales porque me permite comprender y resolver problemas relacionados con cambios y fenómenos de la vida real."
        )
    }
}
