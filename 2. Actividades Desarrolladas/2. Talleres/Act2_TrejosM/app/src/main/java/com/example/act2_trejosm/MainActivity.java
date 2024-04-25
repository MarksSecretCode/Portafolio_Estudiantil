package com.example.act2_trejosm;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Creado", Toast.LENGTH_SHORT).show(); // La actividad está Creada
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Empezar", Toast.LENGTH_SHORT).show(); // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Continuar", Toast.LENGTH_SHORT).show(); // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "En Pausa", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad (esta actividad está a punto de ser "detenida").
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Detenida", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora esta "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destruida", Toast.LENGTH_SHORT).show(); // La actividad está a punto de ser destruida.
    }
}