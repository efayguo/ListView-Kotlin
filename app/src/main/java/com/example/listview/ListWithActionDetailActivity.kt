package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_with_action.*
import kotlinx.android.synthetic.main.activity_list_with_action_detail.*

class ListWithActionDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_with_action_detail)

        //get the value from previous page
        var listValueDetail = intent.getStringExtra("listValue")

        //show the value
        detailTextView.text = listValueDetail
    }
}