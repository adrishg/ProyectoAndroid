package com.example.clase7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.proyectoandroid.Fragment1
import com.example.proyectoandroid.Fragment2
import com.example.proyectoandroid.R
import kotlinx.android.synthetic.main.activity_clase7.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase7)

        boton1.setOnClickListener {
                view-> fragUno(Fragment1())
        }
        boton2.setOnClickListener {
                view -> fragDos(Fragment2())
        }
    }

    fun fragUno(fragmento1: Fragment1){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame, Fragment())
    }
    fun fragDos(fragmento2: Fragment2){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame,Fragment())
    }
}
