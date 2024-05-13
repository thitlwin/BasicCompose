package com.thit.basiccompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.thit.basiccompose.R
import com.thit.basiccompose.router.MyBackButtonHandler
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyText()
    }

    MyBackButtonHandler {
        MyRouter.navigateTo(Screen.Navigation)
    }
}

@Preview
@Composable
fun MyText() {
    Text(
        text = stringResource(id = R.string.jetpack_compose),
        fontStyle = FontStyle.Italic,
        color = colorResource(id = R.color.purple_700),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
}
