package com.thit.basiccompose.screens

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.thit.basiccompose.R
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen

@Composable
fun AlertDialogScreen() {
    val shouldShowDialog = remember {
        mutableStateOf(true)
    }
    if (shouldShowDialog.value) {
        AlertDialog(onDismissRequest = {
            shouldShowDialog.value = false
            MyRouter.navigateTo(Screen.Navigation)
        }, title = { Text(text = stringResource(id = R.string.alert_dialog_title)) },
            text = { Text(text = stringResource(id = R.string.alert_dialog_text)) },
            confirmButton = {
                Button(colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_700)),
                    onClick = {
                        shouldShowDialog.value = false
                        MyRouter.navigateTo(Screen.Navigation)
                    }) {
                    Text(text = stringResource(id = R.string.confirm), color = Color.White)
                }
            })
    }
}