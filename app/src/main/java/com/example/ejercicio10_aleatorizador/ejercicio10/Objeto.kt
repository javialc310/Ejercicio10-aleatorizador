package com.example.ejercicio10_aleatorizador.ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10_aleatorizador.R
import com.example.ejercicio10_aleatorizador.databinding.ActivityObjetoBinding

class Objeto : AppCompatActivity() {
    lateinit var binding: ActivityObjetoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}