package com.example.a34a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SelectActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editTextName: EditText
    lateinit var editTextAddress: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_select)

        button = findViewById(R.id.btnNavigate)
        editTextName = findViewById(R.id.editTextText2)
        editTextAddress = findViewById(R.id.editTextText3)

        button.setOnClickListener {
            var intent = Intent(this@SelectActivity,
                SecondActivity::class.java)
            var name : String ? = editTextName.text.toString()
            var address : String ? = editTextAddress.text.toString()
            intent.putExtra("name",name)
            intent.putExtra("address",address)
            startActivity(intent)
//          finish()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}