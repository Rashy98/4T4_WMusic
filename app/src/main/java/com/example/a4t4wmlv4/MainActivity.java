package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Database.DBHelper;


public class MainActivity extends AppCompatActivity {
    Button log ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = (Button) findViewById(R.id.btn_login);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });


    }

    public void add()
    {
        String uname = ((EditText) findViewById(R.id.nameedit)).toString();

        DBHelper db = new DBHelper(this);

        db.addname(uname);

        Intent i = new Intent(this,mainMenu.class);
        i.putExtra("Name" , uname);
        startActivity(i);



    }



}

