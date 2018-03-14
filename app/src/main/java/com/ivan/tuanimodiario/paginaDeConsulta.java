package com.ivan.tuanimodiario;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class paginaDeConsulta extends AppCompatActivity {

    //Inicializacion de objetos
    Button boton;
    AdView adView;
    RadioButton hombre, mujer, otro;
    Button prueba;
    LinearLayout datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_de_consulta);

        //Layout principal, creado apra introducit elementos visuales meidante codigo
        datos= (LinearLayout) findViewById(R.id.layoutDatos);


        //Inicializamos los RadioButtons para saver el sexo de la persona(aún no los tengo en uso) - Depende de la persona saldran unos u otros mensajes
        hombre= (RadioButton) findViewById(R.id.radioButtonHombre);
        mujer= (RadioButton) findViewById(R.id.radioButtonMujer);
        otro=(RadioButton) findViewById(R.id.radioButtonOtro);

        //Captadores de objetos de la vista
        boton=(Button) findViewById(R.id.button4);
        prueba=(Button) findViewById(R.id.botonPrueba);

        //Boton creado mediante Codigo
        Button botonNuevo= new Button(this);
        botonNuevo.setText("Otro Boton de Prueba");
        datos.addView(botonNuevo);
        botonNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"¿Para que has pulsado?",Toast.LENGTH_SHORT).show();
            }
        });


        //Pongo en negrita parte del texto del boton
        SpannableString texto= new SpannableString("Boton de prueba(Toast) ");
        StyleSpan texto1= new StyleSpan(Typeface.BOLD);
        texto.setSpan(texto1,0,5, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        prueba.setText(texto);

        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Has pulsado el Boton de Prueba",Toast.LENGTH_SHORT).show();
            }
        });

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem opcionMenu){

        int id1=opcionMenu.getItemId();

        if (id1==R.id.pruebaDeMenu){
            Toast toastMenu=Toast.makeText(this,"Has pulsado en el Mensaje", LENGTH_SHORT);
            toastMenu.setGravity(Gravity.CENTER,0,0);
            toastMenu.show();
            return true;
        }else{
            Toast toastMenu= makeText(this,"Has intentado Guardar", LENGTH_SHORT);
            toastMenu.setGravity(Gravity.CENTER,0,0);
            toastMenu.show();
            return true;
        }



    }

}
