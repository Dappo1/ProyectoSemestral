package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class registronuevo extends AppCompatActivity {

    Spinner combo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registronuevo);
        ArrayList<String> comoopciones = new ArrayList<String>();
        comoopciones.add("Empresa");
        comoopciones.add("Persona");


        combo = findViewById(R.id.spinneremp);

        ArrayAdapter<CharSequence> adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, comoopciones);
        combo.setAdapter(adapter);

    }
}