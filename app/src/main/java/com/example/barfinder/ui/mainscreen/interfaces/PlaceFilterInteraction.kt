package com.example.barfinder.ui.mainscreen.interfaces

interface PlaceFilterInteraction {
    fun filterOnlyBars()
    fun filterOnlyRestaurants()
    fun filterOnlyCafes()
    fun filterPlacesByName(name: String)
}