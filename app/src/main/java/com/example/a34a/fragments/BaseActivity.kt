package com.example.a34a.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.a34a.R
import com.example.a34a.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {
    lateinit var baseBinding : ActivityBaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        baseBinding = ActivityBaseBinding.inflate(layoutInflater)
        val view = baseBinding.root
        setContentView(view)
        replaceFragment(FirstFragment(),true)
        baseBinding.btnReplace.setOnClickListener {
            replaceFragment(FirstFragment(),false)

        }
        baseBinding.btnReplace2.setOnClickListener {
            replaceFragment(SecondFragment(),false)

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun replaceFragment(fragment: Fragment,add: Boolean) {
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}