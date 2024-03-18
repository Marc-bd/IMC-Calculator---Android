package com.projeto.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {


    private lateinit var textWeight: TextView
    private lateinit var textHeight: TextView
    private lateinit var textResult: TextView
    private lateinit var btn_back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        textWeight = findViewById(R.id.text_weight)
        textHeight = findViewById(R.id.text_height)
        textResult = findViewById(R.id.text_result)

        btn_back = findViewById<Button>(R.id.btn_back)

        val bundle = intent.extras

        if (bundle != null) {

            val weight = bundle.getDouble("weight")
            val height = bundle.getDouble("height")

            textWeight.text = "Peso informado $weight kg"
            textHeight.text = "Altura informado $height m"

            val imc = weight / (height * height)

            val resultado = when {
                imc < 18.5 -> "Baixo"
                imc in 18.5..24.9 -> "Normal"
                imc in 25.0..29.9 -> "Sobrepeso"
                else -> "Obeso"
            }

            textResult.text = resultado

            btn_back.setOnClickListener {
                this.onDestroy()
            }

        }
    }

}