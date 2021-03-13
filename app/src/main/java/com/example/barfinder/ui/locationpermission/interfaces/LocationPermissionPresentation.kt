package com.example.barfinder.ui.locationpermission.interfaces

/**
 * Interface to present the location permission view.
 *
 * This interface is a blueprint for a presenting results that outcomes from the location permission logic.
 */
interface LocationPermissionPresentation {

    /**
     * Handle when the permission is granted by the user.
     */
    fun locationPermissionGranted()

    /**
     * Handle when the permission is denyed by the user.
     */
    fun locationPermissionDenied()

    /**
     * Present when the permission was already granted in a past time.
     */
    fun locationPermissionAlreadyGranted()
}