package com.example.a4t4wmlv4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;

public class Level2 extends AppCompatActivity {

    TextView Tv1,Tv2;

    ImageView imageView1_1,imageView1_2,imageView1_3,imageView1_4,imageView2_1,imageView2_2,imageView2_3,imageView2_4,
            imageView3_1,imageView3_2,imageView3_3,imageView3_4,imageView4_1,imageView4_2,imageView4_3,imageView4_4;

    Integer[] cardsArray = {101,102,103,104,105,106,107,108,201,202,203,204,205,206,207,208};

    int Sym_101,Sym_102,Sym_103,Sym_104,Sym_105,Sym_106,Sym_107,Sym_108,
            Sym_201,Sym_202,Sym_203,Sym_204,Sym_205,Sym_206,Sym_207,Sym_208;

    int firstCard,secondCard;
    int ClickedFirst,ClickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0,cpuPoints = 0;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_level2);

        Tv1 = (TextView) findViewById(R.id.Tv1);
        Tv2 = (TextView) findViewById(R.id.Tv2);

        imageView1_1 = (ImageView) findViewById(R.id.imageView1_1);
        imageView1_2 = (ImageView) findViewById(R.id.imageView1_2);
        imageView1_3 = (ImageView) findViewById(R.id.imageView1_3);
        imageView1_4 = (ImageView) findViewById(R.id.imageView1_4);
        imageView2_1 = (ImageView) findViewById(R.id.imageView2_1);
        imageView2_2 = (ImageView) findViewById(R.id.imageView2_2);
        imageView2_3 = (ImageView) findViewById(R.id.imageView2_3);
        imageView2_4 = (ImageView) findViewById(R.id.imageView2_4);
        imageView3_1 = (ImageView) findViewById(R.id.imageView3_1);
        imageView3_2 = (ImageView) findViewById(R.id.imageView3_2);
        imageView3_3 = (ImageView) findViewById(R.id.imageView3_3);
        imageView3_4 = (ImageView) findViewById(R.id.imageView3_4);
        imageView4_1 = (ImageView) findViewById(R.id.imageView4_1);
        imageView4_2 = (ImageView) findViewById(R.id.imageView4_2);
        imageView4_3 = (ImageView) findViewById(R.id.imageView4_3);
        imageView4_4 = (ImageView) findViewById(R.id.imageView4_4);


        imageView1_1.setTag("0");
        imageView1_2.setTag("0");
        imageView1_3.setTag("0");
        imageView1_4.setTag("0");
        imageView2_1.setTag("0");
        imageView2_2.setTag("0");
        imageView2_3.setTag("0");
        imageView2_4.setTag("0");
        imageView3_1.setTag("0");
        imageView3_2.setTag("0");
        imageView3_3.setTag("0");
        imageView3_4.setTag("0");
        imageView4_1.setTag("0");
        imageView4_2.setTag("0");
        imageView4_3.setTag("0");
        imageView4_4.setTag("0");


        frontOfCardResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        Tv1.setTextColor(Color.GRAY);

        imageView1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView1_1,theCard);
            }
        });
        imageView1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView1_2,theCard);
            }
        });
        imageView1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView1_3,theCard);
            }
        });
        imageView1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView1_4,theCard);
            }
        });
        imageView2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView2_1,theCard);
            }
        });
        imageView2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView2_2,theCard);
            }
        });
        imageView2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView2_3,theCard);
            }
        });
        imageView2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView2_4,theCard);
            }
        });
        imageView3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView3_1,theCard);
            }
        });
        imageView3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView3_2,theCard);
            }
        });
        imageView3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView3_3,theCard);
            }
        });
        imageView3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView3_4,theCard);
            }
        });
        imageView4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView4_1,theCard);
            }
        });
        imageView4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView4_2,theCard);
            }
        });
        imageView4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView4_3,theCard);
            }
        });
        imageView4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView4_4,theCard);
            }
        });

        }

        private  void doStuff(ImageView imageView, final int card){

            if(cardsArray[card] == 101){
                imageView.setImageResource(Sym_101);
            }
            else if(cardsArray[card] == 102){
                imageView.setImageResource(Sym_102);
            }
            else if(cardsArray[card] == 103){
                imageView.setImageResource(Sym_103);
            }
            else if(cardsArray[card] == 104){
                imageView.setImageResource(Sym_104);
            }
            else if(cardsArray[card] == 105){
                imageView.setImageResource(Sym_105);
            }
            else if(cardsArray[card] == 106){
                imageView.setImageResource(Sym_106);
            }
            else if(cardsArray[card] == 107){
                imageView.setImageResource(Sym_107);
            }
            else if(cardsArray[card] == 108){
                imageView.setImageResource(Sym_108);
            }
            else if(cardsArray[card] == 201){
                imageView.setImageResource(Sym_101);
            }
            else if(cardsArray[card] == 202){
                imageView.setImageResource(Sym_202);
            }
            else if(cardsArray[card] == 203){
                imageView.setImageResource(Sym_203);
            }
            else if(cardsArray[card] == 204){
                imageView.setImageResource(Sym_204);
            }
            else if(cardsArray[card] == 205){
                imageView.setImageResource(Sym_205);
            }
            else if(cardsArray[card] == 206){
                imageView.setImageResource(Sym_206);
            }
            else if(cardsArray[card] == 207){
                imageView.setImageResource(Sym_207);
            }
            else if(cardsArray[card] == 208){
                imageView.setImageResource(Sym_208);
            }

            if(cardNumber == 1) {
                firstCard = cardsArray[card];
                if (firstCard > 200) {
                    firstCard = firstCard - 100;
                }
                cardNumber = 2;
                ClickedFirst = card;

                imageView.setEnabled(false);

            }else if(cardNumber == 2){
                secondCard = cardsArray[card];
                if(secondCard > 200){
                    secondCard = secondCard - 100;
                }
                cardNumber = 1;
                ClickedSecond = card;

                imageView1_1.setEnabled(false);
                imageView1_2.setEnabled(false);
                imageView1_3.setEnabled(false);
                imageView1_4.setEnabled(false);
                imageView2_1.setEnabled(false);
                imageView2_2.setEnabled(false);
                imageView2_3.setEnabled(false);
                imageView2_4.setEnabled(false);
                imageView3_1.setEnabled(false);
                imageView3_2.setEnabled(false);
                imageView3_3.setEnabled(false);
                imageView3_4.setEnabled(false);
                imageView4_1.setEnabled(false);
                imageView4_2.setEnabled(false);
                imageView4_3.setEnabled(false);
                imageView4_4.setEnabled(false);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        calculate();
                    }
                },1000);

            }
        }

        private  void calculate(){

            if (firstCard == secondCard) {
                if (ClickedFirst == 0) {
                    imageView1_1.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 1) {
                    imageView1_2.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 2) {
                    imageView1_3.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 3) {
                    imageView1_4.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 4) {
                    imageView2_1.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 5) {
                    imageView2_2.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 6) {
                    imageView2_3.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 7) {
                    imageView2_4.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 8) {
                    imageView3_1.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 9) {
                    imageView3_2.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 10) {
                    imageView3_3.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 11) {
                    imageView3_4.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 12) {
                    imageView4_1.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 13) {
                    imageView4_2.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 14) {
                    imageView4_3.setVisibility(View.INVISIBLE);
                } else if (ClickedFirst == 15) {
                    imageView4_4.setVisibility(View.INVISIBLE);
                }
                if (ClickedSecond == 0) {
                    imageView1_1.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 1) {
                    imageView1_2.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 2) {
                    imageView1_3.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 3) {
                    imageView1_4.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 4) {
                    imageView2_1.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 5) {
                    imageView2_2.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 6) {
                    imageView2_3.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 7) {
                    imageView2_4.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 8) {
                    imageView3_1.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 9) {
                    imageView3_2.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 10) {
                    imageView3_3.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 11) {
                    imageView3_4.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 12) {
                    imageView4_1.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 13) {
                    imageView4_2.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 14) {
                    imageView4_3.setVisibility(View.INVISIBLE);
                } else if (ClickedSecond == 15) {
                    imageView4_4.setVisibility(View.INVISIBLE);
                }
                if (turn == 1) {
                    playerPoints++;
                    Tv1.setText("P1: " + playerPoints);
                } else if (turn == 2) {
                    cpuPoints++;
                    Tv1.setText("P2: " + playerPoints);
                }
                } else {
                imageView1_1.setImageResource(R.drawable.hidden);
                imageView1_2.setImageResource(R.drawable.hidden);
                imageView1_3.setImageResource(R.drawable.hidden);
                imageView1_4.setImageResource(R.drawable.hidden);
                imageView2_1.setImageResource(R.drawable.hidden);
                imageView2_2.setImageResource(R.drawable.hidden);
                imageView2_3.setImageResource(R.drawable.hidden);
                imageView2_4.setImageResource(R.drawable.hidden);
                imageView3_1.setImageResource(R.drawable.hidden);
                imageView3_2.setImageResource(R.drawable.hidden);
                imageView3_3.setImageResource(R.drawable.hidden);
                imageView3_4.setImageResource(R.drawable.hidden);
                imageView4_1.setImageResource(R.drawable.hidden);
                imageView4_2.setImageResource(R.drawable.hidden);
                imageView4_3.setImageResource(R.drawable.hidden);
                imageView4_4.setImageResource(R.drawable.hidden);

                if (turn == 1) {
                    turn = 2;
                    Tv1.setTextColor(Color.GRAY);
                    Tv2.setTextColor(Color.BLACK);
                } else {
                    if (turn == 2) {
                        turn = 1;
                        Tv1.setTextColor(Color.BLACK);
                        Tv2.setTextColor(Color.GRAY);

                    }
                }
            }
            imageView1_1.setEnabled(true);
            imageView1_2.setEnabled(true);
            imageView1_3.setEnabled(true);
            imageView1_4.setEnabled(true);
            imageView2_1.setEnabled(true);
            imageView2_2.setEnabled(true);
            imageView2_3.setEnabled(true);
            imageView2_4.setEnabled(true);
            imageView3_1.setEnabled(true);
            imageView3_2.setEnabled(true);
            imageView3_3.setEnabled(true);
            imageView3_4.setEnabled(true);
            imageView4_1.setEnabled(true);
            imageView4_2.setEnabled(true);
            imageView4_3.setEnabled(true);
            imageView4_4.setEnabled(true);

            checkEnd();

        }

        private  void  checkEnd(){

            if(imageView1_1.getVisibility() == View.INVISIBLE &&
                imageView1_2.getVisibility() == View.INVISIBLE &&
                imageView1_3.getVisibility() == View.INVISIBLE &&
                imageView1_4.getVisibility() == View.INVISIBLE &&
                imageView2_1.getVisibility() == View.INVISIBLE &&
                imageView2_2.getVisibility() == View.INVISIBLE &&
                imageView2_3.getVisibility() == View.INVISIBLE &&
                imageView2_4.getVisibility() == View.INVISIBLE &&
                imageView3_1.getVisibility() == View.INVISIBLE &&
                imageView3_2.getVisibility() == View.INVISIBLE &&
                imageView3_3.getVisibility() == View.INVISIBLE &&
                imageView3_4.getVisibility() == View.INVISIBLE &&
                imageView4_1.getVisibility() == View.INVISIBLE &&
                imageView4_2.getVisibility() == View.INVISIBLE &&
                imageView4_3.getVisibility() == View.INVISIBLE &&
                imageView4_4.getVisibility() == View.INVISIBLE){

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Level2.this);
                alertDialogBuilder
                        .setMessage("Game Over !\nP1:" +playerPoints +"\nP2:" +cpuPoints)
                        .setCancelable(false)
                        .setPositiveButton("New", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Intent intent = new Intent(getApplicationContext(), Level2.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        }

        private void frontOfCardResources(){
            Sym_101 = R.drawable.sym_101;
            Sym_102 = R.drawable.sym_102;
            Sym_103 = R.drawable.sym_102;
            Sym_104 = R.drawable.sym_102;
            Sym_105 = R.drawable.sym_102;
            Sym_106 = R.drawable.sym_102;
            Sym_107 = R.drawable.sym_102;
            Sym_108 = R.drawable.sym_102;
            Sym_201 = R.drawable.sym_202;
            Sym_202 = R.drawable.sym_202;
            Sym_203 = R.drawable.sym_202;
            Sym_204 = R.drawable.sym_204;
            Sym_205 = R.drawable.sym_205;
            Sym_206 = R.drawable.sym_206;
        }
}
