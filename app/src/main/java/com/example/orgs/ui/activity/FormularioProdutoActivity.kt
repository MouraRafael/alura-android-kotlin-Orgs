package com.example.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.orgs.R
import com.example.orgs.dao.ProdutosDao
import com.example.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity
    : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configuraBotaoSalvar()


    }

    private fun configuraBotaoSalvar() {
        val dao = ProdutosDao();


        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_produto_botao_salvar)
        botaoSalvar.setOnClickListener {
            val produtoNovo = criaProduto()
            dao.adiciona(produtoNovo)
            finish()

        }
    }

    private fun criaProduto(): Produto {
        val campoNome = findViewById<EditText>(R.id.activity_formulario_produto_nome)
        val nome = campoNome.text.toString()

        val campoDescricao = findViewById<EditText>(R.id.activity_formulario_produto_descricao)
        val descricrao = campoDescricao.text.toString()


        val campoValor = findViewById<EditText>(R.id.activity_formulario_produto_valor)
        val valorEmTexto = campoValor.text.toString()

        val valor = if (valorEmTexto.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmTexto)
        }

        return Produto(nome, descricrao, valor)
    }
}
/*
     //onClickListener antigo
     botaoSalvar.setOnClickListener( object : View.OnClickListener{
         override fun onClick(p0: View?) {
             val campoNome = findViewById<EditText>(R.id.nome)
             val nome = campoNome.text.toString()


             Log.i("FormularioProduto","OnCreate $nome")
         }
     })
      */



