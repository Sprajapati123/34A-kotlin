package com.example.a34a

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class ButtonsActivity : AppCompatActivity() {
    lateinit var checkBoxToast : CheckBox
    lateinit var checkBoxSnack : CheckBox
    lateinit var checkBoxAlert : CheckBox
    lateinit var buttonClick : Button
    lateinit var main : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        checkBoxToast = findViewById(R.id.checkBoxToast)
        checkBoxSnack = findViewById(R.id.checkBoxSnack)
        checkBoxAlert = findViewById(R.id.checkBoxAlert)
        main = findViewById(R.id.main)
        buttonClick = findViewById(R.id.btnClick)


        buttonClick.setOnClickListener {
            if(checkBoxToast.isChecked){

            }else if(checkBoxSnack.isChecked){
                //SnackBar
            }else{
                //Alert Dialog
            }
        }
        

    }
}