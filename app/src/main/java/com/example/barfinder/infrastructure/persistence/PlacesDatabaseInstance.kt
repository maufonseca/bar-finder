package com.example.barfinder.infrastructure.persistence

import com.example.barfinder.model.Place
import io.realm.Realm

/**
 * Instance of the realm database
 *
 * Used for posting and getting places from local persistence DB
 */
class PlacesDatabaseInstance :  Database {
    private lateinit var realm: Realm

    override fun onCreate() {
        realm = Realm.getDefaultInstance()
    }

    override fun getPlaces(): List<Place> {
        val response = mutableListOf<Place>()
        val realmList = realm.where(DatabasePlaceModel::class.java).findAll()
        realmList.forEach {
            response.add(Place(it.identifier, it.name, it.type))
        }
        return response
    }

    override fun postPlaces(places: List<Place>) {
        places.forEach {
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