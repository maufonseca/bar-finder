package com.example.barfinder.ui.placelist.interfaces

interface PlaceFilterView {
    fun searchBarSentWith(text: String)
    fun barFilterSelected()
    fun restaurantFilterSelected()
    fun cafeFilterSelected()
}