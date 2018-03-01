package com.ivan.tuanimodiario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class paginaDeConsulta extends AppCompatActivity {

    //Inicializacion de objetos
    Button boton;
    AdView adView;
    RadioButton hombre, mujer, otro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_de_consulta);


        //Inicializamos los RadioButtons para saver el sexo de la persona(aún no los tengo en uso) - Depende de la persona saldran unos u otros mensajes
        hombre= (RadioButton) findViewById(R.id.radioButtonHombre);
        mujer= (RadioButton) findViewById(R.id.radioButtonMujer);
        otro=(RadioButton) findViewById(R.id.radioButtonOtro);

        //Captadores de objetos de la vista
        boton=(Button) findViewById(R.id.button4);

        //Escuchadores
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al pulsar el boton redirigimos a la nueva actividad Resultados
                Intent intent2 = new Intent(getApplicationContext(),Resultados.class);
                startActivity(intent2);
            }



        });
        adView=(AdView) findViewById(R.id.adView);
        MobileAds.initialize(this, "ca-app-pub-4280134931100425~5408089605");
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-4280134931100425/1824067810");

        /*private AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/
    }
}
