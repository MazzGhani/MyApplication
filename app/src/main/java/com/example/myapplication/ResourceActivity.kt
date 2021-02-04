package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val arrayAdapter: ArrayAdapter<*>
        val resourcesUsed= arrayOf(
            "Mazz Ghani","Jingxi Gao","Layton Jacobson","Charly Yan Miller","Carson Harbich"
        )

        val listView= findViewById<ListView>(R.id.listOfResources)
        arrayAdapter= ArrayAdapter(this, android.R.layout.simple_list_item_1,resourcesUsed)
        listView.adapter=arrayAdapter
        


    }
}