package com.example.proyectoandroid


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clase4.*
import kotlinx.android.synthetic.main.activity_main.*

class Clase4Act : AppCompatActivity() {


    var veces=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton.setOnClickListener {
            val intent = Intent(this, Actividad2::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        crearToast("onResume()")
    }
    override fun onPause() {
        super.onPause()
        crearToast("onPause()")
    }
    override fun onStart(){
        super.onStart()
        crearToast("onStart()")
    }
    override fun onRestart() {
        super.onRestart()
        crearToast("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        crearToast("onDestroy()")
    }

    fun crearToast(cadena : String){
        Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show()
    }
    override fun onSaveInstanceState(outState: Bundle?)
    {
        super.onSaveInstanceState(outState)
        outState?.putInt("contenidoVeces", veces)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        val text= savedInstanceState?.getInt("contenidoVeces")
        veces = text!!
        mensaje.text= text.toString()
    }
}

