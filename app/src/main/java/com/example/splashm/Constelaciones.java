package com.example.splashm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class Constelaciones extends AppCompatActivity {

    Button btnConstelacion,btnValidar;
    RadioButton rbtnNorte, rbtnSur;
    ImageView imgMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constelaciones);

        btnConstelacion =  findViewById(R.id.btnMapaConst);
        rbtnNorte = (RadioButton) findViewById(R.id.rbtnHnorte);
        rbtnSur = (RadioButton) findViewById(R.id.rbtnHsur);
        btnValidar = (Button) findViewById(R.id.btnValidar);
        imgMostrar = (ImageView) findViewById(R.id.imgvMostrar);


        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mostrar();
            }
        });


        btnConstelacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent mps = getPackageManager().getLaunchIntentForPackage("com.escapistgames.starchart");
                    startActivity(mps);
                }
                catch (Exception e)
                {
                    System.out.println("The 'try catch' is finished.");
                }
            }
        });
    }

    private void mostrar(){
        String cad="";

        if (rbtnNorte.isChecked() == true) {
            cad="Monstrando el hemisferio Norte  \n";
        }
        else if (rbtnSur.isChecked() == true) {
            cad="Monstrando el hemisferio Norte \n";

        }
        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }

}