package com.example.laboratorioactivies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.MessageFormat;

public class Check extends AppCompatActivity {

    private EditText et1,et2;

    private TextView tvSuma, tvResta;

    private CheckBox cbSuma, cbResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tvSuma = findViewById(R.id.tvSuma);
        tvResta = findViewById(R.id.tvResta);
        cbSuma = findViewById(R.id.cbSuma);
        cbResta = findViewById(R.id.cbResta);
    }

    public void Operar(View view){
        tvSuma.setText("");
        tvResta.setText("");
        String valor1 = et1.getText().toString();

        String valor2 = et2.getText().toString();

        int nro1= Integer.parseInt(valor1);
        int nro2= Integer.parseInt(valor2);

        if(cbSuma.isChecked()==true){
            int suma = nro1+nro2;

            String txtSuma = String.valueOf(suma);

            tvSuma.setText(MessageFormat.format("La suma es: {0}", txtSuma));
        }
        if(cbResta.isChecked()==true){
            int resta = nro1 - nro2;

            String txtResta = String.valueOf(resta);
            tvResta.setText(MessageFormat.format("La resta es: {0}", txtResta));
        }
    }

    public void Menu(View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}