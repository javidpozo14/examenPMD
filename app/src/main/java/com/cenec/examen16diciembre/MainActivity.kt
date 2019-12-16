package com.cenec.examen16diciembre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Elimino la sombra de la action bar
        this.supportActionBar?.elevation=0f;
    }

    fun irALista(view: View) {
        var intent= Intent(this,Lista::class.java)
        startActivity(intent)
    }

    fun diseño(view: View) {
        var intent=Intent(this,Diseño::class.java)
        startActivity(intent)
    }

    fun preferencias(view: View) {
        var intent=Intent(this,Preferencias::class.java)
        startActivity(intent)

    }
}
