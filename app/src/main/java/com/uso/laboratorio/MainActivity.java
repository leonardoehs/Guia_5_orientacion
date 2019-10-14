package com.uso.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button data, conversation, login, calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Menu Principal");
        }
        data = findViewById(R.id.data);
        conversation = findViewById(R.id.conversation);
        login = findViewById(R.id.login);
        calculator = findViewById(R.id.calculator);
        data.setOnClickListener(this);
        calculator.setOnClickListener(this);
        login.setOnClickListener(this);
        conversation.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.data: {
                Intent i = new Intent(MainActivity.this, Datos.class);
                startActivity(i);
            }
            break;
            case R.id.conversation: {
                Intent i = new Intent(MainActivity.this, Conversations.class);
                startActivity(i);
            }
            break;
            case R.id.login: {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
            break;
            case R.id.calculator: {
                Intent i = new Intent(MainActivity.this, Calculadora.class);
                startActivity(i);
            }
            break;

        }
    }
}
