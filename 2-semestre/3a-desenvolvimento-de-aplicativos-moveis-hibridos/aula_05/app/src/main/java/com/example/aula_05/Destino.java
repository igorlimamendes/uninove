package com.example.aula_05;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Destino extends AppCompatActivity {
    TextView peso, altura;
    Button btFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);
        peso = findViewById(R.id.textViewPeso);
        altura = findViewById(R.id.textViewAltura);
        btFechar = findViewById(R.id.buttonFechar);

        // criar o correio que vai receber o pacote
        Intent correio = getIntent();

        // retiramos o pacote de dentro do correio
        Bundle pacote = correio.getExtras();

        double vPeso = Double.parseDouble(pacote.getString("varPeso"));

        // atribuir o valor das variáveis aos objetos do layout
        peso.setText(pacote.getString("varPeso"));
        altura.setText(pacote.getString("varAltura"));

        btFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
