package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView user, psw ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        psw = findViewById(R.id.psw);

    }
    public void actividadsesion(View v){
        String info = "Al parecer hay un error en tus credenciales favor validarlo";
        if(user.getText().toString().equals("user")){
            if(psw.getText().toString().equals("pas")){
                Intent registrado = new Intent(this, MainActivity2.class);
                registrado.putExtra("user",user.getText().toString());
                startActivity(registrado);
            }else{
                Toast.makeText(MainActivity.this, ""+info.toString(),Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(MainActivity.this, ""+info.toString(),Toast.LENGTH_LONG).show();
        }

    }
    public void actividadRegistro(View v){
        Intent registro = new Intent(this, Registrate.class);
        startActivity(registro);
    }
}