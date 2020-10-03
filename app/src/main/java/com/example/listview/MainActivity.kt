package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var myList  = arrayListOf<String>("Bob", "Nancy", "Marry","Efay", "Melbourne", "Vienna", "Vancouver",
            "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York",
            "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set the list view
        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myList)
        mainListView.adapter = arrayAdapter


        mainNextButton.setOnClickListener { goToNext() }
    }

    private fun goToNext(){
        var mainIntent = Intent(this, ListWithActionActivity::class.java)
        startActivity(mainIntent)
    }


}