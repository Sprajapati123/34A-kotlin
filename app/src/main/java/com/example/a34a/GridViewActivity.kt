package com.example.a34a

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a34a.adapter.FruitsAdapter

class GridViewActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_view)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        var adapter = FruitsAdapter(nameList,imageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext,nameList[i],Toast.LENGTH_LONG).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun fillArrays(){
        nameList.add("Apple")
        nameList.add("Banana")
        nameList.add("Cherry")
        nameList.add("Dragon Fruit")
        nameList.add("Grapes")
        nameList.add("Mango")
        nameList.add("Orange")
        nameList.add("Papaya")

        imageList.add(R.drawable.apple)
        imageList.add(R.drawable.banana)
        imageList.add(R.drawable.cherry)
        imageList.add(R.drawable.dragon_fruit)
        imageList.add(R.drawable.grapes)
        imageList.add(R.drawable.mango)
        imageList.add(R.drawable.orange)
        imageList.add(R.drawable.papaya)


    }
}