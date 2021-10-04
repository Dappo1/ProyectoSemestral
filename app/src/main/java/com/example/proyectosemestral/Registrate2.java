package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Registrate2 extends AppCompatActivity {

    ImageView visorimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate2);

        visorimg = findViewById(R.id.img);
        visorimg.setImageResource(R.drawable.flechaazul);

    }
    public void registrofinal(View view){
        Intent registro3 = new Intent(this, Registro3.class);
        startActivity(registro3);
    }
}