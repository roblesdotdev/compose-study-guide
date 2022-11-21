package com.example.csg

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.csg.navigation.CSGNavHost
import com.example.csg.theme.CSGTheme

@Composable
fun CSGApp() {
    val navController = rememberNavController()
    CSGTheme {
        CSGNavHost(navController = navController)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CSGAppPreview() {
    CSGApp()
}