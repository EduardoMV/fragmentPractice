package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculadora = findViewById<Button>(R.id.calculadora)
        val imc = findViewById<Button>(R.id.imc)

        calculadora.setOnClickListener {
            cambiarFragmento(Calculadora())
        }

        imc.setOnClickListener {
            cambiarFragmento(IndiceMC())
        }

        cambiarFragmento(Inicio())

    }

    fun cambiarFragmento(fragmento: Fragment)
    {
        val manage = supportFragmentManager
        val transaccion = manage.beginTransaction()
        transaccion.replace(R.id.fragmentContainerView, fragmento)
        transaccion.commit()
    }
}