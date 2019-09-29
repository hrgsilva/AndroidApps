package com.example.synergiaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConfiguracaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracao)
        supportActionBar?.title = getString(R.string.configuracao)
    }
}
