package com.example.barfinder.infrastructure.networking

data class PlaceResponseModel (
    var success: Boolean = false,
    var terms: String = "",
    var privacy: String = "",
    var places: Map<String,String> = emptyMap()
)