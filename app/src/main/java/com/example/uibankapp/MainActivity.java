package com.example.uibankapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBTN = findViewById(R.id.btn_login);
        Button regBTN = findViewById(R.id.btn_signup);
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginBTN();
            }
        });
        regBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regBTN();
            }
        });
    }

    private void loginBTN(){
        Intent intent=new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }
    private void regBTN(){
        Intent intent=new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }
}