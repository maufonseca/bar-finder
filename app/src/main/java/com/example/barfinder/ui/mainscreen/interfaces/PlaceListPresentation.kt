package com.example.barfinder.ui.mainscreen.interfaces

import com.example.barfinder.model.Place

interface PlaceListPresentation {

    fun onNewPlacesArrivedFromDB(placesArray: ArrayList<Place>)
    fun onNewPlacesArrivedFromNetwork(placesArray: ArrayList<Place>)

}