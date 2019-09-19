package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class level2 extends AppCompatActivity {

    private Button button1;
    private ImageButton sound;
    public static MediaPlayer player;
    boolean isPressed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.background);
        //player.setLooping(true);
        player.start();

        Button btn = (Button) findViewById(R.id.btn5);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(level2.this, mainMenu.class );
                startActivity(intent);
                player.pause();

            }

        });

        button1 = (Button) findViewById(R.id.btn2);
        sound = (ImageButton) findViewById(R.id.sound);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NextPage(view);
                player.pause();
            }
        });

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.setBackgroundResource(R.drawable.mute);
                if(isPressed){
                    sound.setBackgroundResource(R.drawable.mute);
                    player.pause();
                }else{
                    sound.setBackgroundResource(R.drawable.sound);
                    player.start();
                }
                isPressed=!isPressed;

            }
        });

    }

    public void NextPage (View v){
        if(v == button1) {
            Intent intent = new Intent(this, level2_int1.class);
            startActivity(intent);
        }
    }
}