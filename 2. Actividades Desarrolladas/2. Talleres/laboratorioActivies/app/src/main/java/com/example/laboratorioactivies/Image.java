package com.example.laboratorioactivies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Image extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        tv1=findViewById(R.id.tv1);
    }

    public void llamar(View view){
        tv1.setText("LLamando");
    }

    public void Menu(View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}