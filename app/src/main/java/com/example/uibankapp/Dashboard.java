package com.example.uibankapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash);

        Button logoutBTN = findViewById(R.id.btn_logout);
        logoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutBTN();
            }
        });
    }
    private void logoutBTN() {
        Intent intent = new Intent(Dashboard.this, MainActivity.class);
        startActivity(intent);
    }
}
