package com.example.barfinder.ui.placelist.interfaces

import com.example.barfinder.model.Place

/**
 * Interface to treat data before presenting the place list on screen.
 */
interface PlaceListPresentation {

    /**
     * New places comming from DB
     *
     * @param placesArray the list of places that arrived
     */
    fun onNewPlacesArrivedFromDB(placesArray: ArrayList<Place>)

    /**
     * New places comming from Network
     *
     * @param placesArray the list of places that arrived
     */
    fun onNewPlacesArrivedFromNetwork(placesArray: ArrayList<Place>)

}