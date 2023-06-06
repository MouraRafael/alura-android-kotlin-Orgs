package com.example.orgs.dao

import com.example.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adiciona(produto: Produto) {
        Companion.produtos.add(produto)
    }


    fun buscaTodos(): List<Produto> {


        return Companion.produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto("Salada de Fruta", "Laranja, Maçã e Uva", BigDecimal("19.83"))
        )
    }
}