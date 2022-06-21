package com.example.pratica_4

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.tbrCadastro))
        setTitle("Add new")

        val svButton = findViewById<Button>(R.id.btnSalvar)
        svButton.setOnClickListener {
            finish()
        }

        val cancelButton = findViewById<Button>(R.id.btnCancelar)
        cancelButton.setOnClickListener {
            finish()
        }
    }
}