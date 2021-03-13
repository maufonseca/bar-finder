package com.example.barfinder.infrastructure.networking

/**
 * Model of the Google place API response
 *
 * @param success if response is success or error
 * @param places a list of the nearby places
 */
data class PlaceResponseModel (
    var success: Boolean = false,
    var places: Map<String,String> = emptyMap()
)