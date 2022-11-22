package com.example.csg.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.csg.screens.home.HomeScreen
import com.example.csg.screens.login.LoginScreen
import com.example.csg.screens.splash.SplashScreen

@Composable
fun CSGNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
   NavHost(
       navController = navController,
       startDestination = Splash.route,
       modifier = modifier
   ) {
       composable(route = Splash.route) {
           SplashScreen(
               onLoad = {
                   navController.popBackStack()
                   navController.navigate(Login.route)
               }
           )
       }
       composable(route = Home.route) {
           HomeScreen()
       }
       composable(route = Login.route) {
           LoginScreen()
       }
   }
}