package com.example.barfinder.infrastructure.persistence

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Place model for the realm DB
 *
 * @param identifier unique identifier of the place
 * @param name the name of the place
 * @param type if place is bar, restaurant or cafe
 */
open class DatabasePlaceModel (
    @PrimaryKey
    var identifier: String = "",
    var name: String = "",
    var type: String = "bar"
) : RealmObject()