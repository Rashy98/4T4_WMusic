package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class level4 extends AppCompatActivity {

    Button A , B , C ,D , E , F , G ;
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        final MediaPlayer ring= MediaPlayer.create(level4.this,R.raw.background);
        ring.start();

        home = (Button) findViewById(R.id.homebutton1);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                ring.pause();
            }
        });
        A = (Button) findViewById(R.id.A1);
        B = (Button) findViewById(R.id.B1);
        C = (Button) findViewById(R.id.C1);
        D = (Button) findViewById(R.id.D1);
        E = (Button) findViewById(R.id.E1);
        F = (Button) findViewById(R.id.F1);
        G = (Button) findViewById(R.id.G1);
    }

    public void letterPressed(View view) {
        //user has pressed a letter to guess
        String ltr=((TextView)view).getText().toString();

    }




}
