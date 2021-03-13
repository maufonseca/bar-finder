package com.example.barfinder.ui.placelist.scene

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.barfinder.R
import com.example.barfinder.model.Place

/**
 * Adapter to the place list recycler View.
 *
 * This adapter will mount and bind the places cells on the recyclerview
 */
class PlaceListAdapter(private val context: Context, private val placeList: ArrayList<Place>) : RecyclerView.Adapter<PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cell_place, parent, false)
        return PlaceViewHolder(v)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        bindCellViewHolder(holder, position)
    }

    fun bindCellViewHolder(holder: PlaceViewHolder, index: Int) {
        //Configure cell layout
    }

    override fun getItemCount(): Int {
        return placeList.size
    }
}