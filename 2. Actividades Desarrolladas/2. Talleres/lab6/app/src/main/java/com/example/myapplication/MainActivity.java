package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void presentacion(View view){
        i = new Intent(this, presentacion.class);
        startActivity(i);
    }

    public void caso(View view){
        i = new Intent(this, caso.class);
        startActivity(i);
    }
}