package com.example.a34a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a34a.adapter.RecyclerAdapter

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    var titleList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    var descriptionList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.recyclerView)
        titleList.add("Apple")
        titleList.add("Banana")
        titleList.add("Grapes")

        imageList.add(R.drawable.apple)
        imageList.add(R.drawable.banana)
        imageList.add(R.drawable.grapes)

        descriptionList.add("This is apple .....")
        descriptionList.add("This is banana .....")
        descriptionList.add("This is grapes .....")

        var adapter = RecyclerAdapter(titleList,imageList,descriptionList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}