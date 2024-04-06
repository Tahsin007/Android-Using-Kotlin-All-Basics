package com.example.practicedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class EditTextActivity : AppCompatActivity() {
    lateinit var backBtn:TextView
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var textField2: EditText
    lateinit var submitBtn:Button
    lateinit var img:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        backBtn = findViewById(R.id.txtbtn)
        name = findViewById(R.id.txt2)
        email = findViewById(R.id.email2)
        password = findViewById(R.id.password2)
        textField2 = findViewById(R.id.message2)
        submitBtn = findViewById(R.id.btn2)
        


        submitBtn.setOnClickListener {
            var str:String = name.text.toString()+"/n"+email.text.toString()+"/n"+password.text.toString()
            textField2.setText(str)

            //img.setImageResource(R.drawable.formalimage2)
            showToast("Sign Up Successfull")
           var newIntent = Intent(this,RadioBtn::class.java)
           startActivity(newIntent)

        }
        backBtn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}