package com.example.my_first_native_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



    @Composable
    fun LearnTogetherScreen() {
        Column {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentScale = ContentScale.FillWidth,
                contentDescription = null,
            )
            Text(
                text = "Jetpack Compose Tutorial",
                fontSize = 24.sp,
                modifier = Modifier.padding(all = 16.dp),
            )
            Text(
                text = "Jetrack Compose is a modern toolkit for" +
                        "building native Android UI." +
                        "Compose simplifies and accelerates" +
                        "UI development on Android with less code," +
                        "powerful tools, and intuitive Kotlin APIs",
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 16.dp),
            )
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. " +
                        "You call Compose functions to say what elements you want and the Compose compiler does the rest." +
                        " Compose is built around Composable functions. These functions let you define your app\\'s" +
                        "UI programmatically because they let you describe how it should look and provide data dependencies," +
                        " rather than focus on the process of the UI\\'s construction," +
                        " such as initializing an element and then attaching it to a parent." +
                        " To create a Composable function, you add the @Composable annotation to the function name.",
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(all = 16.dp)
            )
        }
    }
