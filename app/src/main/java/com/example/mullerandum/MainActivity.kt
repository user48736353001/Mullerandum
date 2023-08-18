package com.example.mullerandum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable

import com.example.mullerandum.Navigation.AppScreens
import com.example.mullerandum.ui.theme.MullerandumTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MullerandumTheme {
                // A surface container using the 'background' color from the theme

            }


        }
    }
}
@Composable
fun ScreenPreview() {
    AppScreens.SplashScreen
}
@Composable
fun MainScreenPreview() {

    AppScreens.MainScreen
}






