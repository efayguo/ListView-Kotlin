package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_with_action.*


class ListWithActionActivity : AppCompatActivity() {

    var actionListArray = arrayListOf<String>(
        "Bob",
        "Nancy",
        "Marry",
        "Efay",
        "Melbourne",
        "Vienna",
        "Vancouver",
        "Toronto",
        "Calgary",
        "Adelaide",
        "Perth",
        "Auckland",
        "Helsinki",
        "Hamburg",
        "Munich",
        "New York",
        "Sydney",
        "Paris",
        "Cape Town",
        "Barcelona",
        "London",
        "Bangkok"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_with_action)
        var actionListAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, actionListArray)
        actionListView.adapter = actionListAdapter


        //set up the click listern
        actionListView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                //assign the value
                var itemValue = actionListView.getItemAtPosition(position) as String

                //get the value for the next page
                var actionIntent =
                    Intent(applicationContext, ListWithActionDetailActivity::class.java)
                actionIntent.putExtra("listValue", "position is $position  \nvalue is $itemValue")
                startActivity(actionIntent)
//                Toast.makeText(
//                    applicationContext,
//                    "position is $position  \nvalue is $itemValue",
//                    Toast.LENGTH_SHORT
//                ).show()
            }

        }

    }


}