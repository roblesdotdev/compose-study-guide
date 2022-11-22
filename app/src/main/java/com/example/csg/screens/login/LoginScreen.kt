package com.example.csg.screens.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.csg.theme.CSGTheme

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LoginHeader()
            Spacer(modifier = Modifier.height(48.dp))
            TextField(
                value = username,
                onValueChange = { username = it },
                placeholder = { Text("Phone email or username") },
                modifier = Modifier
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                placeholder = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.Visibility,
                            contentDescription = null
                        )
                    }
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            ) {
                Text(
                    text = "Sign In",
                )
            }
        }
    }
}

@Composable
private fun LoginHeader() {
    Text(
        text = "Let's sign you in.",
        style = MaterialTheme.typography.h4,
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(
        text = "Welcome back.",
        style = MaterialTheme.typography.h6
    )
    Text(
        text = "You've been missed!",
        style = MaterialTheme.typography.h6
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    CSGTheme {
        LoginScreen()
    }
}