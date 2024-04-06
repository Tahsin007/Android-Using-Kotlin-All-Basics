package com.example.practicedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class SnackBarMsg : AppCompatActivity() {

    lateinit var msg:Button
    lateinit var myLayout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar_msg)

        msg = findViewById(R.id.snackBarBtn)
        myLayout = findViewById(R.id.snackBarLayout)
        var message = "This course has only 1 hours left. Enroll Now!"

        msg.setOnClickListener {
            Snackbar.make(myLayout,message,Snackbar.LENGTH_INDEFINITE).setAction("Close", View.OnClickListener {

            }).show()
        }
    }
}