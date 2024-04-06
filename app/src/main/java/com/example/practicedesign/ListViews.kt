package com.example.practicedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViews : AppCompatActivity() {
    var country = arrayOf("Bangladesh","India","Srilanka","Pakistan","Ghana")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_views)
        val arrayAdapter:ArrayAdapter<String>
        var mListView = findViewById<ListView>(R.id.listView)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,country)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, position, id ->
            val countryNames:String = parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext,"The Country Name that you selected is:"+countryNames,Toast.LENGTH_LONG).show()
        }


    }
}