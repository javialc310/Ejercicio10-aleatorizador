package com.example.ejercicio10_aleatorizador.ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10_aleatorizador.R
import com.example.ejercicio10_aleatorizador.databinding.ActivityCiudadBinding

class Ciudad : AppCompatActivity() {
    lateinit var binding: ActivityCiudadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        botones()
    }

    private fun botones(){

    }
}