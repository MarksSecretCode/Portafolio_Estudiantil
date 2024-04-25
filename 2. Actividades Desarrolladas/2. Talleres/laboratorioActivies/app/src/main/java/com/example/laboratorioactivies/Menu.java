package com.example.laboratorioactivies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void MainActivity(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Spinner(View view){
        Intent i = new Intent(this, Spinner.class);
        startActivity(i);
    }

    public void Radio(View view){
        Intent i = new Intent(this, Radio.class);
        startActivity(i);
    }

    public void Check(View view){
        Intent i = new Intent(this, Check.class);
        startActivity(i);
    }

    public void Switch(View view){
        Intent i = new Intent(this, Switch.class);
        startActivity(i);
    }

    public void Image(View view){
        Intent i = new Intent(this, Image.class);
        startActivity(i);
    }
}