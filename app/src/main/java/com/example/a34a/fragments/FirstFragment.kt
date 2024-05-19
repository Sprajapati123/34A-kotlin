package com.example.a34a.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        var email: String = arguments?.getString("email").toString()
        var password: String = arguments?.getString("password").toString()

        firstBinding.lblEmail.text = email
        firstBinding.lblPassword.text = password

        return firstBinding.root
    }


}