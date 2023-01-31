package com.example.ejercicio10_aleatorizador.ejercicio10

import android.content.Intent
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
        binding.entrar.setOnClickListener {
            val intent = Intent(this, SiguienteEj::class.java)
            startActivity(intent)
        }

        binding.continuar4.setOnClickListener {
            val intent = Intent(this, Dado::class.java)
            startActivity(intent)
        }
    }
}