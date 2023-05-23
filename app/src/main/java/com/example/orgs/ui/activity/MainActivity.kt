package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.ui.recylerview.adapter.ListaProdutosAdapter

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)



//        val nome: TextView = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//
//        val valor:TextView = findViewById(R.id.valor)
//        valor.text = "19.99"

        val recyclerView:RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = ListaProdutosAdapter()



    }
}