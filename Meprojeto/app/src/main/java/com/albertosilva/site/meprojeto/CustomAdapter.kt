package com.albertosilva.site.meprojeto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(val lista: List<String>): RecyclerView.Adapter<CustomHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        var layoutView = LayoutInflater.from(parent.context).inflate(R.layout.version_item_layout, parent, false)

        return  CustomHolder(layoutView)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        holder.configurar(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}



