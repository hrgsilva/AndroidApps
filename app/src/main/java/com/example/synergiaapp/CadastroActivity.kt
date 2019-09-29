package com.example.synergiaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        supportActionBar?.title = getString(R.string.cadastro)
    }
}
