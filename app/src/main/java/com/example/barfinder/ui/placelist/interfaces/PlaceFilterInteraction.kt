package com.example.barfinder.ui.placelist.interfaces

/**
 * Interface to interact with the place list filter.
 */
interface PlaceFilterInteraction {

    /**
     * Filter only the bars
     *
     * Filters only bar types of the list
     */
    fun filterOnlyBars()

    /**
     * Filter only the restaurants
     *
     * Filters only restaurant types of the list
     */
    fun filterOnlyRestaurants()

    /**
     * Filter only the cafes
     *
     * Filters only cafe types of the list
     */
    fun filterOnlyCafes()

    /**
     * Filtering places by name
     *
     * This function calls the network or database to filter the places based on text queue
     * @param name the name of the place to be searched
     */
    fun filterPlacesByName(name: String)
}