package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class level2_int2 extends AppCompatActivity {

    ImageView iv11,iv12,iv13,iv14,iv21,iv22,iv23,iv24;
    private ImageView home2;

    Integer[] cardArray = {101,105,106,102,105,106,101,102};

    int sys_101,sys_102,sys_105,sys_106;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerpoints = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_int2);

        home2 = findViewById(R.id.iv1);

        iv11 = (ImageView)findViewById(R.id.iv11);
        iv12 = (ImageView)findViewById(R.id.iv12);
        iv13 = (ImageView)findViewById(R.id.iv13);
        iv14 = (ImageView)findViewById(R.id.iv14);
        iv21 = (ImageView)findViewById(R.id.iv21);
        iv22 = (ImageView)findViewById(R.id.iv22);
        iv23 = (ImageView)findViewById(R.id.iv23);
        iv24 = (ImageView)findViewById(R.id.iv24);

        iv11.setTag("0");
        iv12.setTag("0");
        iv13.setTag("0");
        iv13.setTag("0");
        iv21.setTag("0");
        iv22.setTag("0");
        iv23.setTag("0");
        iv24.setTag("0");

        frontOfCardresources();

        Collections.shuffle(Arrays.asList(cardArray));

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv11, theCard);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv12, theCard);
            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv13, theCard);
            }
        });
        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv14, theCard);

            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv21, theCard);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv22, theCard);
            }
        });
        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv23, theCard);
            }
        });
        iv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(iv24, theCard);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SwitchPage();
            }
        });

    }
    private void SwitchPage() {
        Intent intent = new Intent(level2_int2.this, level2.class);
        startActivity(intent);
    }


    private void doStuff(ImageView iv, int Card) {

        if(cardArray[Card] == 101){
            iv.setImageResource(sys_101);
        }
        else if(cardArray[Card] == 102){
            iv.setImageResource(sys_102);
        }
        else if(cardArray[Card] == 105){
            iv.setImageResource(sys_105);
        }
        else if(cardArray[Card] == 106){
            iv.setImageResource(sys_106);
        }

        if(cardNumber == 1){
            firstCard = cardArray[Card];
            if(firstCard > 200)
            {
                firstCard = firstCard - 100;

            }

            cardNumber =2;
            clickedFirst = Card;

            iv.setEnabled(false);

        }
        else
        {
            secondCard = cardArray[Card];

            cardNumber =2;
            clickedSecond = Card;

            iv11.setEnabled(false);
            iv12.setEnabled(false);
            iv13.setEnabled(false);
            iv14.setEnabled(false);
            iv21.setEnabled(false);
            iv22.setEnabled(false);
            iv23.setEnabled(false);
            iv24.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    calculate();

                }
            },1000);
        }
    }

    private void calculate() {
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                iv11.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 1){
                iv12.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 2){
                iv13.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 3){
                iv14.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 4){
                iv21.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 5){
                iv22.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 6){
                iv23.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 7){
                iv24.setVisibility(View.VISIBLE);
            }

            if(clickedSecond == 0){
                iv11.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 1){
                iv12.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 2){
                iv13.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 3){
                iv14.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 4){
                iv21.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 5){
                iv22.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 6){
                iv23.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 7){
                iv24.setVisibility(View.VISIBLE);
            }

            if(turn == 1){
                playerpoints ++;
            }

        }
    }

    private void frontOfCardresources() {

        sys_101 = R.drawable.sym_101;
        sys_102 = R.drawable.sym_102;
        sys_105 = R.drawable.sym_105;
        sys_106 = R.drawable.sym_106;

    }
}
