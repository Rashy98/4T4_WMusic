package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.a4t4wmlv4.R.layout.activity_level04_main;

public class level04Main extends AppCompatActivity {

    private Button but01 , but02 , but03 , but04 , home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level04_main);

        final MediaPlayer mplayer = MediaPlayer.create(this,R.raw.background);

        mplayer.start();

        but01 =(Button) findViewById(R.id.int3);
        but02 =(Button) findViewById(R.id.int0204);
        but03 =(Button) findViewById(R.id.int0304);
        but04 =(Button) findViewById(R.id.int0404);

        home = (Button) findViewById(R.id.homefromlevel04main);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
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
            Intent intent = new Intent(this, level4.class);
            startActivity(intent);
        }
        else if(v == but02)
        {
            Intent intent = new Intent(this, level04S2.class);
            startActivity(intent);
        }
        else if(v == but03)
        {
            Intent intent = new Intent(this, level04_int03.class);
            startActivity(intent);
        }
        else if(v == but04)
        {
            Intent intent = new Intent(this, level04_int04.class);
            startActivity(intent);
        }
    }
}
