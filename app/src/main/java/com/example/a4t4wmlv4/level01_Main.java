package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level01_Main extends AppCompatActivity {

    private Button but01 , but02 , but03 , but04 , home,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level01__main);
        final MediaPlayer mplayer = MediaPlayer.create(this,R.raw.background);

        mplayer.start();

        back = findViewById(R.id.backbtn5);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level01_Main.this, MainActivity.class);
                startActivity(intent);
                mplayer.pause();
            }
        });

        but01 =(Button) findViewById(R.id.int3);
        but02 = findViewById(R.id.int0204);
        but03 =(Button) findViewById(R.id.int0304);
        but04 =(Button) findViewById(R.id.int0404);


        home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                mplayer.pause();
            }
        });

        but01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
                mplayer.pause();
            }
        });

        but02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
                mplayer.pause();
            }
        });
        but03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
                mplayer.pause();
            }
        });
        but04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage(view);
                mplayer.pause();
            }
        });
    }
    public void switchPage (View v){
        if(v == but01) {
            Intent intent = new Intent(this, level1.class);
            startActivity(intent);
        }
        else if(v == but02)
        {
            Intent intent = new Intent(level01_Main.this, level01Int2.class);
            startActivity(intent);
        }
        else if(v == but03)
        {
            Intent intent = new Intent(this, level01Int3.class);
            startActivity(intent);
        }
        else if(v == but04)
        {
            Intent intent = new Intent(this, level01int4.class);
            startActivity(intent);
        }
    }


}
