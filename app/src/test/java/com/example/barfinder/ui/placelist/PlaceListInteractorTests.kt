package com.example.barfinder.ui.placelist

import com.example.barfinder.ui.placelist.scene.PlaceListInteractor
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PlaceListInteractorTests {

    private var sut: PlaceListInteractor? = null

    @Before
    fun setup() {
        sut = PlaceListInteractor()
    }

    @Test
    fun testSutMethods() {
        Assert.assertEquals(4, 2 + 2)
    }

    @After
    fun tearDown() {
        sut = null
    }
}