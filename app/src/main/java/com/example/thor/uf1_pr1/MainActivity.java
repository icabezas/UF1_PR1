package com.example.thor.uf1_pr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jugar;
    Button ranquing;
    Button ajustaments;
    Button quantA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugar = (Button) findViewById(R.id.jugar);
        ranquing = (Button) findViewById(R.id.ranquing);
        ajustaments = (Button) findViewById(R.id.ajustaments);
        quantA = (Button) findViewById(R.id.quantA);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //OBRIR NOVA VISTA

            }
        });

        ranquing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //OBRIR NOVA VISTA
            }
        });

        ajustaments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Ajustaments.class);
                startActivity(intent);
            }
        });
        quantA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //OBRIR NOVA VISTA
            }
        });


    }
}
