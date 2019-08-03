package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class level1 extends AppCompatActivity {


    Button homebutton,back;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        back = findViewById(R.id.backbtn2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level1.this, level01_Main.class);
                startActivity(intent);
            }
        });

        homebutton = findViewById(R.id.button20);

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level1.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}