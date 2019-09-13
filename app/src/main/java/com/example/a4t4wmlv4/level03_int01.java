package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class level03_int01 extends AppCompatActivity {

    private Button home, ok;
    private double answer = 4.25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level03_int01);

        final TextView time = (TextView) findViewById(R.id.lvl3time1);
        CountDownTimer ctdown = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long l) {

                TextView time = (TextView) findViewById(R.id.lvl3time1);

                time.setText("Time remaining : " + DateUtils.formatElapsedTime(l/1000));
            }

            @Override
            public void onFinish() {
                Intent a = new Intent(level03_int01.this,timesup.class);
                startActivity(a);

            }
        }.start();


        home = (Button) findViewById(R.id.lvl3Homebtn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(level03_int01.this, level03_main.class);
                startActivity(i);
            }
        });

        ok = (Button) findViewById(R.id.cnfBtn);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText = findViewById(R.id.editTextSum);

                if(Double.parseDouble(editText.getText().toString()) == answer) {

                    Intent intent = new Intent(level03_int01.this, level03_int02.class);
                    startActivity(intent);

                    editText.setText("");
                }else{
                    Toast.makeText(level03_int01.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                }
            }
        });

    }
}
