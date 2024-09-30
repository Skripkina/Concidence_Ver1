package com.example.coincidence_ver1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.coincidence_ver1.ui.theme.Coincidence_Ver1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            StartPage(
            )

        }
    }
}


@Composable
fun StartPage() {
    Column (
            verticalArrangement = Arrangement.SpaceEvenly
    ){
        val imageModifier = Modifier
            .width(200.dp)
            .height(350.dp)
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize(0.5f),
            verticalAlignment = Alignment.CenterVertically

        ) {
                val image_blue: Painter = painterResource(id = R.drawable.blue)
                Image(painter = image_blue,contentDescription = "blue",
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier)

                val image_pink: Painter = painterResource(id = R.drawable.pink)
                Image(painter = image_pink,contentDescription = "blue",
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val image_yellow: Painter = painterResource(id = R.drawable.yellow)
            Image(painter = image_yellow,contentDescription = "yellow",
                contentScale = ContentScale.Crop,
                modifier = imageModifier)

            val image_green: Painter = painterResource(id = R.drawable.green)
            Image(painter = image_green,contentDescription = "green",
                contentScale = ContentScale.Crop,
                modifier = imageModifier)
        }
    }
}

