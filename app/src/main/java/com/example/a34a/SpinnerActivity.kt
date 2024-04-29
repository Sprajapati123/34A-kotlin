package com.example.a34a

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var textView: TextView
    lateinit var spinner: Spinner
    var data = arrayOf("Nepal", "China", "Bhutan", "Pakistan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinners)

        var adapter = ArrayAdapter(
            this@SpinnerActivity, //context
            android.R.layout.simple_spinner_item, // template
            data // dataset
        )
        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spinner.adapter = adapter
        spinner.onItemSelectedListener = this

    }

    override fun onItemSelected(
        parent: AdapterView<*>?,
        view: View?, index: Int, id: Long
    ) {

        if (parent != null) {
            textView.text = parent.getItemAtPosition(index).toString()
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}