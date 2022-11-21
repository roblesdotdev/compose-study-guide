package com.example.csg

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.csg.ui.theme.CSGTheme

@Composable
fun CSGApp() {
    CSGTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background,
        ) {
           Column(
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
           ) {
                Text(
                    text = "Working...",
                    style = MaterialTheme.typography.h5
                )
           }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CSGAppPreview() {
    CSGApp()
}