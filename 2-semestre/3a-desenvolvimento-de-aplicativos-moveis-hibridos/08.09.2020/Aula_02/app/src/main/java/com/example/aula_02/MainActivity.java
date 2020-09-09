// pacote da aplicação
package com.example.aula_02;

// importação de bibliotecas do Android

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// A linha abaixo é a declaração da classe principal do programa
public class MainActivity extends AppCompatActivity {
    // aqui as variavéis são de escopo GLOBAL
    // Sempre antes do @Override nós devemos colocar os componentes
    // criando variáveis para associar
    EditText nome, sobrenome;
    Button concatenar;
    TextView saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // aqui as variavéis são de escopo LOCAL
        super.onCreate(savedInstanceState);
        // A linha abaixo mostra a TELA que criamos (layout)
        setContentView(R.layout.activity_main);
        /* aqui vamos associar os componentes do layout com
           as variáveis que declaramos acima */
        nome = findViewById(R.id.editTextNome);
        sobrenome = findViewById(R.id.editTextSobrenome);
        concatenar = findViewById(R.id.buttonConcatenar);
        saida = findViewById(R.id.textViewSaida);

        concatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saida.setText("Funcionou!!!");
            }
        });
    }
}