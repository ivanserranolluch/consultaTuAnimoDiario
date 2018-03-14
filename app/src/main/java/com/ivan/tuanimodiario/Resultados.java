package com.ivan.tuanimodiario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class Resultados extends AppCompatActivity {

    ImageView imagen;
    TextView textoAmino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        textoAmino=(TextView) findViewById(R.id.textoAnimo);
        imagen=(ImageView) findViewById(R.id.imageView);
        String res=imagenRandom();
        if(res=="a"){
            imagen.setImageResource(R.mipmap.rata);
            textoAmino.setText(R.string.rata);
        }else if(res=="b"){
            imagen.setImageResource(R.mipmap.elefante);
            textoAmino.setText(R.string.elefante);
        }else if(res=="c"){
            imagen.setImageResource(R.mipmap.animal);
            textoAmino.setText(R.string.gato);
        }else if(res=="d"){
            imagen.setImageResource(R.mipmap.dove);
            textoAmino.setText(R.string.paloma);
        }else if(res=="e"){
            imagen.setImageResource(R.mipmap.thro);
            textoAmino.setText(R.string.caballo);
        }


    }
    private String imagenRandom(){
        Random num= new Random();
        int numero=num.nextInt(5);
        String vector[]=new String[5];
        vector[0]="a";
        vector[1]="b";
        vector[2]="c";
        vector[3]="d";
        vector[4]="e";
        String res=vector[numero];
        return res;
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
