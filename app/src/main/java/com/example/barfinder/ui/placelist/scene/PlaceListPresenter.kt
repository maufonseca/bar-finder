package com.example.barfinder.ui.placelist.scene

import com.example.barfinder.model.Place
import com.example.barfinder.ui.placelist.interfaces.PlaceListPresentation
import com.example.barfinder.ui.placelist.interfaces.PlaceListView

/**
 * The place list presentation class.
 *
 * This class handles all events before showing data to places list view. It filters and maps data to keep the list up to date.
 * @param placeListView the view to put the data after processed
 */
class PlaceListPresenter (var placeListView: PlaceListView) : PlaceListPresentation {

    override fun onNewPlacesArrivedFromDB(placesArray: ArrayList<Place>) {
        TODO("Not yet implemented")
    }

    override fun onNewPlacesArrivedFromNetwork(placesArray: ArrayList<Place>) {
        TODO("Not yet implemented")
    }
}