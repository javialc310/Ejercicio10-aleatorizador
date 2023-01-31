package com.example.ejercicio10_aleatorizador.ejercicio10

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10_aleatorizador.databinding.ActivityDadoBinding
import kotlin.random.Random

class Dado : AppCompatActivity() {
    lateinit var binding: ActivityDadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageButton.setOnClickListener {
            when((1..4).random()){
                1->cambioObjeto()
                2->cambioCiudad()
                3->cambioMercader()
                4->cambioEnemigo()
        }
    }
}

    fun cambioObjeto(){
        val intent= Intent(this, Objeto::class.java)
        startActivity(intent)
    }

    fun cambioCiudad(){
        val intent= Intent(this, Ciudad::class.java)
        startActivity(intent)
    }

    fun cambioMercader(){
        val intent= Intent(this, Mercader::class.java)
        startActivity(intent)
    }

    fun cambioEnemigo(){
        val intent= Intent(this, Enemigo::class.java)
        startActivity(intent)
    }
}