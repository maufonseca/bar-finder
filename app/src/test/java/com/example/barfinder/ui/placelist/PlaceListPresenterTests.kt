package com.example.barfinder.ui.placelist

import com.example.barfinder.ui.placelist.scene.PlaceListPresenter
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PlaceListPresenterTests {
    private var sut: PlaceListPresenter? = null

    @Before
    fun setup() {
        sut = PlaceListPresenter()
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