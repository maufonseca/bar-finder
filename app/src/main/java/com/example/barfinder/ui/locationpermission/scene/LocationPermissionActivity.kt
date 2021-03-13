package com.example.barfinder.ui.locationpermission.scene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barfinder.R
/**
 * The location permission asking scene
 */
class LocationPermissionActivity : AppCompatActivity() {
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