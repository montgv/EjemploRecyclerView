package com.example.ejemplorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejemplorecyclerview.adapter.ModuloAdapter
import com.example.ejemplorecyclerview.databinding.ActivityMainBinding
import com.example.ejemplorecyclerview.datos.ModuloDatos

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        //binding.idRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.idRecyclerView.adapter = ModuloAdapter(ModuloDatos.listaModulos)
    }
}