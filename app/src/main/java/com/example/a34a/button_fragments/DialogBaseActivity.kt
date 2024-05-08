package com.example.a34a.button_fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import com.example.a34a.R
import com.example.a34a.databinding.ActivityDialogBaseBinding

class DialogBaseActivity : AppCompatActivity() {
    lateinit var dialogBaseBinding: ActivityDialogBaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        dialogBaseBinding = ActivityDialogBaseBinding.inflate(layoutInflater)
        setContentView(dialogBaseBinding.root)

        dialogBaseBinding.btnShowDialog.setOnClickListener {
            var fragmentManager : FragmentManager = supportFragmentManager

            var dataFragment = DataFragment()
            dataFragment.isCancelable = false

            dataFragment.show(fragmentManager,"DataFragment")
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun setData(username: String,age:String){
        dialogBaseBinding.lblName.text = username
        dialogBaseBinding.lblAge.text = age
    }
}