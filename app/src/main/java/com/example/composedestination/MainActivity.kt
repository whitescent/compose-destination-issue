package com.example.composedestination

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composedestination.ui.theme.ComposedestinationTheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposedestinationTheme {
        DestinationsNavHost(
          navGraph = NavGraphs.root
        )
      }
    }
  }
}
