package com.example.barfinder.ui.placelist.scene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barfinder.R
import com.example.barfinder.model.Place
import com.example.barfinder.ui.placelist.interfaces.PlaceFilterView
import com.example.barfinder.ui.placelist.interfaces.PlaceListView

class PlaceListActivity : PlaceListView, PlaceFilterView, AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_list)
        setupScene()
    }

    /**
     * Create and link the scene Presenters and Interactors among themselves
     */
    fun setupScene() {
        TODO("Create and setup presenter/intercator/disposables/database/services")
    }

    override fun addPlace(place: Place) {
        TODO("Not yet implemented")
    }

    override fun removePlace(place: Place) {
        TODO("Not yet implemented")
    }

    override fun refreshPlaceList(placeArray: ArrayList<Place>) {
        TODO("Not yet implemented")
    }

    override fun clearList() {
        TODO("Not yet implemented")
    }

    override fun barFilterSelected() {
        TODO("Not yet implemented")
    }

    override fun cafeFilterSelected() {
        TODO("Not yet implemented")
    }

    override fun restaurantFilterSelected() {
        TODO("Not yet implemented")
    }

    override fun searchBarSentWith(text: String) {
        TODO("Not yet implemented")
    }

    /**
     * Dispose scene interactors and presenters
     */
    fun disposeScene() {

    }

    override fun onDestroy() {
        disposeScene()
        super.onDestroy()
    }
}