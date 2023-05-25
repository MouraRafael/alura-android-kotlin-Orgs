package com.example.orgs.ui.activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recylerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal
import java.math.MathContext

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)






//        val nome: TextView = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//
//        val valor:TextView = findViewById(R.id.valor)
//        valor.text = "19.99"

        val recyclerView:RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = ListaProdutosAdapter(this,
            listOf(
                Produto("123","321", BigDecimal("25.24")),
                Produto("456","654", BigDecimal("25.24")),
                Produto("789","987", BigDecimal("25.24"))
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)



    }
}