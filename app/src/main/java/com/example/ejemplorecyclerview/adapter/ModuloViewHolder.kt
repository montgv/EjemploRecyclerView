package com.example.ejemplorecyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview.databinding.ItemModuloBinding
import com.example.ejemplorecyclerview.datos.Modulo

class ModuloViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemModuloBinding.bind(view)

    fun render(modulo: Modulo) {
        binding.textViewNombre.text = modulo.nombre
        binding.textViewCurso.text = modulo.curso
        binding.textViewNombreCiclo.text = modulo.ciclo
    }
}