package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level01Int3 extends AppCompatActivity {

    Button homebutton,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level01_int3);

        back = findViewById(R.id.backbtn3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level01Int3.this, level01_Main.class);
                startActivity(intent);
            }
        });

        homebutton = findViewById(R.id.home);

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level01Int3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
