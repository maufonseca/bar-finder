package com.example.barfinder.ui.placelist.interfaces

import com.example.barfinder.model.Place

interface PlaceListView {
    fun refreshPlaceList(placeArray: ArrayList<Place>)
    fun removePlace(place: Place)
    fun addPlace(place: Place)
    fun clearList()
}