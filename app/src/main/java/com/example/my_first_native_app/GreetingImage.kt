package com.example.my_first_native_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.androidparty),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F,
    )
    GreetingImage(
        message = stringResource(R.string.welcome_message),
        from = stringResource(R.string.from_message)
    )
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier, message: String, from: String) {

    Column(
        modifier = modifier.padding(all = 4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = modifier.align(alignment = Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.favicon),
            contentDescription = null,

            )
        Box(modifier = Modifier.padding(top = 30.dp))
        Text(
            text = message,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
            modifier = modifier.align(alignment = Alignment.CenterHorizontally),
        )
        Box(modifier = Modifier.padding(top = 30.dp))
        Text(
            text = from,
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
            color = Color.Black,
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(end = 10.dp),
        )

    }

}
