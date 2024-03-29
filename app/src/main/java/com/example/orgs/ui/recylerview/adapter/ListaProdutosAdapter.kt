package com.example.orgs.ui.recylerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto

class ListaProdutosAdapter(
    private val context:Context,
    produtos:List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    private val produtos = produtos.toMutableList()


    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.produto_item_nome)
            nome.text = produto.nome

            itemView.findViewById<TextView>(R.id.produto_item_descricao).text = produto.descricao
            itemView.findViewById<TextView>(R.id.produto_item_valor).text = produto.valor.toPlainString()

        }
    }


    /*
    O Recyclerview.ViewHolder retornado do onCreateViewHolder é uma referência genérica e por tanto precisa de uma implementação real
    Então a referencia RecyclerView.ViewHolder é usada como base para fazer ima implementação nossa do que queremos de um viewholder

    Geralmente, por ser algo que apenas será utilizado pelo adapter a classe é criada dentro do próprio adapter
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        /*
         resta funcao vai retornar uma view mas como precisamos criar a view a partir de um layout, com cada um dos viewholders.

         transformando o arquivo layout que temos na pasta de res e em uma view exclusiva.
         usando o onceito de inflar view. Usando o Layout Inflater
         */

        val inflater = LayoutInflater.from(context)

        /*
        o inflater precisa de um resource base que é o arquivo do qual nos baseamos;
        o root o que determina o Viewgroup que enviaremos para onde enviamos o nosso recyclerview. ele vem a partir dos paramentros do onCreateViewHolder
        e o attach to rrot que determina se anexaremos essa view que estamos criando diretamente com o seu root ou se isso será feito em outro momento
         */
        val view = inflater.inflate(
            R.layout.produto_item,
            parent,
            false
        )

        return ViewHolder(view)


    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int {
        return produtos.size
    }

    fun atualiza(produtos: List<Produto>) {
        this.produtos.clear()
        this.produtos.addAll(produtos)

        notifyDataSetChanged()
    }
}









