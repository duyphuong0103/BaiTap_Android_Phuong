package com.example.login_register;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        Button changeRegister, btnLogin;
        changeRegister= findViewById(R.id.register);
        btnLogin = findViewById(R.id.login);
        changeRegister.setOnClickListener(v->{
            Intent intentRegister = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intentRegister);
        });
        btnLogin.setOnClickListener(v->{
            Intent intentLogin = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intentLogin);
        });
        }
}