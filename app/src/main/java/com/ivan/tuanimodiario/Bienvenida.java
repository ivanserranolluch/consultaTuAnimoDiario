package com.ivan.tuanimodiario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;


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
