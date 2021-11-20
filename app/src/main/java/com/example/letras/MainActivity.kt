package com.example.letras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        infoPrincipal()

        val textViewNome = findViewById<TextView>(R.id.nome)
        textViewNome.text = NOME

        val botaoInfoPricipal = findViewById<Button>(R.id.buttonInfoSecundaria)
        botaoInfoPricipal.setOnClickListener {
            infoSecundaria()
        }

        val botaoInfoSecundaria = findViewById<Button>(R.id.buttonInfo)
        botaoInfoSecundaria.setOnClickListener {
            infoPrincipal()
        }

    }

    fun infoPrincipal(){

        val textViewInfos = findViewById<TextView>(R.id.texto)
        textViewInfos.text = INFORMACOES_PRINCIPAIS

    }
    fun infoSecundaria(){

        val textViewInfoSecu = findViewById<TextView>(R.id.texto)
        textViewInfoSecu.text = INFORMACOES_SECUNDARIAS

    }
    companion object {
        val NOME = "Guilherme Hagiwara"
        val INFORMACOES_PRINCIPAIS = "Idade: 21\n"+
                "Sexo: Masculino"
        val INFORMACOES_SECUNDARIAS = "Gosto de jogar video game\n"+
                "ouvir musicas e dormir"

    }
}