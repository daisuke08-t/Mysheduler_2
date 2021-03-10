package com.example.myscheduler2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myscheduler2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(findViewById(R.id.toolbar))
        setFabVisible(View.VISIBLE)

        val naviController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(naviController)
        binding.fab.setOnClickListener { view ->
            naviController.navigate(R.id.action_to_scheduleEditFragment)
        }


    }

    override fun onSupportNavigateUp()
    = findNavController(R.id.nav_host_fragment).navigateUp()

    fun setFabVisible(visibility: Int) {
        binding.fab.visibility = visibility
    }
}