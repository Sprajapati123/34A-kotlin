package com.example.a34a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.a34a.databinding.ActivityFragmentToBinding
import com.example.a34a.fragments.FirstFragment

class FragmentToActivity : AppCompatActivity() {
    lateinit var fragmentToBinding: ActivityFragmentToBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        fragmentToBinding = ActivityFragmentToBinding.inflate(layoutInflater)
        setContentView(fragmentToBinding.root)

//        var fragmentManager : FragmentManager = supportFragmentManager
//        var fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
//
//        fragmentTransaction.replace(R.id.frameLayout3,FirstFragment())
//        fragmentTransaction.commit()
//
        supportFragmentManager.beginTransaction().
        replace(R.id.frameLayout3,FirstFragment()).commit()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun setData(name:String,age:Int){
        fragmentToBinding.textView5.text = name
        fragmentToBinding.textView6.text = age.toString()
    }
}