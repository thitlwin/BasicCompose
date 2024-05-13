package com.thit.basiccompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thit.basiccompose.R
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen

@Preview
@Composable
fun NavigationScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavigationButton(stringResource(id = R.string.text), Screen.Text)
            NavigationButton(stringResource(id = R.string.text_field), Screen.TextField)
            NavigationButton(stringResource(id = R.string.buttons), Screen.Buttons)
            NavigationButton(
                stringResource(id = R.string.progress_indicators),
                Screen.ProgressIndicator
            )
            NavigationButton(stringResource(id = R.string.alert_dialog), Screen.AlertDialog)
        }
    }
}

@Composable
fun NavigationButton(text: String, screen: Screen) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_700)),
        onClick = { MyRouter.navigateTo(screen) }) {
        Text(text = text, color = Color.White)
    }
}
