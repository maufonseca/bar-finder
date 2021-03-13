package com.example.barfinder.ui.locationpermission.interfaces

/**
 * An interface for interaction with the Location Permission logic.
 *
 * This interface handles all events for a user to ask or check the location permission.
 */
interface LocationPermissionInteraction {

    /**
     * Check for *location permission*
     *
     * This method will check if the location permission is already granted to the app.
     */
    fun checkLocationPermission()

    /**
     * Ask for *location permission*.
     *
     * This function asks for location permission in an Android system.
     */
    fun askForLocationPermission()
}