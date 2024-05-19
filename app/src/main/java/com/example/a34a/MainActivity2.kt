package com.example.a34a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.a34a.databinding.ActivityMain2Binding
import com.example.a34a.fragments.FirstFragment

class MainActivity2 : AppCompatActivity() {
    lateinit var main2Binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        main2Binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(main2Binding.root)

        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        val firstFragment =  FirstFragment()

        main2Binding.btnFragment.setOnClickListener {
            var email: String = main2Binding.emailField.text.toString()
            var password: String = main2Binding.passwordField.text.toString()

            var bundle = Bundle()
            bundle.putString("email",email)
            bundle.putString("password",password)

            firstFragment.arguments = bundle
            fragmentTransaction.replace(R.id.frameLayout3,firstFragment)
            fragmentTransaction.commit()


        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}