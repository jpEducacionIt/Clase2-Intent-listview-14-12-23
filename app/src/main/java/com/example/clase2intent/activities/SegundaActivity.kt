package com.example.clase2intent.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.clase2intent.R

class SegundaActivity : AppCompatActivity() {
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val bundle = intent.extras
        val nacion = bundle?.getString("pais")

        tv = findViewById(R.id.textViewNombre)
        tv.text = nacion
    }
}