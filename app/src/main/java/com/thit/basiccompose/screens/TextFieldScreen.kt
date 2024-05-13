package com.thit.basiccompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.thit.basiccompose.R
import com.thit.basiccompose.router.MyBackButtonHandler
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen

@Composable
fun TextFieldScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyTextField()
    }

    MyBackButtonHandler {
        MyRouter.navigateTo(Screen.Navigation)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField() {
    val textValue = remember {
        mutableStateOf("")
    }

    val primaryColor = colorResource(id = R.color.purple_700)

    OutlinedTextField(
        label = { Text(text = stringResource(id = R.string.email)) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = primaryColor,
            focusedLabelColor = primaryColor,
            cursorColor = primaryColor
        ),
        value = textValue.value,
        onValueChange = { textValue.value = it },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
    )
}
