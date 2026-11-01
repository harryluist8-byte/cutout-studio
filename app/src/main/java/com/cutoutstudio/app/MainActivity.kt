package com.cutoutstudio.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cutoutstudio.app.ui.HomeScreen
import com.cutoutstudio.app.ui.theme.CutoutStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CutoutStudioTheme {
                HomeScreen()
            }
        }
    }
}
