package com.example.barfinder.ui.mainscreen.scene

import com.example.barfinder.model.Place
import com.example.barfinder.ui.mainscreen.interfaces.PlaceFilterInteraction
import com.example.barfinder.ui.mainscreen.interfaces.PlaceListInteraction

class PlaceListInteractor() : PlaceListInteraction, PlaceFilterInteraction {

    override fun reloadAllPlaces() {
        TODO("Not yet implemented")
    }

    override fun selectPlace(place: Place) {
        TODO("Not yet implemented")
    }

    override fun filterOnlyBars() {
        TODO("Not yet implemented")
    }

    override fun filterOnlyCafes() {
        TODO("Not yet implemented")
    }

    override fun filterOnlyRestaurants() {
        TODO("Not yet implemented")
    }

    override fun filterPlacesByName(name: String) {
        TODO("Not yet implemented")
    }
}