package com.example.quiz_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultadoTextView;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoTextView = findViewById(R.id.resultadoTextView);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPrecioTotal(5, 30, 1.50);
            }
        });
    }

    // Método para calcular el precio total de las manzanas
    private void calcularPrecioTotal(int cantidadCajas, int manzanasPorCaja, double precioPorManzana) {
        double precioTotal = cantidadCajas * manzanasPorCaja * precioPorManzana;

        resultadoTextView.setText("Precio total: $" + precioTotal);
    }
}