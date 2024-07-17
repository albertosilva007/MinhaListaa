package com.albertosilva.site.meprojeto

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {


    private val tvNomeVersao: TextView

    init {
        tvNomeVersao = rootView.findViewById(R.id.tvItemTexto)
    }

    fun configurar(nomeVersao: String) {
        tvNomeVersao.text= nomeVersao

    }
}