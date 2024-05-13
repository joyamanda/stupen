package com.example.myapplication.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object Course: Screen("course")
    data object Detail: Screen("detail_mentors")
    data object Message: Screen("conversation")
    data object DetailGallery: Screen("detail_gallery")
}