package com.example.listasrecyclerview

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidVersion: ArrayList<String?> = ArrayList<Any?>()
        androidVersion.add("Android 4 Ice Cream Sandwich")
        androidVersion.add("Android 4.1 Jelly Bean")
        androidVersion.add("Android 4.4 KitKat")
        androidVersion.add("Android 5 Lollipop")
        androidVersion.add("Android 6 Marshmallow")
        androidVersion.add("Android 7 Nougat")
        androidVersion.add("Android 8 Oreo")
        androidVersion.add("Android 9.0 Pie")
        androidVersion.add("Android 10 Q")

        val colors = resources.getStringArray(R.array.colors)

        val adapter: AndroidVersionAdapter = AndroidVersionAdapter(androidVersion, colors)


        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        val rv = findViewById<RecyclerView>(R.id.rvListaDeVersoes)
        rv.layoutManager = layoutManager
        rv.adapter = adapter
    }
}

