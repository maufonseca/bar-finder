package com.example.barfinder.ui.placelist.interfaces

import com.example.barfinder.model.Place

/**
 * Interface to interact with the place list view.
 */
interface PlaceListInteraction {

    /**
     * User selected a place
     *
     * This function acts whenever a user selected a place
     * @param place the place the user selected
     */
    fun selectPlace(place: Place)

    /**
     * User reloaded the list
     *
     * This method reload the places after user asks for it.
     */
    fun reloadAllPlaces()
}