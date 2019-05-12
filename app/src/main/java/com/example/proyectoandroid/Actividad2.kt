package com.example.proyectoandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Actividad2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)
    }

    override fun onResume() {
        super.onResume()
        crearToast("onResume() 2")
    }
    override fun onPause() {
        super.onPause()
        crearToast("onPause() 2")
    }
    override fun onStart(){
        super.onStart()
        crearToast("onStart() 2")
    }
    override fun onRestart() {
        super.onRestart()
        crearToast("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        crearToast("onDestroy() 2")
    }

    fun crearToast(cadena : String){
        Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show()
    }
}
