package com.example.jueves2_servicios

import android.app.Service
import android.content.ContentValues.TAG
import android.content.Intent
import android.media.MediaPlayer
import android.media.audiofx.BassBoost
import android.os.IBinder
import android.util.Log

@Suppress("UNREACHABLE_CODE")
class MyService : Service() {

    override fun onBind(intent: Intent): IBinder { //Cuan do se requiere enlazarse con otro servicio
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int { //Cada vez que manda llamar el servicio
        mostrarLog("funcion onStart")
        return super.onStartCommand(intent, flags, startId)

        for(i in  1..10){
            mostrarLog("Segundo plano"+i.toString())
            Thread.sleep(1000)
        }
        /*val miRep;
        miRep = MediaPlayer.create(this, BassBoost.Settings.System.DEFAULT_RINGTONE_URI)
        miRep.isLooping =true
        miRep.start()
        return START_STICKY*/






    }

    override fun onDestroy() {
        super.onDestroy()
    }
    fun mostrarLog(mensaje : String){
        Log.i(TAG, mensaje)
    }
}
