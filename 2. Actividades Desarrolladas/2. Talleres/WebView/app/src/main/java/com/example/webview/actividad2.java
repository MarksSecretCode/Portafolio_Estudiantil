package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;

public class actividad2 extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        wv1 = findViewById(R.id.wv1);

        Bundle bundle = getIntent().getExtras();
        String data= bundle.getString("direccion");
        wv1.loadUrl("https://"+data);
    }
    public void finalizar(View v){
        finish();
    }
}