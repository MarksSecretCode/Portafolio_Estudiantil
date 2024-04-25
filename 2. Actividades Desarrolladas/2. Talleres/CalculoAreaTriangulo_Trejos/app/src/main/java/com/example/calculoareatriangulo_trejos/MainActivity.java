package com.example.calculoareatriangulo_trejos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_SideA, et_SideB, et_SideC;
    private RadioGroup radioGroup;
    private TextView tv_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_SideA = findViewById(R.id.et_SideA);
        et_SideB = findViewById(R.id.et_SideB);
        et_SideC = findViewById(R.id.et_SideC);

        et_SideA.setEnabled(false);
        et_SideB.setEnabled(false);
        et_SideC.setEnabled(false);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                et_SideA.setEnabled(false);
                et_SideB.setEnabled(false);
                et_SideC.setEnabled(false);

                et_SideA.setText("");
                et_SideB.setText("");
                et_SideC.setText("");

                if (checkedId == R.id.rb_Equilateral) {
                    et_SideA.setEnabled(true);
                } else if (checkedId == R.id.rb_Isosceles) {
                    et_SideA.setEnabled(true);
                    et_SideB.setEnabled(true);
                } else if (checkedId == R.id.rb_Scalene) {
                    et_SideA.setEnabled(true);
                    et_SideB.setEnabled(true);
                    et_SideC.setEnabled(true);
                }
            }
        });

        Button btn_Calculate = findViewById(R.id.btn_Calculate);
        tv_Result = findViewById(R.id.tv_Result);

        btn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }
    private void calculate() {
        if (et_SideA.isEnabled() && et_SideB.isEnabled() && et_SideC.isEnabled()) {
            double sideA = Double.parseDouble(et_SideA.getText().toString());
            double sideB = Double.parseDouble(et_SideB.getText().toString());
            double sideC = Double.parseDouble(et_SideC.getText().toString());

            double area = calculateTriangleArea(sideA, sideB, sideC);

            tv_Result.setText("El área del triángulo es: " + area);
        } else if (et_SideA.isEnabled() && et_SideB.isEnabled()) {
            double sideA = Double.parseDouble(et_SideA.getText().toString());
            double sideB = Double.parseDouble(et_SideB.getText().toString());
            double sideC = sideB;

            double area = calculateTriangleArea(sideA, sideB, sideC);

            tv_Result.setText("El área del triángulo es: " + area);
        } else if (et_SideA.isEnabled()) {
            double sideA = Double.parseDouble(et_SideA.getText().toString());
            double sideB = sideA;
            double sideC = sideA;

            double area = calculateTriangleArea(sideA, sideB, sideC);

            tv_Result.setText("El área del triángulo es: " + area);
        } else {
            tv_Result.setText("Por favor, seleccione un tipo de triángulo y complete los lados.");
        }
    }
    private double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
