package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level03_int03 extends AppCompatActivity {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level03_int03);

        home = (Button) findViewById(R.id.lvl3Homebtn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(level03_int03.this, level03_main.class);
                startActivity(i);
            }
        });

    }
}
