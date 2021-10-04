package com.example.proyectosemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String parametros2;
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        datos();
        nombre = findViewById(R.id.nameusuario);
        nombre.setText("");
        nombre.append(parametros2);
    }




    private String datos(){
        Intent parametros = this.getIntent();
        Bundle parametrosactividad2 = parametros.getExtras();
        parametros2 = parametrosactividad2.getString("user");
        return parametros2;
    }
    public  void info (View view){
        Intent informacion = new Intent(this, info.class);
        startActivity(informacion);
    }
    public void ver(View view){
        Intent ver = new Intent(this, registros.class);
        startActivity(ver);
    }
    public void agregar(View view){
        Intent agreg = new Intent(this, registronuevo.class);
        startActivity(agreg);
    }
}
