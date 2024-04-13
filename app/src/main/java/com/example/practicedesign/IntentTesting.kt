package com.example.practicedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentTesting : AppCompatActivity() {

    lateinit var testing:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_testing)

        testing = findViewById(R.id.intentTest)

        var userName = intent.getStringExtra("Name").toString()
        var userEmail = intent.getStringExtra("Email").toString()

        testing.text = "Name is : ${userName} and Email is : ${userEmail}"


    }
}