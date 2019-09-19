package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.format.DateUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;

import Database.DBHelper;

import static com.example.a4t4wmlv4.level2.player;


public class level1 extends AppCompatActivity {

    Button homebutton,back,next,sound;
    ImageView iv1;
    TextView showValue;
    int counter = 0;
    CountDownTimer ctdown;
    DBHelper dbHelper;
    boolean isPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);



        final MediaPlayer mplayer = MediaPlayer.create(this,R.raw.background);

        mplayer.start();
      //sound on off
        sound = (Button) findViewById(R.id.soundon);

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sound.setBackgroundResource(R.drawable.soundoff);

                if(isPressed){
                    sound.setBackgroundResource(R.drawable.soundoff);
                    mplayer.pause();
                }
                else{
                    sound.setBackgroundResource(R.drawable.soundon);
                    mplayer.start();
                }

                isPressed= !isPressed;
            }
        });



        //adding timer
        final TextView time = (TextView) findViewById(R.id.time);


        ctdown = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {

                time.setText("Seconds remaining : " + DateUtils.formatElapsedTime(l / 1000));

            }

            @Override
            public void onFinish() {

                Intent intent = new Intent(level1.this, level01timesup.class);
                intent.putExtra("Value","1");
                startActivity(intent);

            }

        }.start();


        //adding score
        showValue = (TextView) findViewById(R.id.score);


        //back to home
        homebutton = findViewById(R.id.button20);

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level1.this, MainActivity.class);
                startActivity(intent);
            }
        });


        //click the correct button
        next  = findViewById(R.id.button10);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(level1.this, level01score.class);
                intent.putExtra("Next","1");
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        ctdown.cancel();
    }

    //correct image toast
    public  void correct(View view){

       // ctdown.cancel();

        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.correct_toast,(ViewGroup) findViewById(R.id.custom_toast_container));

//        TextView textView = (TextView) layout.findViewById(R.id.text);
//        textView.setText();

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        ctdown.cancel();


        if (counter == 0) {
            counter += 10;
        }
        showValue.setText(Integer.toString(counter));

//        String score =  ((TextView) findViewById(R.id.score)).toString();
//        DBHelper db = new DBHelper(this);
//        db.addInfo(score);
    }


    //wrong image toast
    public  void wrong(View view) {

        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.wrong_toast, (ViewGroup) findViewById(R.id.custom_toast_container));


        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        Vibratee();


    }

    private void Vibratee() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(150,10));
        } else {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(150);
        }
    }




}