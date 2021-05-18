package com.example.splashm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button btnSistema, btnConstalacions,btnGalaxias, btnEstrellas, btnNebulosas, btnFenomenos;

    public static final long SPLASH_SCREEN_DELAY = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSistema = (Button) findViewById(R.id.btnSistemaSolar);
        btnConstalacions = (Button) findViewById(R.id.btnConstelaciones);
        btnGalaxias = (Button) findViewById(R.id.btnGalaxias);
        btnEstrellas = (Button) findViewById(R.id.btnEstrellas);
        btnNebulosas = (Button) findViewById(R.id.btnNebulosas);
        btnFenomenos = (Button) findViewById(R.id.btnFenomenos);


        btnSistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_splash3);
            }
        });

        btnGalaxias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_galaxia);
            }
        });
        btnConstalacions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_constelaciones);
            }
        });

        btnNebulosas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_nebulosas);
            }
        });
        btnFenomenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_fenomenos);
            }
        });

       /* //implementar el tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(MainActivity.this, Splash2.class);
                startActivity(intent);
                finish();
            }
        };

        //se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);*/
    }

    public void Usasplash(){
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(MainActivity.this,Splash2.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }

    public void buscarEstrellas(View view){
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(MainActivity.this,Splash2.class);
                startActivity(intent);
                finish();
            }
        };
        setContentView(R.layout.activity_constelaciones);
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }

}