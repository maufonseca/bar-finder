package com.example.barfinder.infrastructure.persistence

import com.example.barfinder.model.Place

interface Database {

    fun onCreate()
    fun getCurrencies(): List<Place>
    fun postCurrencies(currencies: List<Place>)
    fun onDestroy()

}