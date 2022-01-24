package com.example.examenrecuperacionm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.examenrecuperacionm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var listaPares= mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {

        val listaNumeros = mutableListOf<Int>()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b1.setOnClickListener {
            if (binding.Et1.text.isEmpty())
                Toast.makeText(this, "introduce algo primero", Toast.LENGTH_SHORT).show()
            else {
                listaNumeros.add(binding.Et1.text.toString().toInt())
                binding.Et1.text.clear()
            }
        }

        binding.b2.setOnClickListener {
            binding.tv1.text = listaNumeros.toString()
            ordenInsersion(listaNumeros)

        }

        binding.b3.setOnClickListener {
            binding.tv1.text = listaNumeros.toString()
            ordenarListaPortamano(listaNumeros)
        }
        binding.b4.setOnClickListener {
            binding.tv1.text = listaPares.toString()
            mostrarPares(listaNumeros)
        }
    }

    fun ordenInsersion(listaNumeros: MutableList<Int>): MutableList<Int> {
        return listaNumeros
    }

    fun ordenarListaPortamano(listaNumeros: MutableList<Int>): MutableList<Int> {
        listaNumeros.sortByDescending { it }.toString()
        return listaNumeros
    }

    fun mostrarPares(listaNumeros: MutableList<Int>): MutableList<Int>{
        var i=0
        listaPares= mutableListOf<Int>()
        if (i<listaNumeros.size) {
            if (listaNumeros[i] % 2 == 0)
                listaPares.add(listaNumeros[i])
            i++
        }
        return listaPares
    }

}


