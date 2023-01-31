package com.example.ejercicio10_aleatorizador.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10_aleatorizador.R
import com.example.ejercicio10_aleatorizador.databinding.ActivityEnemigo3Binding

class Enemigo : AppCompatActivity() {
    lateinit var binding: ActivityEnemigo3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEnemigo3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        botones()
    }

    private fun botones(){
        binding.pelear.setOnClickListener {
            val intent = Intent(this, SiguienteEj::class.java)
            startActivity(intent)
        }

        binding.continuar2.setOnClickListener {
            val intent = Intent(this, Dado::class.java)
            startActivity(intent)
        }
    }
}