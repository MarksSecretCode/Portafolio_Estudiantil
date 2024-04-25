package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora extends AppCompatActivity {

    private EditText editTextText;
    private TextView txt;
    private double resultado = 0;
    private String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        editTextText = findViewById(R.id.editTextText);
        txt = findViewById(R.id.txt);

        // Definir los botones
        Button btnSum = findViewById(R.id.btnSum);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnOperate = findViewById(R.id.btnOperate);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnReturn = findViewById(R.id.button24);

        // Definir los botones numéricos
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        // Configurar el OnClickListener para los botones de operaciones
        btnSum.setOnClickListener(v -> setOperator("+"));
        btnSubtract.setOnClickListener(v -> setOperator("-"));
        btnMultiply.setOnClickListener(v -> setOperator("*"));
        btnDivide.setOnClickListener(v -> setOperator("/"));
        btnOperate.setOnClickListener(v -> calculateResult());
        btnClear.setOnClickListener(v -> clearInput());
        btnReturn.setOnClickListener(v -> regresar());

        // Configurar el OnClickListener para los botones numéricos
        btn0.setOnClickListener(v -> appendNumber("0"));
        btn1.setOnClickListener(v -> appendNumber("1"));
        btn2.setOnClickListener(v -> appendNumber("2"));
        btn3.setOnClickListener(v -> appendNumber("3"));
        btn4.setOnClickListener(v -> appendNumber("4"));
        btn5.setOnClickListener(v -> appendNumber("5"));
        btn6.setOnClickListener(v -> appendNumber("6"));
        btn7.setOnClickListener(v -> appendNumber("7"));
        btn8.setOnClickListener(v -> appendNumber("8"));
        btn9.setOnClickListener(v -> appendNumber("9"));
    }

    private void setOperator(String operator) {
        operador = operator;
        resultado = Double.parseDouble(editTextText.getText().toString());
        editTextText.setText("");
    }

    private void calculateResult() {
        if (!editTextText.getText().toString().isEmpty()) {
            double number = Double.parseDouble(editTextText.getText().toString());
            switch (operador) {
                case "+":
                    resultado += number;
                    break;
                case "-":
                    resultado -= number;
                    break;
                case "*":
                    resultado *= number;
                    break;
                case "/":
                    if (number != 0) {
                        resultado /= number;
                    } else {
                        editTextText.setText("Error: división entre 0");
                    }
                    break;
            }
            editTextText.setText(String.valueOf(resultado));
            operador = "";
        }
    }

    private void appendNumber(String number) {
        editTextText.append(number);
    }

    private void clearInput() {
        editTextText.setText("");
        resultado = 0;
        operador = "";
    }

    private void regresar() {
        Intent i = new Intent(this, caso.class);
        startActivity(i);
    }
}
