package com.example.a34a.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a34a.R

class RecyclerAdapter(
    var titleList: ArrayList<String>,
    var imageList: ArrayList<String>,
    var descriptionList: ArrayList<String>
) {

    class FruitsViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var title : TextView = view.findViewById(R.id.textViewTitle)
        var descrription : TextView = view.findViewById(R.id.textViewDescription)
        var images : TextView = view.findViewById(R.id.imageView3)
    }
}