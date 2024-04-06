package com.example.practicedesign

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    lateinit var button:Button
    lateinit var toastB:Button
    lateinit var toggle:ToggleButton
    lateinit var spinnerB:Button
    lateinit var snackBtn:Button
    lateinit var listView:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.txt)
        text.setOnClickListener {
            text.setText("Hello Tahsin,  !!")
            text.setTextColor(Color.CYAN)
        }


        button = findViewById(R.id.btn1)
        button.setText("Start")
        //toggle = findViewById(R.id.toggleBtnMain)
        toastB = findViewById(R.id.toastmainBtn)

        toastB.setOnClickListener {
            val intent = Intent(this,ShowToast::class.java)
            startActivity(intent)
        }
        snackBtn = findViewById(R.id.snakeBtn)

        snackBtn.setOnClickListener {
            val intent = Intent(this,SnackBarMsg::class.java)
            startActivity(intent)
        }
        spinnerB = findViewById(R.id.spinnerBtn)



        button.setOnClickListener {
            text.setText("This text is changed after the click")
            text.setBackgroundColor(Color.GREEN)
            text.setTextColor(Color.WHITE)
            button.setText("Clicked")
            val intent = Intent(this,EditTextActivity::class.java)
            startActivity(intent)
        }

//        toggle.setOnClickListener {
//            val intent = Intent(this,ToggleBtn::class.java)
//            startActivity(intent)
//        }

        spinnerB.setOnClickListener {
            val intent = Intent(this, Spinner::class.java)
            startActivity(intent)
            showToast("Welcome to the spinner button page")
        }

        //listView

        listView = findViewById(R.id.listBtnMain)
        listView.setOnClickListener {
            val intent = Intent(this,ListViews::class.java)
            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}