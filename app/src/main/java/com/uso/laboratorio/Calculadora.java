package com.uso.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Calculadora");
        }
    }
}
