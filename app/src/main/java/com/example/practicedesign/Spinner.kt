package com.example.practicedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import org.jetbrains.annotations.NotNull

class Spinner : AppCompatActivity(),AdapterView.OnItemClickListener {
    lateinit var spinnerC: Spinner
    lateinit var txtField:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        spinnerC = findViewById(R.id.spinnerCountry)
        txtField = findViewById(R.id.spinnerTxt)
        spinnerC.onItemClickListener = this

        var arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerC.adapter =arrayAdapter


    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, p3: Long) {
        if(parent!=null){
            txtField.text = parent.getItemAtPosition(position).toString()
        }

    }
}