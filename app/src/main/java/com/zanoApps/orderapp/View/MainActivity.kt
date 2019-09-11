package com.zanoApps.orderapp.View

import android.app.ActionBar
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.graphics.alpha
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.zanoApps.orderapp.R

class MainActivity : AppCompatActivity(){


    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var bottomNav:BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment ?: return

        val drawerLayout: DrawerLayout? = findViewById(R.id.drawer_layout)
        bottomNav = findViewById(R.id.bottom_nav_view)

        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeMenu_dest,
                R.id.specialOrder_dest),
            drawerLayout
        )
        val navController = host.navController

        setupBottomNavMenu(navController)
        setupNavigationMenu(navController)
        setupActionBar(navController, appBarConfiguration)
    }

    private fun setupBottomNavMenu(navController: NavController){

        bottomNav = findViewById(R.id.bottom_nav_view)
        bottomNav.setupWithNavController(navController)
    }
    private fun setupNavigationMenu(navController: NavController){
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView?.setupWithNavController(navController)
    }

    private fun setupActionBar(
        navController: NavController,
        appBarConfig: AppBarConfiguration
    ) {
        setupActionBarWithNavController(navController, appBarConfig)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(Navigation.findNavController(this , R.id.my_nav_host_fragment)) || super.onOptionsItemSelected(item)
    }
    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.my_nav_host_fragment).navigateUp(appBarConfiguration)
    }



}
