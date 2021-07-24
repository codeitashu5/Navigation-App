package com.ashupandey.navigationapp.recycler.techonolgy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ashupandey.navigationapp.R

class CustomRecyclerTechno(val list: List<String>) : RecyclerView.Adapter<CustomRecyclerTechno.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(
               R.layout.technology_recycler,
               parent,
               false
       )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val textView =  holder.itemView.findViewById<TextView>(R.id.textView)
        textView.text = list[position]
    }

    override fun getItemCount(): Int {
       return list.size
    }


}