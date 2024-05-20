package com.example.a34a.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a34a.FragmentToActivity
import com.example.a34a.R
import com.example.a34a.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var firstBinding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        firstBinding = FragmentFirstBinding.inflate(inflater,container,false)

        firstBinding.btnNavigate3.setOnClickListener {
            var name : String = firstBinding.idName.text.toString()
            var age : Int = firstBinding.idAge.text.toString().toInt()

            var fragmentToActivity : FragmentToActivity =
                activity as FragmentToActivity
            fragmentToActivity.setData(name,age)
        }

        return firstBinding.root
    }


}