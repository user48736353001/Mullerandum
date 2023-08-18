package com.example.mullerandum.Navigation

//clase con pasa un parámetro de tipo cadena de texto, poseerá dos objetos

sealed class AppScreens (val route: String) {

    object SplashScreen: AppScreens(route = "splash_screen")
    object MainScreen: AppScreens(route = "main_screen")

}