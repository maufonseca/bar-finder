package com.example.barfinder.ui.placelist.scene

import com.example.barfinder.infrastructure.persistence.Database
import com.example.barfinder.model.Place
import com.example.barfinder.ui.placelist.interfaces.*
import io.reactivex.disposables.CompositeDisposable

/**
 * The places list interactions.
 *
 * This class handles all events from the places list view. It calls network and databases to keep the list up to date.
 * @param placeListPresentater the presenter to be called in order to return data to the place list scene
 * @param database the database to data persistence
 * @param compositeDisposable is the composite disposable for RX async calls that should be injected by the activity
 */
class PlaceListInteractor (val placeListPresentater: PlaceListPresentation,
                           val database: Database,
                           val compositeDisposable: CompositeDisposable) : PlaceListInteraction, PlaceFilterInteraction {

    override fun reloadAllPlaces() {
        TODO("Not yet implemented")
    }

    override fun selectPlace(place: Place) {
        TODO("Not yet implemented")
    }

    override fun filterOnlyBars() {
        TODO("Not yet implemented")
    }

    override fun filterOnlyCafes() {
        TODO("Not yet implemented")
    }

    override fun filterOnlyRestaurants() {
        TODO("Not yet implemented")
    }

    override fun filterPlacesByName(name: String) {
        TODO("Not yet implemented")
    }
}