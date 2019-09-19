package com.example.a4t4wmlv4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;

public class next extends AppCompatActivity {

    private Button next , back;
    public static MediaPlayer player;
    private TextView score;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);
        score = (TextView) findViewById(R.id.score);

        Intent intent = getIntent();

        String Points = intent.getStringExtra("Player Points");

        score.setText(Points);

        points = Integer.parseInt(Points);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NextPage(view);
                player.pause();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NextPage(view);
                player.pause();
            }
        });

    }

    public void NextPage(View v){

        if(v == next ){

            if(points == 4){

                Intent intent = new Intent(next.this, level2_int2.class);
                startActivity(intent);

            }
            else if(points == 10){

                Intent intent = new Intent(this, level2_int3.class);
                startActivity(intent);
            }
            else if(points == 18) {

                Intent intent = new Intent(this, level03_main.class);
                startActivity(intent);
            }
        }
        else if(v == back){

            Intent intent = new Intent(next.this, level2.class);
            startActivity(intent);
        }
    }


}
