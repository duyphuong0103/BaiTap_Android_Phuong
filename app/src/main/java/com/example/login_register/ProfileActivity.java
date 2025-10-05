package com.example.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity  {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile);
        ImageView setting = findViewById(R.id.btnSetting);
        setting.setOnClickListener(v->{
            Intent intentBackLogin = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intentBackLogin);
        });
    }
}
