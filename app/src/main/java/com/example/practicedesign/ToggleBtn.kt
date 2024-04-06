package com.example.practicedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class ToggleBtn : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var txt:TextView
    lateinit var btn:ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_btn)

        img = findViewById(R.id.toggleImg)
        txt = findViewById(R.id.toggleTxt)
        btn = findViewById(R.id.toggleBtn)

        btn.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                img.visibility = View.INVISIBLE
                txt.setText("The image is hide now. Click again to get the image back.")
            }else{
                img.visibility = View.VISIBLE
                txt.setText("Congrats, Image is back")
            }
        }
    }
}