package com.example.csg

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.csg.ui.theme.CSGTheme

@Composable
fun CSGApp() {
    CSGTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
           Column(
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
           ) {
                Text(
                    text = "Working...",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
           }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CSGAppPreview() {
    CSGApp()
}