package com.ivan.tuanimodiario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Bienvenida extends AppCompatActivity implements View.OnClickListener{

    Button consultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        //Obtencion de objetos de la vista
        consultar=(Button)findViewById(R.id.consultar);

        //Listeneros o escuchadores
        consultar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.consultar:
                Intent intent = new Intent(this,paginaDeConsulta.class);
                startActivity(intent);
                break;
        }

    }
}
