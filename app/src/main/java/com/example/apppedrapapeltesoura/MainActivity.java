package com.example.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selPedra(View view){
            this.OpcaoSelecionada("pedra");

    }
    public void selPapel(View view){
        this.OpcaoSelecionada("papel");

    }
    public void selTesoura(View view){
        this.OpcaoSelecionada("tesoura");

    }

    public void OpcaoSelecionada(String opcao){

        ImageView imagem = findViewById(R.id.imageView);

        int num = new Random().nextInt(3);
        String opcoes[] = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[num];

        switch (opcaoApp){
            case "pedra" :
                imagem.setImageResource(R.drawable.pedra);
            break;
            case "papel" :
                imagem.setImageResource(R.drawable.papel);
            break;
            case "tesoura" :
                imagem.setImageResource(R.drawable.tesoura);
            break;
        }

        TextView texto = findViewById(R.id.textView2);

        if ((opcaoApp == "pedra" && opcao == "tesoura") || (opcaoApp == "papel" && opcao == "pedra")
        || (opcaoApp == "tesoura" && opcao == "papel")){
                texto.setText("Que pena! Você perdeu");
        } else if ((opcao == "pedra" && opcaoApp == "tesoura") || (opcao == "papel" && opcaoApp =="pedra")
        || (opcao == "tesoura" && opcaoApp == "papel")){
            texto.setText("Parabéns! Você ganhou");
        } else {
            texto.setText("Houve um empate!");
        }
    }
}