package com.example.barfinder.ui.placelist.interfaces

import com.example.barfinder.model.Place

interface PlaceListPresentation {

    fun onNewPlacesArrivedFromDB(placesArray: ArrayList<Place>)
    fun onNewPlacesArrivedFromNetwork(placesArray: ArrayList<Place>)

}