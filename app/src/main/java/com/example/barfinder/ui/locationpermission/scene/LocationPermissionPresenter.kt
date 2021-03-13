package com.example.barfinder.ui.locationpermission.scene

import com.example.barfinder.ui.locationpermission.interfaces.LocationPermissionPresentation
import com.example.barfinder.ui.locationpermission.interfaces.LocationPermissionView

/**
 * The location permission presentation class.
 *
 * This class handles all events before showing data to location permission asking view.
 * @param locationPermissionView the view to put the data after processed
 */
class LocationPermissionPresenter (var locationPermissionView: LocationPermissionView) : LocationPermissionPresentation {

    override fun locationPermissionAlreadyGranted() {
        TODO("Not yet implemented")
    }

    override fun locationPermissionDenied() {
        TODO("Not yet implemented")
    }

    override fun locationPermissionGranted() {
        TODO("Not yet implemented")
    }
}