package com.example.barfinder.ui.placelist.interfaces

/**
 * Interface to show the place list filter on screen.
 */
interface PlaceFilterView {

    /**
     * Filtering places by names
     *
     * @param text the text to be sent on the filter
     */
    fun searchBarSentWith(text: String)

    /**
     * Bar filter button touched
     */
    fun barFilterSelected()

    /**
     * Restaurant button touched
     */
    fun restaurantFilterSelected()

    /**
     * Cafe buttoun touched
     */
    fun cafeFilterSelected()
}