package com.example.barfinder.ui.mainscreen.scene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barfinder.R
import com.example.barfinder.model.Place
import com.example.barfinder.ui.mainscreen.interfaces.PlaceFilterView
import com.example.barfinder.ui.mainscreen.interfaces.PlaceListView

class PlaceListActivity : PlaceListView, PlaceFilterView, AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_list)
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
}