package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class caso extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caso);
    }

    public void calculadora(View view){
        i = new Intent(this, calculadora.class);
        startActivity(i);
    }
    public void contactos(View view){
        i = new Intent(this, contacto.class);
        startActivity(i);
    }

    public void regresar1(View view){
        finish();
    }
}