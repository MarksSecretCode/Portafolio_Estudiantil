package com.example.video_01;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    MediaRecorder recorder;
    MediaPlayer player;
    File archivo;
    Button btnGrabar, btnDetener, btnReproducir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        btnGrabar = findViewById(R.id.btnGrabar);
        btnDetener = findViewById(R.id.btnDetener);
        btnReproducir = findViewById(R.id.btnReproduir);
    }

    public void grabar(View v){
        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        File path = getExternalFilesDir(null);
        if (path != null){
            try {
                archivo = File.createTempFile("temporal", "3gp, patch");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            recorder.setOutputFile(archivo.getAbsoluteFile());
            try {
                recorder.prepare();
            } catch (IOException e){
                e.printStackTrace();
                return;
            }
            recorder.start();
            tv1.setText("Grabando");
            btnGrabar.setText("Grabando");
            btnGrabar.setEnabled(false);
            btnDetener.setEnabled(true);
        } else {
            Toast.makeText(this, "No se pudo acceder al almacenamiento externo.", Toast.LENGTH_SHORT).show();
        }
    }

    public void detener(View v){
        if(recorder != null){
            recorder.stop();
            recorder.release();
            recorder = null;
            player = new MediaPlayer();
            player.setOnCompletionListener(mp -> {
                btnGrabar.setEnabled(true);
                btnDetener.setEnabled(true);
                btnReproducir.setEnabled(true);
                tv1.setText("Lista");
                player.release();
            });

            try {
                player.setDataSource(archivo.getAbsolutePath());
                player.prepare();
                player.start();
                tv1.setText("Reproduciendo");
                btnGrabar.setEnabled(false);
                btnDetener.setEnabled(false);
                btnReproducir.setEnabled(false);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void reproducir(View v) {
        if(player != null) {
            player.start();
            btnGrabar.setEnabled(false);
            btnDetener.setEnabled(false);
            btnReproducir.setEnabled(false);
            tv1.setText("Reproduciendo");
        }
    }


}