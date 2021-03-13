package com.example.barfinder.infrastructure.persistence

import com.example.barfinder.model.Place

/**
 * Interface for using the Realm persistence
 */
interface Database {

    /**
     * Creating the database
     *
     * Actions to be made when creating the object instance
     */
    fun onCreate()

    /**
     * Getting places from DB
     *
     * @return a list of places
     * @param places a list of the nearby places
     */
    fun getPlaces(): List<Place>

    /**
     * Saving a list of places to the DB
     *
     * @param places a list of places to be saved
     */
    fun postPlaces(places: List<Place>)

    /**
     * Destroying the DB instance
     *
     * Actions to be done when the object is destroyed
     */
    fun onDestroy()

}