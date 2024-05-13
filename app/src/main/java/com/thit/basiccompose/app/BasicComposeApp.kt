package com.thit.basiccompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.thit.basiccompose.router.MyRouter
import com.thit.basiccompose.router.Screen
import com.thit.basiccompose.screens.AlertDialogScreen
import com.thit.basiccompose.screens.ButtonScreen
import com.thit.basiccompose.screens.NavigationScreen
import com.thit.basiccompose.screens.ProgressIndicatorScreen
import com.thit.basiccompose.screens.TextFieldScreen
import com.thit.basiccompose.screens.TextScreen

@Composable
fun BasicComposeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Crossfade(targetState = MyRouter.currentScreen, label = "") { screenState ->
            when (screenState.value) {
                Screen.AlertDialog -> AlertDialogScreen()
                Screen.Buttons -> ButtonScreen()
                Screen.Navigation -> NavigationScreen()
                Screen.ProgressIndicator -> ProgressIndicatorScreen()
                Screen.Text -> TextScreen()
                Screen.TextField -> TextFieldScreen()
            }
        }
    }
}