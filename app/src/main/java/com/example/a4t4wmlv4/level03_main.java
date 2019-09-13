package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import Database.DBHelper;

public class level03_main extends AppCompatActivity {

    private Button btn1, btn2, btn3, home;
    DBHelper db = new DBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level03_main);

        TextView welcome = findViewById(R.id.welcome);

        Intent i1 = getIntent();
        String name = i1.getStringExtra("Uname");
        welcome.setText(name);

        btn1 = findViewById(R.id.int0103);
        btn2 = findViewById(R.id.int0203);
        btn3 = findViewById(R.id.int0303);

        home = findViewById(R.id.homefromlevel03main);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchPage(view);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchPage(view);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchPage(view);
            }
        });

    }
    public void switchPage(View v){
        if(v == btn1){
            Intent i = new Intent(this, level03_int01.class);
            startActivity(i);
        }
        else if(v == btn2){
            Intent i = new Intent(this, level03_int02.class);
            startActivity(i);
        }
        else if(v == btn3){
            Intent i = new Intent(this, level03_int03.class);
            startActivity(i);
        }
    }

}
