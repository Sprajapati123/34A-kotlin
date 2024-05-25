package com.example.a34a

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a34a.databinding.ActivityLoginFirebaseBinding
import com.google.firebase.auth.FirebaseAuth

class LoginFirebaseActivity : AppCompatActivity() {
    lateinit var loginFirebaseBinding: ActivityLoginFirebaseBinding
    var auth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        loginFirebaseBinding = ActivityLoginFirebaseBinding.inflate(layoutInflater)
        setContentView(loginFirebaseBinding.root)

        loginFirebaseBinding.forgetPassword.setOnClickListener {
            var intent = Intent(this@LoginFirebaseActivity,
                ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        loginFirebaseBinding.btnRegister.setOnClickListener {
            var email = loginFirebaseBinding.emailField.text.toString()
            var password = loginFirebaseBinding.passwordField.text.toString()

            auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                task ->
                if(task.isSuccessful){
                    Toast.makeText(applicationContext,"User created",
                        Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(applicationContext,task.exception?.message.toString(),
                        Toast.LENGTH_LONG).show()
                }
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}