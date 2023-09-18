package com.example.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.odev1.R
import com.example.odev1.common.viewBinding
import com.example.odev1.data.UserData
import com.example.odev1.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding (FragmentHomeBinding::bind)
    private val args by navArgs<HomeFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.ad.text= args.name
        binding.soyad.text = args.surname

        binding.buttonDevam.setOnClickListener{
            val email = binding.email.text.toString()
            val sifre = binding.sifree.text.toString()
            val data = UserData(args.name,args.surname,email,sifre)
            val action = HomeFragmentDirections.homeToQuiz(data)
            findNavController().navigate(action)
        }
        binding.imageButton.setOnClickListener{
            findNavController().navigateUp()
        }

    }


}