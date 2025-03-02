package com.example.loginandsignup.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginandsignup.presentation.pages.LogInScreen
import com.example.loginandsignup.presentation.pages.SignUpScreen
import com.example.loginandsignup.presentation.pages.HomeScreen


@Composable
fun Navigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LogIn", builder = {
        composable("LogIn"){
            LogInScreen(modifier, navController, authViewModel)
        }
        composable("SignUp"){
            SignUpScreen(modifier, navController, authViewModel)
        }
        composable("Home"){
            HomeScreen(modifier, navController, authViewModel)
        }

    } )
}