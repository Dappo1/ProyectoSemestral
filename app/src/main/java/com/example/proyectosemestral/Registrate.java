package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class Registrate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);


        String[] xmlOpciones = getResources().getStringArray(R.array.opciones);
        MultiAutoCompleteTextView vista = findViewById(R.id.Multiauto);
        ArrayAdapter<String> formatoDespliegue = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, xmlOpciones);
        vista.setAdapter(formatoDespliegue);
        vista.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());




    }
    public void continuarRegistro(View view){
        Intent segundoRegistro = new Intent(this, Registrate2.class);
        startActivity(segundoRegistro);
    }
}