package com.example.myapplication.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.squareup.picasso.Picasso

class Adapter (private val context: Context, private val feelingsList: MutableList<Feelings>):
    RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image1: ImageView = itemView.findViewById(R.id.image_feeling1)
        val image2: ImageView = itemView.findViewById(R.id.image_feeling2)
        val image3: ImageView = itemView.findViewById(R.id.image_feeling3)
        val image4: ImageView = itemView.findViewById(R.id.image_feeling4)
        val image5: ImageView = itemView.findViewById(R.id.image_feeling5)
        val text1: TextView = itemView.findViewById(R.id.txt_feeling1)
        val text2: TextView = itemView.findViewById(R.id.txt_feeling2)
        val text3: TextView = itemView.findViewById(R.id.txt_feeling3)
        val text4: TextView = itemView.findViewById(R.id.txt_feeling4)
        val text5: TextView = itemView.findViewById(R.id.txt_feeling5)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        val listItem = feelingsList[position]

        Picasso.get().load(feelingsList[position].image)
        holder.text1.text = feelingsList[position].title
        holder.text2.text = feelingsList[position].title
        holder.text3.text = feelingsList[position].title
    }

    override fun getItemCount() = feelingsList.size


}