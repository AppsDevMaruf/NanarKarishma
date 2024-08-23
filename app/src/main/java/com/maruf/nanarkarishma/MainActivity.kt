package com.maruf.nanarkarishma

import MainScreen
import ShareButton
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                //MainScreen() // Call the composable function here
                ShareButton()
            }
        }
        }
    }

