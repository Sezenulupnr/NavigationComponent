package com.example.odev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev1.common.viewBinding
import com.example.odev1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding (ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}