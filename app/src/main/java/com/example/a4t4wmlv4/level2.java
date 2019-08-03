package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level2 extends AppCompatActivity {

    private Button button1, button2, button3;
    public static MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.funny);
        //player.setLooping(true);
        player.start();

        Button btn = (Button) findViewById(R.id.btn5);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(level2.this, MainActivity.class );
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

                NextPage(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NextPage(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NextPage(view);
            }
        });

    }

    public void NextPage (View v){
        if(v == button1) {
            Intent intent = new Intent(this, level2_int1.class);
            startActivity(intent);
        }
        else if(v == button2)
        {
            Intent intent = new Intent(this, level2_int2.class);
            startActivity(intent);
        }
        else if(v == button3)
        {
            Intent intent = new Intent(this, level2_int3.class);
            startActivity(intent);
        }
    }
}