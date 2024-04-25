package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private TextView txt1;
    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        txt1 = findViewById(R.id.txt1);

        spinner = findViewById(R.id.spinner);
        String[] opcion = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcion);
        spinner.setAdapter(adapter);
    }

    public void operar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        String select = spinner.getSelectedItem().toString();

        if(select.equals("sumar")){
            int resultado = num1+num2;
            String r = String.valueOf(resultado);
            txt1.setText(r);
        }
        if(select.equals("restar")){
            int resultado = num1-num2;
            String r = String.valueOf(resultado);
            txt1.setText(r);
        }
        if(select.equals("multiplicar")){
            int resultado = num1*num2;
            String r = String.valueOf(resultado);
            txt1.setText(r);
        }
        if(select.equals("dividir")){
            int resultado = num1/num2;
            String r = String.valueOf(resultado);
            txt1.setText(r);
        }
    }
}