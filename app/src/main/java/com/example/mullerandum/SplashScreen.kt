package com.example.mullerandum

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.mullerandum.Navigation.AppScreens

//imagen pantalla de inicio.
@Composable
fun SplashScreen(navController: NavHostController) {
    navController.navigate(AppScreens.MainScreen.route)
    Splash()
}
@Preview
@Composable
fun Splash() {
    Column {
            Image(
                painter = painterResource(id = R.drawable.portada),
                contentDescription = null,
                contentScale = ContentScale.None
            )
    }
}
@Preview
@Composable
fun SplashScreenPreview() {
    Splash()
}