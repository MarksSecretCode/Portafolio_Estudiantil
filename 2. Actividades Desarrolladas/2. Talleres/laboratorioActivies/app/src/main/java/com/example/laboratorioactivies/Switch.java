package com.example.laboratorioactivies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Switch extends AppCompatActivity {
    private android.widget.Switch switch1, switch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        switch1=findViewById(R.id.switch1);
        switch2=findViewById(R.id.switch2);
    }

    public void switch1OnChange(View view){
        if(switch1.isChecked())
            Toast.makeText(this, "Datos móviles activados", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Datos móviles descativados", Toast.LENGTH_SHORT).show();
    }
    public void switch2OnChange(View view){
        if(switch2.isChecked())
            Toast.makeText(this, "Wi-Fi activado", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Wi-Fi descativado", Toast.LENGTH_SHORT).show();
    }

    public void Menu(View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}