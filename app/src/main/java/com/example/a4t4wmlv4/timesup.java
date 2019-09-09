package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;

public class timesup extends AppCompatActivity {

    private Button goback;
    public static MediaPlayer player1;
    public static MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timesup);



        player1 = new MediaPlayer();
        player1 = MediaPlayer.create(this, R.raw.error);
        //player.setLooping(true);
        player1.start();

        goback = (Button) findViewById(R.id.goback);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NextPage(view);
                player.pause();

            }
        });
    }

    final Timer timer = new Timer();
    public void NextPage (View v) {
        if (v == goback) {
            Intent intent = new Intent(this, level2.class);
            startActivity(intent);
            player1.pause();
            timer.cancel();
        }
    }
}
