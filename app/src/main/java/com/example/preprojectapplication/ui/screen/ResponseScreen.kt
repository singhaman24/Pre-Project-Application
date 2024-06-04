package com.example.preprojectapplication.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat.Columns
import java.net.ResponseCache

@Composable
fun ResponseScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement =Arrangement.Center,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()


    ) {
            Text(
                text = "Response will be collected here",
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(600.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )

            )
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Cyan)
            ) {
            Text(text = "Back to main",
                color = Color.Black
                )

        }

    }
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewResponse(){
    ResponseScreen()
}