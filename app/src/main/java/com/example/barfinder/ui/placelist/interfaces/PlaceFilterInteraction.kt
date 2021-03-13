package com.example.barfinder.ui.placelist.interfaces

interface PlaceFilterInteraction {
    fun filterOnlyBars()
    fun filterOnlyRestaurants()
    fun filterOnlyCafes()
    fun filterPlacesByName(name: String)
}