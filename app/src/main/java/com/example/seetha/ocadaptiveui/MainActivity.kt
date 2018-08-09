package com.example.seetha.ocadaptiveui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the toolbar view from the activity layout
        val toolbar = findViewById<Toolbar>(R.id.activity_main_toolbar)
        // Set the Toolbar
        setSupportActionBar(toolbar)

        //OR:
//        setSupportActionBar(activity_main_toolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_activity_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.menu_activity_main_search -> {
                Toast.makeText(this, "Search item selected.", Toast.LENGTH_LONG).show()
                true
            }
            R.id.menu_activity_main_info -> {
                Toast.makeText(this, "Info item selected.", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
