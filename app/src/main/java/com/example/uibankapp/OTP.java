package com.example.uibankapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class OTP extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);

        ImageButton exitBTN = findViewById(R.id.btn_exit);
        Button enterBTN = findViewById(R.id.btn_enter);
        exitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitBTN();
            }
        });
        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterBTN();
            }
        });
    }
    private void exitBTN() {
        Intent intent = new Intent(OTP.this, MainActivity.class);
        startActivity(intent);
    }
    private void enterBTN() {
        Intent intent = new Intent(OTP.this, Dashboard.class);
        startActivity(intent);
    }
}
