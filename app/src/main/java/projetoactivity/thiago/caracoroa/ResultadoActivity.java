package projetoactivity.thiago.caracoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagem = (ImageView)findViewById(R.id.moedaID);
        botaoVoltar = (ImageView)findViewById(R.id.voltarID);

        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara")){
                // imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else{
                //imagem coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultadoActivity.this, MainActivity.class));
            }
        });

    }
}
