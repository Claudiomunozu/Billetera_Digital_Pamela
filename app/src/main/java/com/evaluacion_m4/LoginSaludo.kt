package com.evaluacion_m4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.evaluacion_m4.R
import com.example.evaluacion_m4.databinding.FragmentLoginSaludoBinding



class LoginSaludo : Fragment() {


    private lateinit var binding: FragmentLoginSaludoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding= FragmentLoginSaludoBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.crearcuentasaludo.setOnClickListener {
            findNavController().navigate(R.id.action_loginSaludo_to_singupPage)
        }

        binding.tvtengocuenta.setOnClickListener {
            findNavController().navigate(R.id.action_loginSaludo_to_loginPage)
        }

        return root
    }


}

