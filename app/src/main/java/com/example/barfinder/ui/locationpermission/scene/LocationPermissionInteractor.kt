package com.example.barfinder.ui.locationpermission.scene

import com.example.barfinder.ui.locationpermission.interfaces.LocationPermissionInteraction
import com.example.barfinder.ui.locationpermission.interfaces.LocationPermissionPresentation

/**
 * The location permission scene intecartions.
 *
 * This class handles all events from the location permission asking scene. It calls the system to handle the permission.
 * @param locationPermissionPresenter the presenter to be called in order to return data to the scene
 */
class LocationPermissionInteractor (val locationPermissionPresenter: LocationPermissionPresentation) : LocationPermissionInteraction {

    override fun askForLocationPermission() {
        TODO("Not yet implemented")
    }

    override fun checkLocationPermission() {
        TODO("Not yet implemented")
    }
}