package com.example.splashm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash3 extends AppCompatActivity {

    Button btnmapasolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash3);

        btnmapasolar = findViewById(R.id.btnMapaSolar);

        btnmapasolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent mp = getPackageManager().getLaunchIntentForPackage("com.vitotechnology.SolarWalkFree");
                    startActivity(mp);
                }
                catch (Exception e)
                {
                    System.out.println("The 'try catch' is finished.");
                }

            }
        });
    }

}