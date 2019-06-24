package br.com.uniciv.primeiroapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coordinator_main)


        Log.d("categoria", "mensagem de debug")
        Log.i("categoria", "mensagem de informação")
        Log.w("categoria", "mensagem de aviso")
        Log.e("categoria", "mensagem de erro")
        Log.e("categoria", "mensagem de erro", RuntimeException("erro"))

        val msg = intent.getStringExtra("msg")
        Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()

    }
}
