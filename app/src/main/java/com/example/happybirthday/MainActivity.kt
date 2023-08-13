package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }

    @Composable
    fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
        Column {
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp
            )
            Text(
                text = from,
                fontSize = 36.sp
            )
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun BirthdayCardPreview() {
        HappyBirthdayTheme {
            GreetingText(message = "Happy Birthday!", from = "From Duvall")
        }
    }
}