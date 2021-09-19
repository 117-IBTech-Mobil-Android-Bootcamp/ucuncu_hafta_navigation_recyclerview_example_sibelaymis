package com.patika.homework3.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.patikadev.utils.gone
import com.example.patikadev.utils.visible
import com.patika.homework3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController=findNavController(R.id.fragment_container_view)
        NavigationUI.setupWithNavController(bottom_navigation_view,navController)
    }

    fun hideNavigation() {
        bottom_navigation_view.gone()
    }

    fun showNavigation() {
        bottom_navigation_view.postDelayed(
            {
                bottom_navigation_view.visible()

            }, 200
        )
    }
}