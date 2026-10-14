package com.nidheesh.ci_cddemo.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onLogin: (String, String) -> Unit) {
    val nameInput = rememberSaveable { mutableStateOf("") }
    val emailInput = rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        TextField(
            value = nameInput.value,
            onValueChange = {  nameInput.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), placeholder = { Text(text = "Name") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = emailInput.value,
            onValueChange = {  emailInput.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), placeholder = { Text(text = "Email") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onLogin.invoke(nameInput.value, emailInput.value) }, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "LOGIN")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {  }, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "SIGN UP")
        }

    }
}
