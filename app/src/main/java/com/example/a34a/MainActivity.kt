package com.example.a34a

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
   lateinit var radioBike : RadioButton
   lateinit var radioScooter : RadioButton
   lateinit var radioCycle : RadioButton
   lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioBike = findViewById(R.id.btnBike)
        radioScooter = findViewById(R.id.btnScooter)
        radioCycle = findViewById(R.id.btnCycle)
        image = findViewById(R.id.imageView)

        radioBike.setOnClickListener {
            image.setImageResource(R.drawable.bike1)
        }
        radioScooter.setOnClickListener {
            image.setImageResource(R.drawable.bike2)
        }
        radioCycle.setOnClickListener {
            image.setImageResource(R.drawable.bike3)
        }


    }
}