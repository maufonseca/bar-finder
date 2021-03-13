package com.example.barfinder.ui.placelist.interfaces

import com.example.barfinder.model.Place

/**
 * Interface to show with the place list on screen.
 */
interface PlaceListView {

    /**
     * Refreshing the list with new places
     *
     * @param placeArray the nem list of places to be shown on screen
     */
    fun refreshPlaceList(placeArray: ArrayList<Place>)

    /**
     * Removing a place from the screen
     *
     * @param place the place item to be removed
     */
    fun removePlace(place: Place)

    /**
     * Adding a new place to the screen
     *
     * @param place the place item to be added
     */
    fun addPlace(place: Place)

    /**
     * Clearing the whole list
     */
    fun clearList()
}