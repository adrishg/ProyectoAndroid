package com.example.proyectoandroid

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        boton1.setOnClickListener{
            val intent = Intent(this, Clase1::class.java)
            startActivity(intent)
        }
        boton2.setOnClickListener{
            val intent = Intent(this, Clase2::class.java)
            startActivity(intent)
        }
        boton3.setOnClickListener{
            val intent = Intent(this, Clase3::class.java)
            startActivity(intent)
        }
        boton4.setOnClickListener{
            val intent = Intent(this, Clase4Act::class.java)
            startActivity(intent)
        }
        boton5.setOnClickListener{
            val intent = Intent(this, Clase4Int::class.java)
            startActivity(intent)
        }
        boton6.setOnClickListener{
           // val intent = Intent(this, Clase7::class.java)
            //startActivity(intent)
        }
        boton7.setOnClickListener{
            //val intent = Intent(this, Clase8::class.java)
            //startActivity(intent)
        }
        boton8.setOnClickListener{
            val intent = Intent(this, Clase9::class.java)
            startActivity(intent)
        }
        boton9.setOnClickListener{
            val intent = Intent(this, Clase1::class.java)
            startActivity(intent)
        }
        boton10.setOnClickListener{
            val intent = Intent(this, Clase1::class.java)
            startActivity(intent)
        }




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
