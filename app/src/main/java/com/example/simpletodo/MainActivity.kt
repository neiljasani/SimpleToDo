package com.example.simpletodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listOfTasks = mutableListOf<String>()
        /* Detect when user clicks on add button */
        // Grab a reference to the add button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Code in here is executed when user clicks on a button
//            Log.i("Caren", "User clicked on button")
        }
        listOfTasks.add("Do laundry")
        listOfTasks.add("Go shopping")
        // Look up recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        // Create adapter passing in the sample user data
        val adapter = TaskItemAdapter(listOfTasks)
        // Attach the adapter to the recyclerview to populate items
        recyclerView.adapter = adapter
        // Set layout manager to position the items
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}