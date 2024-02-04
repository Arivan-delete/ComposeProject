package com.example.composeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeproject.ui.theme.ComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfo(name = "Artyom", age = 22)
        }
    }
}

@Composable
fun UserInfo(name: String, age: Int) {
    Column {
        repeat(10) {
            Text(text = "Hello $name! You are $age")
        }
    }
}

@Preview
@Composable
fun UserInfoPreview() {
    UserInfo(name = "Artyom", age = 22)
}