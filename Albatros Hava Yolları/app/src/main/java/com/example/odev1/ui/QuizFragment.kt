package com.example.odev1.ui

import  android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.odev1.R
import com.example.odev1.common.viewBinding
import com.example.odev1.data.AllData
import com.example.odev1.data.QuizData
import com.example.odev1.databinding.FragmentQuizBinding


class QuizFragment : Fragment(R.layout.fragment_quiz) {

    private val binding by viewBinding(FragmentQuizBinding::bind)
    private val args by navArgs<QuizFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.isim.text= args.nameUser.ad
        binding.soyisim.text = args.nameUser.soyad


        binding.buttonBitir.setOnClickListener {
            val phone = binding.telefon.text.toString()
            val nereden = binding.nereden.text.toString()
            val nereye = binding.nereye.text.toString()
            val tarih = binding.neZaman.text.toString()
            val quizData = QuizData(phone,nereden,nereye,tarih)
            val allData = AllData(args.nameUser,quizData)
            val action =QuizFragmentDirections.quizToFinish(allData)

            findNavController().navigate(action)
        }
        binding.imageButton.setOnClickListener{
            findNavController().navigateUp()
        }
    }

}
