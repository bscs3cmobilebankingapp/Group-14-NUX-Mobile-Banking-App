package com.example.uibankapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final EditText phone = findViewById(R.id.phone);
        final EditText password = findViewById(R.id.password);
        final Button loginBtn = findViewById(R.id.btn_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phoneTxt = phone.getText().toString();
                final String passwordTxt = password.getText().toString();

                if(phoneTxt.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(Login.this, "Please enter your mobile or password", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(Login.this, Dashboard.class));
                }
            }
        });


        TextView registernowBtn = findViewById(R.id.registertxt);
        registernowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });

        ImageButton exitBTN = findViewById(R.id.btn_exit);
        exitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitBTN();
            }
        });
    }
    private void exitBTN() {
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }
}
