package com.example.a34a.button_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.a34a.R
import com.example.a34a.databinding.FragmentDataBinding

class DataFragment : DialogFragment() {

    lateinit var dataBinding: FragmentDataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        dataBinding = FragmentDataBinding.inflate(inflater,container,false)

        dataBinding.btnOk.setOnClickListener {

            var username : String = dataBinding.editName.text.toString()
            var age : String = dataBinding.editAge.text.toString()

            val dialogBaseActivity : DialogBaseActivity = activity as DialogBaseActivity

            dialogBaseActivity.setData(username,age)
            dialog!!.dismiss()
        }

        dataBinding.btnCancel.setOnClickListener {
            dialog!!.dismiss()
        }

        return dataBinding.root
    }

}