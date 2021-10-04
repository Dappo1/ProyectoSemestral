package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;

public class cargadatos extends AppCompatActivity {

    ProgressBar barra;
    ObjectAnimator animacion;
    RatingBar estrellas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargadatos);

        barra = findViewById(R.id.barraprogreso);
        animacion = ObjectAnimator.ofInt(barra, "progress", 5);

    }

    public void enviarRating(View view){
        Intent rating = new Intent(this, redireccion.class);
        startActivity(rating);

    }
}