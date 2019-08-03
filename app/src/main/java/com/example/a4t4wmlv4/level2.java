package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class level2 extends AppCompatActivity {

    private Button button1, button2, button3;
    public static MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.funny);
        player.setLooping(true);
        player.start();

        Button btn = (Button) findViewById(R.id.btn5);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(level2.this, MainActivity.class);
                startActivity(intent);
                player.stop();


            }
        });



        button1 = (Button) findViewById(R.id.btn2);
        button2 =(Button) findViewById(R.id.btn3);
        button3 = (Button) findViewById(R.id.btn4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
            }
        });


    }

    public void switchPage (View v){
        if(v == button1) {
            Intent intent = new Intent(this, level2_r1.class);
            startActivity(intent);
        }
        else if(v == button2)
        {
            Intent intent = new Intent(this, level2.class);
            startActivity(intent);
        }
        else if(v == button3)
        {
            Intent intent = new Intent(this, level2_r3.class);
            startActivity(intent);
        }
    }
}