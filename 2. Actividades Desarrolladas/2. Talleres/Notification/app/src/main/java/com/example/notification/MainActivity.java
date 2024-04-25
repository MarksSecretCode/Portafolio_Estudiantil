package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        num=(int)(Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notification = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notification.show();
    }

    public void controlar(View v){
        String valorIngresado = editTextNumber.getText().toString();
        int valor = Integer.parseInt(valorIngresado);

        if (valor == num){
            Toast notification = Toast.makeText(this, "recordaste el número mostrado ", Toast.LENGTH_LONG);
            notification.show();
        } else {
            Toast notification = Toast.makeText(this, "No recordaste el número mostrado ", Toast.LENGTH_LONG);
            notification.show();
        }
    }
}