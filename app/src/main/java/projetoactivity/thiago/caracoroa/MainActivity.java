package projetoactivity.thiago.caracoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.jogarId);
        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // gerar numero aleatorio
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);//o 2 define randomico de dois numeros 0=cara e 1= coroa

               // opcao [numeroAleatorio];
                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("opcao",opcao[numeroAleatorio]);
                startActivity(intent);

            }
        });


    }
}
