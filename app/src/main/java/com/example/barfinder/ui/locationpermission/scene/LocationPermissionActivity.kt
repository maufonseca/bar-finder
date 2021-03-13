package com.example.barfinder.ui.locationpermission.scene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barfinder.R
import com.example.barfinder.ui.locationpermission.interfaces.LocationPermissionView

/**
 * The location permission asking scene
 */
class LocationPermissionActivity : LocationPermissionView, AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_permission)
        setupScene()
    }

    /**
     * Create and link the scene Presenters and Interactors among themselves
     */
    fun setupScene() {
        TODO("Create and setup presenter/intercator/disposables/database/services")
    }

    override fun grantPermissionButtonTapped() {
        TODO("Not yet implemented")
    }

    /**
     * Dispose scene interactors and presenters
     */
    fun disposeScene() {

    }

    override fun onDestroy() {
        disposeScene()
        super.onDestroy()
    }
}