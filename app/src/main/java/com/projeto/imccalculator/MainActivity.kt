package com.projeto.imccalculator

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var buttonCalc: Button
    private lateinit var editWeight: EditText
    private lateinit var editHeight: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalc = findViewById<Button>(R.id.btn_calc)
        editWeight = findViewById<EditText>(R.id.input_weight)
        editHeight = findViewById<EditText>(R.id.input_height)

        buttonCalc.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            val weight = editWeight.text.toString()
            val height = editHeight.text.toString()


            if(weight.isNotEmpty() && height.isNotEmpty()) {

                intent.putExtra("weight", weight.toDouble())
                intent.putExtra("height", height.toDouble())

                startActivity(intent)
            } else {
                val toast = Toast.makeText(this, "Preencha os campos corretamente!", Toast.LENGTH_LONG)
                toast.setGravity(Gravity.TOP, 0, 0)
                toast.show()
            }



        }
    }

}