package com.thit.basiccompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.thit.basiccompose.R
import com.thit.basiccompose.router.MyBackButtonHandler
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen

@Composable
fun ProgressIndicatorScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            color = colorResource(id = R.color.purple_700),
            strokeWidth = 5.dp
        )
        LinearProgressIndicator(progress = 0.5f)
    }

    MyBackButtonHandler {
        MyRouter.navigateTo(Screen.Navigation)
    }
}