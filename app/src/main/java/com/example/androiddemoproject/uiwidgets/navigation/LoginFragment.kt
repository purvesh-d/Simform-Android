package com.example.androiddemoproject.uiwidgets.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androiddemoproject.R
import com.example.androiddemoproject.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.btnLogIn.setOnClickListener {
            val username = binding.username.editText?.text ?: "User"
            val action = LoginFragmentDirections
                .actionLoginFragmentToHomeFragment(userName = username.toString())
            findNavController().navigate(action)
        }
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
        return binding.root
    }
}