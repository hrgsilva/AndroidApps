package com.example.synergiaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonStart.setOnClickListener{
            val Slogin: String = inputUser.text.toString()
            val Spassword:String = inputPassword.text.toString()

            if (Slogin == "aluno" && Spassword == "impacta"){

            }
            else if(Slogin == "" && Spassword == ""){
                Toast.makeText(
                    this, "Campos em branco, Informe usuário e senha!",
                    Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(
                    this, "Usuário ou senha incorretos",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
