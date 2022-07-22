package com.example.uibankapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button signupBTN = findViewById(R.id.btn_signup);
        ImageButton logoutBTN = findViewById(R.id.btn_exit);
        TextView loginBTN = findViewById(R.id.text_login);
        signupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signupBTN();
            }
        });
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginBTN();
            }
        });
        logoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutBTN();
            }
        });
    }
    private void signupBTN() {
        Intent intent = new Intent(Register.this, OTP.class);
        startActivity(intent);
    }
    private void loginBTN() {
        Intent intent = new Intent(Register.this, Login.class);
        startActivity(intent);
    }
    private void logoutBTN() {
        Intent intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
    }
}