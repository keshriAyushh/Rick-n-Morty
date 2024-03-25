package com.ayush.ricknmorty.utils

sealed class Route(
    val route: String
) {
    data object HomeScreen: Route("home_screen")
}