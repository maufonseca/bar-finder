package com.example.barfinder.ui.placelist.interfaces

import com.example.barfinder.model.Place

interface PlaceListInteraction {

    fun selectPlace(place: Place)
    fun reloadAllPlaces()
}