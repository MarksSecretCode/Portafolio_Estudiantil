package com.example.audio2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void iniciar(View v){
        destruir();
        mp = MediaPlayer.create(this,R.raw.song);
        mp.start();
    }
    public void destruir(){
        if(mp != null){
            mp.release();
        }
    }

    public void pausar(View v){
        if(mp != null && mp.isPlaying()){
            position = mp.getCurrentPosition();
            mp.pause();
        }
    }

    public void continuar(View v){
        if(mp != null && mp.isPlaying() == false){
            mp.seekTo(position);
            mp.start();
        }
    }

    public void detener(View v){
        if(mp != null){
            mp.stop();
            position = 0;
        }
    }
}