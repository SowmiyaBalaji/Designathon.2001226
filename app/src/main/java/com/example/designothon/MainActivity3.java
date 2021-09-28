package com.example.designothon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
            startActivity(intent);
        });
    }
}