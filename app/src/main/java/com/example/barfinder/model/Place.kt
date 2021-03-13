package com.example.barfinder.model

/**
 * Place model for using within the whole app
 *
 * @param identifier unique identifier of the place
 * @param name the name of the place
 * @param type if place is bar, restaurant or cafe
 */
class Place(var identifier: String,
            var name: String,
            var type: String) {
}