package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class level1 extends AppCompatActivity {


    Button b1;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        clickfunction();
    }


    public void clickfunction() {



        b1 = (Button) findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener(){

        public void onClick(View arg0){

            iv1.setImageResource(R.drawable.correct);
        }

        });

    }
}