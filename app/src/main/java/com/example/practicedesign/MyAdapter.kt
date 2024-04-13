package com.example.practicedesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(
    var Images: ArrayList<Int>,
    var details: ArrayList<String>,
    var Names: ArrayList<String>,
    var context: Context
): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {
        var textViewName:TextView = ItemView.findViewById(R.id.cardName)
        var textViewDescription:TextView = ItemView.findViewById(R.id.cardDescriptions)
        var cardImage:CircleImageView =ItemView.findViewById(R.id.cardImage)
        var cardView:CardView = ItemView.findViewById(R.id.cardView)


    }
//To create new view instance when layout manager failed to load any view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent,false)
        return ViewHolder(itemView)
    }
//how many list items are present in your array
    override fun getItemCount(): Int {
        return Names.size
    }
//it is to use fill the views with datas
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textViewName.text = Names.get(position)
        holder.textViewDescription.text = details.get(position)
        holder.cardImage.setImageResource(Images.get(position))

        holder.cardView.setOnClickListener {
            Toast.makeText(context,"The name you selected is ${Names.get(position)}",Toast.LENGTH_LONG).show()
        }
    }


}