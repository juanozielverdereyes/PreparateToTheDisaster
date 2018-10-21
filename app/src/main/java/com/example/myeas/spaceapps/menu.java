package com.example.myeas.spaceapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    private TextView txtTitulo;
    private Button btnConocelo;
    private Button btnPreparate;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnConocelo = (Button) findViewById( R.id.btnConocelo);
        btnPreparate = (Button) findViewById( R.id.btnPreparate);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);


        btnConocelo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this, Informacion.class);
                startActivity(i);
            }
        });

        btnPreparate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this, preparate.class);
                startActivity(i);
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
