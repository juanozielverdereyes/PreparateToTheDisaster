package com.example.myeas.spaceapps;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu1 extends AppCompatActivity {
    private TextView txtTitulo;
    private Button btnConocelo;
    private Button btnPreparate;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        btnConocelo = (Button) findViewById( R.id.btnConocelo);
        btnPreparate = (Button) findViewById( R.id.btnPreparate);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);


        btnConocelo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu1.this, Informacion1.class);
                startActivity(i);
            }
        });

        btnPreparate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu1.this, preparate.class);
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
