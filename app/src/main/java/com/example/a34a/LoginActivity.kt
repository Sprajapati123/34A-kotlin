package com.example.a34a

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a34a.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityLoginBinding
    lateinit var sharedPreferences: SharedPreferences

    var username : String? = null
    var password : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        var view = loginBinding.root

        getData()

        loginBinding.buttonCounter2.setOnClickListener {
            sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE)

            username = loginBinding.idpassword2.text.toString()
            password = loginBinding.editTextText6.text.toString()

            var editor = sharedPreferences.edit()
            editor.putString("username",username)
            editor.putString("passwords",password)

            editor.apply()


            Toast.makeText(applicationContext,"Data saved",Toast.LENGTH_LONG).show()

        }

        setContentView(view)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun getData() {
        sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE)

        username = sharedPreferences.getString("username","")
        password = sharedPreferences.getString("passwords","")

        loginBinding.idpassword2.setText(username)
        loginBinding.editTextText6.setText(password)

    }
}