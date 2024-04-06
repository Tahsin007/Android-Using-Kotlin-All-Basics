package com.example.practicedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ShowToast : AppCompatActivity() {

    lateinit var toast:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_toast)
        toast = findViewById(R.id.showToast)
        toast.setOnClickListener {
            Toast.makeText(applicationContext,"This is a Toast message",Toast.LENGTH_LONG).show()
        }
    }
}