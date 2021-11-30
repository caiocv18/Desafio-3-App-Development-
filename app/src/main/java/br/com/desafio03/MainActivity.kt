package br.com.desafio03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayCarros = arrayOf("Opala", "Fiat 147")
        //arrastar imagem redimensionada para a pasta res/drawable
        val arrayImagens = arrayOf(R.drawable.opala, R.drawable.fiat147)


        val meuAdapter = CustomAdapter(this,arrayCarros, arrayImagens)
        val listCarros = findViewById(R.id.idListViewCarros) as ListView
        listCarros.adapter = meuAdapter

        listCarros.setOnItemClickListener() { adapterView, view, position, id ->
            Toast.makeText(this, position.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, ActivityMostrarImagemCarro::class.java)
            intent.putExtra("posicao", position)
            startActivity(intent)
        }
    }
}