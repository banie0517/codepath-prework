package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//handling user interactions
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //user can tap button to change color of the label
        //1. add button to layer
        //Get reference to button
       findViewById<Button>(R.id.button).setOnClickListener {
         //  handles button tap
        //change color of text
           // 2.set up logic to know when user has tapped on button
           Log.i("Bithianie" ,"tapped on button")
           // change color of text when user taps button
           // 1. Get reference from Text View
           // 2. Set Color of Text View
           findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
       }


    }
}