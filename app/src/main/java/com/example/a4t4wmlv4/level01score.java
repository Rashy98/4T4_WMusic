package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level01score extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level01score);

        btn =(Button) findViewById(R.id.next);
    }

    public void nextRound(View view) {

        Intent intent = getIntent();
        String Next = intent.getStringExtra("Next");
        int i = Integer.parseInt(Next);

        if (i == 1) {
            Intent intent2 = new Intent(level01score.this, level01Int2.class);
            startActivity(intent2);
        } else if (i == 2) {
            Intent intent3 = new Intent(level01score.this, level01Int3.class);
            startActivity(intent3);
//        }else if(i == 3){
//            Intent intent4 = new Intent(level01score.this,level01Int3.class);
//            startActivity(intent4);
//        }


        }
    }}
