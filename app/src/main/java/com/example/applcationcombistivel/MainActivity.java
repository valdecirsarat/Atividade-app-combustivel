package com.example.applcationcombistivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sair = (Button) findViewById(R.id.buttonCancelar);
        Button calcular = (Button) findViewById(R.id.buttonCalcular);
        EditText valorEtanol = findViewById(R.id.valorEntanol);
        final EditText valorGasolina = (EditText) findViewById(R.id.valorGasolina);
        final EditText consumoEtanol = (EditText) findViewById(R.id.valorConsumoEtanol);
        final EditText consumoGasolina = (EditText) findViewById(R.id.valorConsumoGasolina);
        final TextView textoResultado = (TextView) findViewById(R.id.textoResultado);

        Combustivel combustivel = new Combustivel();

        //Seta metodo onclick no button calcular
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pega valor dos Combustiveis e verifica se esta vazio
                if(valorEtanol.getText().toString().isEmpty()){
                    valorEtanol.setError("Por favor, insira um valor");
                    valorEtanol.requestFocus();
                    return;
                }else{
                    combustivel.setPrecoEtanol(Double.parseDouble(String.valueOf(valorEtanol.getText())));
                }
                if(valorGasolina.getText().toString().isEmpty()){
                    valorGasolina.setError("Por favor, insira um valor");
                    valorGasolina.requestFocus();
                    return;
                }
                else{
                    combustivel.setPrecoGasolina(Double.parseDouble(String.valueOf(valorGasolina.getText())));
                }
                //Pega valor do consumo e verifca se esta vazio
                if(consumoEtanol.getText().toString().isEmpty()) {
                    consumoEtanol.setError("Por favor, insrira um valor");
                    consumoEtanol.requestFocus();
                    return;
                }else{
                    combustivel.setConsumoEtanol(Double.parseDouble(String.valueOf(consumoEtanol.getText())));
                }
                if(consumoGasolina.getText().toString().isEmpty()){
                    consumoGasolina.setError("Por favor, insrira um valor");
                    consumoGasolina.requestFocus();
                    return;
                }else{
                    combustivel.setConsumoGasolina(Double.parseDouble(String.valueOf(consumoGasolina.getText())));
                }

                //faz calculo do Rendimento
               combustivel.calculoRedimento();
               textoResultado.setText(combustivel.getMsg());
            }

        });

        //seta metodo onclick no button sair.
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Volte Sempre!!,App sendo finalizado.",Toast.LENGTH_LONG).show();
                finish();
            }
        });



    }







}