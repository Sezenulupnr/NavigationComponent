package com.example.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.odev1.R
import com.example.odev1.common.viewBinding
import com.example.odev1.databinding.FragmentInputBinding
import com.google.android.material.snackbar.Snackbar

class InputFragment : Fragment(R.layout.fragment_input) {

    private val binding by viewBinding (FragmentInputBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGiris.setOnClickListener{
            val name = binding.ad.text.toString()
            val surname = binding.soyad.text.toString()
            val action = InputFragmentDirections.inputToHome(name, surname)
            findNavController().navigate(action)

            Snackbar.make(it , "HOŞGELDİN" , Snackbar.LENGTH_LONG).show()
            //buttona basıldığında ;
            //tıklama olduğunda aktivite üzerinde bir snackbar oluşturulur
            //make yöntemi:snacbar oluşturulurken hangi görünüm üzerine yerleştirileceğini(it) gösterir
            //snacbarda görünen metni belirtir
            //snacbar.length_short/long:snackbarın ne kadar süre görüntüleneceğini gösterir.
        }

    }
}


