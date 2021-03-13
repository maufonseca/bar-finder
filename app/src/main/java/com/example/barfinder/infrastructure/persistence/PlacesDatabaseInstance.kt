package com.example.barfinder.infrastructure.persistence

import com.example.barfinder.model.Place
import io.realm.Realm
import io.realm.RealmList
import java.util.*

class PlacesDatabaseInstance :  Database {
    private lateinit var realm: Realm

    override fun onCreate() {
        realm = Realm.getDefaultInstance()
    }

    override fun getCurrencies(): List<Place> {
        val response = mutableListOf<Place>()
        val realmList = realm.where(DatabasePlaceModel::class.java).findAll()
        realmList.forEach {
            response.add(Place(it.identifier, it.name, it.type))
        }
        return response
    }

    override fun postCurrencies(currencies: List<Place>) {
        currencies.forEach {
            val placeToAdd = DatabasePlaceModel(it.identifier, it.name, it.type)
            realm.beginTransaction()
            realm.insertOrUpdate(placeToAdd)
            realm.commitTransaction()
        }
    }

    override fun onDestroy() {
        realm.close()
    }
}