package com.example.clase2intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.clase2intent.activities.SegundaActivity

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listviewPaises)

        val paises = getPaises()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, paises)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val nacion = paises[i]
            navegarDetalle(nacion)
        }
    }

    private fun getPaises(): MutableList<String> {
        return mutableListOf("Argentina","Brasil", "Uruguay", "Bolivia", "venezuela", "Colombia", "Chile", "Peru", "Ecuardor", "España", "Portugal", "Francia", "Argentina","Brasil", "Uruguay", "Bolivia", "venezuela", "Colombia", "Chile", "Peru", "Ecuardor", "España", "Portugal", "Francia")
    }

    private fun navegarDetalle(nacion: String) {
        val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra("pais", nacion)
        startActivity(intent)
    }
}