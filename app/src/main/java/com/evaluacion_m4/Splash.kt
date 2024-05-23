package com.evaluacion_m4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.evaluacion_m4.R
import com.example.evaluacion_m4.databinding.FragmentSplashBinding


class Splash : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSplashBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.root.setOnClickListener {
            findNavController().navigate(R.id.action_splash_to_loginSaludo)
        }


       return root
    }

}



