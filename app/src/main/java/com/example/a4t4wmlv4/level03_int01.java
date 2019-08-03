package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level03_int01 extends AppCompatActivity {

    private Button home, ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level03_int01);

        home = (Button) findViewById(R.id.lvl3Homebtn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        ok = (Button) findViewById(R.id.cnfBtn);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(level03_int01.this, level03_int02.class);
                startActivity(intent);
            }
        });

    }
}
