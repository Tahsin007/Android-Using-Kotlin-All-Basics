package com.example.practicedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class RadioBtn : AppCompatActivity() {

    lateinit var radio1:RadioButton
    lateinit var radio2:RadioButton
    lateinit var btn:Button
    lateinit var textField:TextView
    lateinit var backBtn:TextView
    lateinit var layout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_btn)

        radio1 = findViewById(R.id.radioMale)
        radio2 = findViewById(R.id.radioFemale)
        btn = findViewById(R.id.radiobtn)
        textField = findViewById(R.id.radioMsg)
        backBtn = findViewById(R.id.radioTxt)

        //layout = findViewById(R.id.layoutRadio)


        btn.setOnClickListener {
            if(radio1.isChecked){
                var str:String = radio1.text.toString()
                textField.setText(str)
            }else if(radio2.isSelected){
                var str:String = radio2.text.toString()
                textField.setText("You have selected as a ${str}")
            }
        }

        backBtn.setOnClickListener {
            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        }
    }
}