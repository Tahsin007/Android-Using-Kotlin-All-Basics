package com.example.practicedesign

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call.Details
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViews : AppCompatActivity() {
    lateinit var recycleV:RecyclerView
    var Images = ArrayList<Int>()
    var details = ArrayList<String>()
    var Names = ArrayList<String>()

    lateinit var adapter:MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_views)

        recycleV = findViewById(R.id.recycleList)
        recycleV.layoutManager = LinearLayoutManager(this@RecyclerViews)

        Names.add("Tahsin Ahmed")
        Names.add("Wakil Ahmed")
        Names.add("Mamun Ahmed")
        Names.add("Tanvir Ahmed")
        Names.add("Junaed Ahmed")

        details.add("This Picture is belonged to Tahsin Ahmed")
        details.add("This picture is belonged to Wakil Ahmed")
        details.add("This picture is belonged to Mamun Ahmed")
        details.add("This picture is belonged to Tanvir Ahmed")
        details.add("This picture is belonged to Junaed Ahmed")

        Images.add(R.drawable.formalimage1)
        Images.add(R.drawable.formalimage2)
        Images.add(R.drawable.formalimage1)
        Images.add(R.drawable.formalimage2)
        Images.add(R.drawable.formalimage1)

        adapter = MyAdapter(Images,details,Names,this@RecyclerViews)
        recycleV.adapter =adapter
    }
}