package com.example.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.orgs.R
import com.example.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity
    : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()

            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val descricrao = campoDescricao.text.toString()


            val campoValor = findViewById<EditText>(R.id.valor)
            val valorEmTexto = campoValor.text.toString()

            val valor = if(valorEmTexto.isBlank()) {BigDecimal.ZERO} else {BigDecimal(valorEmTexto)}

            val produtoNovo = Produto(nome, descricrao, valor)

            Log.i("FormularioProduto","$produtoNovo")



            Log.i("FormularioProduto", "OnCreate $nome")
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
    }
}




