package com.example.myeas.spaceapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnInundacion;
    private Button btnTornados;
    private Button btnTsunami;
    private Button btnTemp;
    private Button btnAvalancha;
    private Button btnSequia;
    private Button btnHuracan;
    private Button btnIncendio;
    private Button btnErupcion;
    private Button btnTerremoto;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInundacion = (Button) findViewById( R.id.btnInundacion);
        btnTornados = (Button) findViewById( R.id.btnTornados);
        btnTsunami = (Button) findViewById(R.id.btnTsunami);
        btnTemp = (Button) findViewById(R.id.btnTemp);
        btnAvalancha = (Button) findViewById( R.id.btnAvalancha);
        btnSequia = (Button) findViewById( R.id.btnSequia);
        btnHuracan = (Button) findViewById(R.id.btnHuracan);
        btnIncendio = (Button) findViewById(R.id.btnIncendio);
        btnErupcion = (Button) findViewById(R.id.btnErupcion);
        btnTerremoto = (Button) findViewById(R.id.btnTerremoto);
        btnSalir = (Button) findViewById(R.id.btnSalir);


        btnInundacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu.class);
                startActivity(i);
            }
        });

        btnTornados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, menu1.class);
                startActivity(a);
            }
        });
        btnTsunami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu2.class);
                startActivity(i);
            }
        });
        btnTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu3.class);
                startActivity(i);
            }
        });
        btnAvalancha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu4.class);
                startActivity(i);
            }
        });
        btnSequia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu5.class);
                startActivity(i);
            }
        });
        btnHuracan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu6.class);
                startActivity(i);
            }
        });
        btnIncendio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu7.class);
                startActivity(i);
            }
        });
        btnErupcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu8.class);
                startActivity(i);
            }
        });
        btnTerremoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, menu9.class);
                startActivity(i);
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
    }

