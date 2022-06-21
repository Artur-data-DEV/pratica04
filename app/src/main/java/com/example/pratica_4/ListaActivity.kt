package com.example.pratica_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        title = "Championships"

        val champs = arrayOf("\Campeonato Brasileiro \nO maior campeonato do Brasil\n", "\nCampeonato Carioca \nCampeonato do Rio de Janeiro.\n", "\nChampions League \nMaior Campeonato da Europa\n")
        var adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, champs)

        val lista = findViewById<ListView>(R.id.lstLista)
        lista.adapter = adaptador

        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }

        val botaoLogout = findViewById<ImageButton>(R.id.btnLogout)
        botaoLogout.setOnClickListener {
            val intencao = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intencao)
        }

    }

}