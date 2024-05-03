package com.example.composedestination.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.composedestination.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination

@Destination<HomeNavGraph>(start = true)
@Composable
fun Home() {
  Column {
    Text(text = "Login Screen")
    Button(
      onClick = { /*TODO*/ }
    ) {
    }
  }
}
