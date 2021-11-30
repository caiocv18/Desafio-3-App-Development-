package br.com.desafio03

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val context: Activity, private val nomeCarro: Array<String>, private val imgIdCarro:Array<Int>) : ArrayAdapter<String>(context, R.layout.custom_listview,nomeCarro){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.custom_listview, null, true)
        val textView_Nome = view.findViewById(R.id.tv_NomeCarro) as TextView
        val imageView_carro = view.findViewById(R.id.imgCarro) as ImageView

        textView_Nome.text = nomeCarro[position]
        imageView_carro.setImageResource(imgIdCarro[position])

        return view
    }

}