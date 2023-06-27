package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Addition;
    Button Substraction;
    Button Multiplication;
    Button Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addition = findViewById(R.id.btnAdd);
        Substraction = findViewById(R.id.btnSub);
        Multiplication = findViewById(R.id.btnMulti);
        Division = findViewById(R.id.btnDiv);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Game.class);
                startActivity(intent);
                finish();

            }
        });
        Substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Sub.class);
                startActivity(intent);
                finish();

            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mul.class);
                startActivity(intent);
                finish();

            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Divi.class);
                startActivity(intent);
                finish();

            }
        });
    }
}