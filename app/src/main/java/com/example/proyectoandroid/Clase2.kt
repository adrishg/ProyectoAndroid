package com.example.proyectoandroid


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.proyectoandroid.R
import kotlinx.android.synthetic.main.activity_clase2.*
import kotlinx.android.synthetic.main.activity_main.*

class Clase2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botondos.setOnClickListener {
            Toast.makeText(this, "Has pulsado el botón desde kotlin", Toast.LENGTH_SHORT).show()
        }
        longclick.setOnLongClickListener{
            Toast.makeText(this, "Has pulsado largamente desde kotlin", Toast.LENGTH_SHORT).show()
            true  }

    }
    fun click(v: View) {
        Toast.makeText(this, "Has pulsado el botón xml", Toast.LENGTH_SHORT).show()
    }

}

