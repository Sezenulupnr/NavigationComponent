package com.example.odev1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.odev1.R
import com.example.odev1.common.viewBinding
import com.example.odev1.databinding.FragmentFinishBinding

class FinishFragment : Fragment(R.layout.fragment_finish) {

    private val binding by viewBinding (FragmentFinishBinding :: bind )
    private val args by navArgs<FinishFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ad2.text = args.name.user.ad
        binding.soyad2.text = args.name.user.soyad
        binding.email2.text = args.name.user.email
        binding.sifre2.text = args.name.user.sifre
        binding.nereden2.text = args.name.quiz.nereden
        binding.nereye2.text = args.name.quiz.nereye
        binding.tarih2.text = args.name.quiz.tarih
        binding.telefon2.text = args.name.quiz.telefon

        binding.button.setOnClickListener{
            findNavController().popBackStack(R.id.inputFragment,true)
            //buttona basılınca tanıtım sayfasına geri döneceğiz.
        }

    }



}