package com.example.barfinder.ui.mainscreen.interfaces

import com.example.barfinder.model.Place

interface PlaceFilterView {
    fun searchBarSentWith(text: String)
    fun barFilterSelected()
    fun restaurantFilterSelected()
    fun cafeFilterSelected()
}