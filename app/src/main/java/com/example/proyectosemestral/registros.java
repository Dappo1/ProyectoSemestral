package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class registros extends AppCompatActivity {

    ArrayList<PersonajeVO> listapersonajes;
    RecyclerView recliclerpersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);

        listapersonajes = new ArrayList<>();
        recliclerpersonajes = findViewById(R.id.recicler);
        recliclerpersonajes.setLayoutManager(new LinearLayoutManager(this));
        llenarpersonajes();

        adaptador adapter = new adaptador(listapersonajes);
        recliclerpersonajes.setAdapter(adapter);


    }

    private void llenarpersonajes(){
        listapersonajes.add(new PersonajeVO("Magento","Empresa encargada de fabricacion paneles solares convenio N-12334 Vigente hasta 11-12-2023","Pablo Perez",R.drawable.descarga));
        listapersonajes.add(new PersonajeVO("Luis Canales","Postulante a DS19, Postulacion solitario","Luis Canales",R.drawable.user));
        listapersonajes.add(new PersonajeVO("Miguel Clark","Postulante a DS01, Postulacion solitario","",R.drawable.user));
        listapersonajes.add(new PersonajeVO("Ecasas","Empresa Constructora actualmente con DS19 en progreso Temuco","José Perico",R.drawable.descarga));

    }

    public void volver(View view){
        Intent volv = new Intent(this, MainActivity2.class);
        startActivity(volv);
    }
}