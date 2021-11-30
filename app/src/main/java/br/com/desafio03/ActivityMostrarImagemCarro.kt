package br.com.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ActivityMostrarImagemCarro : AppCompatActivity() {

    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_imagem_carro)

        imageView = findViewById(R.id.image_view_carro)

        val posicao:Int = intent.getIntExtra("posicao", -1)

        if(posicao == 0){
            imageView.setImageResource(R.drawable.opalalarge)
        }else{
            imageView.setImageResource(R.drawable.fiat147large)
        }

    }
}