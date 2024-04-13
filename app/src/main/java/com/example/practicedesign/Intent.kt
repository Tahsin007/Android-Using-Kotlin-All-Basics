package com.example.practicedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Intent : AppCompatActivity() {
    lateinit var intentName:TextView
    lateinit var intentEmail:TextView
    lateinit var intentBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentName = findViewById(R.id.intentName)
        intentEmail = findViewById(R.id.intentEmail)
        intentBtn = findViewById(R.id.intentBtn)

        intentBtn.setOnClickListener {
            var userName = intentName.text.toString()
            var userEmail = intentEmail.text.toString()

            var intent = Intent(this,IntentTesting::class.java)
            intent.putExtra("Name",userName)
            intent.putExtra("Email",userEmail)

            startActivity(intent)
        }

    }
}