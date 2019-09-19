package com.example.a4t4wmlv4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import Database.DBAdapter;
import Database.DBHelper;


public class MainActivity extends AppCompatActivity  {
    Button log;
    ImageButton eng, frn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = (Button) findViewById(R.id.btn_login);
        eng = (ImageButton) findViewById(R.id.english);
        frn = (ImageButton) findViewById(R.id.french);

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("en");
            }
        });

        frn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("fr");
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            switch (requestCode) {
                case 1:
                    //add();

            }
        }
    }


    public void add() {
        String uname = ((EditText) findViewById(R.id.nameedit)).getText().toString();
        System.out.println(uname);

//        DBAdapter db = new DBAdapter(this);

        //long x = db.insertData(uname, 0, 0);

       // if (x <= 0)
         //   System.out.println("unsucessful");
        //else
         //   System.out.println("Successful");


        Intent i = new Intent(this, mainMenu.class);
        i.putExtra("Name", uname);
        startActivity(i);


    }

    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        finish();
        startActivity(refresh);
    }


}


