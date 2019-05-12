package com.example.proyectoandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jueves2_servicios.MyService
import kotlinx.android.synthetic.main.activity_clase9.*
import kotlinx.android.synthetic.main.activity_main.*

class Clase9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase9)

        val intent = Intent(this, MyService::class.java)
        startService(intent)

        button1.setOnClickListener{
            val intent = Intent(this, MyService::class.java)
            startService(intent)
        }

        button2.setOnClickListener {
            val intent = Intent (this, MyService::class.java)
            stopService(intent)
        }
    }
}
