package com.example.luissancar.ejercicio23reproduccionsonidoe;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void son1(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.son1);
        mp.start();

    }



    public void son2(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.son2);
        mp.start();

    }
}
