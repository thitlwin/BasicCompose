package com.thit.basiccompose.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thit.basiccompose.R
import com.thit.basiccompose.router.MyBackButtonHandler
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen

@Preview
@Composable
fun ButtonScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()
        MyBackButtonHandler {
            MyRouter.navigateTo(Screen.Navigation)
        }
    }
}

@Composable
fun MyFloatingActionButton() {
    FloatingActionButton(
        onClick = { },
        shape = CircleShape,
        containerColor = colorResource(id = R.color.purple_700),
        contentColor = Color.White,
    ) {
        Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Test FAB")
    }
}

@Composable
fun MyRadioGroup() {
    val radioButtons = listOf(0, 1, 2)
    val selectedButton = remember {
        mutableStateOf(radioButtons.first())
    }

    Column {
        radioButtons.forEach { idx ->
            val isSelected = idx == selectedButton.value
            val colors = RadioButtonDefaults.colors(
                selectedColor = colorResource(id = R.color.purple_700),
                unselectedColor = colorResource(id = R.color.purple_700),
                disabledSelectedColor = Color.LightGray,
                disabledUnselectedColor = Color.DarkGray
            )

            RadioButton(
                selected = isSelected,
                onClick = { selectedButton.value = idx },
                colors = colors
            )
        }
    }
}

@Composable
fun MyButton() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_700)),
        border = BorderStroke(
            1.dp,
            color = colorResource(id = R.color.purple_700)
        )
    ) {
        Text(
            text = stringResource(id = R.string.button_text),
            color = Color.White
        )
    }
}
