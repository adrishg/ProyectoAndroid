package com.example.proyectoandroid

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast


    class Clase3 : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }


        fun alerta(view: View) {
            val alerta = AlertDialog.Builder(this@Clase3)
            alerta.setTitle("My first alert")
            alerta.setMessage("Estas seguro de salir?")
            alerta.setIcon(R.mipmap.ic_launcher)

            alerta.setPositiveButton("yes bro") { dialog: DialogInterface?, which: Int -> finish() }

            alerta.setNegativeButton("Nop") { dialog: DialogInterface?, which: Int ->
                Toast.makeText(this, "I like you ", Toast.LENGTH_SHORT).show()
            }

            alerta.setNeutralButton("Neutral") { dialog: DialogInterface?, which: Int ->
                Toast.makeText(this, "Le picaste wey", Toast.LENGTH_SHORT).show()
            }

            alerta.show()
        }



    }
