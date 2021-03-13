package com.example.barfinder.infrastructure.persistence

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class DatabasePlaceModel (
    @PrimaryKey
    var identifier: String = "",
    var name: String = "",
    var type: String = "bar"
) : RealmObject()