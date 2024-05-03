package com.example.composedestination.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composedestination.LoginNavGraph
import com.ramcosta.composedestinations.annotation.Destination

@Destination<LoginNavGraph>(start = true)
@Composable
fun Login() {
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ) {
    Column {
      Text(text = "Login Screen")
      Button(
        onClick = { /*TODO*/ }
      ) {
      }
    }
  }
}
